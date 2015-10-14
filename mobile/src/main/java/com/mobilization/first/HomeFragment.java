package com.mobilization.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobilization.R;
import com.mobilization.list.ListInitializer;

public final class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Just a nice title");


        final View coordiatorLayout = view.findViewById(R.id.coordinator_layout);
        view.findViewById(R.id.floating_action_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(coordiatorLayout, "This is a snackbar not toast", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("DELETE", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });

        ListInitializer.initList(getContext(), view);
    }
}
