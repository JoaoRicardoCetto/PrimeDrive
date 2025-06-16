/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.enums;

/**
 *
 * @author joaom
 */
public enum SituacaoVeiculo {
    DISPONIVEL(0),
    ALUGADO(1),
    MANUTENCAO(2);
    
    private final int codigo;

    private SituacaoVeiculo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod() {
        return codigo;
    }
}
