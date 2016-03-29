package com.example.laura.themesandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clickround(View view) {
        Toast.makeText(this, "Boton redondo funciona", Toast.LENGTH_SHORT).show();
    }

    public void Clicklineal(View view) {
        Toast.makeText(this,"Boton lineal funciona", Toast.LENGTH_LONG).show();
    }

    public void Clickhereda(View view) {
        Toast.makeText(this, "Boton hereda funciona", Toast.LENGTH_SHORT).show();
    }
}
