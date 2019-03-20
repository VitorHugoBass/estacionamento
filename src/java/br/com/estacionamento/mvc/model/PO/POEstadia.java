package br.com.estacionamento.mvc.model.PO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity()
@Table(name = "TB_ESTADIA")
public class POEstadia extends POEntity {

    @Column(name = "TB_ESTADIA_INICIO", nullable = false)
    private LocalTime inicio;

    @Column(name = "TB_ESTADIA_TERMINO")
    private LocalTime termino;

    @Column(name = "TB_ESTADIA_PLACA", nullable = false)
    private String placa;

    @JoinColumn(name = "TB_VAGA_ID", nullable = false)
    private POVaga vaga;

    @JoinColumn(name = "TB_TABELA_PRECO_ID", nullable = false)
    private POTabelaPreco preco;

    @JoinColumn(name = "TB_VEICULO_ID", nullable = false)
    private POVeiculo veiculo;

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public LocalTime getTermino() {
        return termino;
    }

    public void setTermino(LocalTime termino) {
        this.termino = termino;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public POVaga getVaga() {
        return vaga;
    }

    public void setVaga(POVaga vaga) {
        this.vaga = vaga;
    }

    public POTabelaPreco getPreco() {
        return preco;
    }

    public void setPreco(POTabelaPreco preco) {
        this.preco = preco;
    }

    public POVeiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(POVeiculo veiculo) {
        this.veiculo = veiculo;
    }
}
