package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ZonePresidentColumnActivity extends AppCompatActivity implements View.OnClickListener{

    private Button buttonRecognition,button100Efficiency;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone_president_column);


//        ButtonPlanOfAction2 =findViewById(R.id.button_Plan_Of_Action_2);
        buttonRecognition=findViewById(R.id.button_Recognition);
        button100Efficiency=findViewById(R.id.button_100_Efficiency);




        buttonRecognition.setOnClickListener(this);
        button100Efficiency.setOnClickListener(this);










    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(ZonePresidentColumnActivity.this, PdfViewActivity.class);
        switch (v.getId()) {

            case R.id.button_100_Efficiency:
                i.putExtra("file", "100Efficiency.pdf");
                startActivity(i);
//                Toast.makeText(this, "Pdf will be loaded", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_Recognition:
                i.putExtra("file", "recognition.pdf");
                startActivity(i);
//                Toast.makeText(this, "Pdf will be loaded", Toast.LENGTH_SHORT).show();
                break;

                default:
                break;
        }


    }
}
