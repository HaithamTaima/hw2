package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final TextView tv_result=findViewById(R.id.main_tv_result);
        final EditText et_funm=findViewById(R.id.main_et_funm);
         final EditText et_sunm=findViewById(R.id.main_et_sunm);
         final Button bnt_sum=findViewById(R.id.main_bnt_sum);

        bnt_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String funm = et_funm.getText().toString();
                int H = Integer.parseInt(funm);
                String sunm = et_sunm.getText().toString();
                int A = Integer.parseInt(sunm);
                int result =0 , p=0;
                for (p=H;p<=A;p++){
                    if (p%5==0){ result =p; } }tv_result.setText(result+"");  }
        });


    }
}