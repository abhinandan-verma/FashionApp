package com.example.fashionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<row> appList;

    // Images for cards
    int[] covers = new int[]{
            R.drawable.fash1,
            R.drawable.fash2,
            R.drawable.fash3,
            R.drawable.fash4,
            R.drawable.fash5,
            R.drawable.fash6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Widgets and Variables
         RecyclerView recyclerView = findViewById(R.id.recyclerView2);

        //2. getting Data
        appList = new ArrayList<>();
        //3. Creating Adapter
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, appList);
        //RecyclerView.LayoutManager manager = new GridLayoutManager(this, 2);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        // set LayoutManager
        recyclerView.setLayoutManager(manager);
        // set Adapter
        recyclerView.setAdapter(adapter);

        // Inserting DAta
        InitializeDataIntoRecyclerView();

    }

    private void InitializeDataIntoRecyclerView() {
        row a = new row(covers[0], "Box Tee");
        appList.add(a);
        a = new row(covers[1],"Boyfriend Tee");
        appList.add(a);
        a = new row(covers[2],"Skinny Tee");
        appList.add(a);
        a = new row(covers[3],"Shirt Sleeve");
        appList.add(a);
        a = new row(covers[4],"friend Tee");
        appList.add(a);
        a = new row(covers[5],"Shirt Color");
        appList.add(a);
    }
}