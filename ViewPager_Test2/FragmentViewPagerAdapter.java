package com.example.mbpro.study4_homework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbpro on 2016. 5. 6..
 */
public class FragmentViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentsList = new ArrayList<>();

    public FragmentViewPagerAdapter(FragmentManager fm) {
        super(fm);

        fragmentsList.add(new Fragment1());
        fragmentsList.add(new Fragment2());
        fragmentsList.add(new Fragment3());


    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }
}
