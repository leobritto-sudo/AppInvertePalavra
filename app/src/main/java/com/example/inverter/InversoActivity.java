package com.example.inverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InversoActivity extends AppCompatActivity {

    TextView txt1, txtResult;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverso);
        txt1 = (TextView) findViewById(R.id.txt1);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        Bundle bundle = getIntent().getExtras();
        String stringResultado = bundle.getString("resultado");
        txtResult.setText(stringResultado);
    }

    public void Voltar(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
