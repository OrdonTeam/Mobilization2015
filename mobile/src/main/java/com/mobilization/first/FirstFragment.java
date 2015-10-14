package com.mobilization.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobilization.R;
import com.mobilization.dummy.StandardToolbarInitializer;
import com.mobilization.list.ListInitializer;

public final class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StandardToolbarInitializer.initToolbar(getActivity(), view);
        ListInitializer.initList(getContext(), view);
    }
}
