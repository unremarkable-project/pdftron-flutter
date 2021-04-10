package com.pdftron.pdftronflutter

import android.content.Context
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.pdftron.pdftronflutter.helpers.PluginUtils
import com.pdftron.pdftronflutter.views.DocumentView
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.platform.PlatformView
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
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_OPEN_DOCUMENT
import com.pdftron.pdftronflutter.helpers.PluginUtils.FUNCTION_SET_LEADING_NAV_BUTTON_ICON
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_LEADING_NAV_BUTTON_ICON

class FlutterDocumentView(context: Context?, activityContext: Context, messenger: BinaryMessenger?, id: Int) : PlatformView, MethodChannel.MethodCallHandler {
    private val documentView: DocumentView
    private val methodChannel: MethodChannel
    fun registerWith(messenger: BinaryMessenger?) {
        val annotEventChannel = EventChannel(messenger, EVENT_EXPORT_ANNOTATION_COMMAND)
        annotEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setExportAnnotationCommandEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setExportAnnotationCommandEventEmitter(null)
            }
        })
        val bookmarkEventChannel = EventChannel(messenger, EVENT_EXPORT_BOOKMARK)
        bookmarkEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setExportBookmarkEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setExportBookmarkEventEmitter(null)
            }
        })
        val documentLoadedEventChannel = EventChannel(messenger, EVENT_DOCUMENT_LOADED)
        documentLoadedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setDocumentLoadedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setDocumentLoadedEventEmitter(null)
            }
        })
        val documentErrorEventChannel = EventChannel(messenger, EVENT_DOCUMENT_ERROR)
        documentErrorEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setDocumentErrorEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setDocumentErrorEventEmitter(null)
            }
        })
        val annotationChangedEventChannel = EventChannel(messenger, EVENT_ANNOTATION_CHANGED)
        annotationChangedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setAnnotationChangedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setAnnotationChangedEventEmitter(null)
            }
        })
        val annotationSelectedEventChannel = EventChannel(messenger, EVENT_ANNOTATIONS_SELECTED)
        annotationSelectedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setAnnotationsSelectedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setAnnotationsSelectedEventEmitter(null)
            }
        })
        val formFieldValueChangedEventChannel = EventChannel(messenger, EVENT_FORM_FIELD_VALUE_CHANGED)
        formFieldValueChangedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setFormFieldValueChangedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setFormFieldValueChangedEventEmitter(null)
            }
        })
        val longPressMenuPressedEventChannel = EventChannel(messenger, EVENT_LONG_PRESS_MENU_PRESSED)
        longPressMenuPressedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setLongPressMenuPressedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setLongPressMenuPressedEventEmitter(null)
            }
        })
        val annotationMenuPressedEventChannel = EventChannel(messenger, EVENT_ANNOTATION_MENU_PRESSED)
        annotationMenuPressedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setAnnotationMenuPressedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setAnnotationMenuPressedEventEmitter(null)
            }
        })
        val leadingNavButtonPressedEventChannel = EventChannel(messenger, EVENT_LEADING_NAV_BUTTON_PRESSED)
        leadingNavButtonPressedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setLeadingNavButtonPressedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setLeadingNavButtonIcon(null)
            }
        })
        val pageChangedEventChannel = EventChannel(messenger, EVENT_PAGE_CHANGED)
        pageChangedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setPageChangedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setPageChangedEventEmitter(null)
            }
        })
        val zoomChangedEventChannel = EventChannel(messenger, EVENT_ZOOM_CHANGED)
        zoomChangedEventChannel.setStreamHandler(object : StreamHandler() {
            @Override
            fun onListen(arguments: Object?, emitter: EventChannel.EventSink?) {
                documentView.setZoomChangedEventEmitter(emitter)
            }

            @Override
            fun onCancel(arguments: Object?) {
                documentView.setZoomChangedEventEmitter(null)
            }
        })
    }

    @Override
    fun onMethodCall(call: MethodCall, result: MethodChannel.Result?) {
        when (call.method) {
            FUNCTION_OPEN_DOCUMENT -> {
                val document: String = call.argument("document")
                val password: String = call.argument("password")
                val config: String = call.argument("config")
                documentView.openDocument(document, password, config, result)
            }
            FUNCTION_SET_LEADING_NAV_BUTTON_ICON -> {
                val leadingNavButtonIcon: String = call.argument(KEY_LEADING_NAV_BUTTON_ICON)
                documentView.setLeadingNavButtonIcon(leadingNavButtonIcon)
            }
            else -> PluginUtils.onMethodCall(call, result, documentView)
        }
    }

    @get:Override
    val view: View
        get() = documentView

    @Override
    fun dispose() {
    }

    init {
        registerWith(messenger)
        documentView = DocumentView(context)
        var manager: FragmentManager? = null
        if (activityContext is FragmentActivity) {
            manager = (activityContext as FragmentActivity).getSupportFragmentManager()
        }
        documentView.setSupportFragmentManager(manager)
        methodChannel = MethodChannel(messenger, "pdftron_flutter/documentview_$id")
        methodChannel.setMethodCallHandler(this)
    }
}