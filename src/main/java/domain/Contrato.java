/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * DATA DE PAGAMENTO SEMPRE VAI SER A DATA DE INICIO DO CONTRATO. ALGUNS DOS VALORES VÃO SER CALCULADOS AUTOMATICAMENTE E ARMAZENADOS NO BANCO
 * @author joaom
 */

@Entity
public class Contrato implements Serializable{
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idContrato;
    
    @Temporal ( value = TemporalType.DATE )
    private Date dat_inicio;
    
    @Temporal ( value = TemporalType.DATE )
    private Date dat_fim;
    
    @Temporal ( value = TemporalType.DATE )
    private Date dat_pagamento;
    
    private String forma_pagamento;
    
    private double val_total;
    
    private double val_parcela;
    
    private int qtd_parcelas;
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "idVeiculo")
    private Veiculo veiculo;
    
    @ManyToOne
    @JoinColumn(name = "idLocadora")
    private Locadora locadora;
    

    public Contrato(int idContrato, Date dat_inicio, Date dat_fim, double val_total, double val_parcela, Date dat_pagamento, String forma_pagamento, int qtd_parcelas, Cliente cliente, Veiculo veiculo, Locadora locadora) {
        this.idContrato = idContrato;
        this.dat_inicio = dat_inicio;
        this.dat_fim = dat_fim;
        this.val_total = val_total;
        this.val_parcela = val_parcela;
        this.dat_pagamento = dat_pagamento;
        this.forma_pagamento = forma_pagamento;
        this.qtd_parcelas = qtd_parcelas;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.locadora = locadora;
    }

    public Contrato() {
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setId(int idContrato) {
        this.idContrato = idContrato;
    }

    public Date getDat_inicio() {
        return dat_inicio;
    }

    public void setDat_inicio(Date dat_inicio) {
        this.dat_inicio = dat_inicio;
    }

    public Date getDat_fim() {
        return dat_fim;
    }

    public void setDat_fim(Date dat_fim) {
        this.dat_fim = dat_fim;
    }

    public double getVal_total() {
        return val_total;
    }

    public void setVal_total(double val_total) {
        this.val_total = val_total;
    }

    public double getVal_parcela() {
        return val_parcela;
    }

    public void setVal_parcela(double val_parcela) {
        this.val_parcela = val_parcela;
    }

    public Date getDat_pagamento() {
        return dat_pagamento;
    }

    public void setDat_pagamento(Date dat_pagamento) {
        this.dat_pagamento = dat_pagamento;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public int getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(int qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }
    
}

