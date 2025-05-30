package com.example.calculatorapplication;

import static androidx.activity.EdgeToEdge.*;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView t1,result;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enable(this);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.firstVal);
        et2 = findViewById(R.id.secondVal);
        b1 = findViewById(R.id.add);
        b2 = findViewById(R.id.sub);
        b3 = findViewById(R.id.div);
        b4 = findViewById(R.id.times);
        result = findViewById(R.id.result);
    }

    public void add(View view) {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        double x = Double.parseDouble(firstVal);
        double y = Double.parseDouble(secondVal);
        result.setText(""+(x+y));
    }

    public void sub(View view) {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        double x = Double.parseDouble(firstVal);
        double y = Double.parseDouble(secondVal);
        result.setText(""+(x-y));
    }

    public void div(View view) {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        double x = Double.parseDouble(firstVal);
        double y = Double.parseDouble(secondVal);
        result.setText(""+(x/y));
    }

    public void times(View view) {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        double x = Double.parseDouble(firstVal);
        double y = Double.parseDouble(secondVal);
        result.setText(""+(x*y));
    }

    public void reset(View view) {
        String firstVal = et1.getText().toString();
        String secondVal = et2.getText().toString();
        et1.setText(null);
        et2.setText(null);
    }
}

/*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }); */