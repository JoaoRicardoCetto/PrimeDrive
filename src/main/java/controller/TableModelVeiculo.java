/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelVeiculo extends AbstractTableModel {

    private List lista  = new ArrayList();  

    @Override
    public int getColumnCount() {
        return 6;   // Quantidade de colunas da TABELA
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Veiculo vei = (Veiculo) lista.get(rowIndex);
        switch ( columnIndex ) {
            //case 0: return vei.getFoto();
            case 0: return vei.getTipo();
            case 1: return vei.getMarca().getNome();
            case 2: return vei.getModelo();
            case 3: return vei.getVal_diaria();
            case 4: return vei.getPlaca();
            case 5: return vei.getSitVeiculo();
            
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {/*"Foto",*/ "Tipo", "Marca", "Modelo", "Valor Diária", "Placa", "Situação" };
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

