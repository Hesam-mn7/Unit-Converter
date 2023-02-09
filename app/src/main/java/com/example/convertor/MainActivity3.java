package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText etValueT;
    RadioGroup rgf3;
    RadioGroup rgt3;
    Button btnConvertT;
    TextView tvResultT;

//      void clickcelcus(Float c){
//           c = Float.parseFloat(etValueT.getText().toString());
//          rgt3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//             @Override
//             public void onCheckedChanged(RadioGroup group, int checkedId) {
//                 if (checkedId == R.id.rbtCelsius){
//                     btnConvertT.setOnClickListener(new View.OnClickListener() {
//                         @Override
//                         public void onClick(View v) {
//                         }
//                     });
//                 }
//             }
//         });
//
//    }

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etValueT = findViewById(R.id.etValueT);
        rgf3 = findViewById(R.id.rgf3);
        rgt3 = findViewById(R.id.rgt3);
        btnConvertT = findViewById(R.id.btnConvertT);
        tvResultT = findViewById(R.id.tvResultT);

        btnConvertT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etValueT.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity3.this, "Enter the correct value", Toast.LENGTH_SHORT).show();
                }
            }
        });



        rgf3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                try {
                    if (checkedId == R.id.rbfCelsius) {
                        rgt3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                if (checkedId == R.id.rbtCelsius) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + c + " C");
                                        }
                                    });
                                } else if (checkedId == R.id.rbtFahrenheit) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + (c * 1.8 + 32) + " F");
                                        }
                                    });
                                } else if (checkedId == R.id.rbtKelvin) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + (c + 273.15) + " K");
                                        }
                                    });
                                }
                            }
                        });
                    } else if (checkedId == R.id.rbfFahrenheit) {
                        rgt3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                if (checkedId == R.id.rbtCelsius) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + (c - 32) * 0.55 + " c");
                                        }
                                    });
                                } else if (checkedId == R.id.rbtFahrenheit) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + c + " F");
                                        }
                                    });
                                } else if (checkedId == R.id.rbtKelvin) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + (c + 459.67) * 0.55 + " k");
                                        }
                                    });
                                }
                            }
                        });
                    } else if (checkedId == R.id.rbfKelvin) {
                        rgt3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                if (checkedId == R.id.rbtCelsius) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + (c - 273.15) + " C");
                                        }
                                    });
                                } else if (checkedId == R.id.rbtFahrenheit) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + (c * 1.8 - 459.67) + " F");
                                        }
                                    });
                                } else if (checkedId == R.id.rbtKelvin) {
                                    btnConvertT.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            float c = Float.parseFloat(etValueT.getText().toString());
                                            tvResultT.setText("Result is : " + c + " k");
                                        }
                                    });
                                }
                            }
                        });

                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity3.this, "Enter the correct value", Toast.LENGTH_LONG).show();

                }
            }

        });

    }

}


