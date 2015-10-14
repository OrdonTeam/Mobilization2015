package com.mobilization.dummy;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mobilization.R;

public final class StandardToolbarInitializer {

    public static void initToolbar(FragmentActivity activity, View view) {
        initToolbar((AppCompatActivity) activity, view);
    }

    private static void initToolbar(AppCompatActivity appCompatActivity, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            appCompatActivity.setSupportActionBar(toolbar);
            appCompatActivity.getSupportActionBar().setTitle("Just a nice title");
        }
    }
}
