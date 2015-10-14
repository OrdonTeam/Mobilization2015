package com.mobilization.second;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public final class TriplePageAdapter extends FragmentPagerAdapter {

    String[] titles = {"First", "Second", "Third"};

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

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
