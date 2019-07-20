package com.example.mandiriartomoro_fix.RequestMoney;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mandiriartomoro_fix.R;
import com.example.mandiriartomoro_fix.SuksesRecivedMoney;

public class RecivedMoney extends AppCompatActivity {

    Button btnterimauang, btnwa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recived_money);

        btnterimauang =  findViewById(R.id.btnterimauang);
        btnwa = findViewById(R.id.btnwa);

        btnterimauang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SuksesRecivedMoney.class);
                startActivity(intent);
            }
        });


        btnwa = findViewById(R.id.btnwa);
        btnwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWhatsapp = new Intent("android.intent.action.MAIN");
                intentWhatsapp.setAction(Intent.ACTION_VIEW);
                String url = "https://api.whatsapp.com/send?phone=" + "6285803000346" + "&text=Halo admin, Mau konfirmasi nih...";

                intentWhatsapp.setData(Uri.parse(url));
                intentWhatsapp.setPackage("com.whatsapp");
                startActivity(intentWhatsapp);

            }
        });
    }
}
