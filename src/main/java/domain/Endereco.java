/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import javax.persistence.*;

/**
 *
 * @author joaom
 */
@Entity
public class Endereco {
    @Id    
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idEndereco;  
    
    @Column (length = 9, nullable = false)
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String num;
    private String logradouro;
    private String complemento;
   

    public Endereco() {
    }

    public Endereco(int idEndereco, String cep, String estado, String cidade, String bairro, String num, String logradouro, String complemento) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.num = num;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public Endereco(String cep, String estado, String cidade, String bairro, String num, String logradouro, String complemento) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.num = num;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
            
}
