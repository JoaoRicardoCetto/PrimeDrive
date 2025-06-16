/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.exceptions;

/**
 *
 * @author joaom
 */
// arquivo: AutenticacaoException.java
public class AutenticacaoException extends Exception {

    public AutenticacaoException() {
        super();
    }

    public AutenticacaoException(String mensagem) {
        super(mensagem);
    }

    public AutenticacaoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    public AutenticacaoException(Throwable causa) {
        super(causa);
    }
}
