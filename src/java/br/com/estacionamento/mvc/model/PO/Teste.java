package br.com.estacionamento.mvc.model.PO;

import br.com.estacionamento.mvc.model.crud.CRUDCidade;
import br.com.estacionamento.mvc.model.crud.CRUDCidade;
import br.com.estacionamento.mvc.model.crud.CRUDEstado;
import br.com.estacionamento.mvc.model.PO.enums.Status;

import java.util.List;

public class Teste {

    public static void main(String args[]) {

//        CRUDEstado crudEstado = new CRUDEstado();
//        POEstado entity = new POEstado();
//        entity.setNome("Batata");
//        entity.setSigla("BT");
//        entity.setStatus(Status.ATIVO);

//        POEstado result = crudEstado.save(entity);
//        System.out.println("Add " + result.getId() + " " + result.getNome());
//
//        POEstado result2 = crudEstado.delete(result);
//        System.out.println("Delete " + result2.getId() + " " + result2.getNome());
        CRUDCidade crudCidade = new CRUDCidade();

        List<POCidade> all = crudCidade.findAll();

        all.forEach(poCidade -> System.out.println("nome = " + poCidade.getNome()));
    }
}
