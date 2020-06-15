package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button currentNGB,pastNGB,ZGB,committees,NHQ,EVENT,NOM_COORDINATOR,PAST_NP,NATIONAL_TRAINERS,LOM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentNGB =findViewById(R.id.button_current_ngb);
        ZGB =findViewById(R.id.button_zgb);
        EVENT = findViewById(R.id.button_event);





        currentNGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Go to NGB Profile", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,NGBProfileActivity.class));

            }
        });
        EVENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,EventActivity.class));
            }
        });

        ZGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ZGBActivity.class));
            }
        });
    }
}
