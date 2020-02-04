package com.example.harriscityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView objectlistview;
    private String[] mydata =
            {
                    "Lahore", "Karachi", "Faisalabad", "Peshawar", "Rawalpindi"
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
        citylist();
        creatingadapter();
    }

    @SuppressLint("WrongViewCast")
    private void Initialize() {
        objectlistview = findViewById(R.id.LV1);
    }

    private void citylist() {

    }

    private void creatingadapter() {
        ArrayAdapter<String> objectarrayadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mydata);
        objectlistview.setAdapter(objectarrayadapter);

        objectlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int listPosition, long l) {
                if(listPosition==0){
                    Intent intent = new Intent(MainActivity.this, Information.class);
                    startActivity(intent);
                }
                if(listPosition==1){
                    Intent intent2 = new Intent(MainActivity.this, Karachi.class);
                    startActivity(intent2);
                }
                if(listPosition==2){
                    Intent intent3 = new Intent(MainActivity.this, Karachi.class);
                    startActivity(intent3);
                }

            }
        });
    }
}
