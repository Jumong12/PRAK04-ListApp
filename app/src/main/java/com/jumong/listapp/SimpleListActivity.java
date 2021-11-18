package com.jumong.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] players = new String[]{
            "Frederico Chiesa", "Paulo Dybala", "Alvaro Morata", "Aaron Ramsey",
            "Arien Rabiot", "Manuel Locatelli", "Matthijs de Ligt",
            "Giorgio Chiellini", "Leonardo Bonuci", "Wojciech Szczesny"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_simple_list);

        lvItem = (ListView) findViewById (R.id.lvSimple);
        ArrayAdapter<String> simpleAdaptor = new ArrayAdapter<String> (SimpleListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, players);

        lvItem.setAdapter (simpleAdaptor);

    }
}