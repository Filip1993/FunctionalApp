package com.filipkesteli.functionalapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Filip on 21.5.2016..
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    //array of names of fragments:
    private String[] tabs = {"Light", "Dark", "Purple"};

    //Default Constructor:
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Method that returns Fragment object depending of position parameter -> Here we can look at fragments like items
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new LightFragment();
                break;
            case 1:
                fragment = new DarkFragment();
                break;
            case 2:
                fragment = new PurpleFragment();
                break;
        }
        return fragment;
    }

    //Returns the number of views available
    @Override
    public int getCount() {
        return tabs.length;
    }

    //Receives position parameter and returns title of requested page trough position parameter
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
