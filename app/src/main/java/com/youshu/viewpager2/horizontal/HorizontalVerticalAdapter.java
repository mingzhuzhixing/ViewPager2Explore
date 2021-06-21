package com.youshu.viewpager2.horizontal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.youshu.viewpager2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: HorizontalVpAdapter
 * Description:
 *
 * @author zhuming
 * @package_name com.youshu.viewpager2.horizontal
 * @date 2021/6/21 11:01 AM
 */
public class HorizontalVerticalAdapter extends RecyclerView.Adapter<HorizontalVerticalAdapter.HorizontalVpViewHolder>{
    private List<Integer> backgrounds;
    private Context mContext;

    public HorizontalVerticalAdapter(Context context) {
        mContext = context;
        if (backgrounds == null) {
            backgrounds = new ArrayList<>();
            backgrounds.add(android.R.color.holo_blue_bright);
            backgrounds.add(android.R.color.holo_red_dark);
            backgrounds.add(android.R.color.holo_green_dark);
            backgrounds.add(android.R.color.holo_orange_light);
            backgrounds.add(android.R.color.holo_purple);
        }
    }

    @NonNull
    @Override
    public HorizontalVpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalVpViewHolder(LayoutInflater.from(mContext).inflate((R.layout.item_h_v), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalVpViewHolder holder, int position) {
        holder.mTextView.setText("第  " + (position + 1) + " 界面");
        holder.mLinearLayout.setBackgroundResource(backgrounds.get(position));
    }

    @Override
    public int getItemCount() {
        if (backgrounds == null) {
            return 0;
        }
        return backgrounds.size();
    }

    class HorizontalVpViewHolder extends RecyclerView.ViewHolder{
        LinearLayout mLinearLayout;
        TextView mTextView;

        public HorizontalVpViewHolder(@NonNull View itemView) {
            super(itemView);
            mLinearLayout = itemView.findViewById(R.id.ll_h_v);
            mTextView = itemView.findViewById(R.id.tv_hv);
        }
    }
}
