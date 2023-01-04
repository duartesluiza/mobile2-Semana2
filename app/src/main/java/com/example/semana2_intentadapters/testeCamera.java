package com.example.semana2_intentadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class testeCamera extends AppCompatActivity {


    private final int CAMERA = 3;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView link = (TextView) findViewById(R.id.edtLink);

        Button ok = (Button) findViewById(R.id.btnLink);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:-30.888230744366837, -55.522713236734425"));
                startActivity(intent);
            }
        });
    }

}