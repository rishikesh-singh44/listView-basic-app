package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView listView;
ArrayList<String> arrName= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        arrName.add("Jack");
        arrName.add("Charles");
        arrName.add("Kevin");
        arrName.add("Peter");
        arrName.add("John");
        arrName.add("Charles");
        arrName.add("Kevin");
        arrName.add("Peter");
        arrName.add("Jack");
        arrName.add("Charles");
        arrName.add("Kevin");
        arrName.add("Peter");
        arrName.add("Jack");
        arrName.add("Charles");
        arrName.add("Kevin");
        arrName.add("Peter");
        arrName.add("Jack");
        arrName.add("Peter");
        arrName.add("Jack");
        arrName.add("Charles");
        arrName.add("Kevin");
        arrName.add("Peter");
        arrName.add("Jack");


        ArrayAdapter<String> adapter= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrName);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                }
                if (position==1)
                {
                    Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                }
                if (position==2)
                {
                    Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                }
                if (position==3)
                {
                    Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                }
                if (position==4)
                {
                    Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
                }
                if (position==5)
                {
                    Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
                }
                if (position==6)
                {
                    Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
                }
                if (position==7)
                {
                    Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
                }
                if (position==8)
                {
                    Toast.makeText(MainActivity.this, "9", Toast.LENGTH_SHORT).show();
                }
                if (position==9)
                {
                    Toast.makeText(MainActivity.this, "10", Toast.LENGTH_SHORT).show();
                }
                if (position==10)
                {
                    Toast.makeText(MainActivity.this, "11", Toast.LENGTH_SHORT).show();
                }
                if (position==11)
                {
                    Toast.makeText(MainActivity.this, "12", Toast.LENGTH_SHORT).show();
                }
                if (position==12)
                {
                    Toast.makeText(MainActivity.this, "13", Toast.LENGTH_SHORT).show();
                }
                if (position==13)
                {
                    Toast.makeText(MainActivity.this, "14", Toast.LENGTH_SHORT).show();
                }
                if (position==14)
                {
                    Toast.makeText(MainActivity.this, "15", Toast.LENGTH_SHORT).show();
                }
                if (position==15)
                {
                    Toast.makeText(MainActivity.this, "16", Toast.LENGTH_SHORT).show();
                }
                if (position==16)
                {
                    Toast.makeText(MainActivity.this, "17", Toast.LENGTH_SHORT).show();
                }
                if (position==17)
                {
                    Toast.makeText(MainActivity.this, "18", Toast.LENGTH_SHORT).show();
                }
                if (position==18)
                {
                    Toast.makeText(MainActivity.this, "19", Toast.LENGTH_SHORT).show();
                }
                if (position==19)
                {
                    Toast.makeText(MainActivity.this, "20", Toast.LENGTH_SHORT).show();
                }
                if (position==20)
                {
                    Toast.makeText(MainActivity.this, "21", Toast.LENGTH_SHORT).show();
                }
                if (position==21)
                {
                    Toast.makeText(MainActivity.this, "22", Toast.LENGTH_SHORT).show();
                }
                if (position==22)
                {
                    Toast.makeText(MainActivity.this, "23", Toast.LENGTH_SHORT).show();
                }
                if (position==23)
                {
                    Toast.makeText(MainActivity.this, "24", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}