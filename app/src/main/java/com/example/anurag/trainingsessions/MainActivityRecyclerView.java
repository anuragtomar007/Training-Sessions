package com.example.anurag.trainingsessions;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityRecyclerView extends AppCompatActivity {
    private static ArrayList<CricketModel>data;
    private static RecyclerView.Adapter mAdapter;
    private static RecyclerView recyclerView;
    private static RecyclerView.LayoutManager mLayoutManager;
    private static GridLayoutManager mLayoutManager1;
    static View.OnClickListener myOnClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);
        myOnClickListener = new MyOnClickListener(this);
        recyclerView = findViewById(R.id.rc);
        recyclerView.setHasFixedSize(true);

            //to make Linear Layout
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        //to make Grid Layout
//        mLayoutManager1 = new GridLayoutManager(this,3);
//        mLayoutManager1.setOrientation(LinearLayoutManager.VERTICAL); // to set Orientation
//        recyclerView.setLayoutManager(mLayoutManager1);

        data= new ArrayList<CricketModel>();
        for (int i = 0; i< CricketerData.nameArray.length; i++) {
            data.add(new CricketModel(CricketerData.nameArray[i], CricketerData.teamArray[i], CricketerData.roleArray[i], CricketerData.drawableArray[i]));
        }
        mAdapter=new CricketerAdapter(data);
        recyclerView.setAdapter(mAdapter);
    }

    private class MyOnClickListener implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivityRecyclerView.this, "The item has been clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
