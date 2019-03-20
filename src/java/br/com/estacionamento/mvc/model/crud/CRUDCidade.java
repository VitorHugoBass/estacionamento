package br.com.estacionamento.mvc.model.crud;

import br.com.estacionamento.mvc.model.PO.POCidade;

import javax.persistence.*;
import java.util.List;

public class CRUDCidade {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CRUDCidade() {
        this.emf = Persistence.createEntityManagerFactory("ESTACIONAMENTO_PU");
        this.em = this.emf.createEntityManager();
    }

    public POCidade save(POCidade cidade) {
        this.em.getTransaction().begin();
        if (cidade.getId() == 0)
            this.em.persist(cidade);
        else
            this.em.merge(cidade);
        this.em.getTransaction().commit();

        return cidade;
    }

    public POCidade delete(POCidade cidade) {
        POCidade poCidade = em.find(POCidade.class, cidade.getId());
        this.em.getTransaction().begin();
        this.em.remove(poCidade);
        this.em.getTransaction().commit();
        return poCidade;
    }

    public List<POCidade> findAll() {
        Query query = this.em.createQuery("SELECT o FROM POCidade o");
        return query.getResultList();
    }

    public POCidade findById(int id) {
        TypedQuery<POCidade> query = this.em.createQuery("SELECT o FROM POCidade o WHERE o.id = :id", POCidade.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
