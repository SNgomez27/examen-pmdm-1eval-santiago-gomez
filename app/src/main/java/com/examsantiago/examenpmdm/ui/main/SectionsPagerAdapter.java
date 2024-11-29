package com.examsantiago.examenpmdm.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.examsantiago.examenpmdm.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlaceholderFragment();
            case 1:
                return  new PlaceholderFragment2();
                case 2:
                return new PlaceholderFragment3();
            default:
                return null;
                //case 1:
        }
    }
    @Override
    public int getCount() {
        return 1;
    }
}