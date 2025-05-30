/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaom
 */
public class ClienteDAO extends GenericDAO{
    public Cliente pesquisarPorCPF(String CPF){
        Cliente cliente = new Cliente();
        
        for(Cliente c : (List<Cliente>) listar(Cliente.class)){
            if(c.getCpf().equals(CPF)){
                cliente = c;
            }
            else cliente = null;
        }
        
        
        return cliente;
    }
}
