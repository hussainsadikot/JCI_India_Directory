package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TrainerActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ActiveTrainer,PrimeAndNationalTrainer,ZoneTrainerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer);




                ActiveTrainer =findViewById(R.id.button_Active_trainer);
        PrimeAndNationalTrainer=findViewById(R.id.button_Prime_and_national_trainer);
//        ZoneTrainerButton=findViewById(R.id.button_Zone_Trainer);
        ActiveTrainer.setOnClickListener(this);
        PrimeAndNationalTrainer.setOnClickListener(this);
//        ZoneTrainerButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(TrainerActivity.this, "Zone Trainer Button Board", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    @Override
    public void onClick(View v) {
        Intent i = new Intent(TrainerActivity.this, PdfViewActivity.class);
        switch (v.getId())
        {
            case R.id.button_Active_trainer:
                i.putExtra("file","Zone_9_trainers_detials_7_1.pdf");
                startActivity(i);
                break;
            case R.id.button_Prime_and_national_trainer:
                i.putExtra("file","NATIONAL_TRAINERS_DETAILES_7_2.pdf");
                startActivity(i);
                break;
//            case R.id.button_national_governing_body:
//                i.putExtra("file","national_governing_body.pdf");
//                startActivity(i);
//                break;
//            case R.id.:
//                i.putExtra("file","MESSAGES.pdf");
//                startActivity(i);
//                break;
//            case R.id.btn5:
////                i.putExtra("file",5);
////                startActivity(i);
////                break;
            default:
                break;
        }
}
}
