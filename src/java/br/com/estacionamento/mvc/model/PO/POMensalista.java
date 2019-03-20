package br.com.estacionamento.mvc.model.PO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "TB_MENSALISTA")
public class POMensalista extends POEntity {

    @Column(name = "TB_MENSALISTA_NOME", nullable = false)
    private String nome;

    @Column(name = "TB_MENSALISTA_CPF", nullable = false)
    private String cpf;
}
