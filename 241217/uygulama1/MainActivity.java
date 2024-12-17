package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewtakım;
    RadioButton radioButtonfener,radioButtonbjk,radioButtongs,radioButtongiresun;
    Button buttonsec;

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

            imageViewtakım=findViewById(R.id.imageView_takım);
            radioButtonfener=findViewById(R.id.radioButton_fener);
            radioButtonbjk=findViewById(R.id.radioButton_bjk);
            radioButtongs=findViewById(R.id.radioButton_gs);
            radioButtongiresun=findViewById(R.id.radioButton_giresun);
            buttonsec=findViewById(R.id.button_sec);
            buttonsec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(radioButtonfener.isChecked()){
                        imageViewtakım.setImageResource(R.drawable.fener);

                    }
                    else if (radioButtonbjk.isChecked()) {
                        imageViewtakım.setImageResource(R.drawable.bjk);

                    }
                    else if (radioButtongs.isChecked()) {
                        imageViewtakım.setImageResource(R.drawable.gs);
                    }

                     else {
                        imageViewtakım.setImageResource(R.drawable.giresunspor);
                    }
                }
            });
    }
}