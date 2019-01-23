package com.example.demo_viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Adapter extends PagerAdapter {
    private ArrayList<Item> mArrayListItem;
    private String tabTitle[] = new String[]{"GoKu", "GoHan", "Trunks", "GoTen", "Vegeta"};
    private Context mContext;
    ImageView imageView;
    TextView textView;
    TabLayout tabLayout;

    public Adapter(ArrayList<Item> arrayListItem, Context context) {
        this.mArrayListItem = arrayListItem;
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return mArrayListItem.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, container, false);
        imageView = (ImageView) view.findViewById(R.id.image_view_item);
        textView = (TextView) view.findViewById(R.id.text_view_item);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        Item item = mArrayListItem.get(position);
        Glide.with(mContext)
                .load(item.getmImageItem())
                .into(imageView);
        textView.setText(item.getmNameItem());
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "GoKu";
            case 1:
                return "GoHan";
            case 2:
                return "Trunks";
            case 3:
                return "GoTen";
            case 4:
                return "Vegeta";
        }
        return null;
    }
}
