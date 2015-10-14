package com.mobilization.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobilization.R;

public final class SecondPageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_page_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        TextView firstName = (TextView) view.findViewById(R.id.first_name);
        final TextInputLayout firstNameLayout = (TextInputLayout) view.findViewById(R.id.first_name_layout);
        firstName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View firstName, boolean hasFocus) {
                if (hasFocus) {
                    firstNameLayout.setError(null);
                } else {
                    if (((TextView) firstName).getText().length() == 0) {
                        firstNameLayout.setError("First name cannot be empty");
                    }
                }
            }
        });

    }
}
