package com.demo.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final List<String> list = new ArrayList<String>();
        list.add("PHP");
        list.add("Dot-Net");
        list.add("kotlin");
        list.add("Flutter");
        list.add("Dark");
        list.add("Python");
        list.add("C");
        list.add("C++");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1, list );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, list.get(position), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
