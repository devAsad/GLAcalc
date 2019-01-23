package com.asad.glacalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etOne, etTwo;
    Button btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etOne = findViewById(R.id.et_first);
        etTwo = findViewById(R.id.et_second);

        btnCalc = findViewById(R.id.btn_calc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = etOne.getText().toString();
                Integer a = Integer.parseInt(etOne.getText().toString().trim());
                Integer b = Integer.parseInt(etTwo.getText().toString().trim());

                Toast.makeText(MainActivity.this, a+b +"", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
