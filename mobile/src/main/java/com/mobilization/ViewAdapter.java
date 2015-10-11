package com.mobilization;

import android.support.annotation.DrawableRes;

import java.util.ArrayList;
import java.util.List;

public final class ViewAdapter {

    private int drawableIcon;

    public ViewAdapter(@DrawableRes int drawableIcon) {
        this.drawableIcon = drawableIcon;
    }

    public void bind(ViewHolder holder) {
        holder.drawableView.setImageResource(drawableIcon);
    }

    public static List<ViewAdapter> longRandomList() {
        List<ViewAdapter> adapters = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            adapters.add(new ViewAdapter(R.drawable.circle1));
        }
        return adapters;
    }
}
