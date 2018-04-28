package com.example.android.p5citytourguide;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
class CityAdapter extends FragmentPagerAdapter {

    public CityAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FunPlacesFragment();
            case 1:
                return new HotelsFragment();
            case 2:
                return new MuseumsFragment();
            default:
                return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}
