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
public class Locadora {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idLocadora;
    
    @Column(length = 50, nullable = false)
    private String nome;
    
    @Column(length = 14, nullable = false, unique = true)
    private String cnpj;
    
    @Column (length = 15)
    private String telefone;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;
    
    @OneToMany ( mappedBy = "locadora", fetch = FetchType.LAZY )
    private List<Veiculo> veiculos;
    
    @OneToMany ( mappedBy = "locadora", fetch = FetchType.LAZY )
    private List<Contrato> contratos;
    
    
    public Locadora() {
    }

    public Locadora(int idLocadora, String nome, String cnpj, String telefone, Endereco endereco, List<Veiculo> veiculos) {
        this.idLocadora = idLocadora;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public int getIdLocadora() {
        return idLocadora;
    }

    public void setId(int idLocadora) {
        this.idLocadora = idLocadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  nome;
    }
    
    
            
}
