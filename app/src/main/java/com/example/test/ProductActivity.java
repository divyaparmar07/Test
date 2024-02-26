package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductActivity extends AppCompatActivity {

    ArrayList image = new ArrayList<>(Arrays.asList(R.drawable.trolley,R.drawable.trolley,R.drawable.trolley,R.drawable.trolley,R.drawable.trolley));
    ArrayList name = new ArrayList<>(Arrays.asList("Product1","Product2","Product3","Product4","Product5"));
    ArrayList image1 = new ArrayList<>(Arrays.asList(R.drawable.trolley,R.drawable.trolley,R.drawable.trolley,R.drawable.trolley,R.drawable.trolley));
    ArrayList name1 = new ArrayList<>(Arrays.asList("Product6","Product7","Product8","Product9","Product10"));
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        setTitle("Products");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(ProductActivity.this,image,name,image1,name1);
        recyclerView.setAdapter(customAdapter);


    }
}