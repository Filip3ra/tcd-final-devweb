package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author Filip
 */
@Stateless
public class TarefaBean implements TarefaBeanLocal {

    @PersistenceContext
    EntityManager entityManager;
    
    
    @Override
    public void salvar(Tarefa tarefa) {
        entityManager.persist(tarefa);
    }
}
