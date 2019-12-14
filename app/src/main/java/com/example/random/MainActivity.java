package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEditMin,mEditMax;
    Button mBtnRandom;
    TextView mTvResult;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        0.2 * 5= 1
//        0.9 * 5 = 4.5
//        double random = Math.random() * 5;
        // Lam tron gia tri
//        double number1 = Math.round(random);
        //Lam tron len
//        double number2 = Math.ceil(random);
        //Lam tron xuong
//        double number2 = Math.floor(random);
//        Log.d("BBB",String.valueOf(random));
//        Log.d("BBB",String.valueOf(number2));
//        int a = 5;
//       int b = 10;
//        int ketqua = Math.max(a,b);
//        Log.d("BBB",String.valueOf(ketqua));
//      0-5
//        for(int i = 0; i<=20;i++) {
//            Random random = new Random();
//            int randomNumber = random.nextInt(303-5+1);
//            Log.d("BBB",String.valueOf(randomNumber));

//        }
        mEditMin = findViewById(R.id.edtMin);
        mEditMax = findViewById(R.id.edtMax);
        mBtnRandom = findViewById(R.id.btnRandom);
        mTvResult = findViewById(R.id.txtResult);

        // task 1 : lay du lieu trong edittext
        // task 2 : xem su kien click cua button
        // task 3 : Khi click button show ra du lieu trong edittext

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textMin = mEditMin.getText().toString().trim();
                String textMax = mEditMax.getText().toString().trim();
                Log.d("BBB",textMin);
                Log.d("BBB",textMax);

                Integer sMin = Integer.valueOf(textMin);
                Integer sMax = Integer.valueOf(textMax);

                Random random = new Random();
                int value = random.nextInt(sMax-sMin +1)+sMin;

                mTvResult.setText(String.valueOf(value));
                //FATAL xem loi

            }
        });

    }
}
