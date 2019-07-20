package com.example.mandiriartomoro_fix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplasScreen2 extends AppCompatActivity {

    Button btnnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen2);

        btnnext2 = findViewById(R.id.btnnext2);
        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginUser.class);
                startActivity(intent);

            }

        });
    }
}
