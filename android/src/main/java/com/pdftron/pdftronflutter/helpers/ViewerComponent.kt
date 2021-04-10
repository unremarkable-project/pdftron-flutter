package com.pdftron.pdftronflutter.helpers

import com.pdftron.pdf.Annot
import com.pdftron.pdf.PDFDoc
import com.pdftron.pdf.PDFViewCtrl
import com.pdftron.pdf.controls.PdfViewCtrlTabFragment2
import com.pdftron.pdf.controls.PdfViewCtrlTabHostFragment2
import com.pdftron.pdf.tools.ToolManager
import java.util.ArrayList
import java.util.HashMap
import io.flutter.plugin.common.EventChannel
import io.flutter.plugin.common.MethodChannel

interface ViewerComponent {
    val longPressMenuItems: ArrayList<String?>?
    val longPressMenuOverrideItems: ArrayList<String?>?
    val hideAnnotationMenuTools: ArrayList<String?>?
    val annotationMenuItems: ArrayList<String?>?
    val annotationMenuOverrideItems: ArrayList<String?>?
    val isAutoSaveEnabled: Boolean
    val isUseStylusAsPen: Boolean
    val isSignSignatureFieldWithStamps: Boolean
    val exportAnnotationCommandEventEmitter: EventChannel.EventSink?
    val exportBookmarkEventEmitter: EventChannel.EventSink?
    val documentLoadedEventEmitter: EventChannel.EventSink?
    val documentErrorEventEmitter: EventChannel.EventSink?
    val annotationChangedEventEmitter: EventChannel.EventSink?
    val annotationsSelectedEventEmitter: EventChannel.EventSink?
    val formFieldValueChangedEventEmitter: EventChannel.EventSink?
    val longPressMenuPressedEventEmitter: EventChannel.EventSink?
    val annotationMenuPressedEventEmitter: EventChannel.EventSink?
    val leadingNavButtonPressedEventEmitter: EventChannel.EventSink?
    val pageChangedEventEmitter: EventChannel.EventSink?
    val zoomChangedEventEmitter: EventChannel.EventSink?
    val flutterLoadResult: MethodChannel.Result?
    var selectedAnnots: HashMap<Annot?, Integer?>?

    // Convenience
    @get:Nullable
    val pdfViewCtrlTabHostFragment: PdfViewCtrlTabHostFragment2?

    @get:Nullable
    val pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2?

    @get:Nullable
    val pdfViewCtrl: PDFViewCtrl?

    @get:Nullable
    val toolManager: ToolManager?

    @get:Nullable
    val pdfDoc: PDFDoc?

    @get:NonNull
    val impl: ViewerImpl?
}