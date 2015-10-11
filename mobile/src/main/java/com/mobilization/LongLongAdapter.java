package com.mobilization;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public final class LongLongAdapter extends RecyclerView.Adapter {

    List<ViewAdapter> adapters = ViewAdapter.longRandomList();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        adapters.get(position).bind((ViewHolder) holder);
    }

    @Override
    public int getItemCount() {
        return adapters.size();
    }
}
