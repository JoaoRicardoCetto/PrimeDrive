/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Veiculo;
import domain.enums.SituacaoVeiculo;
import java.util.List;


/**
 *
 * @author joaom
 */
public class VeiculoDAO extends GenericDAO{
    
    private List<Veiculo> listarVeiculosDisponiveis(){
        List<Veiculo> veiculosDisponiveis = null;
        
        for(Veiculo v : (List<Veiculo>) listar(Veiculo.class)){
            if(v.getSitVeiculo() == SituacaoVeiculo.DISPONIVEL){
                veiculosDisponiveis.add(v);
            }
        }
        
        return veiculosDisponiveis;
    }
}
