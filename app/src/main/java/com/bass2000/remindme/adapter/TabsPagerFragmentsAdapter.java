package com.bass2000.remindme.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.bass2000.remindme.fragment.ExampleFragment;

public class TabsPagerFragmentsAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentsAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabs = new String[]{"Таб 1", "Напоминания", "Таб 2"};
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
