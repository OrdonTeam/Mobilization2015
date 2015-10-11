package com.mobilization.second;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public final class TriplePageAdapter extends FragmentPagerAdapter {

    public TriplePageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new SecondPageFragment();
        }
        return new FirstPageFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
