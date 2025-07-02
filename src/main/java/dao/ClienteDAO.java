/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author joaom
 */
public class ClienteDAO extends GenericDAO{
    
    private List<Cliente> pesquisar(String pesq, int tipo) throws HibernateException {

        List lista = null;        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Cliente.class);
            Root tabela = consulta.from( Cliente.class );            
            
            //Restrições
            Predicate restricoes = null;
            switch (tipo) {
                case 1 -> restricoes = builder.like(tabela.get("cpf") , pesq );
            
            }
                       
            consulta.where(restricoes);
            
            // Executar a query
            lista = sessao.createQuery(consulta).getResultList();            
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
                      
        return lista;
        
    }
    
    public Cliente pesquisarPorCPF(String pesq) throws HibernateException {
        return pesquisar(pesq, 1).getFirst();
    }
    
    public Cliente login(String cpf, String senha) throws HibernateException {
        List<Cliente> c = pesquisar(cpf, 1);
        
        if(c.getFirst().getSenha().equals(senha)){
            return c.getFirst();
        }
        
        else return null;
        
    }
}
