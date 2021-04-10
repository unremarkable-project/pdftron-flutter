package com.pdftron.pdftronflutter

import android.content.Context
import com.pdftron.common.PDFNetException
import com.pdftron.pdf.PDFNet
import com.pdftron.pdf.tools.ToolManager
import com.pdftron.pdftronflutter.factories.DocumentViewFactory
import com.pdftron.pdftronflutter.helpers.PluginUtils
import java.util.ArrayList
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_ANNOTATIONS_SELECTED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_ANNOTATION_CHANGED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_ANNOTATION_MENU_PRESSED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_DOCUMENT_ERROR
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_DOCUMENT_LOADED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_EXPORT_ANNOTATION_COMMAND
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_EXPORT_BOOKMARK
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_FORM_FIELD_VALUE_CHANGED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_LEADING_NAV_BUTTON_PRESSED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_LONG_PRESS_MENU_PRESSED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_PAGE_CHANGED
import com.pdftron.pdftronflutter.helpers.PluginUtils.EVENT_ZOOM_CHANGED
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_GET_PLATFORM_VERSION
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_GET_VERSION
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_INITIALIZE
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_OPEN_DOCUMENT
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_SET_LEADING_NAV_BUTTON_ICON
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_CONFIG
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_DOCUMENT
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_LEADING_NAV_BUTTON_ICON
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_LICENSE_KEY
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_PASSWORD

/**
 * PdftronFlutterPlugin
 */
class PdftronFlutterPlugin(context: Context) : MethodCallHandler {
    private val mContext: Context
    private val mDisabledTools: ArrayList<ToolManager.ToolMode> = ArrayList()
    @Override
    fun onMethodCall(call: MethodCall, result: Result) {
        when (call.method) {
            FUNCTION_GET_PLATFORM_VERSION -> result.success("Android " + android.os.Build.VERSION.RELEASE)
            FUNCTION_GET_VERSION -> try {
                val pdftronVersion = toString(PDFNet.getVersion())
                result.success(pdftronVersion)
            } catch (e: PDFNetException) {
                e.printStackTrace()
                result.error(toString(e.getErrorCode()), "PDFTronException Error: $e", null)
            }
            FUNCTION_INITIALIZE -> try {
                val licenseKey: String = call.argument(KEY_LICENSE_KEY)
                com.pdftron.pdf.utils.AppUtils.initializePDFNetApplication(mContext.getApplicationContext(), licenseKey)
                result.success(null)
            } catch (e: PDFNetException) {
                e.printStackTrace()
                result.error(toString(e.getErrorCode()), "PDFTronException Error: $e", null)
            }
            FUNCTION_OPEN_DOCUMENT -> {
                val document: String = call.argument(KEY_DOCUMENT)
                val password: String = call.argument(KEY_PASSWORD)
                val config: String = call.argument(KEY_CONFIG)
                FlutterDocumentActivity.setFlutterLoadResult(result)
                FlutterDocumentActivity.openDocument(mContext, document, password, config)
            }
            FUNCTION_SET_LEADING_NAV_BUTTON_ICON -> {
                val leadingNavButtonIcon: String = call.argument(KEY_LEADING_NAV_BUTTON_ICON)
                FlutterDocumentActivity.setLeadingNavButtonIcon(leadingNavButtonIcon)
            }
            else -> PluginUtils.onMethodCall(call, result, FlutterDocumentActivity.getCurrentActivity())
        }
    }

    companion object {
        /**
         * Plugin registration.
         */
        fun registerWith(registrar: Registrar) {
            val methodChannel = MethodChannel(registrar.messenger(), "pdftron_flutter")
            methodChannel.setMethodCallHandler(PdftronFlutterPlugin(registrar.activeContext()))
            val annotEventChannel = EventChannel(registrar.messenger(), EVENT_EXPORT_ANNOTATION_COMMAND)
            annotEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setExportAnnotationCommandEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setExportAnnotationCommandEventEmitter(null)
                }
            })
            val bookmarkEventChannel = EventChannel(registrar.messenger(), EVENT_EXPORT_BOOKMARK)
            bookmarkEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setExportBookmarkEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setExportBookmarkEventEmitter(null)
                }
            })
            val documentLoadedEventChannel = EventChannel(registrar.messenger(), EVENT_DOCUMENT_LOADED)
            documentLoadedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setDocumentLoadedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setDocumentLoadedEventEmitter(null)
                }
            })
            val documentErrorEventChannel = EventChannel(registrar.messenger(), EVENT_DOCUMENT_ERROR)
            documentErrorEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setDocumentErrorEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setDocumentErrorEventEmitter(null)
                }
            })
            val annotationChangedEventChannel = EventChannel(registrar.messenger(), EVENT_ANNOTATION_CHANGED)
            annotationChangedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setAnnotationChangedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setAnnotationChangedEventEmitter(null)
                }
            })
            val annotationSelectedEventChannel = EventChannel(registrar.messenger(), EVENT_ANNOTATIONS_SELECTED)
            annotationSelectedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setAnnotationsSelectionEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setAnnotationsSelectionEventEmitter(null)
                }
            })
            val formFieldValueChangedEventChannel = EventChannel(registrar.messenger(), EVENT_FORM_FIELD_VALUE_CHANGED)
            formFieldValueChangedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setFormFieldValueChangedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setFormFieldValueChangedEventEmitter(null)
                }
            })
            val longPressMenuPressedEventChannel = EventChannel(registrar.messenger(), EVENT_LONG_PRESS_MENU_PRESSED)
            longPressMenuPressedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setLongPressMenuPressedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setLongPressMenuPressedEventEmitter(null)
                }
            })
            val leadingNavButtonPressedEventChannel = EventChannel(registrar.messenger(), EVENT_LEADING_NAV_BUTTON_PRESSED)
            leadingNavButtonPressedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setLeadingNavButtonPressedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setLeadingNavButtonPressedEventEmitter(null)
                }
            })
            val annotationMenuPressedEventChannel = EventChannel(registrar.messenger(), EVENT_ANNOTATION_MENU_PRESSED)
            annotationMenuPressedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setAnnotationMenuPressedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setAnnotationMenuPressedEventEmitter(null)
                }
            })
            val pageChangedEventChannel = EventChannel(registrar.messenger(), EVENT_PAGE_CHANGED)
            pageChangedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setPageChangedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setPageChangedEventEmitter(null)
                }
            })
            val zoomChangedEventChannel = EventChannel(registrar.messenger(), EVENT_ZOOM_CHANGED)
            zoomChangedEventChannel.setStreamHandler(object : StreamHandler() {
                @Override
                fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                    FlutterDocumentActivity.setZoomChangedEventEmitter(emitter)
                }

                @Override
                fun onCancel(arguments: Object?) {
                    FlutterDocumentActivity.setZoomChangedEventEmitter(null)
                }
            })
            registrar.platformViewRegistry().registerViewFactory("pdftron_flutter/documentview", DocumentViewFactory(registrar.messenger(), registrar.activeContext()))
        }
    }

    init {
        mContext = context
    }
}