/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import org.hibernate.HibernateException;

/**
 *
 * @author joaom
 */
public class GerenciadorDominio {

    public GerenciadorDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();
        // Instânciar as classes DAO
        
    }
    
}
