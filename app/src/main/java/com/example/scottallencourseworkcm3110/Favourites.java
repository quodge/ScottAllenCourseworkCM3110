package com.example.scottallencourseworkcm3110;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collections;
import java.util.List;
import java.util.*;

public class Favourites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourites);

        ArrayList<String> display = new ArrayList<>();
        for(int i = 1; i <= 20; i++){
            display.add("Favourite " + i);
        }

        ListView favouritesLV = findViewById(R.id.favouritesLV);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, display);
        favouritesLV.setAdapter(adapter);
    }

}
