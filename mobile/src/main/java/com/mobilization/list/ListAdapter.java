package com.mobilization.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobilization.R;

import java.util.List;

public final class ListAdapter extends RecyclerView.Adapter {

    List<ViewAdapter> adapters;

    public ListAdapter(List<ViewAdapter> adapters) {
        this.adapters = adapters;
    }

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
