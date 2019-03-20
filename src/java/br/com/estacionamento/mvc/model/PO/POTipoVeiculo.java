package br.com.estacionamento.mvc.model.PO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "TB_TIPO_VEICULO")
public class POTipoVeiculo extends POEntity{

    @Column(name = "TB_TIPO_VEICULO_DESC", nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
