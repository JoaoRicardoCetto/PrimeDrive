/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;

/**
 *
 * @author joaom
 */
public class Util {
    
    private Util() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada");
    }

    public static double calcularDiferencaEmDias(Date data1, Date data2) {
        long diffMillis = data2.getTime() - data1.getTime();
        long diffDias = diffMillis / (1000L * 60 * 60 * 24);
        return Math.abs(diffDias);
    }
    
}
