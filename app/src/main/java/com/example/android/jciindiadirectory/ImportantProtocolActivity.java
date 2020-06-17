package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ImportantProtocolActivity extends AppCompatActivity {
    PDFView aboutPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_important_protocol);
        aboutPDF =findViewById(R.id.pdfView_important_protocol);
        aboutPDF.fromAsset("important_protocol.pdf").load();

    }
}
