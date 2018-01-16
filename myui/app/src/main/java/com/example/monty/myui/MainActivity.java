package com.example.monty.myui;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager mypage;
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
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                mypage.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.about:
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                break;
            default: break;
        }
        return true;
    }
};



class myPageAdapter extends FragmentPagerAdapter {

    String data[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public myPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        if (position == 0) {
            return new MondayFragmentClass();
        }
        if (position == 1) {
            return new TuesdayFragmentClass();
        }
        if (position == 2) {
            return new WednesdayFragmentClass();
        }
        if (position == 3) {
            return new ThursdayFragmentClass();
        }
        if (position == 4) {
            return new FridayFragmentClass();
        }
        if (position == 5) {
            return new SturdayFragmentClass();
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



