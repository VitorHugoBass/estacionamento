package br.com.estacionamento.mvc.model.PO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name = "TB_ENDERECO")
public class POEndereco extends POEntity{

    @Column(name = "TB_ENDERECO_cep", nullable = false)
    private String cep;

    @Column(name = "TB_ENDERECO_LOGRADOURO", nullable = false)
    private String logradouro;

    @Column(name = "TB_ENDERECO_NUM", nullable = false)
    private String numero;

    @Column(name = "TB_ENDERECO_COMP")
    private String complemento;

    @Column(name = "TB_CIDADE_ID", nullable = false)
    private POCidade cidade;

    @Column(name = "TB_MENSALIDADE_ID", nullable = false)
    private POMensalista mensalista;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public POCidade getCidade() {
        return cidade;
    }

    public void setCidade(POCidade cidade) {
        this.cidade = cidade;
    }

    public POMensalista getMensalista() {
        return mensalista;
    }

    public void setMensalista(POMensalista mensalista) {
        this.mensalista = mensalista;
    }
}
