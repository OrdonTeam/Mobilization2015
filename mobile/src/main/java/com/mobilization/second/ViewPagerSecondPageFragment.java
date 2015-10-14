package com.mobilization.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.mobilization.R;

public final class ViewPagerSecondPageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view_pager_second_page_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        final EditText firstName = (EditText) view.findViewById(R.id.first_name);
        firstName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    firstName.setError(null);
                } else {
                    if (firstName.getText().length() == 0) {
                        firstName.setError("First name cannot be empty");
                    }
                }
            }
        });

    }
}
