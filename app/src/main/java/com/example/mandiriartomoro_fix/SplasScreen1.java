package com.example.mandiriartomoro_fix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplasScreen1 extends AppCompatActivity {

    Button btnnext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen1);
        btnnext1 = findViewById(R.id.btnnext1);
        btnnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SplasScreen2.class);
                startActivity(intent);

            }

        });

    }
}
