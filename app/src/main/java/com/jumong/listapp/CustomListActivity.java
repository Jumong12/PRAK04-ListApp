package com.jumong.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {

    private ListView lvItem;

    private String[] players = new String[]{
            "Frederico Chiesa", "Paulo Dybala", "Alvaro Morata",
            "Aaron Ramsey", "Arien Rabiot", "Manuel Locatelli",
            "Matthijs de Ligt", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szczesny"
    };

    private String[] pos = new String[]{
            "Forward",  "Forward", "Forward",
            "Midfilder", "Midfilder", "Midfilder",
            "Defender",  "Defender",  "Defender",
            "Goal Keeper"
    };

    private int[] num = {22,20,9,8,25,27,4,3,19,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_custom_list);

        lvItem = findViewById (R.id.listCustom);
        JuveAdapter adapter = new JuveAdapter (this, players, pos, num);
        lvItem.setAdapter (adapter);
    }
}