package com.filipkesteli.functionalapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FloatingActionButton fabDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        connectTabWithPager();
        setupListeners();
    }

    //Connecting views with private variables:
    private void initWidgets() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        fabDashboard = (FloatingActionButton) findViewById(R.id.fabDashboard);
    }

    //setup EVENT LISTENERS
    private void setupListeners() {
        fabDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActionBar actionBar = getSupportActionBar();
                if (actionBar.isShowing()) {
                    actionBar.hide();
                } else {
                    actionBar.show();
                }
            }
        });
    }

    //Connecting TabLayout with ViewPager:
    private void connectTabWithPager() {
        //Adapter object for viewPager:
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        //Connection of viewPager with tabLayout -> simple method:
        tabLayout.setupWithViewPager(viewPager);
    }

    //powerfull overrided method that tells us which ActionBar menu we will use
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater -> Returns a MenuInflater with this context
        MenuInflater menuInflater = getMenuInflater();
        //We are inflating menu layout with menu variable
        menuInflater.inflate(R.menu.menu, menu);
        //onCreateOptionsMenu returns true if menu is to be displayed
        return true;
    }

    //Depending which item is selected, do something
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_delete:
                break;
            case R.id.action_favorite:
                break;
            case R.id.action_home:
                break;
            case R.id.action_list:
                break;
            case R.id.action_profile:
                break;
            case R.id.action_search:
                break;
        }
        return true;
    }
}
