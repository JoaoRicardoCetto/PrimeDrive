/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.VeiculoDAO;
import domain.Cliente;
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
    private ClienteDAO cliDAO;

    public GerenciadorDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        veiDAO = new VeiculoDAO(); 
        cliDAO = new ClienteDAO();
        // Instânciar as classes DAO
    }
    
    
    public List listarVeiculosDisponiveis(){
        return veiDAO.listarVeiculosDisponiveis();
    }
    
    public void alterarEstadoVeiculo(Veiculo v){
        veiDAO.alterarEstadoVeiculo(v);
    }
    
    public Cliente pesquisarPorCPF(String CPF){
        return cliDAO.pesquisarPorCPF(CPF);
    }
    
    public List listar(Class classe){
        return genDAO.listar(classe);
    }
    
    public void inserir(Object obj){
        genDAO.inserir(obj);
    }
}
