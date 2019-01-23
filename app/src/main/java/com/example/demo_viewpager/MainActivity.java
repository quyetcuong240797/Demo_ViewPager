package com.example.demo_viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private ArrayList<Item> arrayList;
    private String urlGoku ="https://pm1.narvii.com/6480/83fe70009b0292a60f5a185ec3e3ccb99514fbfd_hq.jpg";
    private String urlVegeta ="http://freeaddon.com/wp-content/uploads/2017/10/vegeta-5.jpg";
    private String urlTrunks ="https://otakukart.com/wp-content/uploads/2017/09/future_trunks_super_saiyan_rage__2_by_rmehedi-db5rxdm.png";
    private String urlGohan ="https://qph.fs.quoracdn.net/main-qimg-d69ffb39155cc71615332e635ec5557e";
    private String urlGoten ="https://lh3.googleusercontent.com/-2JqRxcqXsk0/Wccz0mZJOwI/AAAAAAAACXk/NAivXGZU_8Il_BSim4g2zz2ZAVE8ZxdiACJoC/w852-h1136/SSJGokuJrHD.jpg";
    public static final String NAME_GOKU ="GoKu";
    public static final String NAME_GOTEN ="GoTen";
    public static final String NAME_GOHAN ="GoHan";
    public static final String NAME_VEGETA ="Vegeta";
    public static final String NAME_TRUNKS ="Trunks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    public void addControls() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        arrayList.add(new Item(urlGoku,NAME_GOKU));
        arrayList.add(new Item(urlGohan,NAME_GOHAN));
        arrayList.add(new Item(urlTrunks,NAME_TRUNKS));
        arrayList.add(new Item(urlGoten,NAME_GOTEN));
        arrayList.add(new Item(urlVegeta,NAME_VEGETA));
        Adapter adapter = new Adapter(arrayList, this);
        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
