package com.example.t5_a3_banuelosruizeduardoalejo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txtOperaciones;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnCE, btnC, btnEliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        txtOperaciones = findViewById(R.id.txtCajaOperaciones);

        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnEliminar = findViewById(R.id.btnEliminar);
    }

    public void insertarNumero(View v) {
        if (v == btn0) {
            txtOperaciones.setText(txtOperaciones.getText() + "0");
        } else if (v == btn1) {
            txtOperaciones.setText(txtOperaciones.getText() + "1");
        } else if (v == btn2) {
            txtOperaciones.setText(txtOperaciones.getText() + "2");
        } else if (v == btn3) {
            txtOperaciones.setText(txtOperaciones.getText() + "3");
        } else if (v == btn4) {
            txtOperaciones.setText(txtOperaciones.getText() + "4");
        } else if (v == btn5) {
            txtOperaciones.setText(txtOperaciones.getText() + "5");
        } else if (v == btn6) {
            txtOperaciones.setText(txtOperaciones.getText() + "6");
        } else if (v == btn7) {
            txtOperaciones.setText(txtOperaciones.getText() + "7");
        } else if (v == btn8) {
            txtOperaciones.setText(txtOperaciones.getText() + "8");
        } else if (v == btn9) {
            txtOperaciones.setText(txtOperaciones.getText() + "9");
        }
    }//INSERTAR NUMEROS

    public void opcionesEliminar(View v) {
        if (v == btnEliminar) {
            String txtAct = txtOperaciones.getText().toString();

            if (txtAct.length() != 0) {
                txtOperaciones.setText(txtAct.substring(0, txtAct.length() - 1));
            }
        } else if (v == btnC) {
            txtOperaciones.setText("");

        } else if (v == btnCE) {
            txtOperaciones.setText("");
        }
    }//OPCIONES ELIMINAR

    public void transformaciones(View v){

    }

    public void operaciones(View v){

    }

}//main