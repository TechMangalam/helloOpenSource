package com.bitaam.bgyoutube.utility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;

public class BgMediaWebView extends WebView {

    public BgMediaWebView(Context context) {
        super(context);
    }

    public BgMediaWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BgMediaWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onWindowVisibilityChanged(int visibility) {
        if (visibility != View.GONE) super.onWindowVisibilityChanged(View.VISIBLE);
    }

}
