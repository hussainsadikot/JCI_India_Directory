package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        Bundle bundle = getIntent().getExtras();
        String x =  bundle.getString("file");

        switch (x)
        {
            case ("about_jci_total.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("about_jci_total.pdf").load();

                break;
            case ("PROTOCOLS_6.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("PROTOCOLS_6.pdf").load();
                break;
            case ("ZONE_GOVERNING_BOARD_3_2.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("ZONE_GOVERNING_BOARD_3_2.pdf").load();
                break;
            case ("ZONE_PRESIDENT_3_1.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("ZONE_PRESIDENT_3_1.pdf").load();
                break;

            case ("national_governing_body.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("national_governing_body.pdf").load();
                break;
            case ("zone_directory_5_1.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("zone_directory_5_1.pdf").load();
                break;
            case ("LOM_PERFORMANCE_5_2.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("LOM_PERFORMANCE_5_2.pdf").load();
                break;
            case ("100Efficiency.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("100Efficiency.pdf").load();
                break;
            case ("plan_of_action_1"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("plan_of_action_1").load();
                break;
            case ("recognition.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("recognition.pdf").load();
                break;
            case ("BACKBONE_OF_ZONE_IX_3_3.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("BACKBONE_OF_ZONE_IX_3_3.pdf").load();
                break;
            case ("MESSAGES.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("MESSAGES.pdf").load();
                break;
            case ("Zone_9_trainers_detials_7_1.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("Zone_9_trainers_detials_7_1.pdf").load();
                break;
            case ("NATIONAL_TRAINERS_DETAILES_7_2.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("NATIONAL_TRAINERS_DETAILES_7_2.pdf").load();
                break;
        }
    }
}
