package br.com.estacionamento.mvc.model.crud;

import br.com.estacionamento.mvc.model.PO.POEstado;

import javax.persistence.*;
import java.util.List;

public class CRUDEstado {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CRUDEstado() {
        this.emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
        this.em = this.emf.createEntityManager();
    }

    public POEstado save(POEstado estado) {
        this.em.getTransaction().begin();
        if (estado.getId() == 0)
            this.em.persist(estado);
        else
            this.em.merge(estado);
        this.em.getTransaction().commit();

        return estado;
    }

    public POEstado delete(POEstado estado) {
        POEstado poEstado = em.find(POEstado.class, estado.getId());
        this.em.getTransaction().begin();
        this.em.remove(poEstado);
        this.em.getTransaction().commit();
        return poEstado;
    }

    public List<POEstado> findAll() {
        Query query = this.em.createQuery("SELECT o FROM POEstado o");
        return query.getResultList();
    }

    public POEstado findById(int id) {
        TypedQuery<POEstado> query = this.em.createQuery("SELECT o FROM POEstado o WHERE o.id = :id", POEstado.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
