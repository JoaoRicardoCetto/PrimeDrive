/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Veiculo;
import domain.enums.SituacaoVeiculo;
import java.util.ArrayList;
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
public class VeiculoDAO extends GenericDAO{
    
    private List<Veiculo> pesquisar(int pesq, int tipo) throws HibernateException {

        List lista = null;        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Veiculo.class);
            Root tabela = consulta.from( Veiculo.class );            
            
            //Restrições
            Predicate restricoes = null;
            switch (tipo) {
                case 1 -> restricoes = builder.equal(tabela.get("sitVeiculo") , pesq);
            
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
    
    public List<Veiculo> listarVeiculosDisponiveis(){
        return pesquisar(SituacaoVeiculo.DISPONIVEL.getCod(), 1);
    }
    
    public void alterarEstadoVeiculo(Veiculo v) throws HibernateException {
        v.setSitVeiculo(SituacaoVeiculo.ALUGADO);
        alterar(v);
    }
}
