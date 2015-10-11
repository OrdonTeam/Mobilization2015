package com.mobilization.second;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public final class TriplePageAdapter extends FragmentPagerAdapter {

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0) return "First";
        if(position==1) return "Second";
        if(position==2) return "Third";
        throw new RuntimeException("There is no page "+position);
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
