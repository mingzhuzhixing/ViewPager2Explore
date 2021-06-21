package com.youshu.viewpager2.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: TabAdapter
 * Description:
 *
 * @author zhuming
 * @package_name com.youshu.viewpager2
 * @date 2021/6/21 2:01 PM
 */
public class TabAdapter extends FragmentStateAdapter {

    private List<Integer> colors;

    TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        if (colors == null) {
            colors = new ArrayList<>();
        }
    }

    void addColor(int color) {
        if (colors != null) {
            colors.add(color);
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return ShowFragment.newInstance(colors, position);
    }

    @Override
    public int getItemCount() {
        return colors.size();
    }
}
