package com.mobilization.dummy;

import android.view.View;

import com.mobilization.HomeActivity;
import com.mobilization.R;
import com.mobilization.first.FirstFragment;
import com.mobilization.second.SecondFragment;

public final class SelectorInitializer {
    public static void initDummySelector(final HomeActivity homeActivity) {
        View selectFirst = homeActivity.findViewById(R.id.select_first);
        if (selectFirst != null) {
            selectFirst.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    homeActivity.getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new FirstFragment()).commit();
                }
            });
        }
        View selectSecond = homeActivity.findViewById(R.id.select_second);
        if (selectSecond != null) {
            selectSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    homeActivity.getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new SecondFragment()).commit();
                }
            });
        }
    }
}
