/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Contrato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author joaom
 */
public class TableModelContrato extends AbstractTableModel{
        private List lista  = new ArrayList();  

    @Override
    public int getColumnCount() {
        return 8;   // Quantidade de colunas da TABELA
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Contrato con = (Contrato) lista.get(rowIndex);
        switch ( columnIndex ) {
            case 0: return con.getLocadora().getNome();
            case 1: return con.getVeiculo().getMarca();
            case 2: return con.getVeiculo().getModelo();
            case 3: return con.getVal_total();
            case 4: return con.getQtd_parcelas();
            case 5: return con.getVal_parcela();
            case 6: return con.getDat_inicio();
            case 7: return con.getDat_fim();
            
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Locadora", "Marca", "Veiculo", "Valor Total", "Qtde Parcelas", "Valor Parcela", "Inicio do Contrato", "Fim do Contrato"};
        return nomes[column];
    }
    
    
    public Object getItem (int rowIndex) {
        return lista.get(rowIndex);        
    }
    
    public void adicionar (Object obj) {
        lista.add(obj);
        fireTableRowsInserted( lista.size() - 1, lista.size() - 1 );
        
    }
    
    public void remover (int indice) {
        lista.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !lista.isEmpty() ) {
                lista.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            lista = novaLista;
            fireTableRowsInserted( 0, lista.size() - 1);
        }
        
    }
    
    public List getLista() {
        return lista;
    }
}
