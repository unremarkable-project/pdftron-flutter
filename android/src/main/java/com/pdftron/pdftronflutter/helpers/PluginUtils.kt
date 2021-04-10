package com.pdftron.pdftronflutter.helpers

import android.content.ContentResolver

object PluginUtils {
    const val KEY_LICENSE_KEY = "licenseKey"
    const val KEY_DOCUMENT = "document"
    const val KEY_PASSWORD = "password"
    const val KEY_CONFIG = "config"
    const val KEY_XFDF_COMMAND = "xfdfCommand"
    const val KEY_XFDF = "xfdf"
    const val KEY_BOOKMARK_JSON = "bookmarkJson"
    const val KEY_PAGE_NUMBER = "pageNumber"
    const val KEY_TOOL_MODE = "toolMode"
    const val KEY_FIELD_NAMES = "fieldNames"
    const val KEY_FLAG = "flag"
    const val KEY_FLAG_VALUE = "flagValue"
    const val KEY_FIELDS = "fields"
    const val KEY_ANNOTATION_LIST = "annotations"
    const val KEY_ANNOTATION = "annotation"
    const val KEY_FORMS_ONLY = "formsOnly"
    const val KEY_ANNOTATIONS_WITH_FLAGS = "annotationsWithFlags"
    const val KEY_LEADING_NAV_BUTTON_ICON = "leadingNavButtonIcon"
    const val KEY_CONFIG_DISABLED_ELEMENTS = "disabledElements"
    const val KEY_CONFIG_DISABLED_TOOLS = "disabledTools"
    const val KEY_CONFIG_MULTI_TAB_ENABLED = "multiTabEnabled"
    const val KEY_CONFIG_CUSTOM_HEADERS = "customHeaders"
    const val KEY_CONFIG_HIDE_THUMBNAIL_FILTER_MODES = "hideThumbnailFilterModes"
    const val KEY_CONFIG_LONG_PRESS_MENU_ENABLED = "longPressMenuEnabled"
    const val KEY_CONFIG_LONG_PRESS_MENU_ITEMS = "longPressMenuItems"
    const val KEY_CONFIG_OVERRIDE_LONG_PRESS_MENU_BEHAVIOR = "overrideLongPressMenuBehavior"
    const val KEY_CONFIG_HIDE_ANNOTATION_MENU = "hideAnnotationMenu"
    const val KEY_CONFIG_ANNOTATION_MENU_ITEMS = "annotationMenuItems"
    const val KEY_CONFIG_OVERRIDE_ANNOTATION_MENU_BEHAVIOR = "overrideAnnotationMenuBehavior"
    const val KEY_CONFIG_AUTO_SAVE_ENABLED = "autoSaveEnabled"
    const val KEY_CONFIG_PAGE_CHANGE_ON_TAP = "pageChangeOnTap"
    const val KEY_CONFIG_SHOW_SAVED_SIGNATURES = "showSavedSignatures"
    const val KEY_CONFIG_USE_STYLUS_AS_PEN = "useStylusAsPen"
    const val KEY_CONFIG_SIGN_SIGNATURE_FIELD_WITH_STAMPS = "signSignatureFieldWithStamps"
    const val KEY_CONFIG_SELECT_ANNOTATION_AFTER_CREATION = "selectAnnotationAfterCreation"
    const val KEY_CONFIG_PAGE_INDICATOR_ENABLED = "pageIndicatorEnabled"
    const val KEY_CONFIG_FOLLOW_SYSTEM_DARK_MODE = "followSystemDarkMode"
    const val KEY_CONFIG_ANNOTATION_TOOLBARS = "annotationToolbars"
    const val KEY_CONFIG_HIDE_DEFAULT_ANNOTATION_TOOLBARS = "hideDefaultAnnotationToolbars"
    const val KEY_CONFIG_HIDE_ANNOTATION_TOOLBAR_SWITCHER = "hideAnnotationToolbarSwitcher"
    const val KEY_CONFIG_HIDE_TOP_TOOLBARS = "hideTopToolbars"
    const val KEY_CONFIG_HIDE_TOP_APP_NAV_BAR = "hideTopAppNavBar"
    const val KEY_CONFIG_HIDE_BOTTOM_TOOLBAR = "hideBottomToolbar"
    const val KEY_CONFIG_SHOW_LEADING_NAV_BUTTON = "showLeadingNavButton"
    const val KEY_CONFIG_READ_ONLY = "readOnly"
    const val KEY_CONFIG_THUMBNAIL_VIEW_EDITING_ENABLED = "thumbnailViewEditingEnabled"
    const val KEY_CONFIG_ANNOTATION_AUTHOR = "annotationAuthor"
    const val KEY_CONFIG_CONTINUOUS_ANNOTATION_EDITING = "continuousAnnotationEditing"
    const val KEY_CONFIG_TAB_TITLE = "tabTitle"
    const val KEY_X1 = "x1"
    const val KEY_Y1 = "y1"
    const val KEY_X2 = "x2"
    const val KEY_Y2 = "y2"
    const val KEY_WIDTH = "width"
    const val KEY_HEIGHT = "height"
    const val KEY_RECT = "rect"
    const val KEY_FIELD_NAME = "fieldName"
    const val KEY_FIELD_VALUE = "fieldValue"
    const val KEY_PREVIOUS_PAGE_NUMBER = "previousPageNumber"
    const val KEY_ANNOTATION_ID = "id"
    const val KEY_ACTION_ADD = "add"
    const val KEY_ACTION_MODIFY = "modify"
    const val KEY_ACTION_DELETE = "delete"
    const val KEY_ACTION = "action"
    const val KEY_ANNOTATION_FLAG_LISTS = "flags"
    const val KEY_ANNOTATION_FLAG = "flag"
    const val KEY_ANNOTATION_FLAG_VALUE = "flagValue"
    const val KEY_ANNOTATION_MENU_ITEM = "annotationMenuItem"
    const val KEY_LONG_PRESS_MENU_ITEM = "longPressMenuItem"
    const val KEY_LONG_PRESS_TEXT = "longPressText"
    const val EVENT_EXPORT_ANNOTATION_COMMAND = "export_annotation_command_event"
    const val EVENT_EXPORT_BOOKMARK = "export_bookmark_event"
    const val EVENT_DOCUMENT_LOADED = "document_loaded_event"
    const val EVENT_DOCUMENT_ERROR = "document_error_event"
    const val EVENT_ANNOTATION_CHANGED = "annotation_changed_event"
    const val EVENT_ANNOTATIONS_SELECTED = "annotations_selected_event"
    const val EVENT_FORM_FIELD_VALUE_CHANGED = "form_field_value_changed_event"
    const val EVENT_LONG_PRESS_MENU_PRESSED = "long_press_menu_pressed_event"
    const val EVENT_ANNOTATION_MENU_PRESSED = "annotation_menu_pressed_event"
    const val EVENT_LEADING_NAV_BUTTON_PRESSED = "leading_nav_button_pressed_event"
    const val EVENT_PAGE_CHANGED = "page_changed_event"
    const val EVENT_ZOOM_CHANGED = "zoom_changed_event"
    const val FUNCTION_GET_PLATFORM_VERSION = "getPlatformVersion"
    const val FUNCTION_GET_VERSION = "getVersion"
    const val FUNCTION_INITIALIZE = "initialize"
    const val FUNCTION_OPEN_DOCUMENT = "openDocument"
    const val FUNCTION_IMPORT_ANNOTATION_COMMAND = "importAnnotationCommand"
    const val FUNCTION_IMPORT_BOOKMARK_JSON = "importBookmarkJson"
    const val FUNCTION_SAVE_DOCUMENT = "saveDocument"
    const val FUNCTION_COMMIT_TOOL = "commitTool"
    const val FUNCTION_GET_PAGE_COUNT = "getPageCount"
    const val FUNCTION_HANDLE_BACK_BUTTON = "handleBackButton"
    const val FUNCTION_GET_PAGE_CROP_BOX = "getPageCropBox"
    const val FUNCTION_SET_TOOL_MODE = "setToolMode"
    const val FUNCTION_SET_FLAG_FOR_FIELDS = "setFlagForFields"
    const val FUNCTION_SET_VALUES_FOR_FIELDS = "setValuesForFields"
    const val FUNCTION_IMPORT_ANNOTATIONS = "importAnnotations"
    const val FUNCTION_EXPORT_ANNOTATIONS = "exportAnnotations"
    const val FUNCTION_FLATTEN_ANNOTATIONS = "flattenAnnotations"
    const val FUNCTION_DELETE_ANNOTATIONS = "deleteAnnotations"
    const val FUNCTION_SELECT_ANNOTATION = "selectAnnotation"
    const val FUNCTION_SET_FLAGS_FOR_ANNOTATIONS = "setFlagsForAnnotations"
    const val FUNCTION_SET_LEADING_NAV_BUTTON_ICON = "setLeadingNavButtonIcon"
    const val FUNCTION_CLOSE_ALL_TABS = "closeAllTabs"
    const val BUTTON_TOOLS = "toolsButton"
    const val BUTTON_SEARCH = "searchButton"
    const val BUTTON_SHARE = "shareButton"
    const val BUTTON_VIEW_CONTROLS = "viewControlsButton"
    const val BUTTON_THUMBNAILS = "thumbnailsButton"
    const val BUTTON_LISTS = "listsButton"
    const val BUTTON_THUMBNAIL_SLIDER = "thumbnailSlider"
    const val BUTTON_SAVE_COPY = "saveCopyButton"
    const val BUTTON_EDIT_PAGES = "editPagesButton"
    const val BUTTON_PRINT = "printButton"
    const val BUTTON_FILL_AND_SIGN = "fillAndSignButton"
    const val BUTTON_PREPARE_FORM = "prepareFormButton"
    const val BUTTON_REFLOW_MODE = "reflowModeButton"
    const val BUTTON_CLOSE = "closeButton"
    const val BUTTON_OUTLINE_LIST = "outlineListButton"
    const val BUTTON_ANNOTATION_LIST = "annotationListButton"
    const val BUTTON_USER_BOOKMARK_LIST = "userBookmarkListButton"
    const val BUTTON_EDIT_MENU = "editMenuButton"
    const val BUTTON_CROP_PAGE = "cropPageButton"
    const val BUTTON_MORE_ITEMS = "moreItemsButton"
    const val BUTTON_UNDO = "undo"
    const val BUTTON_REDO = "redo"
    const val TOOL_BUTTON_FREE_HAND = "freeHandToolButton"
    const val TOOL_BUTTON_HIGHLIGHT = "highlightToolButton"
    const val TOOL_BUTTON_UNDERLINE = "underlineToolButton"
    const val TOOL_BUTTON_SQUIGGLY = "squigglyToolButton"
    const val TOOL_BUTTON_STRIKEOUT = "strikeoutToolButton"
    const val TOOL_BUTTON_RECTANGLE = "rectangleToolButton"
    const val TOOL_BUTTON_ELLIPSE = "ellipseToolButton"
    const val TOOL_BUTTON_LINE = "lineToolButton"
    const val TOOL_BUTTON_ARROW = "arrowToolButton"
    const val TOOL_BUTTON_POLYLINE = "polylineToolButton"
    const val TOOL_BUTTON_POLYGON = "polygonToolButton"
    const val TOOL_BUTTON_CLOUD = "cloudToolButton"
    const val TOOL_BUTTON_SIGNATURE = "signatureToolButton"
    const val TOOL_BUTTON_FREE_TEXT = "freeTextToolButton"
    const val TOOL_BUTTON_STICKY = "stickyToolButton"
    const val TOOL_BUTTON_CALLOUT = "calloutToolButton"
    const val TOOL_BUTTON_STAMP = "stampToolButton"
    const val TOOL_ANNOTATION_CREATE_FREE_HAND = "AnnotationCreateFreeHand"
    const val TOOL_ANNOTATION_CREATE_TEXT_HIGHLIGHT = "AnnotationCreateTextHighlight"
    const val TOOL_ANNOTATION_CREATE_TEXT_UNDERLINE = "AnnotationCreateTextUnderline"
    const val TOOL_ANNOTATION_CREATE_TEXT_SQUIGGLY = "AnnotationCreateTextSquiggly"
    const val TOOL_ANNOTATION_CREATE_TEXT_STRIKEOUT = "AnnotationCreateTextStrikeout"
    const val TOOL_ANNOTATION_CREATE_RECTANGLE = "AnnotationCreateRectangle"
    const val TOOL_ANNOTATION_CREATE_ELLIPSE = "AnnotationCreateEllipse"
    const val TOOL_ANNOTATION_CREATE_LINE = "AnnotationCreateLine"
    const val TOOL_ANNOTATION_CREATE_ARROW = "AnnotationCreateArrow"
    const val TOOL_ANNOTATION_CREATE_POLYLINE = "AnnotationCreatePolyline"
    const val TOOL_ANNOTATION_CREATE_POLYGON = "AnnotationCreatePolygon"
    const val TOOL_ANNOTATION_CREATE_POLYGON_CLOUD = "AnnotationCreatePolygonCloud"
    const val TOOL_ANNOTATION_CREATE_SIGNATURE = "AnnotationCreateSignature"
    const val TOOL_ANNOTATION_CREATE_FREE_TEXT = "AnnotationCreateFreeText"
    const val TOOL_ANNOTATION_CREATE_STICKY = "AnnotationCreateSticky"
    const val TOOL_ANNOTATION_CREATE_CALLOUT = "AnnotationCreateCallout"
    const val TOOL_ANNOTATION_CREATE_STAMP = "AnnotationCreateStamp"
    const val TOOL_ANNOTATION_CREATE_DISTANCE_MEASUREMENT = "AnnotationCreateDistanceMeasurement"
    const val TOOL_ANNOTATION_CREATE_PERIMETER_MEASUREMENT = "AnnotationCreatePerimeterMeasurement"
    const val TOOL_ANNOTATION_CREATE_AREA_MEASUREMENT = "AnnotationCreateAreaMeasurement"
    const val TOOL_ANNOTATION_CREATE_FILE_ATTACHMENT = "AnnotationCreateFileAttachment"
    const val TOOL_TEXT_SELECT = "TextSelect"
    const val TOOL_ANNOTATION_EDIT = "AnnotationEdit"
    const val TOOL_ANNOTATION_CREATE_SOUND = "AnnotationCreateSound"
    const val TOOL_ANNOTATION_CREATE_FREE_HIGHLIGHTER = "AnnotationCreateFreeHighlighter"
    const val TOOL_ANNOTATION_CREATE_RUBBER_STAMP = "AnnotationCreateRubberStamp"
    const val TOOL_ERASER = "Eraser"
    const val TOOL_ANNOTATION_CREATE_REDACTION = "AnnotationCreateRedaction"
    const val TOOL_ANNOTATION_CREATE_REDACTION_TEXT = "AnnotationCreateRedactionText"
    const val TOOL_ANNOTATION_CREATE_LINK = "AnnotationCreateLink"
    const val TOOL_ANNOTATION_CREATE_LINK_TEXT = "AnnotationCreateLinkText"
    const val TOOL_FORM_CREATE_TEXT_FIELD = "FormCreateTextField"
    const val TOOL_FORM_CREATE_CHECKBOX_FIELD = "FormCreateCheckboxField"
    const val TOOL_FORM_CREATE_SIGNATURE_FIELD = "FormCreateSignatureField"
    const val TOOL_FORM_CREATE_RADIO_FIELD = "FormCreateRadioField"
    const val TOOL_FORM_CREATE_COMBO_BOX_FIELD = "FormCreateComboBoxField"
    const val TOOL_FORM_CREATE_TOOL_BOX_FIELD = "FormCreateToolBoxField"
    const val TOOL_FORM_CREATE_LIST_BOX_FIELD = "FormCreateListBoxField"
    const val ANNOTATION_FLAG_HIDDEN = "hidden"
    const val ANNOTATION_FLAG_INVISIBLE = "invisible"
    const val ANNOTATION_FLAG_LOCKED = "locked"
    const val ANNOTATION_FLAG_LOCKED_CONTENTS = "lockedContents"
    const val ANNOTATION_FLAG_NO_ROTATE = "noRotate"
    const val ANNOTATION_FLAG_NO_VIEW = "noView"
    const val ANNOTATION_FLAG_NO_ZOOM = "noZoom"
    const val ANNOTATION_FLAG_PRINT = "print"
    const val ANNOTATION_FLAG_READ_ONLY = "readOnly"
    const val ANNOTATION_FLAG_TOGGLE_NO_VIEW = "toggleNoView"
    const val THUMBNAIL_FILTER_MODE_ANNOTATED = "annotated"
    const val THUMBNAIL_FILTER_MODE_BOOKMARKED = "bookmarked"
    const val MENU_ID_STRING_STYLE = "style"
    const val MENU_ID_STRING_NOTE = "note"
    const val MENU_ID_STRING_COPY = "copy"
    const val MENU_ID_STRING_DELETE = "delete"
    const val MENU_ID_STRING_FLATTEN = "flatten"
    const val MENU_ID_STRING_TEXT = "text"
    const val MENU_ID_STRING_EDIT_INK = "editInk"
    const val MENU_ID_STRING_SEARCH = "search"
    const val MENU_ID_STRING_SHARE = "share"
    const val MENU_ID_STRING_MARKUP_TYPE = "markupType"
    const val MENU_ID_STRING_SCREEN_CAPTURE = "screenCapture"
    const val MENU_ID_STRING_PLAY_SOUND = "playSound"
    const val MENU_ID_STRING_OPEN_ATTACHMENT = "openAttachment"
    const val MENU_ID_STRING_READ = "read"
    const val MENU_ID_STRING_CALIBRATE = "calibrate"
    const val MENU_ID_STRING_REDACT = "redact"
    const val MENU_ID_STRING_REDACTION = "redaction"
    const val MENU_ID_STRING_UNDERLINE = "underline"
    const val MENU_ID_STRING_STRIKEOUT = "strikeout"
    const val MENU_ID_STRING_SQUIGGLY = "squiggly"
    const val MENU_ID_STRING_LINK = "link"
    const val MENU_ID_STRING_HIGHLIGHT = "highlight"
    const val MENU_ID_STRING_SIGNATURE = "signature"
    const val MENU_ID_STRING_RECTANGLE = "rectangle"
    const val MENU_ID_STRING_LINE = "line"
    const val MENU_ID_STRING_FREE_HAND = "freeHand"
    const val MENU_ID_STRING_IMAGE = "image"
    const val MENU_ID_STRING_FORM_TEXT = "formText"
    const val MENU_ID_STRING_STICKY_NOTE = "stickyNote"
    const val MENU_ID_STRING_OVERFLOW = "overflow"
    const val MENU_ID_STRING_ERASER = "eraser"
    const val MENU_ID_STRING_STAMP = "rubberStamp"
    const val MENU_ID_STRING_PAGE_REDACTION = "pageRedaction"
    const val MENU_ID_STRING_RECT_REDACTION = "rectRedaction"
    const val MENU_ID_STRING_SEARCH_REDACTION = "searchRedaction"
    const val MENU_ID_STRING_SHAPE = "shape"
    const val MENU_ID_STRING_CLOUD = "cloud"
    const val MENU_ID_STRING_POLYGON = "polygon"
    const val MENU_ID_STRING_POLYLINE = "polyline"
    const val MENU_ID_STRING_FREE_HIGHLIGHTER = "freeHighlighter"
    const val MENU_ID_STRING_ARROW = "arrow"
    const val MENU_ID_STRING_OVAL = "oval"
    const val MENU_ID_STRING_CALLOUT = "callout"
    const val MENU_ID_STRING_MEASUREMENT = "measurement"
    const val MENU_ID_STRING_AREA_MEASUREMENT = "areaMeasurement"
    const val MENU_ID_STRING_PERIMETER_MEASUREMENT = "perimeterMeasurement"
    const val MENU_ID_STRING_RECT_AREA_MEASUREMENT = "rectAreaMeasurement"
    const val MENU_ID_STRING_RULER = "ruler"
    const val MENU_ID_STRING_FORM = "form"
    const val MENU_ID_STRING_FORM_COMBO_BOX = "formComboBox"
    const val MENU_ID_STRING_FORM_LIST_BOX = "formListBox"
    const val MENU_ID_STRING_FORM_CHECK_BOX = "formCheckBox"
    const val MENU_ID_STRING_FORM_SIGNATURE = "formSignature"
    const val MENU_ID_STRING_FORM_RADIO_GROUP = "formRadioGroup"
    const val MENU_ID_STRING_ATTACH = "attach"
    const val MENU_ID_STRING_FILE_ATTACHMENT = "fileAttachment"
    const val MENU_ID_STRING_SOUND = "sound"
    const val MENU_ID_STRING_FREE_TEXT = "freeText"
    const val MENU_ID_STRING_CROP = "crop"
    const val MENU_ID_STRING_CROP_OK = "crossOK"
    const val MENU_ID_STRING_CROP_CANCEL = "crossCancel"
    const val MENU_ID_STRING_DEFINE = "define"
    const val MENU_ID_STRING_FIELD_SIGNED = "fieldSigned"
    const val MENU_ID_STRING_FIRST_ROW_GROUP = "firstRowGroup"
    const val MENU_ID_STRING_SECOND_ROW_GROUP = "secondRowGroup"
    const val MENU_ID_STRING_GROUP = "group"
    const val MENU_ID_STRING_PASTE = "paste"
    const val MENU_ID_STRING_RECT_GROUP_SELECT = "rectGroupSelect"
    const val MENU_ID_STRING_SIGN_AND_SAVE = "signAndSave"
    const val MENU_ID_STRING_THICKNESS = "thickness"
    const val MENU_ID_STRING_TRANSLATE = "translate"
    const val MENU_ID_STRING_TYPE = "type"
    const val MENU_ID_STRING_UNGROUP = "ungroup"

    // Toolbars
    const val TAG_VIEW_TOOLBAR = "PDFTron_View"
    const val TAG_ANNOTATE_TOOLBAR = "PDFTron_Annotate"
    const val TAG_DRAW_TOOLBAR = "PDFTron_Draw"
    const val TAG_INSERT_TOOLBAR = "PDFTron_Insert"
    const val TAG_FILL_AND_SIGN_TOOLBAR = "PDFTron_Fill_and_Sign"
    const val TAG_PREPARE_FORM_TOOLBAR = "PDFTron_Prepare_Form"
    const val TAG_MEASURE_TOOLBAR = "PDFTron_Measure"
    const val TAG_PENS_TOOLBAR = "PDFTron_Pens"
    const val TAG_REDACTION_TOOLBAR = "PDFTron_redact"
    const val TAG_FAVORITE_TOOLBAR = "PDFTron_Favorite"

    // Custom toolbars
    const val TOOLBAR_KEY_ID = "id"
    const val TOOLBAR_KEY_NAME = "name"
    const val TOOLBAR_KEY_ICON = "icon"
    const val TOOLBAR_KEY_ITEMS = "items"
    fun handleOpenDocument(@NonNull builder: ViewerConfig.Builder, @NonNull toolManagerBuilder: ToolManagerBuilder,
                           @NonNull pdfViewCtrlConfig: PDFViewCtrlConfig?, @NonNull document: String?, @NonNull context: Context,
                           configStr: String?): ConfigInfo {
        var builder: ViewerConfig.Builder = builder
        var toolManagerBuilder: ToolManagerBuilder = toolManagerBuilder
        val configInfo = ConfigInfo()
        toolManagerBuilder.setOpenToolbar(true)
        val disabledTools: ArrayList<ToolManager.ToolMode> = ArrayList()
        val isBase64 = false
        val cacheDir: String = context.getCacheDir().getAbsolutePath()
        if (configStr != null && !configStr.equals("null")) {
            try {
                val configJson = JSONObject(configStr)
                if (!configJson.isNull(KEY_CONFIG_DISABLED_ELEMENTS)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_DISABLED_ELEMENTS)
                    disabledTools.addAll(disableElements(builder, array))
                }
                if (!configJson.isNull(KEY_CONFIG_DISABLED_TOOLS)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_DISABLED_TOOLS)
                    disabledTools.addAll(disableTools(array))
                }
                if (!configJson.isNull(KEY_CONFIG_MULTI_TAB_ENABLED)) {
                    val `val`: Boolean = configJson.getBoolean(KEY_CONFIG_MULTI_TAB_ENABLED)
                    builder.multiTabEnabled(`val`)
                }
                if (!configJson.isNull(KEY_CONFIG_CUSTOM_HEADERS)) {
                    val customHeaderJson: JSONObject = configJson.getJSONObject(KEY_CONFIG_CUSTOM_HEADERS)
                    configInfo.setCustomHeaderJson(customHeaderJson)
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_THUMBNAIL_FILTER_MODES)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_HIDE_THUMBNAIL_FILTER_MODES)
                    val hideList: ArrayList<ThumbnailsViewFragment.FilterModes> = ArrayList()
                    for (i in 0 until array.length()) {
                        val filterModeString: String = array.getString(i)
                        if (filterModeString.equals(THUMBNAIL_FILTER_MODE_ANNOTATED)) {
                            hideList.add(ThumbnailsViewFragment.FilterModes.ANNOTATED)
                        } else if (filterModeString.equals(THUMBNAIL_FILTER_MODE_BOOKMARKED)) {
                            hideList.add(ThumbnailsViewFragment.FilterModes.BOOKMARKED)
                        }
                    }
                    builder.hideThumbnailFilterModes(hideList.toArray(arrayOfNulls<ThumbnailsViewFragment.FilterModes>(0)))
                }
                if (!configJson.isNull(KEY_CONFIG_LONG_PRESS_MENU_ENABLED)) {
                    val longPressMenuEnabled: Boolean = configJson.getBoolean(KEY_CONFIG_LONG_PRESS_MENU_ENABLED)
                    toolManagerBuilder = toolManagerBuilder.setDisableQuickMenu(!longPressMenuEnabled)
                }
                if (!configJson.isNull(KEY_CONFIG_LONG_PRESS_MENU_ITEMS)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_LONG_PRESS_MENU_ITEMS)
                    val longPressMenuItems: ArrayList<String?> = convertJSONArrayToArrayList(array)
                    configInfo.setLongPressMenuItems(longPressMenuItems)
                }
                if (!configJson.isNull(KEY_CONFIG_OVERRIDE_LONG_PRESS_MENU_BEHAVIOR)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_OVERRIDE_LONG_PRESS_MENU_BEHAVIOR)
                    val longPressMenuOverrideItems: ArrayList<String?> = convertJSONArrayToArrayList(array)
                    configInfo.setLongPressMenuOverrideItems(longPressMenuOverrideItems)
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_ANNOTATION_MENU)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_HIDE_ANNOTATION_MENU)
                    val hideAnnotationMenuTools: ArrayList<String?> = convertJSONArrayToArrayList(array)
                    configInfo.setHideAnnotationMenuTools(hideAnnotationMenuTools)
                }
                if (!configJson.isNull(KEY_CONFIG_ANNOTATION_MENU_ITEMS)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_ANNOTATION_MENU_ITEMS)
                    val annotationMenuItems: ArrayList<String?> = convertJSONArrayToArrayList(array)
                    configInfo.setAnnotationMenuItems(annotationMenuItems)
                }
                if (!configJson.isNull(KEY_CONFIG_OVERRIDE_ANNOTATION_MENU_BEHAVIOR)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_OVERRIDE_ANNOTATION_MENU_BEHAVIOR)
                    val annotationMenuOverrideItems: ArrayList<String?> = convertJSONArrayToArrayList(array)
                    configInfo.setAnnotationMenuOverrideItems(annotationMenuOverrideItems)
                }
                if (!configJson.isNull(KEY_CONFIG_AUTO_SAVE_ENABLED)) {
                    val autoSaveEnabled: Boolean = configJson.getBoolean(KEY_CONFIG_AUTO_SAVE_ENABLED)
                    configInfo.isAutoSaveEnabled = autoSaveEnabled
                }
                if (!configJson.isNull(KEY_CONFIG_PAGE_CHANGE_ON_TAP)) {
                    val pageChangeOnTap: Boolean = configJson.getBoolean(KEY_CONFIG_PAGE_CHANGE_ON_TAP)
                    PdfViewCtrlSettingsManager.setAllowPageChangeOnTap(context, pageChangeOnTap)
                }
                if (!configJson.isNull(KEY_CONFIG_SHOW_SAVED_SIGNATURES)) {
                    val showSavedSignatures: Boolean = configJson.getBoolean(KEY_CONFIG_SHOW_SAVED_SIGNATURES)
                    toolManagerBuilder = toolManagerBuilder.setShowSavedSignatures(showSavedSignatures)
                }
                if (!configJson.isNull(KEY_CONFIG_USE_STYLUS_AS_PEN)) {
                    val useStylusAsPen: Boolean = configJson.getBoolean(KEY_CONFIG_USE_STYLUS_AS_PEN)
                    configInfo.isUseStylusAsPen = useStylusAsPen
                }
                if (!configJson.isNull(KEY_CONFIG_SIGN_SIGNATURE_FIELD_WITH_STAMPS)) {
                    val signSignatureFieldWithStamps: Boolean = configJson.getBoolean(KEY_CONFIG_SIGN_SIGNATURE_FIELD_WITH_STAMPS)
                    configInfo.isSignSignatureFieldWithStamps = signSignatureFieldWithStamps
                }
                if (!configJson.isNull(KEY_CONFIG_SELECT_ANNOTATION_AFTER_CREATION)) {
                    val selectAnnotationAfterCreation: Boolean = configJson.getBoolean(KEY_CONFIG_SELECT_ANNOTATION_AFTER_CREATION)
                    toolManagerBuilder.setAutoSelect(selectAnnotationAfterCreation)
                }
                if (!configJson.isNull(KEY_CONFIG_PAGE_INDICATOR_ENABLED)) {
                    val pageIndicatorEnabled: Boolean = configJson.getBoolean(KEY_CONFIG_PAGE_INDICATOR_ENABLED)
                    builder = builder.showPageNumberIndicator(pageIndicatorEnabled)
                }
                if (!configJson.isNull(KEY_CONFIG_FOLLOW_SYSTEM_DARK_MODE)) {
                    val followSystem: Boolean = configJson.getBoolean(KEY_CONFIG_FOLLOW_SYSTEM_DARK_MODE)
                    PdfViewCtrlSettingsManager.setFollowSystemDarkMode(context, followSystem)
                }
                if (!configJson.isNull(KEY_CONFIG_ANNOTATION_TOOLBARS)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_ANNOTATION_TOOLBARS)
                    setAnnotationBars(array, builder)
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_DEFAULT_ANNOTATION_TOOLBARS)) {
                    val array: JSONArray = configJson.getJSONArray(KEY_CONFIG_HIDE_DEFAULT_ANNOTATION_TOOLBARS)
                    val tagList: ArrayList<String> = ArrayList()
                    for (i in 0 until array.length()) {
                        val tag: String = array.getString(i)
                        if (!Utils.isNullOrEmpty(tag)) {
                            tagList.add(tag)
                        }
                    }
                    builder = builder.hideToolbars(tagList.toArray(arrayOfNulls<String>(tagList.size())))
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_ANNOTATION_TOOLBAR_SWITCHER)) {
                    val hideAnnotationToolbarSwitcher: Boolean = configJson.getBoolean(KEY_CONFIG_HIDE_ANNOTATION_TOOLBAR_SWITCHER)
                    builder = builder.showToolbarSwitcher(!hideAnnotationToolbarSwitcher)
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_TOP_TOOLBARS)) {
                    val hideTopToolbars: Boolean = configJson.getBoolean(KEY_CONFIG_HIDE_TOP_TOOLBARS)
                    builder = builder.showAppBar(!hideTopToolbars)
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_TOP_APP_NAV_BAR)) {
                    val hideTopAppNavBars: Boolean = configJson.getBoolean(KEY_CONFIG_HIDE_TOP_APP_NAV_BAR)
                    builder = builder.showTopToolbar(!hideTopAppNavBars)
                }
                if (!configJson.isNull(KEY_CONFIG_HIDE_BOTTOM_TOOLBAR)) {
                    val hideBottomToolbar: Boolean = configJson.getBoolean(KEY_CONFIG_HIDE_BOTTOM_TOOLBAR)
                    builder = builder.showBottomToolbar(!hideBottomToolbar)
                }
                if (!configJson.isNull(KEY_CONFIG_SHOW_LEADING_NAV_BUTTON)) {
                    val showLeadingNavButton: Boolean = configJson.getBoolean(KEY_CONFIG_SHOW_LEADING_NAV_BUTTON)
                    configInfo.isShowLeadingNavButton = showLeadingNavButton
                }
                if (!configJson.isNull(KEY_CONFIG_READ_ONLY)) {
                    val readOnly: Boolean = configJson.getBoolean(KEY_CONFIG_READ_ONLY)
                    builder.documentEditingEnabled(!readOnly)
                }
                if (!configJson.isNull(KEY_CONFIG_THUMBNAIL_VIEW_EDITING_ENABLED)) {
                    val thumbnailViewEditingEnabled: Boolean = configJson.getBoolean(KEY_CONFIG_THUMBNAIL_VIEW_EDITING_ENABLED)
                    builder.thumbnailViewEditingEnabled(thumbnailViewEditingEnabled)
                }
                if (!configJson.isNull(KEY_CONFIG_ANNOTATION_AUTHOR)) {
                    val annotationAuthor: String = configJson.getString(KEY_CONFIG_ANNOTATION_AUTHOR)
                    if (!annotationAuthor.isEmpty()) {
                        PdfViewCtrlSettingsManager.updateAuthorName(context, annotationAuthor)
                        PdfViewCtrlSettingsManager.setAnnotListShowAuthor(context, true)
                    }
                }
                if (!configJson.isNull(KEY_CONFIG_CONTINUOUS_ANNOTATION_EDITING)) {
                    val continuousAnnotationEditing: Boolean = configJson.getBoolean(KEY_CONFIG_CONTINUOUS_ANNOTATION_EDITING)
                    PdfViewCtrlSettingsManager.setContinuousAnnotationEdit(context, continuousAnnotationEditing)
                }
                if (!configJson.isNull(KEY_CONFIG_TAB_TITLE)) {
                    val tabTitle: String = configJson.getString(KEY_CONFIG_TAB_TITLE)
                    configInfo.tabTitle = tabTitle
                }
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
        val fileUri: Uri? = getUri(context, document, isBase64)
        configInfo.setFileUri(fileUri)
        if (fileUri != null) {
            builder.openUrlCachePath(cacheDir)
                    .saveCopyExportPath(cacheDir)
            if (disabledTools.size() > 0) {
                val modes: Array<ToolManager.ToolMode> = disabledTools.toArray(arrayOfNulls<ToolManager.ToolMode>(0))
                if (modes.size > 0) {
                    toolManagerBuilder.disableToolModes(modes)
                }
            }
        }
        builder.pdfViewCtrlConfig(pdfViewCtrlConfig)
                .toolManagerBuilder(toolManagerBuilder)
        return configInfo
    }

    @Throws(JSONException::class)
    private fun setAnnotationBars(array: JSONArray, builder: ViewerConfig.Builder) {
        var builder: ViewerConfig.Builder = builder
        for (i in 0 until array.length()) {
            val annotationBar: Object = array.get(i)
            if (annotationBar is String) {
                val tag = annotationBar as String
                if (isValidToolbarTag(tag)) {
                    builder = builder.addToolbarBuilder(
                            DefaultToolbars.getDefaultAnnotationToolbarBuilderByTag(tag)
                    )
                }
            } else if (annotationBar is JSONObject) {
                val `object`: JSONObject = annotationBar as JSONObject
                var toolbarId: String? = null
                var toolbarName: String? = null
                var toolbarIcon: String? = null
                var toolbarItems: JSONArray? = null
                if (!`object`.isNull(TOOLBAR_KEY_ID)) {
                    toolbarId = `object`.getString(TOOLBAR_KEY_ID)
                }
                if (!`object`.isNull(TOOLBAR_KEY_NAME)) {
                    toolbarName = `object`.getString(TOOLBAR_KEY_NAME)
                }
                if (!`object`.isNull(TOOLBAR_KEY_ICON)) {
                    toolbarIcon = `object`.getString(TOOLBAR_KEY_ICON)
                }
                if (!`object`.isNull(TOOLBAR_KEY_ITEMS)) {
                    toolbarItems = getJSONArrayFromJSONObject(`object`, TOOLBAR_KEY_ITEMS)
                }
                if (!Utils.isNullOrEmpty(toolbarId) && !Utils.isNullOrEmpty(toolbarName)
                        && toolbarItems != null && toolbarItems.length() > 0) {
                    val toolbarBuilder: AnnotationToolbarBuilder = AnnotationToolbarBuilder.withTag(toolbarId)
                            .setToolbarName(toolbarName)
                            .setIcon(convStringToToolbarDefaultIconRes(toolbarIcon))
                    for (j in 0 until toolbarItems.length()) {
                        val toolStr: String = toolbarItems.getString(j)
                        val buttonType: ToolbarButtonType? = convStringToToolbarType(toolStr)
                        val buttonId = convStringToButtonId(toolStr)
                        if (buttonType != null && buttonId != 0) {
                            if (buttonType === ToolbarButtonType.UNDO ||
                                    buttonType === ToolbarButtonType.REDO) {
                                toolbarBuilder.addToolStickyButton(buttonType, buttonId)
                            } else {
                                toolbarBuilder.addToolButton(buttonType, buttonId)
                            }
                        }
                    }
                    builder = builder.addToolbarBuilder(toolbarBuilder)
                }
            }
        }
    }

    private fun getUri(context: Context?, path: String?, isBase64: Boolean): Uri? {
        if (context == null || path == null) {
            return null
        }
        try {
            if (isBase64) {
                val data: ByteArray = Base64.decode(path, Base64.DEFAULT)
                val tempFile: File = File.createTempFile("tmp", ".pdf")
                var fos: FileOutputStream? = null
                return try {
                    fos = FileOutputStream(tempFile)
                    IOUtils.write(data, fos)
                    Uri.fromFile(tempFile)
                } finally {
                    IOUtils.closeQuietly(fos)
                }
            }
            var fileUri: Uri = Uri.parse(path)
            if (ContentResolver.SCHEME_ANDROID_RESOURCE.equals(fileUri.getScheme())) {
                val resNameWithExtension: String = fileUri.getLastPathSegment()
                val extension: String = FilenameUtils.getExtension(resNameWithExtension)
                val resName: String = FilenameUtils.removeExtension(resNameWithExtension)
                val resId: Int = Utils.getResourceRaw(context, resName)
                if (resId != 0) {
                    val file: File = Utils.copyResourceToLocal(context, resId,
                            resName, ".$extension")
                    if (null != file && file.exists()) {
                        fileUri = Uri.fromFile(file)
                    }
                }
            } else if (ContentResolver.SCHEME_FILE.equals(fileUri.getScheme())) {
                val file = File(fileUri.getPath())
                fileUri = Uri.fromFile(file)
            }
            return fileUri
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return null
    }

    @Throws(JSONException::class)
    private fun disableElements(builder: ViewerConfig.Builder, args: JSONArray): ArrayList<ToolManager.ToolMode> {
        var builder: ViewerConfig.Builder = builder
        val viewModePickerItems: ArrayList<ViewModePickerDialogFragment.ViewModePickerItems> = ArrayList()
        for (i in 0 until args.length()) {
            val item: String = args.getString(i)
            if (BUTTON_TOOLS.equals(item)) {
                builder = builder.showAnnotationToolbarOption(false)
            } else if (BUTTON_SEARCH.equals(item)) {
                builder = builder.showSearchView(false)
            } else if (BUTTON_SHARE.equals(item)) {
                builder = builder.showShareOption(false)
            } else if (BUTTON_VIEW_CONTROLS.equals(item)) {
                builder = builder.showDocumentSettingsOption(false)
            } else if (BUTTON_THUMBNAILS.equals(item)) {
                builder = builder.showThumbnailView(false)
            } else if (BUTTON_LISTS.equals(item)) {
                builder = builder
                        .showAnnotationsList(false)
                        .showOutlineList(false)
                        .showUserBookmarksList(false)
            } else if (BUTTON_THUMBNAIL_SLIDER.equals(item)) {
                builder = builder.showBottomNavBar(false)
            } else if (BUTTON_SAVE_COPY.equals(item)) {
                builder = builder.showSaveCopyOption(false)
            } else if (BUTTON_EDIT_PAGES.equals(item)) {
                builder = builder.showEditPagesOption(false)
            } else if (BUTTON_PRINT.equals(item)) {
                builder = builder.showPrintOption(false)
            } else if (BUTTON_FILL_AND_SIGN.equals(item)) {
                builder = builder.showFillAndSignToolbarOption(false)
            } else if (BUTTON_PREPARE_FORM.equals(item)) {
                builder = builder.showFormToolbarOption(false)
            } else if (BUTTON_REFLOW_MODE.equals(item)) {
                builder = builder.showReflowOption(false)
                viewModePickerItems.add(ViewModePickerDialogFragment.ViewModePickerItems.ITEM_ID_REFLOW)
            } else if (BUTTON_CLOSE.equals(item)) {
                builder = builder.showCloseTabOption(false)
            } else if (BUTTON_OUTLINE_LIST.equals(item)) {
                builder = builder.showOutlineList(false)
            } else if (BUTTON_ANNOTATION_LIST.equals(item)) {
                builder = builder.showAnnotationsList(false)
            } else if (BUTTON_USER_BOOKMARK_LIST.equals(item)) {
                builder = builder.showUserBookmarksList(false)
            } else if (BUTTON_EDIT_MENU.equals(item)) {
                builder = builder.showEditMenuOption(false)
            } else if (BUTTON_CROP_PAGE.equals(item)) {
                viewModePickerItems.add(ViewModePickerDialogFragment.ViewModePickerItems.ITEM_ID_USERCROP)
            } else if (BUTTON_MORE_ITEMS.equals(item)) {
                builder = builder
                        .showEditPagesOption(false)
                        .showPrintOption(false)
                        .showCloseTabOption(false)
                        .showSaveCopyOption(false)
                        .showFormToolbarOption(false)
                        .showFillAndSignToolbarOption(false)
                        .showEditMenuOption(false)
                        .showReflowOption(false)
            }
        }
        builder.hideViewModeItems(viewModePickerItems.toArray(arrayOfNulls<ViewModePickerDialogFragment.ViewModePickerItems>(0)))
        return disableTools(args)
    }

    @Throws(JSONException::class)
    private fun disableTools(args: JSONArray): ArrayList<ToolManager.ToolMode> {
        val tools: ArrayList<ToolManager.ToolMode> = ArrayList()
        for (i in 0 until args.length()) {
            val item: String = args.getString(i)
            val mode: ToolManager.ToolMode? = convStringToToolMode(item)
            if (mode != null) {
                tools.add(mode)
            }
        }
        return tools
    }

    private fun convStringToToolMode(item: String): ToolManager.ToolMode? {
        var mode: ToolManager.ToolMode? = null
        if (TOOL_BUTTON_FREE_HAND.equals(item) || TOOL_ANNOTATION_CREATE_FREE_HAND.equals(item)) {
            mode = ToolManager.ToolMode.INK_CREATE
        } else if (TOOL_BUTTON_HIGHLIGHT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_HIGHLIGHT.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_HIGHLIGHT
        } else if (TOOL_BUTTON_UNDERLINE.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_UNDERLINE.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_UNDERLINE
        } else if (TOOL_BUTTON_SQUIGGLY.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_SQUIGGLY.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_SQUIGGLY
        } else if (TOOL_BUTTON_STRIKEOUT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_STRIKEOUT.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_STRIKEOUT
        } else if (TOOL_BUTTON_RECTANGLE.equals(item) || TOOL_ANNOTATION_CREATE_RECTANGLE.equals(item)) {
            mode = ToolManager.ToolMode.RECT_CREATE
        } else if (TOOL_BUTTON_ELLIPSE.equals(item) || TOOL_ANNOTATION_CREATE_ELLIPSE.equals(item)) {
            mode = ToolManager.ToolMode.OVAL_CREATE
        } else if (TOOL_BUTTON_LINE.equals(item) || TOOL_ANNOTATION_CREATE_LINE.equals(item)) {
            mode = ToolManager.ToolMode.LINE_CREATE
        } else if (TOOL_BUTTON_ARROW.equals(item) || TOOL_ANNOTATION_CREATE_ARROW.equals(item)) {
            mode = ToolManager.ToolMode.ARROW_CREATE
        } else if (TOOL_BUTTON_POLYLINE.equals(item) || TOOL_ANNOTATION_CREATE_POLYLINE.equals(item)) {
            mode = ToolManager.ToolMode.POLYLINE_CREATE
        } else if (TOOL_BUTTON_POLYGON.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON.equals(item)) {
            mode = ToolManager.ToolMode.POLYGON_CREATE
        } else if (TOOL_BUTTON_CLOUD.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON_CLOUD.equals(item)) {
            mode = ToolManager.ToolMode.CLOUD_CREATE
        } else if (TOOL_BUTTON_SIGNATURE.equals(item) || TOOL_ANNOTATION_CREATE_SIGNATURE.equals(item)) {
            mode = ToolManager.ToolMode.SIGNATURE
        } else if (TOOL_BUTTON_FREE_TEXT.equals(item) || TOOL_ANNOTATION_CREATE_FREE_TEXT.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_CREATE
        } else if (TOOL_BUTTON_STICKY.equals(item) || TOOL_ANNOTATION_CREATE_STICKY.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_ANNOT_CREATE
        } else if (TOOL_BUTTON_CALLOUT.equals(item) || TOOL_ANNOTATION_CREATE_CALLOUT.equals(item)) {
            mode = ToolManager.ToolMode.CALLOUT_CREATE
        } else if (TOOL_BUTTON_STAMP.equals(item) || TOOL_ANNOTATION_CREATE_STAMP.equals(item)) {
            mode = ToolManager.ToolMode.STAMPER
        } else if (TOOL_ANNOTATION_CREATE_DISTANCE_MEASUREMENT.equals(item)) {
            mode = ToolManager.ToolMode.RULER_CREATE
        } else if (TOOL_ANNOTATION_CREATE_PERIMETER_MEASUREMENT.equals(item)) {
            mode = ToolManager.ToolMode.PERIMETER_MEASURE_CREATE
        } else if (TOOL_ANNOTATION_CREATE_AREA_MEASUREMENT.equals(item)) {
            mode = ToolManager.ToolMode.AREA_MEASURE_CREATE
        } else if (TOOL_TEXT_SELECT.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_SELECT
        } else if (TOOL_ANNOTATION_EDIT.equals(item)) {
            mode = ToolManager.ToolMode.ANNOT_EDIT_RECT_GROUP
        } else if (TOOL_ANNOTATION_CREATE_SOUND.equals(item)) {
            mode = ToolManager.ToolMode.SOUND_CREATE
        } else if (TOOL_ANNOTATION_CREATE_FREE_HIGHLIGHTER.equals(item)) {
            mode = ToolManager.ToolMode.FREE_HIGHLIGHTER
        } else if (TOOL_ANNOTATION_CREATE_RUBBER_STAMP.equals(item)) {
            mode = ToolManager.ToolMode.RUBBER_STAMPER
        } else if (TOOL_ERASER.equals(item)) {
            mode = ToolManager.ToolMode.INK_ERASER
        } else if (TOOL_ANNOTATION_CREATE_FILE_ATTACHMENT.equals(item)) {
            mode = ToolManager.ToolMode.FILE_ATTACHMENT_CREATE
        } else if (TOOL_ANNOTATION_CREATE_REDACTION.equals(item)) {
            mode = ToolManager.ToolMode.RECT_REDACTION
        } else if (TOOL_ANNOTATION_CREATE_LINK.equals(item)) {
            mode = ToolManager.ToolMode.RECT_LINK
        } else if (TOOL_ANNOTATION_CREATE_REDACTION_TEXT.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_REDACTION
        } else if (TOOL_ANNOTATION_CREATE_LINK_TEXT.equals(item)) {
            mode = ToolManager.ToolMode.TEXT_LINK_CREATE
        } else if (TOOL_FORM_CREATE_TEXT_FIELD.equals(item)) {
            mode = ToolManager.ToolMode.FORM_TEXT_FIELD_CREATE
        } else if (TOOL_FORM_CREATE_CHECKBOX_FIELD.equals(item)) {
            mode = ToolManager.ToolMode.FORM_CHECKBOX_CREATE
        } else if (TOOL_FORM_CREATE_SIGNATURE_FIELD.equals(item)) {
            mode = ToolManager.ToolMode.FORM_SIGNATURE_CREATE
        } else if (TOOL_FORM_CREATE_RADIO_FIELD.equals(item)) {
            mode = ToolManager.ToolMode.FORM_RADIO_GROUP_CREATE
        } else if (TOOL_FORM_CREATE_COMBO_BOX_FIELD.equals(item)) {
            mode = ToolManager.ToolMode.FORM_COMBO_BOX_CREATE
        } else if (TOOL_FORM_CREATE_LIST_BOX_FIELD.equals(item)) {
            mode = ToolManager.ToolMode.FORM_LIST_BOX_CREATE
        }
        return mode
    }

    @Nullable
    fun convStringToAnnotType(item: String?): Int {
        var annotType: Int = Annot.e_Unknown
        if (TOOL_BUTTON_FREE_HAND.equals(item) || TOOL_ANNOTATION_CREATE_FREE_HAND.equals(item)) {
            annotType = Annot.e_Ink
        } else if (TOOL_BUTTON_HIGHLIGHT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_HIGHLIGHT.equals(item)) {
            annotType = Annot.e_Highlight
        } else if (TOOL_BUTTON_UNDERLINE.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_UNDERLINE.equals(item)) {
            annotType = Annot.e_Underline
        } else if (TOOL_BUTTON_SQUIGGLY.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_SQUIGGLY.equals(item)) {
            annotType = Annot.e_Squiggly
        } else if (TOOL_BUTTON_STRIKEOUT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_STRIKEOUT.equals(item)) {
            annotType = Annot.e_StrikeOut
        } else if (TOOL_BUTTON_RECTANGLE.equals(item) || TOOL_ANNOTATION_CREATE_RECTANGLE.equals(item)) {
            annotType = Annot.e_Square
        } else if (TOOL_BUTTON_ELLIPSE.equals(item) || TOOL_ANNOTATION_CREATE_ELLIPSE.equals(item)) {
            annotType = Annot.e_Circle
        } else if (TOOL_BUTTON_LINE.equals(item) || TOOL_ANNOTATION_CREATE_LINE.equals(item)) {
            annotType = Annot.e_Line
        } else if (TOOL_BUTTON_ARROW.equals(item) || TOOL_ANNOTATION_CREATE_ARROW.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_ARROW
        } else if (TOOL_BUTTON_POLYLINE.equals(item) || TOOL_ANNOTATION_CREATE_POLYLINE.equals(item)) {
            annotType = Annot.e_Polyline
        } else if (TOOL_BUTTON_POLYGON.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON.equals(item)) {
            annotType = Annot.e_Polygon
        } else if (TOOL_BUTTON_CLOUD.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON_CLOUD.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_CLOUD
        } else if (TOOL_BUTTON_SIGNATURE.equals(item) || TOOL_ANNOTATION_CREATE_SIGNATURE.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_SIGNATURE
        } else if (TOOL_BUTTON_FREE_TEXT.equals(item) || TOOL_ANNOTATION_CREATE_FREE_TEXT.equals(item)) {
            annotType = Annot.e_FreeText
        } else if (TOOL_BUTTON_STICKY.equals(item) || TOOL_ANNOTATION_CREATE_STICKY.equals(item)) {
            annotType = Annot.e_Text
        } else if (TOOL_BUTTON_CALLOUT.equals(item) || TOOL_ANNOTATION_CREATE_CALLOUT.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_CALLOUT
        } else if (TOOL_BUTTON_STAMP.equals(item) || TOOL_ANNOTATION_CREATE_STAMP.equals(item)) {
            annotType = Annot.e_Stamp
        } else if (TOOL_ANNOTATION_CREATE_DISTANCE_MEASUREMENT.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_RULER
        } else if (TOOL_ANNOTATION_CREATE_PERIMETER_MEASUREMENT.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_PERIMETER_MEASURE
        } else if (TOOL_ANNOTATION_CREATE_AREA_MEASUREMENT.equals(item)) {
            annotType = AnnotStyle.CUSTOM_ANNOT_TYPE_AREA_MEASURE
        } else if (TOOL_ANNOTATION_CREATE_FILE_ATTACHMENT.equals(item)) {
            annotType = Annot.e_FileAttachment
        } else if (TOOL_ANNOTATION_CREATE_SOUND.equals(item)) {
            annotType = Annot.e_Sound
        } else if (TOOL_ANNOTATION_CREATE_REDACTION.equals(item) || TOOL_ANNOTATION_CREATE_REDACTION_TEXT.equals(item)) {
            annotType = Annot.e_Redact
        } else if (TOOL_ANNOTATION_CREATE_LINK.equals(item) || TOOL_ANNOTATION_CREATE_LINK_TEXT.equals(item)) {
            annotType = Annot.e_Link
        } else if (TOOL_FORM_CREATE_TEXT_FIELD.equals(item)) {
            annotType = Annot.e_Widget
        } else if (TOOL_FORM_CREATE_CHECKBOX_FIELD.equals(item)) {
            annotType = Annot.e_Widget
        } else if (TOOL_FORM_CREATE_SIGNATURE_FIELD.equals(item)) {
            annotType = Annot.e_Widget
        } else if (TOOL_FORM_CREATE_RADIO_FIELD.equals(item)) {
            annotType = Annot.e_Widget
        } else if (TOOL_FORM_CREATE_COMBO_BOX_FIELD.equals(item)) {
            annotType = Annot.e_Widget
        } else if (TOOL_FORM_CREATE_TOOL_BOX_FIELD.equals(item)) {
            annotType = Annot.e_Widget
        }
        return annotType
    }

    @Nullable
    fun convQuickMenuIdToString(id: Int): String? {
        var menuStr: String? = null
        if (id == R.id.qm_appearance) {
            menuStr = MENU_ID_STRING_STYLE
        } else if (id == R.id.qm_note) {
            menuStr = MENU_ID_STRING_NOTE
        } else if (id == R.id.qm_copy) {
            menuStr = MENU_ID_STRING_COPY
        } else if (id == R.id.qm_delete) {
            menuStr = MENU_ID_STRING_DELETE
        } else if (id == R.id.qm_flatten) {
            menuStr = MENU_ID_STRING_FLATTEN
        } else if (id == R.id.qm_text) {
            menuStr = MENU_ID_STRING_TEXT
        } else if (id == R.id.qm_edit) {
            menuStr = MENU_ID_STRING_EDIT_INK
        } else if (id == R.id.qm_search) {
            menuStr = MENU_ID_STRING_SEARCH
        } else if (id == R.id.qm_share) {
            menuStr = MENU_ID_STRING_SHARE
        } else if (id == R.id.qm_type) {
            menuStr = MENU_ID_STRING_MARKUP_TYPE
        } else if (id == R.id.qm_screencap_create) {
            menuStr = MENU_ID_STRING_SCREEN_CAPTURE
        } else if (id == R.id.qm_play_sound) {
            menuStr = MENU_ID_STRING_PLAY_SOUND
        } else if (id == R.id.qm_open_attachment) {
            menuStr = MENU_ID_STRING_OPEN_ATTACHMENT
        } else if (id == R.id.qm_tts) {
            menuStr = MENU_ID_STRING_READ
        } else if (id == R.id.qm_calibrate) {
            menuStr = MENU_ID_STRING_CALIBRATE
        } else if (id == R.id.qm_underline) {
            menuStr = MENU_ID_STRING_UNDERLINE
        } else if (id == R.id.qm_redact) {
            menuStr = MENU_ID_STRING_REDACT
        } else if (id == R.id.qm_redaction) {
            menuStr = MENU_ID_STRING_REDACTION
        } else if (id == R.id.qm_strikeout) {
            menuStr = MENU_ID_STRING_STRIKEOUT
        } else if (id == R.id.qm_squiggly) {
            menuStr = MENU_ID_STRING_SQUIGGLY
        } else if (id == R.id.qm_link) {
            menuStr = MENU_ID_STRING_LINK
        } else if (id == R.id.qm_highlight) {
            menuStr = MENU_ID_STRING_HIGHLIGHT
        } else if (id == R.id.qm_floating_sig) {
            menuStr = MENU_ID_STRING_SIGNATURE
        } else if (id == R.id.qm_rectangle) {
            menuStr = MENU_ID_STRING_RECTANGLE
        } else if (id == R.id.qm_line) {
            menuStr = MENU_ID_STRING_LINE
        } else if (id == R.id.qm_free_hand) {
            menuStr = MENU_ID_STRING_FREE_HAND
        } else if (id == R.id.qm_image_stamper) {
            menuStr = MENU_ID_STRING_IMAGE
        } else if (id == R.id.qm_form_text) {
            menuStr = MENU_ID_STRING_FORM_TEXT
        } else if (id == R.id.qm_sticky_note) {
            menuStr = MENU_ID_STRING_STICKY_NOTE
        } else if (id == R.id.qm_overflow) {
            menuStr = MENU_ID_STRING_OVERFLOW
        } else if (id == R.id.qm_ink_eraser) {
            menuStr = MENU_ID_STRING_ERASER
        } else if (id == R.id.qm_rubber_stamper) {
            menuStr = MENU_ID_STRING_STAMP
        } else if (id == R.id.qm_page_redaction) {
            menuStr = MENU_ID_STRING_PAGE_REDACTION
        } else if (id == R.id.qm_rect_redaction) {
            menuStr = MENU_ID_STRING_RECT_REDACTION
        } else if (id == R.id.qm_search_redaction) {
            menuStr = MENU_ID_STRING_SEARCH_REDACTION
        } else if (id == R.id.qm_shape) {
            menuStr = MENU_ID_STRING_SHAPE
        } else if (id == R.id.qm_cloud) {
            menuStr = MENU_ID_STRING_CLOUD
        } else if (id == R.id.qm_polygon) {
            menuStr = MENU_ID_STRING_POLYGON
        } else if (id == R.id.qm_polyline) {
            menuStr = MENU_ID_STRING_POLYLINE
        } else if (id == R.id.qm_free_highlighter) {
            menuStr = MENU_ID_STRING_FREE_HIGHLIGHTER
        } else if (id == R.id.qm_arrow) {
            menuStr = MENU_ID_STRING_ARROW
        } else if (id == R.id.qm_oval) {
            menuStr = MENU_ID_STRING_OVAL
        } else if (id == R.id.qm_callout) {
            menuStr = MENU_ID_STRING_CALLOUT
        } else if (id == R.id.qm_measurement) {
            menuStr = MENU_ID_STRING_MEASUREMENT
        } else if (id == R.id.qm_area_measure) {
            menuStr = MENU_ID_STRING_AREA_MEASUREMENT
        } else if (id == R.id.qm_perimeter_measure) {
            menuStr = MENU_ID_STRING_PERIMETER_MEASUREMENT
        } else if (id == R.id.qm_rect_area_measure) {
            menuStr = MENU_ID_STRING_RECT_AREA_MEASUREMENT
        } else if (id == R.id.qm_ruler) {
            menuStr = MENU_ID_STRING_RULER
        } else if (id == R.id.qm_form) {
            menuStr = MENU_ID_STRING_FORM
        } else if (id == R.id.qm_form_combo_box) {
            menuStr = MENU_ID_STRING_FORM_COMBO_BOX
        } else if (id == R.id.qm_form_list_box) {
            menuStr = MENU_ID_STRING_FORM_LIST_BOX
        } else if (id == R.id.qm_form_check_box) {
            menuStr = MENU_ID_STRING_FORM_CHECK_BOX
        } else if (id == R.id.qm_form_signature) {
            menuStr = MENU_ID_STRING_FORM_SIGNATURE
        } else if (id == R.id.qm_form_radio_group) {
            menuStr = MENU_ID_STRING_FORM_RADIO_GROUP
        } else if (id == R.id.qm_attach) {
            menuStr = MENU_ID_STRING_ATTACH
        } else if (id == R.id.qm_file_attachment) {
            menuStr = MENU_ID_STRING_FILE_ATTACHMENT
        } else if (id == R.id.qm_sound) {
            menuStr = MENU_ID_STRING_SOUND
        } else if (id == R.id.qm_free_text) {
            menuStr = MENU_ID_STRING_FREE_TEXT
        } else if (id == R.id.qm_crop) {
            menuStr = MENU_ID_STRING_CROP
        } else if (id == R.id.qm_crop_ok) {
            menuStr = MENU_ID_STRING_CROP_OK
        } else if (id == R.id.qm_crop_cancel) {
            menuStr = MENU_ID_STRING_CROP_CANCEL
        } else if (id == R.id.qm_define) {
            menuStr = MENU_ID_STRING_DEFINE
        } else if (id == R.id.qm_field_signed) {
            menuStr = MENU_ID_STRING_FIELD_SIGNED
        } else if (id == R.id.qm_first_row_group) {
            menuStr = MENU_ID_STRING_FIRST_ROW_GROUP
        } else if (id == R.id.qm_second_row_group) {
            menuStr = MENU_ID_STRING_SECOND_ROW_GROUP
        } else if (id == R.id.qm_group) {
            menuStr = MENU_ID_STRING_GROUP
        } else if (id == R.id.qm_paste) {
            menuStr = MENU_ID_STRING_PASTE
        } else if (id == R.id.qm_rect_group_select) {
            menuStr = MENU_ID_STRING_RECT_GROUP_SELECT
        } else if (id == R.id.qm_sign_and_save) {
            menuStr = MENU_ID_STRING_SIGN_AND_SAVE
        } else if (id == R.id.qm_thickness) {
            menuStr = MENU_ID_STRING_THICKNESS
        } else if (id == R.id.qm_translate) {
            menuStr = MENU_ID_STRING_TRANSLATE
        } else if (id == R.id.qm_type) {
            menuStr = MENU_ID_STRING_TYPE
        } else if (id == R.id.qm_ungroup) {
            menuStr = MENU_ID_STRING_UNGROUP
        }
        return menuStr
    }

    private fun isValidToolbarTag(tag: String?): Boolean {
        if (tag != null) {
            if (TAG_VIEW_TOOLBAR.equals(tag) ||
                    TAG_ANNOTATE_TOOLBAR.equals(tag) ||
                    TAG_DRAW_TOOLBAR.equals(tag) ||
                    TAG_INSERT_TOOLBAR.equals(tag) ||
                    TAG_FILL_AND_SIGN_TOOLBAR.equals(tag) ||
                    TAG_PREPARE_FORM_TOOLBAR.equals(tag) ||
                    TAG_MEASURE_TOOLBAR.equals(tag) ||
                    TAG_PENS_TOOLBAR.equals(tag) ||
                    TAG_REDACTION_TOOLBAR.equals(tag) ||
                    TAG_FAVORITE_TOOLBAR.equals(tag)) {
                return true
            }
        }
        return false
    }

    private fun convStringToButtonId(item: String): Int {
        var buttonId = 0
        if (TOOL_BUTTON_FREE_HAND.equals(item) || TOOL_ANNOTATION_CREATE_FREE_HAND.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.INK.value()
        } else if (TOOL_BUTTON_HIGHLIGHT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_HIGHLIGHT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.TEXT_HIGHLIGHT.value()
        } else if (TOOL_BUTTON_UNDERLINE.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_UNDERLINE.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.TEXT_UNDERLINE.value()
        } else if (TOOL_BUTTON_SQUIGGLY.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_SQUIGGLY.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.TEXT_SQUIGGLY.value()
        } else if (TOOL_BUTTON_STRIKEOUT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_STRIKEOUT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.TEXT_STRIKEOUT.value()
        } else if (TOOL_BUTTON_RECTANGLE.equals(item) || TOOL_ANNOTATION_CREATE_RECTANGLE.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.SQUARE.value()
        } else if (TOOL_BUTTON_ELLIPSE.equals(item) || TOOL_ANNOTATION_CREATE_ELLIPSE.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.CIRCLE.value()
        } else if (TOOL_BUTTON_LINE.equals(item) || TOOL_ANNOTATION_CREATE_LINE.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.LINE.value()
        } else if (TOOL_BUTTON_ARROW.equals(item) || TOOL_ANNOTATION_CREATE_ARROW.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.ARROW.value()
        } else if (TOOL_BUTTON_POLYLINE.equals(item) || TOOL_ANNOTATION_CREATE_POLYLINE.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.POLYLINE.value()
        } else if (TOOL_BUTTON_POLYGON.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.POLYGON.value()
        } else if (TOOL_BUTTON_CLOUD.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON_CLOUD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.POLY_CLOUD.value()
        } else if (TOOL_BUTTON_SIGNATURE.equals(item) || TOOL_ANNOTATION_CREATE_SIGNATURE.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.SIGNATURE.value()
        } else if (TOOL_BUTTON_FREE_TEXT.equals(item) || TOOL_ANNOTATION_CREATE_FREE_TEXT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.FREE_TEXT.value()
        } else if (TOOL_BUTTON_STICKY.equals(item) || TOOL_ANNOTATION_CREATE_STICKY.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.STICKY_NOTE.value()
        } else if (TOOL_BUTTON_CALLOUT.equals(item) || TOOL_ANNOTATION_CREATE_CALLOUT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.CALLOUT.value()
        } else if (TOOL_BUTTON_STAMP.equals(item) || TOOL_ANNOTATION_CREATE_STAMP.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.STAMP.value()
        } else if (TOOL_ANNOTATION_CREATE_RUBBER_STAMP.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.STAMP.value()
        } else if (TOOL_ANNOTATION_CREATE_DISTANCE_MEASUREMENT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.RULER.value()
        } else if (TOOL_ANNOTATION_CREATE_PERIMETER_MEASUREMENT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.PERIMETER.value()
        } else if (TOOL_ANNOTATION_CREATE_AREA_MEASUREMENT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.AREA.value()
        } else if (TOOL_ANNOTATION_CREATE_FILE_ATTACHMENT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.ATTACHMENT.value()
        } else if (TOOL_ANNOTATION_CREATE_SOUND.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.SOUND.value()
        } else if (TOOL_ANNOTATION_CREATE_REDACTION.equals(item)) {
            // TODO
        } else if (TOOL_ANNOTATION_CREATE_LINK.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.LINK.value()
        } else if (TOOL_ANNOTATION_CREATE_REDACTION_TEXT.equals(item)) {
            // TODO
        } else if (TOOL_ANNOTATION_CREATE_LINK_TEXT.equals(item)) {
            // TODO
        } else if (TOOL_ANNOTATION_EDIT.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.MULTI_SELECT.value()
        } else if (TOOL_FORM_CREATE_TEXT_FIELD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.TEXT_FIELD.value()
        } else if (TOOL_FORM_CREATE_CHECKBOX_FIELD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.CHECKBOX.value()
        } else if (TOOL_FORM_CREATE_SIGNATURE_FIELD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.SIGNATURE_FIELD.value()
        } else if (TOOL_FORM_CREATE_RADIO_FIELD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.RADIO_BUTTON.value()
        } else if (TOOL_FORM_CREATE_COMBO_BOX_FIELD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.COMBO_BOX.value()
        } else if (TOOL_FORM_CREATE_LIST_BOX_FIELD.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.LIST_BOX.value()
        } else if (TOOL_ERASER.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.ERASER.value()
        } else if (BUTTON_UNDO.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.UNDO.value()
        } else if (BUTTON_REDO.equals(item)) {
            buttonId = DefaultToolbars.ButtonId.REDO.value()
        }
        return buttonId
    }

    @Nullable
    private fun convStringToToolbarType(item: String): ToolbarButtonType? {
        var buttonType: ToolbarButtonType? = null
        if (TOOL_BUTTON_FREE_HAND.equals(item) || TOOL_ANNOTATION_CREATE_FREE_HAND.equals(item)) {
            buttonType = ToolbarButtonType.INK
        } else if (TOOL_BUTTON_HIGHLIGHT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_HIGHLIGHT.equals(item)) {
            buttonType = ToolbarButtonType.TEXT_HIGHLIGHT
        } else if (TOOL_BUTTON_UNDERLINE.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_UNDERLINE.equals(item)) {
            buttonType = ToolbarButtonType.TEXT_UNDERLINE
        } else if (TOOL_BUTTON_SQUIGGLY.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_SQUIGGLY.equals(item)) {
            buttonType = ToolbarButtonType.TEXT_SQUIGGLY
        } else if (TOOL_BUTTON_STRIKEOUT.equals(item) || TOOL_ANNOTATION_CREATE_TEXT_STRIKEOUT.equals(item)) {
            buttonType = ToolbarButtonType.TEXT_STRIKEOUT
        } else if (TOOL_BUTTON_RECTANGLE.equals(item) || TOOL_ANNOTATION_CREATE_RECTANGLE.equals(item)) {
            buttonType = ToolbarButtonType.SQUARE
        } else if (TOOL_BUTTON_ELLIPSE.equals(item) || TOOL_ANNOTATION_CREATE_ELLIPSE.equals(item)) {
            buttonType = ToolbarButtonType.CIRCLE
        } else if (TOOL_BUTTON_LINE.equals(item) || TOOL_ANNOTATION_CREATE_LINE.equals(item)) {
            buttonType = ToolbarButtonType.LINE
        } else if (TOOL_BUTTON_ARROW.equals(item) || TOOL_ANNOTATION_CREATE_ARROW.equals(item)) {
            buttonType = ToolbarButtonType.ARROW
        } else if (TOOL_BUTTON_POLYLINE.equals(item) || TOOL_ANNOTATION_CREATE_POLYLINE.equals(item)) {
            buttonType = ToolbarButtonType.POLYLINE
        } else if (TOOL_BUTTON_POLYGON.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON.equals(item)) {
            buttonType = ToolbarButtonType.POLYGON
        } else if (TOOL_BUTTON_CLOUD.equals(item) || TOOL_ANNOTATION_CREATE_POLYGON_CLOUD.equals(item)) {
            buttonType = ToolbarButtonType.POLY_CLOUD
        } else if (TOOL_BUTTON_SIGNATURE.equals(item) || TOOL_ANNOTATION_CREATE_SIGNATURE.equals(item)) {
            buttonType = ToolbarButtonType.SIGNATURE
        } else if (TOOL_BUTTON_FREE_TEXT.equals(item) || TOOL_ANNOTATION_CREATE_FREE_TEXT.equals(item)) {
            buttonType = ToolbarButtonType.FREE_TEXT
        } else if (TOOL_BUTTON_STICKY.equals(item) || TOOL_ANNOTATION_CREATE_STICKY.equals(item)) {
            buttonType = ToolbarButtonType.STICKY_NOTE
        } else if (TOOL_BUTTON_CALLOUT.equals(item) || TOOL_ANNOTATION_CREATE_CALLOUT.equals(item)) {
            buttonType = ToolbarButtonType.CALLOUT
        } else if (TOOL_BUTTON_STAMP.equals(item) || TOOL_ANNOTATION_CREATE_STAMP.equals(item)) {
            buttonType = ToolbarButtonType.STAMP
        } else if (TOOL_ANNOTATION_CREATE_RUBBER_STAMP.equals(item)) {
            buttonType = ToolbarButtonType.STAMP
        } else if (TOOL_ANNOTATION_CREATE_DISTANCE_MEASUREMENT.equals(item)) {
            buttonType = ToolbarButtonType.RULER
        } else if (TOOL_ANNOTATION_CREATE_PERIMETER_MEASUREMENT.equals(item)) {
            buttonType = ToolbarButtonType.PERIMETER
        } else if (TOOL_ANNOTATION_CREATE_AREA_MEASUREMENT.equals(item)) {
            buttonType = ToolbarButtonType.AREA
        } else if (TOOL_ANNOTATION_CREATE_FILE_ATTACHMENT.equals(item)) {
            buttonType = ToolbarButtonType.ATTACHMENT
        } else if (TOOL_ANNOTATION_CREATE_SOUND.equals(item)) {
            buttonType = ToolbarButtonType.SOUND
        } else if (TOOL_ANNOTATION_CREATE_REDACTION.equals(item)) {
            // TODO
        } else if (TOOL_ANNOTATION_CREATE_LINK.equals(item)) {
            buttonType = ToolbarButtonType.LINK
        } else if (TOOL_ANNOTATION_CREATE_REDACTION_TEXT.equals(item)) {
            // TODO
        } else if (TOOL_ANNOTATION_CREATE_LINK_TEXT.equals(item)) {
            // TODO
        } else if (TOOL_ANNOTATION_EDIT.equals(item)) {
            buttonType = ToolbarButtonType.MULTI_SELECT
        } else if (TOOL_FORM_CREATE_TEXT_FIELD.equals(item)) {
            buttonType = ToolbarButtonType.TEXT_FIELD
        } else if (TOOL_FORM_CREATE_CHECKBOX_FIELD.equals(item)) {
            buttonType = ToolbarButtonType.CHECKBOX
        } else if (TOOL_FORM_CREATE_SIGNATURE_FIELD.equals(item)) {
            buttonType = ToolbarButtonType.SIGNATURE_FIELD
        } else if (TOOL_FORM_CREATE_RADIO_FIELD.equals(item)) {
            buttonType = ToolbarButtonType.RADIO_BUTTON
        } else if (TOOL_FORM_CREATE_COMBO_BOX_FIELD.equals(item)) {
            buttonType = ToolbarButtonType.COMBO_BOX
        } else if (TOOL_FORM_CREATE_LIST_BOX_FIELD.equals(item)) {
            buttonType = ToolbarButtonType.LIST_BOX
        } else if (TOOL_ERASER.equals(item)) {
            buttonType = ToolbarButtonType.ERASER
        } else if (BUTTON_UNDO.equals(item)) {
            buttonType = ToolbarButtonType.UNDO
        } else if (BUTTON_REDO.equals(item)) {
            buttonType = ToolbarButtonType.REDO
        }
        return buttonType
    }

    private fun convStringToToolbarDefaultIconRes(item: String?): Int {
        if (TAG_VIEW_TOOLBAR.equals(item)) {
            return R.drawable.ic_view
        } else if (TAG_ANNOTATE_TOOLBAR.equals(item)) {
            return R.drawable.ic_annotation_underline_black_24dp
        } else if (TAG_DRAW_TOOLBAR.equals(item)) {
            return R.drawable.ic_pens_and_shapes
        } else if (TAG_INSERT_TOOLBAR.equals(item)) {
            return R.drawable.ic_add_image_white
        } else if (TAG_FILL_AND_SIGN_TOOLBAR.equals(item)) {
            return R.drawable.ic_fill_and_sign
        } else if (TAG_PREPARE_FORM_TOOLBAR.equals(item)) {
            return R.drawable.ic_prepare_form
        } else if (TAG_MEASURE_TOOLBAR.equals(item)) {
            return R.drawable.ic_annotation_distance_black_24dp
        } else if (TAG_PENS_TOOLBAR.equals(item)) {
            return R.drawable.ic_annotation_freehand_black_24dp
        } else if (TAG_REDACTION_TOOLBAR.equals(item)) {
            return R.drawable.ic_annotation_redact_black_24dp
        } else if (TAG_FAVORITE_TOOLBAR.equals(item)) {
            return R.drawable.ic_star_white_24dp
        }
        return 0
    }

    fun onMethodCall(call: MethodCall, result: MethodChannel.Result, component: ViewerComponent) {
        when (call.method) {
            FUNCTION_IMPORT_ANNOTATIONS -> {
                checkFunctionPrecondition(component)
                val xfdf: String = call.argument(KEY_XFDF)
                try {
                    importAnnotations(xfdf, result, component)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_EXPORT_ANNOTATIONS -> {
                checkFunctionPrecondition(component)
                val annotationList: String = call.argument(KEY_ANNOTATION_LIST)
                try {
                    exportAnnotations(annotationList, result, component)
                } catch (ex: JSONException) {
                    ex.printStackTrace()
                    result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_FLATTEN_ANNOTATIONS -> {
                checkFunctionPrecondition(component)
                val formsOnly: Boolean = call.argument(KEY_FORMS_ONLY)
                if (formsOnly != null) {
                    try {
                        flattenAnnotations(formsOnly, result, component)
                    } catch (ex: PDFNetException) {
                        ex.printStackTrace()
                        result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                    }
                }
            }
            FUNCTION_DELETE_ANNOTATIONS -> {
                checkFunctionPrecondition(component)
                val annotationList: String = call.argument(KEY_ANNOTATION_LIST)
                try {
                    deleteAnnotations(annotationList, result, component)
                } catch (ex: JSONException) {
                    ex.printStackTrace()
                    result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_SELECT_ANNOTATION -> {
                checkFunctionPrecondition(component)
                val annotation: String = call.argument(KEY_ANNOTATION)
                try {
                    selectAnnotation(annotation, result, component)
                } catch (ex: JSONException) {
                    ex.printStackTrace()
                    result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_SET_FLAGS_FOR_ANNOTATIONS -> {
                checkFunctionPrecondition(component)
                val annotationsWithFlags: String = call.argument(KEY_ANNOTATIONS_WITH_FLAGS)
                try {
                    setFlagsForAnnotations(annotationsWithFlags, result, component)
                } catch (ex: JSONException) {
                    ex.printStackTrace()
                    result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_IMPORT_ANNOTATION_COMMAND -> {
                checkFunctionPrecondition(component)
                val xfdfCommand: String = call.argument(KEY_XFDF_COMMAND)
                try {
                    importAnnotationCommand(xfdfCommand, result, component)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_IMPORT_BOOKMARK_JSON -> {
                checkFunctionPrecondition(component)
                val bookmarkJson: String = call.argument(KEY_BOOKMARK_JSON)
                try {
                    importBookmarkJson(bookmarkJson, result, component)
                } catch (ex: JSONException) {
                    ex.printStackTrace()
                    result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                }
            }
            FUNCTION_SAVE_DOCUMENT -> {
                checkFunctionPrecondition(component)
                saveDocument(result, component)
            }
            FUNCTION_COMMIT_TOOL -> {
                checkFunctionPrecondition(component)
                commitTool(result, component)
            }
            FUNCTION_GET_PAGE_COUNT -> {
                checkFunctionPrecondition(component)
                try {
                    getPageCount(result, component)
                } catch (ex: PDFNetException) {
                    ex.printStackTrace()
                    result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                }
            }
            FUNCTION_HANDLE_BACK_BUTTON -> {
                checkFunctionPrecondition(component)
                handleBackButton(result, component)
            }
            FUNCTION_GET_PAGE_CROP_BOX -> {
                checkFunctionPrecondition(component)
                val pageNumber: Integer = call.argument(KEY_PAGE_NUMBER)
                if (pageNumber != null) {
                    try {
                        getPageCropBox(pageNumber, result, component)
                    } catch (ex: JSONException) {
                        ex.printStackTrace()
                        result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                    } catch (ex: PDFNetException) {
                        ex.printStackTrace()
                        result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                    }
                }
            }
            FUNCTION_SET_TOOL_MODE -> {
                checkFunctionPrecondition(component)
                val toolModeString: String = call.argument(KEY_TOOL_MODE)
                setToolMode(toolModeString, result, component)
            }
            FUNCTION_SET_FLAG_FOR_FIELDS -> {
                checkFunctionPrecondition(component)
                val fieldNames: ArrayList<String> = call.argument(KEY_FIELD_NAMES)
                val flag: Integer = call.argument(KEY_FLAG)
                val flagValue: Boolean = call.argument(KEY_FLAG_VALUE)
                if (fieldNames != null && flag != null && flagValue != null) {
                    try {
                        setFlagForFields(fieldNames, flag, flagValue, result, component)
                    } catch (ex: PDFNetException) {
                        ex.printStackTrace()
                        result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                    }
                }
            }
            FUNCTION_SET_VALUES_FOR_FIELDS -> {
                checkFunctionPrecondition(component)
                val fieldsString: String = call.argument(KEY_FIELDS)
                if (fieldsString != null) {
                    try {
                        setValuesForFields(fieldsString, result, component)
                    } catch (ex: JSONException) {
                        ex.printStackTrace()
                        result.error(Integer.toString(ex.hashCode()), "JSONException Error: $ex", null)
                    } catch (ex: PDFNetException) {
                        ex.printStackTrace()
                        result.error(toString(ex.getErrorCode()), "PDFTronException Error: $ex", null)
                    }
                }
            }
            FUNCTION_CLOSE_ALL_TABS -> {
                checkFunctionPrecondition(component)
                closeAllTabs(result, component)
            }
            else -> result.notImplemented()
        }
    }

    // Methods
    @Throws(PDFNetException::class)
    private fun importAnnotations(xfdf: String?, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfDoc || null == xfdf) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        var shouldUnlockRead = false
        try {
            pdfViewCtrl.docLockRead()
            shouldUnlockRead = true
            if (pdfDoc.hasDownloader()) {
                // still downloading file, let's wait for next call
                result.error("InvalidState", "Document download in progress, try again later", null)
                return
            }
        } finally {
            if (shouldUnlockRead) {
                pdfViewCtrl.docUnlockRead()
            }
        }
        var shouldUnlock = false
        try {
            pdfViewCtrl.docLock(true)
            shouldUnlock = true
            val fdfDoc: FDFDoc = FDFDoc.createFromXFDF(xfdf)
            pdfDoc.fdfUpdate(fdfDoc)
            pdfViewCtrl.update(true)
            result.success(null)
        } finally {
            if (shouldUnlock) {
                pdfViewCtrl.docUnlock()
            }
        }
    }

    @Throws(PDFNetException::class, JSONException::class)
    private fun exportAnnotations(annotationList: String?, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        if (null == pdfViewCtrl) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        var shouldUnlockRead = false
        try {
            pdfViewCtrl.docLockRead()
            shouldUnlockRead = true
            val pdfDoc: PDFDoc = pdfViewCtrl.getDoc()
            if (null == annotationList) {
                val fdfDoc: FDFDoc = pdfDoc.fdfExtract(PDFDoc.e_both)
                result.success(fdfDoc.saveAsXFDF())
            } else {
                val annotationJsonArray = JSONArray(annotationList)
                val validAnnotationList: ArrayList<Annot> = ArrayList(annotationJsonArray.length())
                for (i in 0 until annotationJsonArray.length()) {
                    val currAnnot: JSONObject = annotationJsonArray.getJSONObject(i)
                    if (currAnnot != null) {
                        val currAnnotId: String = currAnnot.getString(KEY_ANNOTATION_ID)
                        val currAnnotPageNumber: Int = currAnnot.getInt(KEY_PAGE_NUMBER)
                        if (!Utils.isNullOrEmpty(currAnnotId)) {
                            val validAnnotation: Annot = ViewerUtils.getAnnotById(pdfViewCtrl, currAnnotId, currAnnotPageNumber)
                            if (validAnnotation != null && validAnnotation.isValid()) {
                                validAnnotationList.add(validAnnotation)
                            }
                        }
                    }
                }
                if (validAnnotationList.size() > 0) {
                    val fdfDoc: FDFDoc = pdfDoc.fdfExtract(validAnnotationList)
                    result.success(fdfDoc.saveAsXFDF())
                } else {
                    result.success("")
                }
            }
        } finally {
            if (shouldUnlockRead) {
                pdfViewCtrl.docUnlockRead()
            }
        }
    }

    @Throws(PDFNetException::class)
    private fun flattenAnnotations(formsOnly: Boolean, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfDoc) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        if (pdfViewCtrl.getToolManager() is ToolManager) {
            val toolManager: ToolManager = pdfViewCtrl.getToolManager() as ToolManager
            toolManager.setTool(toolManager.createTool(ToolManager.ToolMode.PAN, toolManager.getTool()))
        }
        var shouldUnlock = false
        try {
            pdfViewCtrl.docLock(true)
            shouldUnlock = true
            pdfDoc.flattenAnnotations(formsOnly)
        } finally {
            if (shouldUnlock) {
                pdfViewCtrl.docUnlock()
            }
            result.success(null)
        }
    }

    @Throws(PDFNetException::class, JSONException::class)
    private fun deleteAnnotations(annotationList: String, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfDoc) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        val toolManager: ToolManager = pdfViewCtrl.getToolManager() as ToolManager
        val annotationJsonArray = JSONArray(annotationList)
        for (i in 0 until annotationJsonArray.length()) {
            val currAnnot: JSONObject = annotationJsonArray.getJSONObject(i)
            if (currAnnot != null) {
                val currAnnotId: String = currAnnot.getString(KEY_ANNOTATION_ID)
                val currAnnotPageNumber: Int = currAnnot.getInt(KEY_PAGE_NUMBER)
                if (!Utils.isNullOrEmpty(currAnnotId)) {
                    val validAnnotation: Annot = ViewerUtils.getAnnotById(pdfViewCtrl, currAnnotId, currAnnotPageNumber)
                    if (validAnnotation != null && validAnnotation.isValid()) {
                        var shouldUnlock = false
                        try {
                            pdfViewCtrl.docLock(true)
                            shouldUnlock = true
                            val map: HashMap<Annot, Integer> = HashMap(1)
                            map.put(validAnnotation, currAnnotPageNumber)
                            toolManager.raiseAnnotationsPreRemoveEvent(map)
                            val page: Page = pdfViewCtrl.getDoc().getPage(currAnnotPageNumber)
                            page.annotRemove(validAnnotation)
                            pdfViewCtrl.update(validAnnotation, currAnnotPageNumber)
                            toolManager.raiseAnnotationsRemovedEvent(map)
                        } finally {
                            if (shouldUnlock) {
                                pdfViewCtrl.docUnlock()
                            }
                        }
                        toolManager.deselectAll()
                    }
                }
            }
        }
    }

    @Throws(PDFNetException::class, JSONException::class)
    private fun selectAnnotation(annotation: String, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfDoc) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        val annotationJson = JSONObject(annotation)
        val toolManager: ToolManager = pdfViewCtrl.getToolManager() as ToolManager
        val annotationId: String = annotationJson.getString(KEY_ANNOTATION_ID)
        val annotationPageNumber: Int = annotationJson.getInt(KEY_PAGE_NUMBER)
        if (!Utils.isNullOrEmpty(annotationId)) {
            toolManager.selectAnnot(annotationId, annotationPageNumber)
        }
    }

    @Throws(PDFNetException::class, JSONException::class)
    private fun setFlagsForAnnotations(annotationsWithFlags: String, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        val toolManager: ToolManager = component.getToolManager()
        if (null == pdfViewCtrl || null == pdfDoc || null == toolManager) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        val annotationWithFlagsArray = JSONArray(annotationsWithFlags)
        var shouldUnlock = false
        try {
            pdfViewCtrl.docLock(true)
            shouldUnlock = true

            // for each annotation
            for (i in 0 until annotationWithFlagsArray.length()) {
                val currentAnnotationWithFlags: JSONObject = annotationWithFlagsArray.getJSONObject(i)
                val currentAnnotation: JSONObject = getJSONObjectFromJSONObject(currentAnnotationWithFlags, KEY_ANNOTATION)
                val currentAnnotationId: String = currentAnnotation.getString(KEY_ANNOTATION_ID)
                val currentAnnotationPageNumber: Int = currentAnnotation.getInt(KEY_PAGE_NUMBER)
                if (!Utils.isNullOrEmpty(currentAnnotationId)) {
                    val validAnnotation: Annot = ViewerUtils.getAnnotById(pdfViewCtrl, currentAnnotationId, currentAnnotationPageNumber)
                    if (validAnnotation == null || !validAnnotation.isValid()) {
                        continue
                    }
                    val currentFlagArray: JSONArray = getJSONArrayFromJSONObject(currentAnnotationWithFlags, KEY_ANNOTATION_FLAG_LISTS)

                    // for each flag
                    for (j in 0 until currentFlagArray.length()) {
                        val currentFlagObject: JSONObject = currentFlagArray.getJSONObject(j)
                        val currentFlag: String = currentFlagObject.getString(KEY_ANNOTATION_FLAG)
                        val currentFlagValue: Boolean = currentFlagObject.getBoolean(KEY_ANNOTATION_FLAG_VALUE)
                        if (currentFlag == null) {
                            continue
                        }
                        var flagNumber = -1
                        when (currentFlag) {
                            ANNOTATION_FLAG_HIDDEN -> flagNumber = Annot.e_hidden
                            ANNOTATION_FLAG_INVISIBLE -> flagNumber = Annot.e_invisible
                            ANNOTATION_FLAG_LOCKED -> flagNumber = Annot.e_locked
                            ANNOTATION_FLAG_LOCKED_CONTENTS -> flagNumber = Annot.e_locked_contents
                            ANNOTATION_FLAG_NO_ROTATE -> flagNumber = Annot.e_no_rotate
                            ANNOTATION_FLAG_NO_VIEW -> flagNumber = Annot.e_no_view
                            ANNOTATION_FLAG_NO_ZOOM -> flagNumber = Annot.e_no_zoom
                            ANNOTATION_FLAG_PRINT -> flagNumber = Annot.e_print
                            ANNOTATION_FLAG_READ_ONLY -> flagNumber = Annot.e_read_only
                            ANNOTATION_FLAG_TOGGLE_NO_VIEW -> flagNumber = Annot.e_toggle_no_view
                        }
                        if (flagNumber != -1) {
                            val map: HashMap<Annot, Integer> = HashMap(1)
                            map.put(validAnnotation, currentAnnotationPageNumber)
                            toolManager.raiseAnnotationsPreModifyEvent(map)
                            validAnnotation.setFlag(flagNumber, currentFlagValue)
                            pdfViewCtrl.update(validAnnotation, currentAnnotationPageNumber)
                            toolManager.raiseAnnotationsModifiedEvent(map, Tool.getAnnotationModificationBundle(null))
                        }
                    }
                }
            }
        } finally {
            if (shouldUnlock) {
                pdfViewCtrl.docUnlock()
            }
        }
    }

    @Throws(PDFNetException::class)
    private fun importAnnotationCommand(xfdfCommand: String?, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfDoc || null == xfdfCommand) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        var shouldUnlockRead = false
        try {
            pdfViewCtrl.docLockRead()
            shouldUnlockRead = true
            if (pdfDoc.hasDownloader()) {
                // still downloading file, let's wait for next call
                result.error("InvalidState", "Document download in progress, try again later", null)
                return
            }
        } finally {
            if (shouldUnlockRead) {
                pdfViewCtrl.docUnlockRead()
            }
        }
        var shouldUnlock = false
        try {
            pdfViewCtrl.docLock(true)
            shouldUnlock = true
            val fdfDoc: FDFDoc = pdfDoc.fdfExtract(PDFDoc.e_both)
            fdfDoc.mergeAnnots(xfdfCommand)
            pdfDoc.fdfUpdate(fdfDoc)
            pdfViewCtrl.update(true)
            result.success(null)
        } finally {
            if (shouldUnlock) {
                pdfViewCtrl.docUnlock()
            }
        }
    }

    @Throws(JSONException::class)
    private fun importBookmarkJson(bookmarkJson: String?, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        if (null == pdfViewCtrl || null == bookmarkJson) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        BookmarkManager.importPdfBookmarks(pdfViewCtrl, bookmarkJson)
        result.success(null)
    }

    private fun saveDocument(result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2 = component.getPdfViewCtrlTabFragment()
        if (pdfViewCtrlTabFragment != null) {
            pdfViewCtrlTabFragment.setSavingEnabled(true)
            pdfViewCtrlTabFragment.save(false, true, true)
            pdfViewCtrlTabFragment.setSavingEnabled(component.isAutoSaveEnabled())
            result.success(pdfViewCtrlTabFragment.getFilePath())
            return
        }
        result.error("InvalidState", "Activity not attached", null)
    }

    private fun commitTool(result: MethodChannel.Result, component: ViewerComponent) {
        val toolManager: ToolManager = component.getToolManager()
        if (toolManager != null) {
            val currentTool: ToolManager.Tool = toolManager.getTool()
            if (currentTool is FreehandCreate) {
                (currentTool as FreehandCreate).commitAnnotation()
                toolManager.setTool(toolManager.createTool(ToolManager.ToolMode.PAN, null))
                result.success(true)
            } else if (currentTool is AdvancedShapeCreate) {
                (currentTool as AdvancedShapeCreate).commit()
                toolManager.setTool(toolManager.createTool(ToolManager.ToolMode.PAN, null))
                result.success(true)
            }
            result.success(false)
            return
        }
        result.error("InvalidState", "Tool manager not found", null)
    }

    @Throws(PDFNetException::class)
    private fun getPageCount(result: MethodChannel.Result, component: ViewerComponent) {
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (pdfDoc == null) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        result.success(pdfDoc.getPageCount())
    }

    private fun handleBackButton(result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrlTabHostFragment: PdfViewCtrlTabHostFragment2 = component.getPdfViewCtrlTabHostFragment()
        if (pdfViewCtrlTabHostFragment == null) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        result.success(pdfViewCtrlTabHostFragment.handleBackPressed())
    }

    @Throws(PDFNetException::class, JSONException::class)
    private fun getPageCropBox(pageNumber: Int, result: MethodChannel.Result, component: ViewerComponent) {
        val jsonObject = JSONObject()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (pdfDoc == null) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        val rect: Rect = pdfDoc.getPage(pageNumber).getCropBox()
        jsonObject.put(KEY_X1, rect.getX1())
        jsonObject.put(KEY_Y1, rect.getY1())
        jsonObject.put(KEY_X2, rect.getX2())
        jsonObject.put(KEY_Y2, rect.getY2())
        jsonObject.put(KEY_WIDTH, rect.getWidth())
        jsonObject.put(KEY_HEIGHT, rect.getHeight())
        result.success(jsonObject.toString())
    }

    @Throws(PDFNetException::class)
    private fun setFlagForFields(fieldNames: ArrayList<String>, flag: Int, flagValue: Boolean, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfdoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfdoc) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        var shouldUnlock = false
        try {
            pdfViewCtrl.docLock(true)
            shouldUnlock = true
            for (fieldName in fieldNames) {
                val field: Field = pdfdoc.getField(fieldName)
                if (field != null && field.isValid()) {
                    field.setFlag(flag, flagValue)
                    pdfViewCtrl.update(field)
                }
            }
        } finally {
            if (shouldUnlock) {
                pdfViewCtrl.docUnlock()
            }
        }
        result.success(null)
    }

    @Throws(PDFNetException::class, JSONException::class)
    private fun setValuesForFields(fieldsString: String, result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (null == pdfViewCtrl || null == pdfDoc) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        val fieldsArray = JSONArray(fieldsString)
        var shouldUnlock = false
        try {
            pdfViewCtrl.docLock(true)
            shouldUnlock = true
            for (i in 0 until fieldsArray.length()) {
                val fieldObject: JSONObject = fieldsArray.getJSONObject(i)
                val fieldName: String = fieldObject.getString(KEY_FIELD_NAME)
                val field: Field = pdfDoc.getField(fieldName)
                if (field != null && field.isValid()) {
                    setFieldValue(pdfViewCtrl, field, fieldObject.get(KEY_FIELD_VALUE))
                }
            }
        } finally {
            if (shouldUnlock) {
                pdfViewCtrl.docUnlock()
            }
        }
        result.success(null)
    }

    // write lock required around this method
    @Throws(PDFNetException::class, JSONException::class)
    private fun setFieldValue(pdfViewCtrl: PDFViewCtrl, field: Field, value: Object) {
        val fieldType: Int = field.getType()
        if (value is Boolean) {
            if (Field.e_check === fieldType) {
                val view_change: ViewChangeCollection = field.setValue(value as Boolean)
                pdfViewCtrl.refreshAndUpdate(view_change)
            }
        } else if (value is String) {
            if (Field.e_text === fieldType || Field.e_radio === fieldType || Field.e_choice === fieldType) {
                val view_change: ViewChangeCollection = field.setValue(value as String)
                pdfViewCtrl.refreshAndUpdate(view_change)
            }
        } else if (value is Integer || value is Double || value is Long || value is Float) {
            if (Field.e_text === fieldType) {
                val view_change: ViewChangeCollection = field.setValue(String.valueOf(value))
                pdfViewCtrl.refreshAndUpdate(view_change)
            }
        }
    }

    private fun setToolMode(toolModeString: String, result: MethodChannel.Result, component: ViewerComponent) {
        val toolManager: ToolManager = component.getToolManager()
        val context: Context? = if (component.getPdfViewCtrl() != null) component.getPdfViewCtrl().getContext() else null
        if (toolManager == null || context == null) {
            result.error("InvalidState", "PDFViewCtrl not found", null)
            return
        }
        val mode: ToolManager.ToolMode? = convStringToToolMode(toolModeString)
        val tool: Tool = toolManager.createTool(mode, null) as Tool
        val continuousAnnot: Boolean = PdfViewCtrlSettingsManager.getContinuousAnnotationEdit(context)
        tool.setForceSameNextToolMode(continuousAnnot)
        toolManager.setTool(tool)
        result.success(null)
    }

    private fun closeAllTabs(result: MethodChannel.Result, component: ViewerComponent) {
        val pdfViewCtrlTabHostFragment: PdfViewCtrlTabHostFragment2 = component.getPdfViewCtrlTabHostFragment()
        if (pdfViewCtrlTabHostFragment == null) {
            result.error("InvalidState", "Activity not attached", null)
            return
        }
        pdfViewCtrlTabHostFragment.closeAllTabs()
        result.success(null)
    }

    // Events
    fun handleDocumentLoaded(component: ViewerComponent) {
        if (component.getPdfViewCtrlTabFragment() != null) {
            if (!component.isAutoSaveEnabled()) {
                component.getPdfViewCtrlTabFragment().setSavingEnabled(component.isAutoSaveEnabled())
            }
        }
        if (component.getToolManager() != null) {
            component.getToolManager().setStylusAsPen(component.isUseStylusAsPen())
            component.getToolManager().setSignSignatureFieldsWithStamps(component.isSignSignatureFieldWithStamps())
        }
        addListeners(component)
        val result: MethodChannel.Result = component.getFlutterLoadResult()
        if (result != null) {
            result.success(true)
        }
        if (component.getPdfViewCtrlTabFragment() != null) {
            val documentLoadedEventSink: EventChannel.EventSink = component.getDocumentLoadedEventEmitter()
            if (documentLoadedEventSink != null) {
                documentLoadedEventSink.success(component.getPdfViewCtrlTabFragment().getFilePath())
            }
        }
    }

    fun handleOpenDocError(component: ViewerComponent): Boolean {
        val result: MethodChannel.Result = component.getFlutterLoadResult()
        if (result != null) {
            result.success(false)
        }
        if (component.getPdfViewCtrlTabFragment() != null) {
            val documentErrorEventSink: EventChannel.EventSink = component.getDocumentErrorEventEmitter()
            if (documentErrorEventSink != null) {
                documentErrorEventSink.success(null)
            }
        }
        return false
    }

    fun handleOnDetach(component: ViewerComponent) {
        val result: MethodChannel.Result = component.getFlutterLoadResult()
        if (result != null) {
            result.success(false)
        }
        val toolManager: ToolManager = component.getToolManager()
        if (toolManager != null) {
            component.getImpl().removeListeners(toolManager)
        }
        val pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2 = component.getPdfViewCtrlTabFragment()
        if (pdfViewCtrlTabFragment != null) {
            component.getImpl().removeListeners(pdfViewCtrlTabFragment)
            val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
            if (pdfViewCtrl != null) {
                component.getImpl().removeListeners(pdfViewCtrl)
            }
        }
    }

    fun handleLeadingNavButtonPressed(component: ViewerComponent) {
        val leadingNavButtonPressedEventSink: EventChannel.EventSink = component.getLeadingNavButtonPressedEventEmitter()
        if (leadingNavButtonPressedEventSink != null) {
            leadingNavButtonPressedEventSink.success(null)
        }
    }

    private fun addListeners(component: ViewerComponent) {
        val toolManager: ToolManager = component.getToolManager()
        if (toolManager != null) {
            component.getImpl().addListeners(toolManager)
        }
        val pdfViewCtrlTabFragment: PdfViewCtrlTabFragment2 = component.getPdfViewCtrlTabFragment()
        if (pdfViewCtrlTabFragment != null) {
            component.getImpl().addListeners(pdfViewCtrlTabFragment)
            val pdfViewCtrl: PDFViewCtrl = component.getPdfViewCtrl()
            if (pdfViewCtrl != null) {
                component.getImpl().addListeners(pdfViewCtrl)
            }
        }
    }

    fun emitAnnotationChangedEvent(action: String?, map: Map<Annot?, Integer?>, component: ViewerComponent) {
        val eventSink: EventChannel.EventSink = component.getAnnotationChangedEventEmitter()
        if (eventSink != null) {
            val resultObject = JSONObject()
            try {
                resultObject.put(KEY_ACTION, action)
                val annotArray = JSONArray()
                for (annot in map.keySet()) {
                    var uid: String? = null
                    try {
                        uid = if (annot.getUniqueID() != null) annot.getUniqueID().getAsPDFText() else null
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                    if (uid != null) {
                        val pageNumber: Integer? = map[annot]
                        val annotObject = JSONObject()
                        annotObject.put(KEY_ANNOTATION_ID, uid)
                        annotObject.put(KEY_PAGE_NUMBER, pageNumber)
                        annotArray.put(annotObject)
                    }
                }
                resultObject.put(KEY_ANNOTATION_LIST, annotArray)
            } catch (e: JSONException) {
                e.printStackTrace()
            }
            eventSink.success(resultObject.toString())
        }
    }

    fun emitExportAnnotationCommandEvent(action: String, map: Map<Annot?, Integer?>, component: ViewerComponent) {
        // TODO: when collabManager is null
        val annots: ArrayList<Annot> = ArrayList(map.keySet())
        var xfdfCommand: String? = null
        try {
            xfdfCommand = if (action.equals(KEY_ACTION_ADD)) {
                generateXfdfCommand(annots, null, null, component)
            } else if (action.equals(KEY_ACTION_MODIFY)) {
                generateXfdfCommand(null, annots, null, component)
            } else {
                generateXfdfCommand(null, null, annots, component)
            }
        } catch (e: PDFNetException) {
            e.printStackTrace()
        }
        val eventSink: EventChannel.EventSink = component.getExportAnnotationCommandEventEmitter()
        if (eventSink != null) {
            eventSink.success(xfdfCommand)
        }
    }

    fun emitAnnotationsSelectedEvent(map: Map<Annot?, Integer?>?, component: ViewerComponent) {
        component.setSelectedAnnots(HashMap(map))
        if (hasAnnotationsSelected(component)) {
            val eventSink: EventChannel.EventSink = component.getAnnotationsSelectedEventEmitter()
            if (eventSink != null) {
                var resultArray: JSONArray? = null
                try {
                    resultArray = getAnnotationsData(component)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
                eventSink.success(if (resultArray == null) "[]" else resultArray.toString())
            }
        }
    }

    // Helpers
    private fun checkFunctionPrecondition(component: ViewerComponent) {
        Objects.requireNonNull(component)
        Objects.requireNonNull(component.getPdfDoc())
    }

    @Nullable
    @Throws(PDFNetException::class)
    private fun generateXfdfCommand(added: ArrayList<Annot>?, modified: ArrayList<Annot>?, removed: ArrayList<Annot>?, component: ViewerComponent): String? {
        val pdfDoc: PDFDoc = component.getPdfDoc()
        if (pdfDoc != null) {
            val fdfDoc: FDFDoc = pdfDoc.fdfExtract(added, modified, removed)
            return fdfDoc.saveAsXFDF()
        }
        return null
    }

    @Nullable
    @Throws(JSONException::class)
    fun generateBookmarkJson(component: ViewerComponent): String? {
        val pdfDoc: PDFDoc = component.getPdfDoc()
        return if (pdfDoc != null) {
            BookmarkManager.exportPdfBookmarks(pdfDoc)
        } else null
    }

    @Throws(JSONException::class)
    private fun getAnnotationData(annot: Annot, pageNumber: Int, component: ViewerComponent): JSONObject? {

        // try to obtain id
        var uid: String? = null
        try {
            uid = if (annot.getUniqueID() != null) annot.getUniqueID().getAsPDFText() else null
        } catch (e: Exception) {
            e.printStackTrace()
        }
        if (uid != null && component.getPdfViewCtrl() != null) {
            val annotPair = JSONObject()
            annotPair.put(KEY_ANNOTATION_ID, uid)
            annotPair.put(KEY_PAGE_NUMBER, pageNumber)
            // try to obtain bbox
            try {
                val bbox: com.pdftron.pdf.Rect = component.getPdfViewCtrl().getScreenRectForAnnot(annot, pageNumber)
                val bboxMap = JSONObject()
                bboxMap.put(KEY_X1, bbox.getX1())
                bboxMap.put(KEY_Y1, bbox.getY1())
                bboxMap.put(KEY_X2, bbox.getX2())
                bboxMap.put(KEY_Y2, bbox.getY2())
                bboxMap.put(KEY_WIDTH, bbox.getWidth())
                bboxMap.put(KEY_HEIGHT, bbox.getHeight())
                annotPair.put(KEY_RECT, bboxMap)
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
            return annotPair
        }
        return null
    }

    @Throws(JSONException::class)
    fun getAnnotationsData(component: ViewerComponent): JSONArray {
        val annots = JSONArray()
        for (entry in component.getSelectedAnnots().entrySet()) {
            val key: Annot = entry.getKey()
            val value: Integer = entry.getValue()
            val annotData: JSONObject? = getAnnotationData(key, value, component)
            if (annotData != null) {
                annots.put(annotData)
            }
        }
        return annots
    }

    fun hasAnnotationsSelected(component: ViewerComponent): Boolean {
        return component.getSelectedAnnots() != null && !component.getSelectedAnnots().isEmpty()
    }

    fun checkQuickMenu(menuItems: List<QuickMenuItem>, keepList: ArrayList<String?>, removeList: List<QuickMenuItem?>) {
        for (item in menuItems) {
            val menuId: Int = item.getItemId()
            if (ToolConfig.getInstance().getToolModeByQMItemId(menuId) != null) {
                // skip real annotation tools
                return
            }
            val menuStr = convQuickMenuIdToString(menuId)
            if (!keepList.contains(menuStr)) {
                removeList.add(item)
            }
        }
    }

    @Throws(JSONException::class)
    private fun getJSONArrayFromJSONObject(jsonObject: JSONObject, key: String): JSONArray {
        val jsonArrayString: String = jsonObject.getString(key)
        return JSONArray(jsonArrayString)
    }

    @Throws(JSONException::class)
    private fun getJSONObjectFromJSONObject(jsonObject: JSONObject, key: String): JSONObject {
        val jsonObjectString: String = jsonObject.getString(key)
        return JSONObject(jsonObjectString)
    }

    @Throws(JSONException::class)
    private fun convertJSONArrayToArrayList(jsonArray: JSONArray): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        for (i in 0 until jsonArray.length()) {
            arrayList.add(jsonArray.getString(i))
        }
        return arrayList
    }

    class ConfigInfo {
        private var customHeaderJson: JSONObject? = null
        private var fileUri: Uri? = null
        private var longPressMenuItems: ArrayList<String> = null
        private var longPressMenuOverrideItems: ArrayList<String> = null
        private var hideAnnotationMenuTools: ArrayList<String> = null
        private var annotationMenuItems: ArrayList<String> = null
        private var annotationMenuOverrideItems: ArrayList<String> = null
        var isAutoSaveEnabled = true
        var isUseStylusAsPen = true
        var isSignSignatureFieldWithStamps = false
        var isShowLeadingNavButton = true
        var tabTitle: String? = null
        fun setCustomHeaderJson(customHeaderJson: JSONObject?) {
            this.customHeaderJson = customHeaderJson
        }

        fun setFileUri(fileUri: Uri?) {
            this.fileUri = fileUri
        }

        fun setLongPressMenuItems(longPressMenuItems: ArrayList<String?>) {
            this.longPressMenuItems = longPressMenuItems
        }

        fun setLongPressMenuOverrideItems(longPressMenuOverrideItems: ArrayList<String?>) {
            this.longPressMenuOverrideItems = longPressMenuOverrideItems
        }

        fun setHideAnnotationMenuTools(hideAnnotationMenuTools: ArrayList<String?>) {
            this.hideAnnotationMenuTools = hideAnnotationMenuTools
        }

        fun setAnnotationMenuItems(annotationMenuItems: ArrayList<String?>) {
            this.annotationMenuItems = annotationMenuItems
        }

        fun setAnnotationMenuOverrideItems(annotationMenuOverrideItems: ArrayList<String?>) {
            this.annotationMenuOverrideItems = annotationMenuOverrideItems
        }

        fun getCustomHeaderJson(): JSONObject? {
            return customHeaderJson
        }

        fun getFileUri(): Uri? {
            return fileUri
        }

        fun getLongPressMenuItems(): ArrayList<String> {
            return longPressMenuItems
        }

        fun getLongPressMenuOverrideItems(): ArrayList<String> {
            return longPressMenuOverrideItems
        }

        fun getHideAnnotationMenuTools(): ArrayList<String> {
            return hideAnnotationMenuTools
        }

        fun getAnnotationMenuItems(): ArrayList<String> {
            return annotationMenuItems
        }

        fun getAnnotationMenuOverrideItems(): ArrayList<String> {
            return annotationMenuOverrideItems
        }
    }
}