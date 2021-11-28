/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.web.endereco;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
@Stateless
public class EnderecoBean implements EnderecoBeanLocal {

    @PersistenceContext
    EntityManager entityManager;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void salvar(Endereco endereco) {
        entityManager.persist(endereco);
    }
    
}
