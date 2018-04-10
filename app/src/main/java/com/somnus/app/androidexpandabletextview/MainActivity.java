package com.somnus.app.androidexpandabletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter();
        mRecyclerView.setAdapter(myAdapter);

        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");
        myAdapter.addData("");

    }
}
