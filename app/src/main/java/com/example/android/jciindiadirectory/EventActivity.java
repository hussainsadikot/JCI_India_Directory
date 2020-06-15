package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EventAdapter eventAdapter;
    List<Event> eventList;
    SharedPreferences prefs = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        recyclerView = findViewById(R.id.recycler_view_event);
        eventList = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        eventList.add( new Event("January","Art and Culture"));
        eventList.add( new Event("February","Geography and places"));
        eventList.add( new Event("March","Health and fitness"));
        eventList.add( new Event("April","History and events"));
        eventList.add( new Event("May","Natural sciences and nature"));
        eventList.add( new Event("June","People and self"));
        eventList.add( new Event("July","Philosophy and thinking"));
        eventList.add( new Event("August","Religion and spirituality"));
        eventList.add( new Event("September","Social sciences and society"));
        eventList.add( new Event("October","Technology and applied sciences"));

       eventAdapter = new EventAdapter((ArrayList<Event>) eventList);
        eventAdapter.setOnItemClickListener(new EventAdapter.OnItemClickListener() {
            @Override
            public void onButtonClick(int position) {
//                eventList.get(position).notify();
                Toast.makeText(EventActivity.this, "Go to Event", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
        recyclerView.setAdapter(eventAdapter);




    }
}
