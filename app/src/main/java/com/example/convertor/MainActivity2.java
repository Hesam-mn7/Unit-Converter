package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText etValue;
    RadioGroup rg2;
    TextView tvResultGram;
    TextView tvResultKilogram;
    TextView tvResultOunce;
    TextView tvResultTon;
    TextView tvResultPound;
    TextView tvResultCarat;
    TextView tvResultGrain;
    TextView tvResultStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etValue = findViewById(R.id.tiValue);

        rg2 = findViewById(R.id.rg2);

        tvResultGram = findViewById(R.id.tvResultGram);
        tvResultKilogram = findViewById(R.id.tvResultKilogram);
        tvResultOunce = findViewById(R.id.tvResultOunce);
        tvResultTon = findViewById(R.id.tvResultTon);
        tvResultPound = findViewById(R.id.tvResultPound);
        tvResultCarat = findViewById(R.id.tvResultCarat);
        tvResultGrain = findViewById(R.id.tvResultGrain);
        tvResultStone = findViewById(R.id.tvResultStone);

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                try {

                    double b = Double.parseDouble(etValue.getText().toString());

                    if (checkedId == R.id.rbGram) {

                        tvResultGram.setText(b + " g");
                        tvResultKilogram.setText(b * 0.001 + " kg");
                        tvResultOunce.setText(b * 0.035 + " oz");
                        tvResultTon.setText(b * 0.000001 + " t");
                        tvResultPound.setText(b * 0.0022 + " lb");
                        tvResultCarat.setText(b * 5 + " ct");
                        tvResultGrain.setText(b * 15.43 + " gr");
                        tvResultStone.setText(b * 0.15 + " st");
                    }
                    else if (checkedId == R.id.rbKilogram) {

                        tvResultGram.setText(b * 1000 + " g");
                        tvResultKilogram.setText(b + " kg");
                        tvResultOunce.setText(b * 35.27 + " oz");
                        tvResultTon.setText(b * 0.001 + " t");
                        tvResultPound.setText(b * 2.204 + " lb");
                        tvResultCarat.setText(b * 5000 + " ct");
                        tvResultGrain.setText(b * 15432.3 + " gr");
                        tvResultStone.setText(b * 0.00016 + " st");

                    }else if (checkedId == R.id.rbOunce) {

                        tvResultGram.setText(b * 28.34 + " g");
                        tvResultKilogram.setText(b * 0.028 + " kg");
                        tvResultOunce.setText(b + " oz");
                        tvResultTon.setText(b * 0.00003 + " t");
                        tvResultPound.setText(b * 0.062 + " lb");
                        tvResultCarat.setText(b * 141.74 + " ct");
                        tvResultGrain.setText(b * 437.5 + " gr");
                        tvResultStone.setText(b * 0.00446 + " st");

                    }else if (checkedId == R.id.rbTon) {

                        tvResultGram.setText(b * 1000000 + " g");
                        tvResultKilogram.setText(b * 1000 + " kg");
                        tvResultOunce.setText(b * 35273.9 + " oz");
                        tvResultTon.setText(b + " t");
                        tvResultPound.setText(b * 2204.6 + " lb");
                        tvResultCarat.setText(b * 5000000 + " ct");
                        tvResultGrain.setText(b * 15432358.3 + " gr");
                        tvResultStone.setText(b * 157.4 + " st");

                    }else if (checkedId == R.id.rbPound) {

                        tvResultGram.setText(b * 453.59 + " g");
                        tvResultKilogram.setText(b * 0.453 + " kg");
                        tvResultOunce.setText(b * 16 + " oz");
                        tvResultTon.setText(b * 0.00045 + " t");
                        tvResultPound.setText(b + " lb");
                        tvResultCarat.setText(b * 2267.9 + " ct");
                        tvResultGrain.setText(b * 7000 + " gr");
                        tvResultStone.setText(b * 0.071 + " st");

                    }else if (checkedId == R.id.rbCarat) {

                        tvResultGram.setText(b * 0.2 + " g");
                        tvResultKilogram.setText(b * 0.0002 + " kg");
                        tvResultOunce.setText(b * 0.007 + " oz");
                        tvResultTon.setText(b * 0.0000002 + " t");
                        tvResultPound.setText(b * 0.0004 + " lb");
                        tvResultCarat.setText(b + " ct");
                        tvResultGrain.setText(b * 3.08 + " gr");
                        tvResultStone.setText(b * 0.00003 + " st");

                    }else if (checkedId == R.id.rbGrain) {

                        tvResultGram.setText(b * 0.0648 + " g");
                        tvResultKilogram.setText(b * 0.00006 + " kg");
                        tvResultOunce.setText(b * 0.0022 + " oz");
                        tvResultTon.setText(b * 0.00000006 + " t");
                        tvResultPound.setText(b * 0.00014 + " lb");
                        tvResultCarat.setText(b * 0.32 + " ct");
                        tvResultGrain.setText(b + " gr");
                        tvResultStone.setText(b * 0.00001 + " st");

                    }else if (checkedId == R.id.rbStone) {

                        tvResultGram.setText(b * 6350 + " g");
                        tvResultKilogram.setText(b * 6.35 + " kg");
                        tvResultOunce.setText(b * 224 + " oz");
                        tvResultTon.setText(b * 0.00635 + " t");
                        tvResultPound.setText(b * 14 + " lb");
                        tvResultCarat.setText(b * 31751.4 + " ct");
                        tvResultGrain.setText(b * 98000 + " gr");
                        tvResultStone.setText(b + " st");
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity2.this,"Enter the correct value",Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}