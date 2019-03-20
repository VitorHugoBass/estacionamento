package br.com.estacionamento.mvc.model.PO;

import javax.persistence.*;

@Entity()
@Table(name = "TB_CIDADE")
public class POCidade extends POEntity {

    @Column(name = "TB_CIDADE_NOME", nullable = false)
    private String nome;

    @OneToOne
    @JoinColumn(name = "TB_ESTADO_ID", nullable = false)
    private POEstado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public POEstado getEstado() {
        return estado;
    }

    public void setEstado(POEstado estado) {
        this.estado = estado;
    }
}
