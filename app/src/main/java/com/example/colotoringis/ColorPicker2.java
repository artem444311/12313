package com.example.colotoringis;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEventSource;

interface ColorPicker2 extends Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource {
    boolean onTouch(View v, MotionEvent event);
}
