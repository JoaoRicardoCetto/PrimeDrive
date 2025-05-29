/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.VeiculoDAO;
import domain.Veiculo;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author joaom
 */
public class GerenciadorDominio {
    
    private GenericDAO genDAO;
    private VeiculoDAO veiDAO;

    public GerenciadorDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        veiDAO = new VeiculoDAO(); 
        // Instânciar as classes DAO
    }
    
    
    public List listarVeiculosDisponiveis(){
        return veiDAO.listarVeiculosDisponiveis();
    }
    
    public List listar(Class classe){
        return genDAO.listar(classe);
    }
}
