package com.mobilization.list;

import android.support.annotation.DrawableRes;

import com.mobilization.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class ViewAdapter {

    private final int drawableIcon;
    private final String text;

    public ViewAdapter(@DrawableRes int drawableIcon, String text) {
        this.drawableIcon = drawableIcon;
        this.text = text;
    }

    public void bind(ViewHolder holder) {
        holder.drawableView.setImageResource(drawableIcon);
        holder.textView.setText(text);
    }
}
