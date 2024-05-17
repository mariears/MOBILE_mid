package com.example.mid_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    RadioGroup radioGroup;
    RadioButton rbTambah, rbKurang, rbKali, rbBagi;
    EditText etHasil;
    Button btnClr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        etHasil = (EditText) findViewById (R.id.editTextHasil);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rbTambah = (RadioButton) findViewById(R.id.radioButtonTambah);
        rbKurang = (RadioButton) findViewById(R.id.radioButtonKurang);
        rbKali = (RadioButton) findViewById(R.id.radioButtonKali);
        rbBagi = (RadioButton) findViewById(R.id.radioButtonBagi);
        btnClr = (Button) findViewById(R.id.buttonClear);

        rbTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1+bil2;
                String hasil1 = String.valueOf(hasil);
                etHasil.setText(hasil1);
            }
        });
        rbKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1 = Double.valueOf(et1.getText().toString().trim());
                bil2 = Double.valueOf(et2.getText().toString().trim());
                hasil = bil1-bil2;
                String hasil1 = String.valueOf(hasil);
                etHasil.setText(hasil1);
            }
        });
        rbKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1*bil2;
                String hasil1=String.valueOf(hasil);
                etHasil.setText(hasil1);
            }
        });
        rbBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(et1.getText().toString().trim());
                bil2=Double.valueOf(et2.getText().toString().trim());
                hasil=bil1/bil2;
                String hasil1=String.valueOf(hasil);
                etHasil.setText(hasil1);
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                etHasil.setText("");
                radioGroup.clearCheck();
            }
        });
    }

}