package com.example.pytho.exzrayproject;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.pytho.exzrayproject.adapter.MainAdapter;


public class MainActivity extends AppCompatActivity {

    TabLayout mTab;
    ViewPager mPager;
    Toolbar mToolbar;
    CoordinatorLayout mRoot;
    FloatingActionButton mActionButton;

    MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTab = findViewById(R.id.main_tab);
        mRoot = findViewById(R.id.main_root);
        mPager = findViewById(R.id.main_pager);
        mToolbar = findViewById(R.id.main_toolbar);
        mActionButton = findViewById(R.id.main_fab);

        mAdapter = new MainAdapter(getSupportFragmentManager(), mToolbar, mPager, mTab);

        // widget setup
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_logout:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }

    public void onClickFloatingButton(View view) {
        Snackbar.make(mRoot, "Hello world!", Snackbar.LENGTH_LONG).show();
    }
}
