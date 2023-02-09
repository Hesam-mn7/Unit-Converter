package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    EditText etValue;
    RadioGroup rg1;
    TextView tvResultMeter;
    TextView tvResultCentimeter;
    TextView tvResultMillimetre;
    TextView tvResultkilometre;
    TextView tvResultMile;
    TextView tvResultYard;
    TextView tvResultInch;
    TextView tvResultFoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        etValue = findViewById(R.id.etValue);

        rg1 = findViewById(R.id.rg1);

        tvResultMeter = findViewById(R.id.tvResultMeter);
        tvResultCentimeter = findViewById(R.id.tvResultCentimeter);
        tvResultMillimetre = findViewById(R.id.tvResultMillimetre);
        tvResultkilometre = findViewById(R.id.tvResultkilometre);
        tvResultMile = findViewById(R.id.tvResultMile);
        tvResultYard = findViewById(R.id.tvResultYard);
        tvResultInch = findViewById(R.id.tvResultInch);
        tvResultFoot = findViewById(R.id.tvResultFoot);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                try {

                    double a = Double.parseDouble(etValue.getText().toString());

                    if (checkedId == R.id.rbMeter) {
                        tvResultMeter.setText(a + " m");
                        tvResultCentimeter.setText(a * 100 + " cm");
                        tvResultMillimetre.setText(a * 1000 + " mm");
                        tvResultkilometre.setText(a * 0.001 + " km");
                        tvResultMile.setText(a * 0.001 + " mi");
                        tvResultYard.setText(a * +1.094 + " yd");
                        tvResultInch.setText(a * 39.37 + " in");
                        tvResultFoot.setText(a * 0.305 + " ft");
                    }
                    else if (checkedId == R.id.rbCentimeter) {
                        tvResultMeter.setText(a * 0.01 + " m");
                        tvResultCentimeter.setText(a + " cm");
                        tvResultMillimetre.setText(a * 10 + " mm");
                        tvResultkilometre.setText(a * 0.00001 + " km");
                        tvResultMile.setText(a * 0.000006 + " mi");
                        tvResultYard.setText(a * +0.011 + " yd");
                        tvResultInch.setText(a * 0.394 + " in");
                        tvResultFoot.setText(a * 0.33 + " ft");
                    }
                    else if (checkedId == R.id.rbMillimetre) {
                        tvResultMeter.setText(a * 0.001 + " m");
                        tvResultCentimeter.setText(a * 0.1 + " cm");
                        tvResultMillimetre.setText(a + " mm");
                        tvResultkilometre.setText(a * 0.000001 + " km");
                        tvResultMile.setText(a * 0.0000006 + " mi");
                        tvResultYard.setText(a * +0.0011 + " yd");
                        tvResultInch.setText(a * 0.039 + " in");
                        tvResultFoot.setText(a * 0.033 + " ft");
                    }
                    else if (checkedId == R.id.rbkilometre) {
                        tvResultMeter.setText(a * 1000 + " m");
                        tvResultCentimeter.setText(a * 100000 + " cm");
                        tvResultMillimetre.setText(a * 1000000 + " mm");
                        tvResultkilometre.setText(a + " km");
                        tvResultMile.setText(a * 0.621 + " mi");
                        tvResultYard.setText(a * +1093.6 + " yd");
                        tvResultInch.setText(a * 39370 + " in");
                        tvResultFoot.setText(a * 3280.84 + " ft");
                    }
                    else if (checkedId == R.id.rbMile) {
                        tvResultMeter.setText(a * 1609.3 + " m");
                        tvResultCentimeter.setText(a * 160934.4 + " cm");
                        tvResultMillimetre.setText(a * 1609344.4 + " mm");
                        tvResultkilometre.setText(a * 1.609 + " km");
                        tvResultMile.setText(a + " mi");
                        tvResultYard.setText(a * +1760 + " yd");
                        tvResultInch.setText(a * 63360 + " in");
                        tvResultFoot.setText(a * 5280 + " ft");
                    }
                    else if (checkedId == R.id.rbYard) {
                        tvResultMeter.setText(a * 0.914 + " m");
                        tvResultCentimeter.setText(a * 91.44 + " cm");
                        tvResultMillimetre.setText(a * 914.4 + " mm");
                        tvResultkilometre.setText(a * 0.0009 + " km");
                        tvResultMile.setText(a * 0.001 + " mi");
                        tvResultYard.setText(a + " yd");
                        tvResultInch.setText(a * 36 + " in");
                        tvResultFoot.setText(a * 3 + " ft");
                    }
                    else if (checkedId == R.id.rbInch) {
                        tvResultMeter.setText(a * 0.025 + " m");
                        tvResultCentimeter.setText(a * 2.54 + " cm");
                        tvResultMillimetre.setText(a * 25.4 + " mm");
                        tvResultkilometre.setText(a * 0.00002 + " km");
                        tvResultMile.setText(a * 0.000015 + " mi");
                        tvResultYard.setText(a * 0.028 + " yd");
                        tvResultInch.setText(a + " in");
                        tvResultFoot.setText(a * 0.083 + " ft");
                    }
                    else if (checkedId == R.id.rbFoot) {
                        tvResultMeter.setText(a * 0.305 + " m");
                        tvResultCentimeter.setText(a * 30.48 + " cm");
                        tvResultMillimetre.setText(a * 304.8 + " mm");
                        tvResultkilometre.setText(a * 0.0003 + " km");
                        tvResultMile.setText(a * 0.0002 + " mi");
                        tvResultYard.setText(a * 0.33 + " yd");
                        tvResultInch.setText(a * 12 + " in");
                        tvResultFoot.setText(a + " ft");
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity1.this,"Enter the correct value",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}