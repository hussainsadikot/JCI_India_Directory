package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ZGBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z_g_b);

        ListView mainListView = findViewById(R.id.main_list);

        final ArrayList<ZoneList> zones = new ArrayList<>();
        zones.add(new ZoneList("Zone I"));
        zones.add(new ZoneList("Zone II"));
        zones.add(new ZoneList("Zone III"));

        ZoneAdapter zoneAdapter= new ZoneAdapter(this,zones);
        mainListView.setAdapter(zoneAdapter);


    }
}
