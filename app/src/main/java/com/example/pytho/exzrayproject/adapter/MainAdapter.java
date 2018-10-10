package com.example.pytho.exzrayproject.adapter;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.example.pytho.exzrayproject.mainfragment.MainChatFragment;
import com.example.pytho.exzrayproject.mainfragment.MainEventFragment;
import com.example.pytho.exzrayproject.mainfragment.MainPostFragment;
import com.example.pytho.exzrayproject.R;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends FragmentPagerAdapter {

    private int[] titles = {R.string.text_post, R.string.text_chat, R.string.text_event};
    private int[] icons = {R.drawable.ic_picture_in_picture_white_24dp, R.drawable.ic_chat_white_24dp, R.drawable.ic_event_note_white_24dp,};

    private TabLayout mTab;
    private ViewPager mPager;
    private Toolbar mToolbar;
    private List<Fragment> mList;

    public MainAdapter(FragmentManager fm, Toolbar toolbar, ViewPager pager, TabLayout tabLayout) {
        super(fm);

        mPager = pager;
        mTab = tabLayout;
        mToolbar = toolbar;
        mList = new ArrayList<>();

        // create new fragments
        MainPostFragment post = new MainPostFragment();
        MainChatFragment chat = new MainChatFragment();
        MainEventFragment event = new MainEventFragment();

        mList.add(post);
        mList.add(chat);
        mList.add(event);

        setupSwipeTab();

        // default title bar
        mToolbar.setTitle(titles[0]);
    }

    @Override
    public Fragment getItem(int i) {
        return mList.get(i);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mList.get(position).toString();
    }

    private void setupSwipeTab() {
        mPager.setAdapter(this);
        mTab.setupWithViewPager(mPager);

        // add icon to tab
        for (int n = 0; n < mList.size(); n++) {
            TabLayout.Tab tab = mTab.getTabAt(n);

            if (tab != null) tab.setText(null).setIcon(icons[n]);
        }

        // add listener when change view and change tittle bar
        mPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                mToolbar.setTitle(titles[position]);
            }
        });
    }
}
