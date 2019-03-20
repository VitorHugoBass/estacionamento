package br.com.estacionamento.mvc.model.PO;

import br.com.estacionamento.mvc.model.PO.enums.TipoTelefone;

import javax.persistence.*;

@Entity()
@Table(name = "TB_TELEFONE")
public class POTelefone extends POEntity{

    @Column(name = "TB_TELEFONE_NUM", nullable = false)
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "TB_TELEFONE_TIPO_TELEFONE", nullable = false)
    private TipoTelefone tipoTelefone;

    @JoinColumn(name = "TB_MENSALISTA_ID", nullable = false)
    private POMensalista mensalista;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public POMensalista getMensalista() {
        return mensalista;
    }

    public void setMensalista(POMensalista mensalista) {
        this.mensalista = mensalista;
    }
}
