package com.example.saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_nombre;
    private Button bt_saludo;
    private TextView tv_saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nombre = findViewById(R.id.et_nombre);
        bt_saludo = findViewById(R.id.bt_saludo);
        tv_saludo = findViewById(R.id.tv_saludo);

        bt_saludo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String saludo = et_nombre.getText().toString();
                tv_saludo.setText("Bienvenido " + saludo);
            }
        });

    }

}
