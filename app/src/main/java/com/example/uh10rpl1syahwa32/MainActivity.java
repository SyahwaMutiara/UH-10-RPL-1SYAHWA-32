package com.example.uh10rpl1syahwa32;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter Adapter;
    private ArrayList<food> foodArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        Adapter = new FoodAdapter(foodArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(Adapter);
    }

    void addData(){
        foodArrayList = new ArrayList<>();
        foodArrayList.add(new food("Lolipop"));
        foodArrayList.add(new food("Candy"));
        foodArrayList.add(new food("Marshmallow"));
        foodArrayList.add(new food("KitKat"));
        foodArrayList.add(new food("BangBang"));
        foodArrayList.add(new food("Peanut"));
        foodArrayList.add(new food("Oreo"));
        foodArrayList.add(new food("Pie"));
        foodArrayList.add(new food("Jelly Bean"));
        foodArrayList.add(new food("Potato"));
        foodArrayList.add(new food("Lays"));
        foodArrayList.add(new food("Oishi"));
        foodArrayList.add(new food("Chitato"));

    }
}