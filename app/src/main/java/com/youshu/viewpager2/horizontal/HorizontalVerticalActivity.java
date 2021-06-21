package com.youshu.viewpager2.horizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.youshu.viewpager2.R;

/**
 * 横向滑动viewpager
 */
public class HorizontalVerticalActivity extends AppCompatActivity {
    private static final String EXTRA_NAME="orientation";

    public static Intent newInstance(Context context, @ViewPager2.Orientation int oroentation) {
        Intent intent = new Intent(context, HorizontalVerticalActivity.class);
        intent.putExtra(EXTRA_NAME, oroentation);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_vertical);
        ViewPager2 viewpager2 = findViewById(R.id.viewpager2);

        int orientation = getIntent().getIntExtra(EXTRA_NAME,ViewPager2.ORIENTATION_HORIZONTAL);
        viewpager2.setOrientation(orientation);

        HorizontalVerticalAdapter adapter = new HorizontalVerticalAdapter(this);
        viewpager2.setAdapter(adapter);
    }
}