package com.example.terryapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TerryActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttontmbh, buttonkali, buttonbagi;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terry);

        buttontmbh = findViewById(R.id.btn_tambah);
        buttonkali = findViewById(R.id.btn_kali);
        buttonbagi = findViewById(R.id.btn_bagi);
        editTextN1 = findViewById(R.id.nilaia);
        editTextN2 = findViewById(R.id.nilaib);
        textView = findViewById(R.id.jawaban);


        buttontmbh.setOnClickListener(this);
        buttonkali.setOnClickListener(this);
        buttonbagi.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText) {
        if (editText.getText().toString().equals("")){
            Toast.makeText(this, "Masukkan Nilai", Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
    }



    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);

        int id = view.getId();

        if (id == R.id.btn_tambah) {
            textView.setText("Jawaban = " + (num1 + num2));
        } else if (id == R.id.btn_kali) {
            textView.setText("Jawaban = " + (num1 * num2));
        } else if (id == R.id.btn_bagi) {
            if (num2 == 0) {
                textView.setText("Tidak bisa membagi dengan nol");
            } else {
                textView.setText("Jawaban = " + ((float) num1 / num2));
            }
        }
    }

}