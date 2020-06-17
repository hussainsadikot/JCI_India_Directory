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
            case ("important_protocol.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("important_protocol.pdf").load();
                break;
            case ("zone _governing_body.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("zone _governing_body.pdf").load();
                break;
            case ("zone_president.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("zone_president.pdf").load();
                break;

            case ("national_governing_body.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("national_governing_body.pdf").load();
                break;
            case ("zone_directory_5_1.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("zone_directory_5_1.pdf").load();
                break;
            case ("lom_performance.pdf"):
                pdfView =findViewById(R.id.pdf_view);

                pdfView.fromAsset("lom_performance.pdf").load();
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


        }
    }
}
