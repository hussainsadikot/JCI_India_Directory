package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ImportantMessageActivity extends AppCompatActivity {

    private Button zonePresidentmsg,jciIndiaPresidentMsg,importantPastPresidentMessage,zoneDirectoryMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_message);

        zonePresidentmsg =findViewById(R.id.button_Zone_President_Message);
        jciIndiaPresidentMsg =findViewById(R.id.button_JCI_india_president_message);
        importantPastPresidentMessage = findViewById(R.id.button_Imp_past_zone_president_message);
        zoneDirectoryMessage =findViewById(R.id.button_Zone_Directory_message);







    }
}
