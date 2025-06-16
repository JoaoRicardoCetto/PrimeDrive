/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Contrato;
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
public class ContratoDAO extends GenericDAO{
    
    private List<Contrato> pesquisar(int pesq, int tipo) throws HibernateException {

        List lista = null;        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Contrato.class);
            Root tabela = consulta.from( Contrato.class );            
            
            //Restrições
            Predicate restricoes = null;
            switch (tipo) {
                case 1 -> restricoes = builder.equal(tabela.get("cliente").get("idCliente") , pesq );
            
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

    public List<Contrato> pesquisarContratosUsuarioLogado(int id){
        return pesquisar(id , 1);
    }
}
