package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ZoneGoverningBodyActivity extends AppCompatActivity implements View.OnClickListener {
    private Button zonePresidentDetail,ZoneGoverningBoard,BackboneOfZoneIX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone_governing_body);

        zonePresidentDetail =findViewById(R.id.button_zone_president);
        ZoneGoverningBoard = findViewById(R.id.button_Zone_governing_board);
        BackboneOfZoneIX =findViewById(R.id.button_Backbone_of_Zone_IX);

        zonePresidentDetail.setOnClickListener(this);
        ZoneGoverningBoard.setOnClickListener(this);
        BackboneOfZoneIX.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(ZoneGoverningBodyActivity.this, PdfViewActivity.class);
        switch (v.getId()) {
            case R.id.button_Zone_governing_board:
                i.putExtra("file", "ZONE_GOVERNING_BOARD_3_2.pdf");
                startActivity(i);
                break;
            case R.id.button_zone_president:
                i.putExtra("file", "ZONE_PRESIDENT_3_1.pdf");
                startActivity(i);
                break;
            case R.id.button_Backbone_of_Zone_IX:
                i.putExtra("file","BACKBONE_OF_ZONE_IX_3_3.pdf");
                startActivity(i);
//                Toast.makeText(this, "Pdf will be loaded", Toast.LENGTH_SHORT).show();
                break;
//            case R.id.btn4:
//                i.putExtra("file",4);
//                startActivity(i);
//                break;
//            case R.id.btn5:
//                i.putExtra("file",5);
//                startActivity(i);
//                break;
            default:
                break;
        }
    }
}
