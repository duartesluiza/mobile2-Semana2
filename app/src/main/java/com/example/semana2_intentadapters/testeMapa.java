package com.example.semana2_intentadapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class testeMapa extends AppCompatActivity {

    // la 19.076 long:72.8777

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_mapa);
    }
    public void process(View view){

        Intent intent=null;

        if(view.getId()==R.id.LaunchMap){
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.8777"));
            startActivity(intent);
        }
    }
}