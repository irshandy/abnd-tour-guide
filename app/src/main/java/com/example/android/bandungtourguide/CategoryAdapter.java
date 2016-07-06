package com.example.android.bandungtourguide;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by IrvinShandy on 6/30/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new ParksFragment();
            case 3:
                return new HistoricFragment();
            default:
                return new ShoppingFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 1:
                return mContext.getString(R.string.category_restaurants);
            case 2:
                return mContext.getString(R.string.category_parks);
            case 3:
                return mContext.getString(R.string.category_historic);
            default:
                return mContext.getString(R.string.category_shopping);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}