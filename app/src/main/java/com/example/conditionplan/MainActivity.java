package com.example.conditionplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView namaTumbuhan1, namaTumbuhan2, namaTumbuhan3, namaTumbuhan4, namaTumbuhan5, namaTumbuhan6, namaTumbuhan7;
    Button kaktus, mawar, anggrek, gc, tr, dp, aglo;
    String nama, suhu, humid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kaktus = findViewById(R.id.btnKaktus);
        mawar = findViewById(R.id.btnMawar);
        anggrek = findViewById(R.id.btnAnggrek);
        gc = findViewById(R.id.btnGC);
        tr = findViewById(R.id.btnTR);
        dp = findViewById(R.id.btnDP);
        aglo = findViewById(R.id.btnAglo);
        namaTumbuhan1 = findViewById(R.id.namePlant1);
        namaTumbuhan2 = findViewById(R.id.namePlant2);
        namaTumbuhan3 = findViewById(R.id.namePlant3);
        namaTumbuhan4 = findViewById(R.id.namePlant4);
        namaTumbuhan5 = findViewById(R.id.namePlant5);
        namaTumbuhan6 = findViewById(R.id.namePlant6);
        namaTumbuhan7 = findViewById(R.id.namePlant7);


        kaktus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "39";
                humid = "40";
                nama = namaTumbuhan1.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.kaktus);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });

        mawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "30";
                humid = "91";
                nama = namaTumbuhan2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.mawarr);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });


        anggrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "41";
                humid = "60";
                nama = namaTumbuhan3.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.anggrekk);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });

        gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "32";
                humid = "55";
                nama = namaTumbuhan4.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.gelombangcintaa);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });

        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "42";
                humid = "39";
                nama = namaTumbuhan5.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.tandukrusa);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });


        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "29";
                humid = "72";
                nama = namaTumbuhan6.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.daunpuringg);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });


        aglo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suhu = "39";
                humid = "69";
                nama = namaTumbuhan6.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Description.class);
                intent.putExtra("nama", nama);
                intent.putExtra("picture", R.drawable.aglonemaa);
                intent.putExtra("temp", suhu);
                intent.putExtra("hum", humid);
                startActivity(intent);
            }
        });


    }
}