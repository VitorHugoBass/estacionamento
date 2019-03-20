package br.com.estacionamento.mvc.model.PO;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class POMensalistaVeiculo extends POEntity{

    @Column(name = "TB_MENSALISTA_VEICULO_PROPRIETARIO", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean proprietario;

    @OneToOne
    @JoinColumn(name = "TB_MENSALISTA_ID",nullable = false)
    private POMensalista mensalista;

    @OneToOne
    @JoinColumn(name = "TB_VEICULO_ID", nullable = false)
    private POVeiculo veiculo;

}
