package com.miapp.movilidaddemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        TextView tvNombre = findViewById(R.id.tvConfirmNombre);
        TextView tvFecha = findViewById(R.id.tvConfirmFecha);
        TextView tvTelefono = findViewById(R.id.tvConfirmTelefono);
        TextView tvEmail = findViewById(R.id.tvConfirmEmail);
        TextView tvDescripcion = findViewById(R.id.tvConfirmDescripcion);

        tvNombre.setText(DummyData.nombre);
        tvFecha.setText(DummyData.fechaNacimiento);
        tvTelefono.setText(DummyData.telefono);
        tvEmail.setText(DummyData.email);
        tvDescripcion.setText(DummyData.descripcion);

        Button btnEditar = findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(v -> finish()); // Regresa al formulario
    }
}
