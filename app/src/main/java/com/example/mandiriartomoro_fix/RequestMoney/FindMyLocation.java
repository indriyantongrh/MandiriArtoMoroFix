package com.example.mandiriartomoro_fix.RequestMoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mandiriartomoro_fix.R;

public class FindMyLocation extends AppCompatActivity {

    Button btn_simpan_gambar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_my_location);


        btn_simpan_gambar2 = findViewById(R.id.btn_simpan_gambar2);

        btn_simpan_gambar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecivedMoney.class);
                startActivity(intent);
            }
        });

    }
}
