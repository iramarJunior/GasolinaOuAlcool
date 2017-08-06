package com.iramarjunior.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.iramarjunior.gasolinaoualcool.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private EditText edtGasolina, edtAlcool;
    private Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGasolina = (EditText) findViewById(R.id.edtGasolina);
        edtAlcool = (EditText) findViewById(R.id.edtAlcool);
        btnVerificar = (Button) findViewById(R.id.btnVerifica);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gaso = String.valueOf(edtGasolina.getText());
                String etan = String.valueOf(edtAlcool.getText());

                Double gas = Double.parseDouble(gaso);
                Double eta = Double.parseDouble(etan);

                String result;

                if ((eta / gas) < 0.7)
                    result = "Abasteça com Álcool";
                else
                    result = "Abasteça com Gasolina";

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
