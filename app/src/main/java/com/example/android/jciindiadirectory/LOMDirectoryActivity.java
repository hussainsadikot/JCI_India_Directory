package com.example.android.jciindiadirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LOMDirectoryActivity extends AppCompatActivity implements View.OnClickListener {
    private Button LOMDirectoryButton,LOMPerformanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_o_m_directory);


        LOMDirectoryButton =findViewById(R.id.button_LOM_Directory);
        LOMPerformanceButton=findViewById(R.id.button_LOM_Performance);
        LOMDirectoryButton.setOnClickListener(this);
        LOMPerformanceButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(LOMDirectoryActivity.this, PdfViewActivity.class);
        switch (v.getId()) {
            case R.id.button_LOM_Directory:
                i.putExtra("file", "zone_directory_5_1.pdf");
                startActivity(i);
                break;

            case R.id.button_LOM_Performance:
                i.putExtra("file","lom_performance.pdf");
                startActivity(i);
                Toast.makeText(this, "Pdf will be loaded", Toast.LENGTH_SHORT).show();
                break;
           default:
                break;
        }
    }
}
