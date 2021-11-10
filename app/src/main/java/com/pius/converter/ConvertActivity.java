package com.israel.converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConvertActivity extends AppCompatActivity {
    final double ONE_KM_MILES = 0.6241;

    private EditText txtKm;
    private TextView tvResults;
    private  Button btnConvert;
    private  Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter);

         txtKm = (EditText) findViewById(R.id.txtKm);
         tvResults = (TextView) findViewById(R.id.tvResults);

        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnQuit = (Button) findViewById(R.id.btnQuit);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertKmToMiles();
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void convertKmToMiles(){
        double km = Double.parseDouble( txtKm.getText().toString());
        double miles =  km * ONE_KM_MILES;
        tvResults.setText("" + miles + "");
    }
}
