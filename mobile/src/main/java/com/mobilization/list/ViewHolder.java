package com.mobilization.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobilization.R;

public final class ViewHolder extends RecyclerView.ViewHolder {

    public final ImageView drawableView;
    public final TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);
        drawableView = (ImageView) itemView.findViewById(R.id.list_item_drawable);
        textView = (TextView) itemView.findViewById(R.id.list_item_text);
    }
}
