package com.example.administrator.heartbeat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Personage> personageList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPersonage();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager
                (2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        HeartAdapter adapter = new HeartAdapter(personageList);
        recyclerView.setAdapter(adapter);
    }

    private void initPersonage() {
        for (int i = 0; i<3;i++){
            Personage zhaoyi = new Personage(R.mipmap.heartimage, R.mipmap.view1, R.mipmap.heartwhite);
            personageList.add(zhaoyi);
            Personage qianer = new Personage(R.mipmap.heartimage, R.mipmap.view2, R.mipmap.heartwhite);
            personageList.add(qianer);
            Personage sunsan = new Personage(R.mipmap.heartimage, R.mipmap.view3, R.mipmap.heartwhite);
            personageList.add(sunsan);
            Personage zhouwu = new Personage(R.mipmap.heartimage, R.mipmap.view4, R.mipmap.heartwhite);
            personageList.add(zhouwu);
            Personage lisi = new Personage(R.mipmap.heartimage, R.mipmap.view5, R.mipmap.heartwhite);
            personageList.add(lisi);
            Personage wuliu = new Personage(R.mipmap.heartimage, R.mipmap.view6, R.mipmap.heartwhite);
            personageList.add(wuliu);
            Personage zhengqi = new Personage(R.mipmap.heartimage, R.mipmap.view7, R.mipmap.heartwhite);
            personageList.add(zhengqi);
            Personage wangba = new Personage(R.mipmap.heartimage, R.mipmap.view1, R.mipmap.heartwhite);
            personageList.add(wangba);
        }
    }
}
