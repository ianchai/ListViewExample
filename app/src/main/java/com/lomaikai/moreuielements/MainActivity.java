package com.lomaikai.moreuielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView fruitsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruitsList = findViewById(R.id.fruitlist);

        final ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Kumquat");
        fruits.add("Durian");
        fruits.add("Rambutan");
        fruits.add("Strawberry");
        fruits.add("Pitaya");

        ArrayAdapter<String> fruitsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                fruits
        );

        fruitsList.setAdapter(fruitsAdapter);

        fruitsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, fruits.get(i) + " selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}