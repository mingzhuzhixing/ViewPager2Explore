package com.youshu.viewpager2.radiogroup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.youshu.viewpager2.R;

/**
 * ClassName: MyFragment
 * Description:
 *
 * @author zhuming
 * @package_name com.youshu.viewpager2.radiogroup
 * @date 2021/6/21 2:21 PM
 */
public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);
    }
}
