package com.zhouyou.samlpe.signseekbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String mTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            //actionBar.setHomeButtonEnabled(true);
            //actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.openOptionsMenu();
        }

        findViewById(R.id.main_tab_btn_1).setOnClickListener(this);
        findViewById(R.id.main_tab_btn_2).setOnClickListener(this);
        findViewById(R.id.main_tab_btn_3).setOnClickListener(this);
        findViewById(R.id.main_tab_btn_4).setOnClickListener(this);
        findViewById(R.id.main_tab_btn_5).setOnClickListener(this);
        findViewById(R.id.main_tab_btn_6).setOnClickListener(this);
        findViewById(R.id.main_tab_btn_7).setOnClickListener(this);

        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.container, DemoFragment1.newInstance(), "demo1");
            ft.commit();
            mTag = "demo1";
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.adout_layout:
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_tab_btn_1:
                switchContent("demo1");
                break;
            case R.id.main_tab_btn_2:
                switchContent("demo2");
                break;
            case R.id.main_tab_btn_3:
                switchContent("demo3");
                break;
            case R.id.main_tab_btn_4:
                switchContent("demo4");
                break;
            case R.id.main_tab_btn_5:
                switchContent("demo5");
                break;
            case R.id.main_tab_btn_6:
                switchContent("demo6");
                break;
            case R.id.main_tab_btn_7:
                switchContent("demo7");
                break;
        }
    }

    public void switchContent(String toTag) {
        if (mTag.equals(toTag))
            return;

        FragmentManager fm = getSupportFragmentManager();
        Fragment from = fm.findFragmentByTag(mTag);
        Fragment to = fm.findFragmentByTag(toTag);

        FragmentTransaction ft = fm.beginTransaction();
        if (to == null) {
            if ("demo1".equals(toTag)) {
                to = DemoFragment1.newInstance();
            } else if ("demo2".equals(toTag)) {
                to = DemoFragment2.newInstance();
            } else if ("demo3".equals(toTag)) {
                to = DemoFragment3.newInstance();
            } else if ("demo4".equals(toTag)) {
                to = DemoFragment4.newInstance();
            } else if ("demo5".equals(toTag)) {
                to = DemoFragment5.newInstance();
            } else if ("demo6".equals(toTag))  {
                to = DemoFragment6.newInstance();
            }else{
                to = DemoFragment7.newInstance();
            }
        }
        if (!to.isAdded()) {
            ft.hide(from).add(R.id.container, to, toTag);
        } else {
            ft.hide(from).show(to);
        }
        ft.commit();

        mTag = toTag;
    }
}
