package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TrainerActivity extends AppCompatActivity {
    private Button ActiveTrainer,PrimeAndNationalTrainer,ZoneTrainerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);




                ActiveTrainer =findViewById(R.id.button_Active_trainer);
        PrimeAndNationalTrainer=findViewById(R.id.button_Prime_and_national_trainer);
        ZoneTrainerButton=findViewById(R.id.button_Zone_Trainer);
        ActiveTrainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TrainerActivity.this, "Active Trainer", Toast.LENGTH_SHORT).show();
            }
        });
        PrimeAndNationalTrainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TrainerActivity.this, "Prime And National Trainer", Toast.LENGTH_SHORT).show();
            }
        });
        ZoneTrainerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TrainerActivity.this, "Zone Trainer Button Board", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
