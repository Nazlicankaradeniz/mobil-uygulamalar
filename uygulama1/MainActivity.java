package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxcorba,checkBoxkofte,checkBoxpilav,checkBoxlahmacun,checkBoxsutlac;
    Button buttonsiparis;
    TextView textViewozet;
      EditText  editTextNumber_corbadet,editTextNumber_kofteadet,editTextNumber_pilavadet,editTextNumber_lahmacunadet,editTextNumber_sutlacadet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBoxcorba=findViewById(R.id.checkBox_corba);
        checkBoxkofte=findViewById(R.id.checkBox_kofte);
        checkBoxpilav=findViewById(R.id.checkBox_pilav);
        checkBoxlahmacun=findViewById(R.id.checkBox_lahmacun);
        checkBoxsutlac=findViewById(R.id.checkBox_sutlac);
        buttonsiparis=findViewById(R.id.button_siparis);
        textViewozet=findViewById(R.id.textView_ozet);
        editTextNumber_corbadet=findViewById(R.id.editTextNumber_corbadet);
        editTextNumber_kofteadet=findViewById(R.id.editTextNumber_kofteadet);
        editTextNumber_pilavadet=findViewById(R.id.editTextNumber_pilavadet);
        editTextNumber_lahmacunadet=findViewById(R.id.editTextNumber_lahmacunadet);
        editTextNumber_sutlacadet=findViewById(R.id.editTextNumber_sutlacadet);



        buttonsiparis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbafiyat=50,koftefiyat=200,pilavfiyat=100,lahmacunfiyat=75,sutlacfiyat=65;
                float toplamtutar=0,adet=0;
                String s="Sipariş Özeti:\n";

                if(checkBoxcorba.isChecked()){
                    adet=Float.parseFloat(editTextNumber_corbadet .getText().toString());
                    toplamtutar+=(corbafiyat*adet);
                    s+="çorba\n";
                }
                if(checkBoxkofte.isChecked()){
                    adet=Float.parseFloat(editTextNumber_kofteadet.getText().toString());
                    toplamtutar+=(koftefiyat*adet);
                    s+="köfte\n";
                } if(checkBoxpilav.isChecked()){
                    adet=Float.parseFloat(editTextNumber_pilavadet.getText().toString());
                    toplamtutar+=(pilavfiyat*adet);
                    s+="pilav\n";
                } if(checkBoxlahmacun.isChecked()){
                    adet=Float.parseFloat(editTextNumber_lahmacunadet.getText().toString());
                    toplamtutar+=(lahmacunfiyat*adet);
                    s+="lahmacun\n";
                } if(checkBoxsutlac.isChecked()){
                    adet=Float.parseFloat(editTextNumber_sutlacadet.getText().toString());
                    toplamtutar+=(sutlacfiyat*adet);
                    s+="sütlaç\n";
                }

                textViewozet.setText(s+"Toplam Tutar: "+toplamtutar);
            }
        });
    }
}