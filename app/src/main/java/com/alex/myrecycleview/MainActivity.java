package com.alex.myrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    LinearLayoutManager layoutManager;
    ArrayList<AndroidVersion> listVersions;
    int[] logo;
    String[] codeName, version, api, releaseDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rvVersions);
        layoutManager = new LinearLayoutManager(this);
       // layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        prepareData();
        listVersions = new ArrayList<AndroidVersion>();
        for (int i=0; i < codeName.length; i++){
            listVersions.add(new AndroidVersion(logo[i], codeName[i], version[i], api[i], releaseDate[i]));
        }
        adapter = new CustomAdapter(this, listVersions);
        recyclerView.setAdapter(adapter);
    }

    public void prepareData() {
        logo = new int[] {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair,
                R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb,
                R.drawable.ics, R.drawable.jelly, R.drawable.kit, R.drawable.lolli,
                R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo};
        codeName = getResources().getStringArray(R.array.code_names);
        version = getResources().getStringArray(R.array.version_no);
        api = getResources().getStringArray(R.array.api_level);
        releaseDate = getResources().getStringArray(R.array.release_date);
    }
}
