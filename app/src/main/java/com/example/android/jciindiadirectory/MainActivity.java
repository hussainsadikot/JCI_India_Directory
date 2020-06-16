package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button aboutJCI,importantMessage,zoneGoverningBody,nationalGoverningBody,lomDirectory,importantProtocol,trainer,zonePresident;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutJCI =findViewById(R.id.button_about_JCi_Main);
        importantMessage =findViewById(R.id.button_important_message);
        zoneGoverningBody = findViewById(R.id.button_zgb);
        nationalGoverningBody =findViewById(R.id.button_national_governing_body);
        lomDirectory =findViewById(R.id.button_Lom_directory);
        importantProtocol = findViewById(R.id.button_important_protocols);
        trainer =findViewById(R.id.button_trainer);
        zonePresident = findViewById(R.id.button_zone_president);




        aboutJCI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Go to NGB Profile", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,AboutActivity.class));

            }
        });
        importantMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ImportantMessageActivity.class));
            }
        });

        zoneGoverningBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,ZGBActivity.class));
            }
        });
    }
}
