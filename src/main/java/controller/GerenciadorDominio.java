/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.exceptions.AutenticacaoException;
import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.ContratoDAO;
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
    
    private Cliente usuarioLogado;
    
    private GenericDAO genDAO;
    private VeiculoDAO veiDAO;
    private ClienteDAO cliDAO;
    private ContratoDAO contratoDAO;

    public GerenciadorDominio() throws java.lang.ExceptionInInitializerError, HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        veiDAO = new VeiculoDAO(); 
        cliDAO = new ClienteDAO();
        contratoDAO = new ContratoDAO();
        // Instânciar as classes DAO
    }

    public Cliente getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Cliente usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    public List listarVeiculosDisponiveis() throws HibernateException {
        return veiDAO.listarVeiculosDisponiveis();
    }
    
    public void alterarEstadoVeiculo(Veiculo v) throws HibernateException {
        veiDAO.alterarEstadoVeiculo(v);
    }
    
    public Cliente pesquisarPorCPF(String CPF) throws HibernateException {
        return cliDAO.pesquisarPorCPF(CPF);
    }
    
    public Cliente login(String cpf, String senha) throws HibernateException, AutenticacaoException {
        usuarioLogado = cliDAO.login(cpf, senha);
        if(usuarioLogado == null) {
            throw new AutenticacaoException("CPF ou senha inválidos");
        }
        
        return usuarioLogado;
    }
    
    public List listar(Class classe) throws HibernateException {
        return genDAO.listar(classe);
    }
    
    public void inserir(Object obj) throws HibernateException {
        genDAO.inserir(obj);
    }
    
    
    public List listarContratosUsuario() throws HibernateException {
        return contratoDAO.pesquisarContratosUsuarioLogado(usuarioLogado.getIdCliente()); 
    }
}
