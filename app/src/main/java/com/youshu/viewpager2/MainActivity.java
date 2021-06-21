package com.youshu.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.youshu.viewpager2.horizontal.HorizontalVerticalActivity;
import com.youshu.viewpager2.radiogroup.RadioGroupActivity;
import com.youshu.viewpager2.tablayout.TabLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 横向滑动
     */
    public void onHorizontalScroll(View view) {
        startActivity(HorizontalVerticalActivity.newInstance(this, ViewPager2.ORIENTATION_HORIZONTAL));
    }

    /**
     * 纵向滑动
     */
    public void onVerticalScroll(View view) {
        startActivity(HorizontalVerticalActivity.newInstance(this, ViewPager2.ORIENTATION_VERTICAL));
    }

    /**
     * viewpager2与tablayout使用
     */
    public void onRadioGroup(View view) {
        startActivity(new Intent(this, RadioGroupActivity.class));
    }

    /**
     * viewpager2与tablayout使用
     */
    public void onTabLayout(View view) {
        startActivity(new Intent(this, TabLayoutActivity.class));
    }
}