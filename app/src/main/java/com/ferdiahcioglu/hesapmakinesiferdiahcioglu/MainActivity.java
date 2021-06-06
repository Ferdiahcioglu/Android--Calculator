package com.ferdiahcioglu.hesapmakinesiferdiahcioglu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button
            btn0,
            btn1,
            btn2,
            btn3,
            btn4,
            btn5,
            btn6,
            btn7,
            btn8,
            btn9,
            btnTop,
            btnCik,
            btnBol,
            btnCarp,
            btnResault,
            btnClear,
            btnKup,
            btnKaresi;

    Double ilkSayi;
    Double Kare;
    Double Kup;
    TextView hesapEkrani;
    String islemDurum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnTop = findViewById(R.id.btnTop);
        btnCik = findViewById(R.id.btnCik);
        btnBol = findViewById(R.id.btnBol);
        btnCarp = findViewById(R.id.btnCarp);
        btnResault = findViewById(R.id.btnResault);
        btnClear = findViewById(R.id.btnClear);
        btnKaresi = findViewById(R.id.btnKaresi);
        btnKup = findViewById(R.id.btnKup);

        hesapEkrani = findViewById(R.id.hesapEkrani);

        hesapEkrani.setText("0");
        ilkSayi = 0.0;
        islemDurum = "0";
        Kup = 0.0;
        Kare =0.0;


        btnResault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("=");
            }
        });
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnTopla) {
                TIKLA_SEMBOL("+");
            }
        });
        btnCik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("-");
            }
        });
        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("*");
            }
        });
        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("/");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("sifirla");
            }
        });
        btnKaresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("*2");
            }
        });
        btnKup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_SEMBOL("*3");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIKLA_NUMARA(9);
            }
        });
    }

    private void TIKLA_NUMARA(int sayi) {
        if (hesapEkrani.getText().toString() == "0")
        {
            hesapEkrani.setText("");
        }
        else if (
                hesapEkrani.getText().toString() == "+" ||
                        hesapEkrani.getText().toString() == "*" ||
                        hesapEkrani.getText().toString() == "/" ||
                        hesapEkrani.getText().toString() == "-")
        {
            hesapEkrani.setText("");
        }
        hesapEkrani.setText(hesapEkrani.getText() + String.valueOf(sayi));
    }

    private void TIKLA_SEMBOL(String sembol) {
        switch (sembol) {
            default: {
                if (hesapEkrani.getText().toString() == "+" || hesapEkrani.getText().toString() == "*"
                        || hesapEkrani.getText().toString() == "/" || hesapEkrani.getText().toString() == "-"
                        || hesapEkrani.getText().toString() == "*2" || hesapEkrani.getText().toString() == "*3")
                {
                    if (islemDurum == "*" || islemDurum == "/")
                        ilkSayi = -1 * ilkSayi;

                    hesapEkrani.setText(sembol);
                    islemDurum = sembol;
                } else {
                    ilkSayi = Double.parseDouble(hesapEkrani.getText().toString());
                    hesapEkrani.setText(sembol);
                    islemDurum = sembol;
                }
            }
            break;
            case "sifirla": {
                ilkSayi = 0.0;
                hesapEkrani.setText("0");
                islemDurum = "0";
            }
            break;
            case "=": {
                if (hesapEkrani.getText().toString() == "+" || hesapEkrani.getText().toString() == "*"
                        || hesapEkrani.getText().toString() == "/" || hesapEkrani.getText().toString() == "-"
                        || hesapEkrani.getText().toString() == "*2" || hesapEkrani.getText().toString() == "*3"
                )

                {

                }
                else {
                    switch (islemDurum) {
                        default: {
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "+": {
                            ilkSayi = ilkSayi + Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "-": {
                            ilkSayi = ilkSayi - Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "/": {
                            ilkSayi = ilkSayi / Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "*": {
                            ilkSayi = ilkSayi * Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                    }
                    break;
                }
            }
            break;
            case "*2":
            {
                ilkSayi = Double.parseDouble(hesapEkrani.getText().toString());
                Kare = ilkSayi*ilkSayi;
                hesapEkrani.setText(Kare.toString());
            }
            break;
            case "*3":
            {
                ilkSayi = Double.parseDouble(hesapEkrani.getText().toString());
                Kup = ilkSayi*ilkSayi*ilkSayi;
                hesapEkrani.setText(Kup.toString());
            }
            break;

        }

    }
}