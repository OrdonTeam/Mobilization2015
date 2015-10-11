package com.mobilization;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public final class ViewHolder extends RecyclerView.ViewHolder {

    public final ImageView drawableView;

    public ViewHolder(View itemView) {
        super(itemView);
        drawableView = (ImageView) itemView.findViewById(R.id.list_item_drawable);
    }
}
