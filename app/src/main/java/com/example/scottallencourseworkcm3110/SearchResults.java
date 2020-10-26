package com.example.scottallencourseworkcm3110;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchResults extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_results);

        ArrayList<String> display = new ArrayList<>();
        for(int i = 1; i <= 20; i++){
            display.add("Search Results " + i);
        }

        ListView searchResultsLV = findViewById(R.id.searchResultsLV);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, display);
        searchResultsLV.setAdapter(adapter);
    }
}
