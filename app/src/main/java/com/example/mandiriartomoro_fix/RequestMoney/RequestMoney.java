package com.example.mandiriartomoro_fix.RequestMoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mandiriartomoro_fix.PassCode;
import com.example.mandiriartomoro_fix.R;

import java.text.NumberFormat;
import java.util.Locale;

public class RequestMoney extends AppCompatActivity {

    Button btnnext3;
    EditText txtamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_money2);

        btnnext3 = findViewById(R.id.btnnext3);

        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindMyLocation.class);
                startActivity(intent);
            }
        });

    }
}
