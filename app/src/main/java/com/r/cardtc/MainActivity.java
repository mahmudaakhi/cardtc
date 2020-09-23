package com.r.cardtc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Data[] myData = new Data[]{
                new Data("SUZUKI","THE BEST CAR",R.drawable.suzuki),
                new Data("TATA","the best car",R.drawable.tata),
                new Data("MAHINDRA","2005 film",R.drawable.mahindra),
                new Data("HONDHA","2019 film",R.drawable.hondha),
                new Data("TOYOTA","2012 film",R.drawable.toyota),
                new Data("FONCAD","2003 film",R.drawable.foncad),
                //new MyMovieData("Avatar","2009 film",R.drawable.avatar),
        };

        Adapter myAdapter = new Adapter(myData,MainActivity.this);
        recyclerView.setAdapter(myAdapter);




    }
}