package com.joseph.apuntesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.joseph.apuntesapp.daos.ApunteDAO;
import com.joseph.apuntesapp.models.Apunte;

public class ApuntesFormActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apuntes_form);
        Button btnguardar = (Button) findViewById(R.id.btnAceptar);
        btnguardar.setOnClickListener(this);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",-1);
        if(index >=0){
            Apunte apunte = ApunteDAO.all.get(index);
            TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo);
            TextView txtEtiqueta = (TextView) findViewById(R.id.txtEtiquetas);
            TextView txtContenido = (TextView) findViewById(R.id.txtContenido);

            txtTitulo.setText(apunte.getTitulo());
            txtEtiqueta.setText(apunte.getEtiqueta());
            txtContenido.setText(apunte.getContenido());
        }
    }
    @Override
    public void onClick(View view) {
        TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        TextView txtEtiqueta = (TextView) findViewById(R.id.txtEtiquetas);
        TextView txtContenido = (TextView) findViewById(R.id.txtContenido);
        Apunte apunte = new Apunte();
        apunte.setTitulo(txtTitulo.getText().toString());
        apunte.setEtiqueta(txtEtiqueta.getText().toString());
        apunte.setContenido(txtContenido.getText().toString());
        ApunteDAO.save(apunte);
        finish();
    }
}
