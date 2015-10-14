package com.mobilization.second;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public final class TriplePageAdapter extends FragmentPagerAdapter {

    Fragment[] fragments = {new FirstPageFragment(), new SecondPageFragment(), new FirstPageFragment()};
    String[] titles = {"First", "Second", "Third"};

    public TriplePageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
