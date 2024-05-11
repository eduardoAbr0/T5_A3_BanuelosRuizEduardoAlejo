package com.example.t5_a3_banuelosruizeduardoalejo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    double n1;
    String opr;
    logicaCalculadora op = new logicaCalculadora();
    private TextView txtOperaciones;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPunto, btnCE, btnC, btnEliminar, btnRaiz, btnCuadrado, btnDivisionUno, btnMasMenos, btnSuma, btnResta, btnMultiplicacion, btnDivision, btnResiduo, btnRes;

    boolean ver = true;
    boolean verP = true;

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
        btnPunto = findViewById(R.id.btnPunto);

        txtOperaciones = findViewById(R.id.txtCajaOperaciones);

        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnEliminar = findViewById(R.id.btnEliminar);

        btnRaiz = findViewById(R.id.btnRaiz);
        btnCuadrado = findViewById(R.id.btnCuadrado);
        btnDivisionUno = findViewById(R.id.btnDivisionUno);
        btnMasMenos = findViewById(R.id.btnMasMenos);

        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);
        btnResiduo = findViewById(R.id.btnResiduo);
    }

    public void insertarNumero(View v) {
        if (ver) {
            txtOperaciones.setText("");
        }
        ver = false;

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
        } else if (v == btnPunto) {
            if (verP) {
                txtOperaciones.setText(txtOperaciones.getText() + ".");
            }
            verP = false;
        }

    }//INSERTAR NUMEROS


    public void opcionesEliminar(View v) {
        verP = true;

        if (v == btnEliminar) {
            String txtAct = txtOperaciones.getText().toString();

            if (txtAct.length() != 0) {
                txtOperaciones.setText(txtAct.substring(0, txtAct.length() - 1));
            }
        } else if (v == btnC) {
            txtOperaciones.setText("0");
            opr="";

        } else if (v == btnCE) {
            txtOperaciones.setText("0");
        }
    }//OPCIONES ELIMINAR

    public void transformaciones(View v) {
        if (v == btnRaiz) {
            double num = Double.parseDouble(String.valueOf(txtOperaciones.getText()));

            if (num < 0) {
                Toast.makeText(this, "Error: raíz compleja", Toast.LENGTH_SHORT).show();
            } else {
                txtOperaciones.setText(String.valueOf(op.raiz(num)));
            }
        } else if (v == btnCuadrado) {
            double num = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText(String.valueOf(op.cuadrado(num)));
        } else if (v == btnDivisionUno) {
            double num = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText(String.valueOf(op.divisionUno(num)));
        } else if (v == btnMasMenos) {
            double num = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText(String.valueOf(op.masmenos(num)));
        }
    }//TRANSFORMACIONES

    public void operaciones(View v) {
        verP = true;

        if (v == btnSuma) {
            n1 = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText("");
            opr = "+";
        } else if (v == btnResta) {
            n1 = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText("");
            opr = "-";
        } else if (v == btnMultiplicacion) {
            n1 = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText("");
            opr = "*";
        } else if (v == btnDivision) {
            n1 = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText("");
            opr = "/";
        } else if (v == btnResiduo) {
            n1 = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
            txtOperaciones.setText("");
            opr = "%";
        }
    }//OPERACIONES

    public void resultado(View v) {
        ver = true;

        double n2 = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
        switch (opr) {
            case "+":
                txtOperaciones.setText(String.valueOf(op.suma(n1, n2)));
                break;
            case "-":
                txtOperaciones.setText(String.valueOf(op.resta(n1, n2)));
                break;
            case "*":
                txtOperaciones.setText(String.valueOf(op.multiplicacion(n1, n2)));
                break;
            case "/":
                if (n1 != 0) {
                    txtOperaciones.setText(String.valueOf(op.division(n1, n2)));
                } else {
                    Toast.makeText(this, "ERROR: Divisor cero.", Toast.LENGTH_SHORT).show();
                }
                break;
            case "%":
                txtOperaciones.setText(String.valueOf(op.residuo(n1, n2)));
                break;

            case "":
                txtOperaciones.setText("0");
                break;
        }

        opr = "";
    }

}//main