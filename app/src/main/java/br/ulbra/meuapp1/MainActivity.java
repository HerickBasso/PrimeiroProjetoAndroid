package br.ulbra.meuapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    Button btnSomar, btnSubt, btnMult, btnDivt, btnlimpar;

    TextView txtResu;
    double v1,v2,soma, mult, subt, divt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubt =  (Button) findViewById(R.id.btnSubt);
        btnMult =  (Button) findViewById(R.id.btnMult);
        btnDivt =   (Button) findViewById(R.id.btnDivt);
        txtResu =  (TextView) findViewById(R.id.txtResu);
        btnlimpar = (Button) findViewById(R.id.btnLimpar);


        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                soma = v1 + v2;
                txtResu.setText("Resultado: "+soma);
            }

        });

        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                subt = v1 - v2;
                txtResu.setText("Resultado: " + subt);
            }


        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                mult = v1 * v2;
                txtResu.setText("Resultado: " +mult);
            }
        });
     btnDivt.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             v1 = Double.parseDouble(edt1.getText().toString());
             v2 = Double.parseDouble(edt2.getText().toString());
             divt = v1 / v2;
             txtResu.setText("Resultado: "+divt);
         }
     });
    }
    public void btnlimpar(View view) {
        edt1.setText(null);
        edt2.setText(null);
    }
}