package br.com.estacionamento.mvc.model.PO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity()
@Table(name = "TB_TABELA_PRECO")
public class POTabelaPreco extends POEntity{

    @Column(name = "TB_TABELA_PRECO_VALOR", nullable = false)
    private BigDecimal valor;

    @Column(name = "TB_TABELA_PRECO_TEMPO_MIN", nullable = false)
    private int tempoMin;

    @Column(name = "TB_TABELA_PRECO_TEMPO_MAX", nullable = false)
    private int tempoMax;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getTempoMin() {
        return tempoMin;
    }

    public void setTempoMin(int tempoMin) {
        this.tempoMin = tempoMin;
    }

    public int getTempoMax() {
        return tempoMax;
    }

    public void setTempoMax(int tempoMax) {
        this.tempoMax = tempoMax;
    }
}
