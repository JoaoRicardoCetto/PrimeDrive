/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import org.hibernate.HibernateException;

/**
 *
 * @author joaom
 */
public class GerenciadorDominio {
    
    private GenericDAO genDAO;

    public GerenciadorDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        // Instânciar as classes DAO
        
    }
    
}
