/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Check;

/**
 *
 * @author joaom
 */
@Entity
@Check(constraints = "sexo IN ('M','F')")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int idCliente;
    
    @Column  (nullable = false, length = 200)
    private String nome;
    
    @Column (nullable = false, unique = true, length = 14, updatable = false)
    private String cpf;
    
    @Column (nullable = false)
    private String senha;
    
    @Temporal ( value = TemporalType.DATE )
    @Column (updatable = false)
    private Date dat_nasc;
    
    @Column (length = 50)
    private String email;
    
    @Column (length = 15 )
    private String telefone;
    
    @Column (length = 1 )
    private char sexo;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;
    
    @OneToMany ( mappedBy = "cliente", fetch = FetchType.LAZY )
    private List<Contrato> contratos;
    
    
    public Cliente() {
    }

    public Cliente(String nome, String cpf, String senha, Date dat_nasc, String email, String telefone, char sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.dat_nasc = dat_nasc;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    
    
    public Cliente(int id, String nome, String cpf, String senha, Date dat_nasc, String email, String telefone, char sexo, Endereco endereco) {
        this.idCliente = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.dat_nasc = dat_nasc;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nome;
    }
        
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDat_nasc() {
        return dat_nasc;
    }

    public void setDat_nasc(Date dat_nasc) {
        this.dat_nasc = dat_nasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
