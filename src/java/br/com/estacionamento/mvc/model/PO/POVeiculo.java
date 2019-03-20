package br.com.estacionamento.mvc.model.PO;

import br.com.estacionamento.mvc.model.PO.enums.Cor;

import javax.persistence.*;

@Entity()
@Table(name = "TB_VEICULO")
public class POVeiculo extends POEntity{

    @Column(name = "TB_VEICULO_PLACA", nullable = false)
    private String placa;

    @Enumerated(EnumType.STRING)
    @Column(name = "TB_VEICULO_COR", nullable = false)
    private Cor cor;

    @JoinColumn(name = "TB_MODELO_ID", nullable = false)
    private POModelo modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public POModelo getModelo() {
        return modelo;
    }

    public void setModelo(POModelo modelo) {
        this.modelo = modelo;
    }
}
