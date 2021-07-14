package com.pdftron.pdftronflutter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import com.pdftron.pdf.config.PDFViewCtrlConfig;
import com.pdftron.pdf.config.ToolManagerBuilder;
import com.pdftron.pdf.config.ViewerConfig;
import com.pdftron.pdf.config.ViewerBuilder2;
import com.pdftron.pdf.controls.DocumentActivity;
import com.pdftron.pdf.controls.PdfViewCtrlTabHostFragment2;
import com.pdftron.pdf.model.FileInfo;
import com.pdftron.pdf.widget.toolbar.builder.AnnotationToolbarBuilder;
import com.pdftron.pdf.widget.toolbar.builder.ToolbarButtonType;
import com.pdftron.pdftronflutter.helpers.PluginUtils;
import com.pdftron.pdf.widget.toolbar.component.DefaultToolbars;

import org.json.JSONObject;

// import androidx.appcompat.app.AppCompatActivity;

import static com.pdftron.pdftronflutter.helpers.PluginUtils.handleLeadingNavButtonPressed;

import java.net.URI;

public class IntentDocumentActivity extends DocumentActivity {
    private static IntentDocumentActivity sCurrentActivity;
    public PdfViewCtrlTabHostFragment2 mPdfViewCtrlTabHostFragment;


    private void openIntent(IntentDocumentActivity a, Context packageContext, Uri fileUri, String password, @Nullable JSONObject customHeaders, @Nullable ViewerConfig config) {
        openIntent(packageContext, fileUri, password, customHeaders, config, DEFAULT_NAV_ICON_ID);
        a.finish();
    }

    private void openIntent(Context packageContext, Uri fileUri, String password, @Nullable JSONObject customHeaders, @Nullable ViewerConfig config, @DrawableRes int navIconId) {
        DocumentActivity.IntentBuilder intentBuilder = DocumentActivity.IntentBuilder.fromActivityClass(packageContext, IntentDocumentActivity.class);

        if (null != fileUri) {
            intentBuilder.withUri(fileUri);
        }

        if (null != password) {
            intentBuilder.usingPassword(password);
        }

        if (null != customHeaders) {
            intentBuilder.usingCustomHeaders(customHeaders);
        }

        // mPdfViewCtrlTabHostFragment = ViewerBuilder2.withUri(fileUri)
        intentBuilder
            .usingNavIcon(navIconId)
            .usingConfig(config)
            .usingNewUi(true);
            // .build(this);
        // mPdfViewCtrlTabHostFragment.addHostListener(this);
        // FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // ft.replace(R.id.fragment_container, mPdfViewCtrlTabHostFragment);
        // ft.commit();
        packageContext.startActivity(intentBuilder.build()
        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK)
        );
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // String uri = getIntent().getDataString();
        Uri uri = getIntent().getData();
        Context context = getApplicationContext();
        setContentView(R.layout.activity_intent);
        String password = null;

        // trying to figure out if instancestate does something
        // Log.e("INSTANCE", "onCreate: " + savedInstanceState);
        super.onCreate(savedInstanceState);

        ViewerConfig.Builder builder = new ViewerConfig.Builder();
        ToolManagerBuilder toolManagerBuilder = ToolManagerBuilder.from();
        PDFViewCtrlConfig pdfViewCtrlConfig = PDFViewCtrlConfig.getDefaultConfig(context);
        
        if(uri!= null) {
            PluginUtils.ConfigInfo configInfo = PluginUtils.handleOpenDocument(builder, toolManagerBuilder, pdfViewCtrlConfig, uri.toString(), context, null);
            openIntent(this, context, configInfo.getFileUri(), password, null, builder.build());
            // finish();
            
        }
        attachActivity();

    }


    private void attachActivity() {
        sCurrentActivity = this;
    }

    private void detachActivity() {
        sCurrentActivity = null;
    }

    public static IntentDocumentActivity getCurrentActivity() {
        return sCurrentActivity;
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        detachActivity();
    }
}
