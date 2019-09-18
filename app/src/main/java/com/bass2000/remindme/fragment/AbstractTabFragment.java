package com.bass2000.remindme.fragment;

import android.content.Context;
import android.view.View;

import androidx.fragment.app.Fragment;

public class AbstractTabFragment extends Fragment {
    protected View view;
    protected Context context;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
