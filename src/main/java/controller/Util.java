/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author joaom
 */
public class Util {
    public static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    private Util() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada");
    }

    public static double calcularDiferencaEmDias(Date data1, Date data2) {
        long diffMillis = data2.getTime() - data1.getTime();
        long diffDias = diffMillis / (1000L * 60 * 60 * 24);
        return Math.abs(diffDias);
    }
    
}
