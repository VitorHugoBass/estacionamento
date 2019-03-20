package br.com.estacionamento.mvc.model.PO;

import br.com.estacionamento.mvc.model.PO.enums.Status;

import javax.persistence.*;

public abstract class POEntity {

    @Id
    @GeneratedValue
    @Column(name = "TB_ID", nullable = false)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TB_STATUS", nullable = false)
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
