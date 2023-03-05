package com.example.circlearea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText objRadius = (EditText) findViewById(R.id.inputRadius);
        TextView objResult = (TextView) findViewById(R.id.txtResult);

        Button btnCount = (Button) findViewById(R.id.btnCount);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Ngitung
                double result = Math.pow(Double.parseDouble(objRadius.getText().toString()), 2) * Math.PI;

                // Set ke TextView txtResult
                objResult.setText(String.format("%.2f", result));
            }
        });


    }
}