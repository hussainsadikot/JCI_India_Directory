package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
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
//        zonePresident = findViewById(R.id.button_zone_president_main);
        aboutJCI.setOnClickListener(this);
        importantProtocol.setOnClickListener(this);

//
//        aboutJCI.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "About JCI Profile", Toast.LENGTH_SHORT).show();
//
//                startActivity(new Intent(MainActivity.this,PdfViewActivity.class).putExtra("about_pdf","about_jci_total.pdf"));
//
//
//
//            }
//        });
        importantMessage.setOnClickListener(this);

        zoneGoverningBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Zone Governing Body", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,ZoneGoverningBodyActivity.class));

            }
        });

        nationalGoverningBody.setOnClickListener(this);
//        importantProtocol.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Important Protocol", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity.this,PdfViewActivity.class).putExtra("protocol_pdf","important_protocol.pdf"));
//
//            }
//        });



        lomDirectory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "lom Directory ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,LOMDirectoryActivity.class));
            }
        });
        trainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Trainer", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,TrainerActivity.class));
            }
        });
//        zonePresident.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "Zone President", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity.this,ZonePresidentColumnActivity.class));
//            }
//        });




    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, PdfViewActivity.class);
        switch (v.getId())
        {
            case R.id.button_about_JCi_Main:
                i.putExtra("file","about_jci_total.pdf");
                startActivity(i);
                break;
            case R.id.button_important_protocols:
                i.putExtra("file","PROTOCOLS_6.pdf");
                startActivity(i);
                break;
            case R.id.button_national_governing_body:
                i.putExtra("file","national_governing_body.pdf");
                startActivity(i);
                break;
            case R.id.button_important_message:
                i.putExtra("file","MESSAGES.pdf");
                startActivity(i);
                break;
//            case R.id.btn5:
////                i.putExtra("file",5);
////                startActivity(i);
////                break;
            default:
                break;
        }
    }
}
