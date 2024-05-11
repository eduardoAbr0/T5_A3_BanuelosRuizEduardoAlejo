package com.example.t5_a3_banuelosruizeduardoalejo;

import android.view.View;
import android.widget.Button;

public class logicaCalculadora {
    public double suma(double n1, double n2){
        return n1+n2;
    }
    public double resta(double n1, double n2){
        return n1-n2;
    }
    public double division(double n1, double n2){
        return n1/n2;
    }
    public double multiplicacion(double n1, double n2){
        return n1*n2;
    }
    public  double residuo(double n1, double n2){
        return n1%n2;
    }
    public double masmenos(double n){
        return n*-1;
    }
    public double raiz(double n){
        return Math.sqrt(n);
    }
    public double divisionUno(double n){
        return 1/n;
    }
    public double cuadrado(double n){
        return n*n;
    }
}
