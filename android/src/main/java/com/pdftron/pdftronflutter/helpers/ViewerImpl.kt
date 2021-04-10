package com.pdftron.pdftronflutter.helpers

import android.os.Bundle
import android.view.View
import com.pdftron.pdf.Annot
import com.pdftron.pdf.Field
import com.pdftron.pdf.PDFViewCtrl
import com.pdftron.pdf.annots.Widget
import com.pdftron.pdf.controls.PdfViewCtrlTabFragment2
import com.pdftron.pdf.tools.QuickMenu
import com.pdftron.pdf.tools.QuickMenuItem
import com.pdftron.pdf.tools.ToolManager
import com.pdftron.pdf.utils.AnnotUtils
import com.pdftron.pdf.utils.ViewerUtils
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import io.flutter.plugin.common.EventChannel
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_ANNOTATION_LIST
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_ANNOTATION_MENU_ITEM
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_LONG_PRESS_MENU_ITEM
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_LONG_PRESS_TEXT
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_PAGE_NUMBER
import com.pdftron.pdftronflutter.helpers.PluginUtils.KEY_PREVIOUS_PAGE_NUMBER
import com.pdftron.pdftronflutter.helpers.PluginUtils.checkQuickMenu
import com.pdftron.pdftronflutter.helpers.PluginUtils.convStringToAnnotType
import com.pdftron.pdftronflutter.helpers.PluginUtils.getAnnotationsData

class ViewerImpl(@NonNull component: ViewerComponent) {
    private val mViewerComponent: ViewerComponent
    fun addListeners(@NonNull toolManager: ToolManager) {
        toolManager.addAnnotationModificationListener(mAnnotationModificationListener)
        toolManager.addAnnotationsSelectionListener(mAnnotationsSelectionListener)
        toolManager.addPdfDocModificationListener(mPdfDocModificationListener)
    }

    fun addListeners(@NonNull pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2) {
        pdfViewCtrlTabFragment.addQuickMenuListener(mQuickMenuListener)
    }

    fun addListeners(@NonNull pdfViewCtrl: PDFViewCtrl) {
        pdfViewCtrl.addOnCanvasSizeChangeListener(mOnCanvasSizeChangedListener)
        pdfViewCtrl.addPageChangeListener(mPageChangedListener)
    }

    fun removeListeners(@NonNull toolManager: ToolManager) {
        toolManager.removeAnnotationModificationListener(mAnnotationModificationListener)
        toolManager.removeAnnotationsSelectionListener(mAnnotationsSelectionListener)
        toolManager.removePdfDocModificationListener(mPdfDocModificationListener)
    }

    fun removeListeners(@NonNull pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2) {
        pdfViewCtrlTabFragment.removeQuickMenuListener(mQuickMenuListener)
    }

    fun removeListeners(@NonNull pdfViewCtrl: PDFViewCtrl) {
        pdfViewCtrl.removeOnCanvasSizeChangeListener(mOnCanvasSizeChangedListener)
        pdfViewCtrl.removePageChangeListener(mPageChangedListener)
    }

    private val mAnnotationModificationListener: ToolManager.AnnotationModificationListener = object : AnnotationModificationListener() {
        @Override
        fun onAnnotationsAdded(map: Map<Annot?, Integer?>?) {
            PluginUtils.emitAnnotationChangedEvent(PluginUtils.KEY_ACTION_ADD, map, mViewerComponent)
            PluginUtils.emitExportAnnotationCommandEvent(PluginUtils.KEY_ACTION_ADD, map, mViewerComponent)
        }

        @Override
        fun onAnnotationsPreModify(map: Map<Annot?, Integer?>?) {
        }

        @Override
        fun onAnnotationsModified(map: Map<Annot?, Integer?>, bundle: Bundle?) {
            PluginUtils.emitAnnotationChangedEvent(PluginUtils.KEY_ACTION_MODIFY, map, mViewerComponent)
            PluginUtils.emitExportAnnotationCommandEvent(PluginUtils.KEY_ACTION_MODIFY, map, mViewerComponent)
            val fieldsArray = JSONArray()
            for (annot in map.keySet()) {
                try {
                    if (annot != null && annot.isValid() && annot.getType() === Annot.e_Widget) {
                        var fieldName: String? = null
                        var fieldValue: String? = null
                        val widget = Widget(annot)
                        val field: Field = widget.getField()
                        if (field != null) {
                            fieldName = field.getName()
                            fieldValue = field.getValueAsString()
                        }
                        if (fieldName != null && fieldValue != null) {
                            val fieldObject = JSONObject()
                            fieldObject.put(PluginUtils.KEY_FIELD_NAME, fieldName)
                            fieldObject.put(PluginUtils.KEY_FIELD_VALUE, fieldValue)
                            fieldsArray.put(fieldObject)
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
            val eventSink: EventChannel.EventSink = mViewerComponent.getFormFieldValueChangedEventEmitter()
            if (eventSink != null) {
                eventSink.success(fieldsArray.toString())
            }
        }

        @Override
        fun onAnnotationsPreRemove(map: Map<Annot?, Integer?>?) {
            PluginUtils.emitAnnotationChangedEvent(PluginUtils.KEY_ACTION_DELETE, map, mViewerComponent)
            PluginUtils.emitExportAnnotationCommandEvent(PluginUtils.KEY_ACTION_DELETE, map, mViewerComponent)
        }

        @Override
        fun onAnnotationsRemoved(map: Map<Annot?, Integer?>?) {
        }

        @Override
        fun onAnnotationsRemovedOnPage(i: Int) {
        }

        @Override
        fun annotationsCouldNotBeAdded(s: String?) {
        }
    }
    private val mAnnotationsSelectionListener: ToolManager.AnnotationsSelectionListener = object : AnnotationsSelectionListener() {
        @Override
        fun onAnnotationsSelectionChanged(hashMap: HashMap<Annot?, Integer?>?) {
            PluginUtils.emitAnnotationsSelectedEvent(hashMap, mViewerComponent)
        }
    }
    private val mPdfDocModificationListener: ToolManager.PdfDocModificationListener = object : PdfDocModificationListener() {
        @Override
        fun onBookmarkModified() {
            var bookmarkJson: String? = null
            try {
                bookmarkJson = PluginUtils.generateBookmarkJson(mViewerComponent)
            } catch (e: JSONException) {
                e.printStackTrace()
            }
            val eventSink: EventChannel.EventSink = mViewerComponent.getExportBookmarkEventEmitter()
            if (eventSink != null) {
                eventSink.success(bookmarkJson)
            }
        }

        @Override
        fun onPagesCropped() {
        }

        @Override
        fun onPagesAdded(list: List<Integer?>?) {
        }

        @Override
        fun onPagesDeleted(list: List<Integer?>?) {
        }

        @Override
        fun onPagesRotated(list: List<Integer?>?) {
        }

        @Override
        fun onPageMoved(i: Int, i1: Int) {
        }

        @Override
        fun onPageLabelsChanged() {
        }

        @Override
        fun onAllAnnotationsRemoved() {
        }

        @Override
        fun onAnnotationAction() {
        }
    }
    private val mQuickMenuListener: ToolManager.QuickMenuListener = object : QuickMenuListener() {
        @Override
        fun onQuickMenuClicked(quickMenuItem: QuickMenuItem): Boolean {
            val menuStr: String = PluginUtils.convQuickMenuIdToString(quickMenuItem.getItemId())

            // check if this is an override menu
            var result = false
            if (mViewerComponent.getPdfViewCtrl() != null && mViewerComponent.getToolManager() != null) {

                // If annotations are selected - annotationMenu; Or: - longPressMenu
                if (PluginUtils.hasAnnotationsSelected(mViewerComponent)) {
                    if (mViewerComponent.getAnnotationMenuOverrideItems() != null) {
                        result = mViewerComponent.getAnnotationMenuOverrideItems().contains(menuStr)
                    }
                    try {
                        val annotationMenuObject = JSONObject()
                        annotationMenuObject.put(KEY_ANNOTATION_MENU_ITEM, menuStr)
                        annotationMenuObject.put(KEY_ANNOTATION_LIST, getAnnotationsData(mViewerComponent))
                        val eventSink: EventChannel.EventSink = mViewerComponent.getAnnotationMenuPressedEventEmitter()
                        if (eventSink != null) {
                            eventSink.success(annotationMenuObject.toString())
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                } else {
                    if (mViewerComponent.getLongPressMenuOverrideItems() != null) {
                        result = mViewerComponent.getLongPressMenuOverrideItems().contains(menuStr)
                    }
                    try {
                        val longPressMenuObject = JSONObject()
                        longPressMenuObject.put(KEY_LONG_PRESS_MENU_ITEM, menuStr)
                        longPressMenuObject.put(KEY_LONG_PRESS_TEXT, ViewerUtils.getSelectedString(mViewerComponent.getPdfViewCtrl()))
                        val eventSink: EventChannel.EventSink = mViewerComponent.getLongPressMenuPressedEventEmitter()
                        if (eventSink != null) {
                            eventSink.success(longPressMenuObject.toString())
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
            return result
        }

        @Override
        fun onShowQuickMenu(quickMenu: QuickMenu, @Nullable annot: Annot?): Boolean {
            if (mViewerComponent.getHideAnnotationMenuTools() != null && annot != null && mViewerComponent.getPdfViewCtrl() != null) {
                for (tool in mViewerComponent.getHideAnnotationMenuTools()) {
                    val type: Int = convStringToAnnotType(tool)
                    var shouldUnlockRead = false
                    try {
                        mViewerComponent.getPdfViewCtrl().docLockRead()
                        shouldUnlockRead = true
                        val annotType: Int = AnnotUtils.getAnnotType(annot)
                        if (annotType == type) {
                            mViewerComponent.getPdfViewCtrl().docUnlockRead()
                            return true
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    } finally {
                        if (shouldUnlockRead) {
                            mViewerComponent.getPdfViewCtrl().docUnlockRead()
                        }
                    }
                }
            }

            // remove unwanted items
            if (mViewerComponent.getAnnotationMenuItems() != null && annot != null) {
                val removeList: List<QuickMenuItem> = ArrayList()
                checkQuickMenu(quickMenu.getFirstRowMenuItems(), mViewerComponent.getAnnotationMenuItems(), removeList)
                checkQuickMenu(quickMenu.getSecondRowMenuItems(), mViewerComponent.getAnnotationMenuItems(), removeList)
                checkQuickMenu(quickMenu.getOverflowMenuItems(), mViewerComponent.getAnnotationMenuItems(), removeList)
                quickMenu.removeMenuEntries(removeList)
                if (quickMenu.getFirstRowMenuItems().size() === 0) {
                    quickMenu.setDividerVisibility(View.GONE)
                }
            }
            if (mViewerComponent.getLongPressMenuItems() != null && null == annot) {
                val removeList: List<QuickMenuItem> = ArrayList()
                checkQuickMenu(quickMenu.getFirstRowMenuItems(), mViewerComponent.getLongPressMenuItems(), removeList)
                checkQuickMenu(quickMenu.getSecondRowMenuItems(), mViewerComponent.getLongPressMenuItems(), removeList)
                checkQuickMenu(quickMenu.getOverflowMenuItems(), mViewerComponent.getLongPressMenuItems(), removeList)
                quickMenu.removeMenuEntries(removeList)
                if (quickMenu.getFirstRowMenuItems().size() === 0) {
                    quickMenu.setDividerVisibility(View.GONE)
                }
            }
            return false
        }

        @Override
        fun onQuickMenuShown() {
        }

        @Override
        fun onQuickMenuDismissed() {
        }
    }
    private val mOnCanvasSizeChangedListener: PDFViewCtrl.OnCanvasSizeChangeListener = object : OnCanvasSizeChangeListener() {
        @Override
        fun onCanvasSizeChanged() {
            val eventSink: EventChannel.EventSink = mViewerComponent.getZoomChangedEventEmitter()
            if (eventSink != null && mViewerComponent.getPdfViewCtrl() != null) {
                eventSink.success(mViewerComponent.getPdfViewCtrl().getZoom())
            }
        }
    }
    private val mPageChangedListener: PDFViewCtrl.PageChangeListener = object : PageChangeListener() {
        @Override
        fun onPageChange(old_page: Int, cur_page: Int, pageChangeState: PDFViewCtrl.PageChangeState) {
            val eventSink: EventChannel.EventSink = mViewerComponent.getPageChangedEventEmitter()
            if (eventSink != null && (old_page != cur_page || pageChangeState === PDFViewCtrl.PageChangeState.END)) {
                val resultObject = JSONObject()
                try {
                    resultObject.put(KEY_PREVIOUS_PAGE_NUMBER, old_page)
                    resultObject.put(KEY_PAGE_NUMBER, cur_page)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
                eventSink.success(resultObject.toString())
            }
        }
    }

    init {
        mViewerComponent = component
    }
}