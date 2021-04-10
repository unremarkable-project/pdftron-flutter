package com.pdftron.pdftronflutter.factories

import android.content.Context
import com.pdftron.pdftronflutter.FlutterDocumentView
import java.lang.ref.WeakReference
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory

class DocumentViewFactory(messenger: BinaryMessenger, activityContext: Context?) : PlatformViewFactory(StandardMessageCodec.INSTANCE) {
    private val messenger: BinaryMessenger
    private val mContextRef: WeakReference<Context>
    @Override
    fun create(context: Context?, id: Int, o: Object?): PlatformView {
        return FlutterDocumentView(context, mContextRef.get(), messenger, id)
    }

    init {
        this.messenger = messenger
        mContextRef = WeakReference(activityContext)
    }
}