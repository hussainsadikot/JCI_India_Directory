package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class AboutActivity extends AppCompatActivity {
//    private Button founderPerspective,jciVisionMission,jciCreed,aboutJCIin,knowJCI,historyJCI,areaOpportunity,jciWorldHQ,jciNationalHQ;
    PDFView aboutPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent =getIntent();
        final  String value = intent.getStringExtra("about_pdf");

        aboutPDF =findViewById(R.id.pdfView_About);
        aboutPDF.fromAsset(value).load();


//        founderPerspective =findViewById(R.id.button_Founder_Perspective);
//        jciVisionMission =findViewById(R.id.button_JCI_version_and_Mission);
//        jciCreed = findViewById(R.id.button_JCI_Creed);
//        aboutJCIin =findViewById(R.id.button_about_jci_india);
//        knowJCI =findViewById(R.id.button_Know_Your_JCI);
//        historyJCI = findViewById(R.id.button_History_of);
//        areaOpportunity =findViewById(R.id.button_Area_of_opportunities);
//        jciWorldHQ = findViewById(R.id.button_JCI_word_head_quarters);
//        jciNationalHQ =findViewById(R.id.button_JCI_national_head_quarters);





    }
}
