package com.pdftron.pdftronflutter

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.annotation.DrawableRes
import com.pdftron.pdf.Annot
import com.pdftron.pdf.PDFDoc
import com.pdftron.pdf.PDFViewCtrl
import com.pdftron.pdf.config.PDFViewCtrlConfig
import com.pdftron.pdf.config.ToolManagerBuilder
import com.pdftron.pdf.config.ViewerBuilder
import com.pdftron.pdf.config.ViewerBuilder2
import com.pdftron.pdf.config.ViewerConfig
import com.pdftron.pdf.controls.DocumentActivity
import com.pdftron.pdf.controls.PdfViewCtrlTabFragment2
import com.pdftron.pdf.controls.PdfViewCtrlTabHostFragment2
import com.pdftron.pdf.tools.ToolManager
import com.pdftron.pdf.utils.Utils
import com.pdftron.pdftronflutter.helpers.PluginUtils
import com.pdftron.pdftronflutter.helpers.ViewerComponent
import com.pdftron.pdftronflutter.helpers.ViewerImpl
import org.json.JSONObject
import java.util.ArrayList
import java.util.HashMap
import java.util.concurrent.atomic.AtomicReference
import io.flutter.plugin.common.EventChannel.EventSink
import io.flutter.plugin.common.MethodChannel.Result
import com.pdftron.pdftronflutter.helpers.PluginUtils.handleLeadingNavButtonPressed

class FlutterDocumentActivity : DocumentActivity(), ViewerComponent {
    private val mImpl: ViewerImpl = ViewerImpl(this)

    @get:Override
    val exportAnnotationCommandEventEmitter: EventSink
        get() = sExportAnnotationCommandEventEmitter.get()

    @get:Override
    val exportBookmarkEventEmitter: EventSink
        get() = sExportBookmarkEventEmitter.get()

    @get:Override
    val documentLoadedEventEmitter: EventSink
        get() = sDocumentLoadedEventEmitter.get()

    @get:Override
    val documentErrorEventEmitter: EventSink
        get() = sDocumentErrorEventEmitter.get()
    val annotationChangedEventEmitter: EventSink
        get() = sAnnotationChangedEventEmitter.get()

    @get:Override
    val annotationsSelectedEventEmitter: EventSink
        get() = sAnnotationsSelectionEventEmitter.get()

    @get:Override
    val formFieldValueChangedEventEmitter: EventSink
        get() = sFormFieldChangedEventEmitter.get()

    @get:Override
    val longPressMenuPressedEventEmitter: EventSink
        get() = sLongPressMenuPressedEventEmitter.get()

    @get:Override
    val annotationMenuPressedEventEmitter: EventSink
        get() = sAnnotationMenuPressedEventEmitter.get()
    val leadingNavButtonPressedEventEmitter: EventSink
        get() = sLeadingNavButtonPressedEventEmitter.get()

    @get:Override
    val pageChangedEventEmitter: EventSink
        get() = sPageChangedEventEmitter.get()

    @get:Override
    val zoomChangedEventEmitter: EventSink
        get() = sZoomChangedEventEmitter.get()

    @get:Override
    val flutterLoadResult: Result
        get() = sFlutterLoadResult.getAndSet(null)

    @get:Override
    var selectedAnnots: HashMap<Annot, Integer>
        get() = mSelectedAnnots
        set(selectedAnnots) {
            mSelectedAnnots = selectedAnnots
        }

    @get:Override
    val longPressMenuItems: ArrayList<String>
        get() = mLongPressMenuItems

    @get:Override
    val longPressMenuOverrideItems: ArrayList<String>
        get() = mLongPressMenuOverrideItems

    @get:Override
    val hideAnnotationMenuTools: ArrayList<String>
        get() = mHideAnnotationMenuTools

    @get:Override
    val annotationMenuItems: ArrayList<String>
        get() = mAnnotationMenuItems

    @get:Override
    val annotationMenuOverrideItems: ArrayList<String>
        get() = mAnnotationMenuOverrideItems

    @Override
    protected fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        attachActivity()
    }

    @Override
    protected fun onDestroy() {
        PluginUtils.handleOnDetach(this)
        super.onDestroy()
        sExportAnnotationCommandEventEmitter.set(null)
        sExportBookmarkEventEmitter.set(null)
        sDocumentLoadedEventEmitter.set(null)
        sDocumentErrorEventEmitter.set(null)
        sAnnotationChangedEventEmitter.set(null)
        sAnnotationsSelectionEventEmitter.set(null)
        sFormFieldChangedEventEmitter.set(null)
        sLongPressMenuPressedEventEmitter.set(null)
        sAnnotationMenuPressedEventEmitter.set(null)
        sLeadingNavButtonPressedEventEmitter.set(null)
        sPageChangedEventEmitter.set(null)
        sZoomChangedEventEmitter.set(null)
        detachActivity()
    }

    @Override
    fun onTabDocumentLoaded(tag: String?) {
        super.onTabDocumentLoaded(tag)
        PluginUtils.handleDocumentLoaded(this)
    }

    @Override
    fun onOpenDocError(): Boolean {
        super.onOpenDocError()
        return PluginUtils.handleOpenDocError(this)
    }

    @Override
    fun onNavButtonPressed() {
        handleLeadingNavButtonPressed(this)
        super.onNavButtonPressed()
    }

    private fun attachActivity() {
        currentActivity = this
    }

    private fun detachActivity() {
        currentActivity = null
    }

    // Convenience
    @get:Nullable
    val pdfViewCtrlTabHostFragment: PdfViewCtrlTabHostFragment2?
        get() = mPdfViewCtrlTabHostFragment2

    @get:Nullable
    val pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2?
        get() = if (mPdfViewCtrlTabHostFragment2 != null) {
            mPdfViewCtrlTabHostFragment2.getCurrentPdfViewCtrlFragment()
        } else null

    @get:Nullable
    val pdfViewCtrl: PDFViewCtrl?
        get() = if (pdfViewCtrlTabFragment != null) {
            pdfViewCtrlTabFragment.getPDFViewCtrl()
        } else null

    @get:Nullable
    val toolManager: ToolManager?
        get() = if (pdfViewCtrlTabFragment != null) {
            pdfViewCtrlTabFragment.getToolManager()
        } else null

    @get:Nullable
    val pdfDoc: PDFDoc?
        get() = if (pdfViewCtrlTabFragment != null) {
            pdfViewCtrlTabFragment.getPdfDoc()
        } else null

    @get:Override
    @get:NonNull
    val impl: ViewerImpl
        get() = mImpl

    companion object {
        private var mLongPressMenuItems: ArrayList<String>? = null
        private var mLongPressMenuOverrideItems: ArrayList<String>? = null
        private var mHideAnnotationMenuTools: ArrayList<String>? = null
        private var mAnnotationMenuItems: ArrayList<String>? = null
        private var mAnnotationMenuOverrideItems: ArrayList<String>? = null
        var isAutoSaveEnabled = false
            get() = Companion.field
            private set
        var isUseStylusAsPen = false
            get() = Companion.field
            private set
        var isSignSignatureFieldWithStamps = false
            get() = Companion.field
            private set
        private var mShowLeadingNavButton = false
        var currentActivity: FlutterDocumentActivity? = null
            private set
        private val sFlutterLoadResult: AtomicReference<Result> = AtomicReference()
        private val sExportAnnotationCommandEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sExportBookmarkEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sDocumentLoadedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sDocumentErrorEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sAnnotationChangedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sAnnotationsSelectionEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sFormFieldChangedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sLongPressMenuPressedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sAnnotationMenuPressedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sLeadingNavButtonPressedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sPageChangedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private val sZoomChangedEventEmitter: AtomicReference<EventSink> = AtomicReference()
        private var mSelectedAnnots: HashMap<Annot, Integer>? = null
        fun openDocument(packageContext: Context, document: String?, password: String?, configStr: String?) {
            val builder: ViewerConfig.Builder = Builder().multiTabEnabled(false).showCloseTabOption(false)
            val toolManagerBuilder: ToolManagerBuilder = ToolManagerBuilder.from()
            val pdfViewCtrlConfig: PDFViewCtrlConfig = PDFViewCtrlConfig.getDefaultConfig(packageContext)
            val configInfo: PluginUtils.ConfigInfo = PluginUtils.handleOpenDocument(builder, toolManagerBuilder, pdfViewCtrlConfig, document, packageContext, configStr)
            mLongPressMenuItems = configInfo.getLongPressMenuItems()
            mLongPressMenuOverrideItems = configInfo.getLongPressMenuOverrideItems()
            mHideAnnotationMenuTools = configInfo.getHideAnnotationMenuTools()
            mAnnotationMenuItems = configInfo.getAnnotationMenuItems()
            mAnnotationMenuOverrideItems = configInfo.getAnnotationMenuOverrideItems()
            isAutoSaveEnabled = configInfo.isAutoSaveEnabled()
            isUseStylusAsPen = configInfo.isUseStylusAsPen()
            isSignSignatureFieldWithStamps = configInfo.isSignSignatureFieldWithStamps()
            mShowLeadingNavButton = configInfo.isShowLeadingNavButton()
            if (mShowLeadingNavButton) {
                openDocument(packageContext, configInfo.getFileUri(), password, configInfo.getCustomHeaderJson(), builder.build())
            } else {
                openDocument(packageContext, configInfo.getFileUri(), password, configInfo.getCustomHeaderJson(), builder.build(), 0)
            }
        }

        fun openDocument(packageContext: Context, fileUri: Uri?, password: String?, @Nullable customHeaders: JSONObject?, config: ViewerConfig?) {
            openDocument(packageContext, fileUri, password, customHeaders, config, DEFAULT_NAV_ICON_ID)
        }

        fun openDocument(packageContext: Context, fileUri: Uri?, password: String?, @Nullable customHeaders: JSONObject?, config: ViewerConfig?, @DrawableRes navIconId: Int) {
            if (currentActivity != null && currentActivity!!.pdfViewCtrlTabHostFragment != null) {
                val viewerBuilder: ViewerBuilder2 = ViewerBuilder2.withUri(fileUri, password)
                        .usingCustomHeaders(customHeaders)
                        .usingConfig(config)
                        .usingNavIcon(navIconId)
                currentActivity!!.pdfViewCtrlTabHostFragment.onOpenAddNewTab(viewerBuilder.createBundle(packageContext))
            } else {
                val intentBuilder: DocumentActivity.IntentBuilder = DocumentActivity.IntentBuilder.fromActivityClass(packageContext, FlutterDocumentActivity::class.java)
                if (null != fileUri) {
                    intentBuilder.withUri(fileUri)
                }
                if (null != password) {
                    intentBuilder.usingPassword(password)
                }
                if (null != customHeaders) {
                    intentBuilder.usingCustomHeaders(customHeaders)
                }
                intentBuilder.usingNavIcon(navIconId)
                intentBuilder.usingConfig(config)
                intentBuilder.usingNewUi(true)
                packageContext.startActivity(intentBuilder.build())
            }
        }

        fun setLeadingNavButtonIcon(leadingNavButtonIcon: String?) {
            val documentActivity = currentActivity
            if (documentActivity != null) {
                val pdfViewCtrlTabHostFragment: PdfViewCtrlTabHostFragment2? = documentActivity.pdfViewCtrlTabHostFragment
                if (mShowLeadingNavButton && pdfViewCtrlTabHostFragment != null && pdfViewCtrlTabHostFragment.getToolbar() != null) {
                    val res: Int = Utils.getResourceDrawable(pdfViewCtrlTabHostFragment.getToolbar().getContext(), leadingNavButtonIcon)
                    if (res != 0) {
                        pdfViewCtrlTabHostFragment.getToolbar().setNavigationIcon(res)
                    }
                }
            }
        }

        fun setExportAnnotationCommandEventEmitter(emitter: EventSink?) {
            sExportAnnotationCommandEventEmitter.set(emitter)
        }

        fun setExportBookmarkEventEmitter(emitter: EventSink?) {
            sExportBookmarkEventEmitter.set(emitter)
        }

        fun setDocumentLoadedEventEmitter(emitter: EventSink?) {
            sDocumentLoadedEventEmitter.set(emitter)
        }

        fun setDocumentErrorEventEmitter(emitter: EventSink?) {
            sDocumentErrorEventEmitter.set(emitter)
        }

        fun setAnnotationChangedEventEmitter(emitter: EventSink?) {
            sAnnotationChangedEventEmitter.set(emitter)
        }

        fun setAnnotationsSelectionEventEmitter(emitter: EventSink?) {
            sAnnotationsSelectionEventEmitter.set(emitter)
        }

        fun setFormFieldValueChangedEventEmitter(emitter: EventSink?) {
            sFormFieldChangedEventEmitter.set(emitter)
        }

        fun setLongPressMenuPressedEventEmitter(emitter: EventSink?) {
            sLongPressMenuPressedEventEmitter.set(emitter)
        }

        fun setAnnotationMenuPressedEventEmitter(emitter: EventSink?) {
            sAnnotationMenuPressedEventEmitter.set(emitter)
        }

        fun setLeadingNavButtonPressedEventEmitter(emitter: EventSink?) {
            sLeadingNavButtonPressedEventEmitter.set(emitter)
        }

        fun setPageChangedEventEmitter(emitter: EventSink?) {
            sPageChangedEventEmitter.set(emitter)
        }

        fun setZoomChangedEventEmitter(emitter: EventSink?) {
            sZoomChangedEventEmitter.set(emitter)
        }

        fun setFlutterLoadResult(result: Result?) {
            sFlutterLoadResult.set(result)
        }
    }
}