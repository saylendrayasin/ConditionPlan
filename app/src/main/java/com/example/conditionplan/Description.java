package com.example.conditionplan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Description extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton,r1, r2,r3,r4;
    Button water, save;
    ImageView gambar, imTemp, imHumid;
    TextView judul, notif, tvSuhu, tvHumid;

    String nama = "nama";
    String foto = "picture";
    String suhu = "temp";
    String humid = "hum";
    int good = R.drawable.good;
    int bad = R.drawable.bad;
    String txtNama, txtSuhu, txtHumidity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        r3 = findViewById(R.id.radio3);
        r4 = findViewById(R.id.radio4);
        judul = findViewById(R.id.txtTitle);
        gambar = findViewById(R.id.gbrPlant);
        water = findViewById(R.id.btnWatering);
        save = findViewById(R.id.btnSave);
        notif = findViewById(R.id.txtNotif);
        radioGroup = findViewById(R.id.groups);
        imTemp = findViewById(R.id.tempCond);
        imHumid = findViewById(R.id.humidCond);
        tvSuhu = findViewById(R.id.txtSuhu);
        tvHumid = findViewById(R.id.txtHumidity);

        Bundle bundle = getIntent().getExtras();

        txtNama = bundle.getString(nama);
        txtSuhu = bundle.getString(suhu);
        txtHumidity = bundle.getString(humid);

        int tampilkan = bundle.getInt(foto);
        int Temprature = Integer.parseInt(txtSuhu);
        int Humidity = Integer.parseInt(txtHumidity);


        if (Temprature >= 25 && Temprature <= 40){
            imTemp.setImageResource(good);
        }else{
            imTemp.setImageResource(bad);
        }

        if (Humidity >= 40 && Humidity <= 85){
            imHumid.setImageResource(good);
        }else{
            imHumid.setImageResource(bad);
        }

        gambar.setImageResource(tampilkan);
        judul.setText(txtNama);
        tvSuhu.setText(txtSuhu);
        tvHumid.setText(txtHumidity);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                notif.setText("Watering Set Authomatic to : " + radioButton.getText());
            }
        });

        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Kondisi = water.getText().toString();
                if(Kondisi=="Start Instant Watering"){
                    water.setBackgroundResource(R.drawable.button_after_click);
                    water.setText("Stop Instant Watering");
                }else{
                    water.setBackgroundResource(R.drawable.costum_buttocn);
                    water.setText("Start Instant Watering");
                }
;
            }
        });

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (r1.isChecked()){
                    save.setVisibility(View.VISIBLE);
                    water.setVisibility(View.INVISIBLE);
                    notif.setVisibility(View.VISIBLE);
                }
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (r2.isChecked()){
                    save.setVisibility(View.VISIBLE);
                    water.setVisibility(View.INVISIBLE);
                    notif.setVisibility(View.VISIBLE);
                }
            }
        });

        r3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (r3.isChecked()){
                    save.setVisibility(View.VISIBLE);
                    water.setVisibility(View.INVISIBLE);
                    notif.setVisibility(View.VISIBLE);
                }
            }
        });

        r4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (r4.isChecked()){
                    save.setVisibility(View.INVISIBLE);
                    water.setVisibility(View.VISIBLE);
                    notif.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void checkBtn(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(), Toast.LENGTH_LONG).show();
    }
}