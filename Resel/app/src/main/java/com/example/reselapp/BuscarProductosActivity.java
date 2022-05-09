package com.example.reselapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BuscarProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_productos);
    }

    public void subirProducto (View view){
        Intent intent =  new Intent(this, SubirProductosActivity.class);
        startActivity(intent);
    }
}