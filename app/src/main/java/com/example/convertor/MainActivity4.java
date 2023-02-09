package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button btnConvertclock;
    EditText etHour;
    EditText etMinute;
    TextView tvLondon;
    TextView tvLosangeles;
    TextView tvSeoul;
    TextView tvParis;
    TextView tvRiodejaneiro;
    TextView tvNewyork;
    TextView tvSydney;

//    void subtime(int h, int m, int h2, int m2) {
//        m -= m2;
//        h = h - h2;
//        if (m < 0) {
//            h -= 1;
//            m += 60;
//        }
//        if (h < 0) {
//            h +=  24;
//        }
//        tvParis.setText("helooo:"+h+m);
//    }
//     public static void addtime(int h1 , int m1 , int h2 , int m2){
//        int m3 = m1 + m2;
//        int h3 = h1 + h2;
//        if(m3>60){
//            h3 = h3+1;
//            m3=m3-60;
//        }
//        if(h3>=24){
//            h3 = h3 - 24;
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnConvertclock = findViewById(R.id.btnConvertclock);
        etHour = findViewById(R.id.etHour);
        etMinute = findViewById(R.id.etMinute);
        tvLondon = findViewById(R.id.tvLondon);
        tvLosangeles = findViewById(R.id.tvLosangeles);
        tvSeoul = findViewById(R.id.tvSeoul);
        tvParis = findViewById(R.id.tvParis);
        tvRiodejaneiro = findViewById(R.id.tvRiodejaneiro);
        tvNewyork = findViewById(R.id.tvNewyork);
        tvSydney = findViewById(R.id.tvSydney);

        btnConvertclock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    int h = Integer.parseInt(etHour.getText().toString());
                    int m = Integer.parseInt(etMinute.getText().toString());

                    if ((0 <= h && h < 24) && (m >= 0 && m < 60)) {
                        int hGMT = h - 3;
                        int mGMT = m - 30;
                        if (mGMT < 0) {
                            hGMT = hGMT - 1;
                            mGMT = 60 + mGMT;
                        }
                        if (hGMT < 0) {
                            hGMT = hGMT + 24;
                        }
                        tvLondon.setText("London (United Kingdom) : " + hGMT + ":" + mGMT);

                        int hLosangeles = hGMT - 8;
                        if (hLosangeles < 0) {
                            hLosangeles += 24;
                        }
                        tvLosangeles.setText("Los Angeles (United States) : " + hLosangeles + ":" + mGMT);

                        int hSeoul = hGMT + 9;
                        if (hSeoul > 24) {
                            hSeoul -= 24;
                        }
                        tvSeoul.setText("Seoul (South Korea) : " + hSeoul + ":" + mGMT);

                        int hParis = hGMT + 1;
                        if (hParis > 24) {
                            hParis -= 24;
                        }
                        tvParis.setText("Paris (France) : " + hParis + ":" + mGMT);

                        int hRiodejaneiro = hGMT - 3;
                        if (hRiodejaneiro < 0) {
                            hRiodejaneiro += 24;
                        }
                        tvRiodejaneiro.setText("Rio de Janeiro (Brazil) : " + hRiodejaneiro + ":" + mGMT);

                        int hNewyork = hGMT - 5;
                        if (hNewyork < 0) {
                            hNewyork += 24;
                        }
                        tvNewyork.setText("New York (United States) : " + hNewyork + ":" + mGMT);

                        int hSydney = hGMT + 11;
                        if (hSydney > 24) {
                            hSydney -= 24;
                        }
                        tvSydney.setText("Sydney (Australia) : " + hSydney + ":" + mGMT);

                    }else{
                        Toast.makeText(MainActivity4.this,"Enter the hour and minute value correctly",Toast.LENGTH_LONG).show();
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity4.this,"Enter the hour and minute value correctly",Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}