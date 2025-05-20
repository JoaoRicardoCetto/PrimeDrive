/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import domain.enums.SituacaoVeiculo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Check;

/**
 *
 * @author joaom
 */
@Entity
public class Veiculo implements Serializable{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idVeiculo;
    
    @Column  (nullable = false)
    private double val_diaria;
    
    @Column (length = 7, nullable = false)
    private String placa;
    
    private String tipo;
    
    @Column (nullable = false)
    private String modelo;
    
    private SituacaoVeiculo sitVeiculo;
    
    @ManyToOne
    @JoinColumn(name="idLocadora")
    private Locadora locadora;
    
    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;
    
    @OneToMany ( mappedBy = "veiculo", fetch = FetchType.LAZY )
    private List<Contrato> contratos;
    
    
    public Veiculo() {
    }

    public Veiculo(int idVeiculo, double val_diaria, String placa, String tipo, String modelo, SituacaoVeiculo sitVeiculo, Marca marca) {
        this.idVeiculo = idVeiculo;
        this.val_diaria = val_diaria;
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.sitVeiculo = sitVeiculo;
        this.marca = marca;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public double getVal_diaria() {
        return val_diaria;
    }

    public void setVal_diaria(double val_diaria) {
        this.val_diaria = val_diaria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public SituacaoVeiculo getSitVeiculo() {
        return sitVeiculo;
    }

    public void setSitVeiculo(SituacaoVeiculo sitVeiculo) {
        this.sitVeiculo = sitVeiculo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
