package com.example.monty.myui;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import  android.content.res.Configuration;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager page;
    ViewPager mypage;
    ViewPager image_page;
    Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tool = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        tab = (TabLayout) findViewById(R.id.tabLayout);
        mypage = (ViewPager) findViewById(R.id.mypager);
        mypage.setAdapter(new myPageAdapter(getSupportFragmentManager()));

        tab.setupWithViewPager(mypage);
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mypage.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
};



class myPageAdapter extends FragmentPagerAdapter {

    String data[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public myPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new mon();
        }
        if (position == 1) {
            return new tue();
        }
        if (position == 2) {
            return new wed();
        }
        if (position == 3) {
            return new thu();
        }
        if (position == 4) {
            return new fri();
        }
        if (position == 5) {
            return new sat();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return data.length;
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        return data[position];
    }

};



