package br.com.estacionamento.mvc.model.PO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity()
@Table(name = "TB_MODELO")
public class POModelo extends POEntity{

    @Column(name = "TB_MODELO_DESC", nullable = false)
    private String descricao;

    @Column(name = "TB_MARCA_DESC", nullable = false)
    private POTipoVeiculo tipoVeiculo;

    @JoinColumn(name = "TB_MARCA_ID", nullable = false)
    private POMarca marca;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public POTipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(POTipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public POMarca getMarca() {
        return marca;
    }

    public void setMarca(POMarca marca) {
        this.marca = marca;
    }
}
