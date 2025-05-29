/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author joaom
 */

@Entity
public class Marca {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idMarca;
    
    @Column(length = 50, nullable = false)
    private String nome;
    
    @OneToMany( mappedBy = "marca", fetch = FetchType.LAZY )
    private List<Veiculo> veiculos;
    
    public Marca() {
    }

    public Marca(int idMarca, String nome, List<Veiculo> veiculos) {
        this.idMarca = idMarca;
        this.nome = nome;
        this.veiculos = veiculos;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    public int getIdMarca() {
        return idMarca;
    }

    public void setId(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

 
    
    
}
