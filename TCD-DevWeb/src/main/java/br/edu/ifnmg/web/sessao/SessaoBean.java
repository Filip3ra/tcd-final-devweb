/*
 * Este código foi desenvolvido com intuito de aprender sobre desenvolvimento de aplicações WEB.
 * Este trabalho foi desenvolvido na disciplina de Desenvolvimento Web do IFNMG - Campus - Montes Claros.
 * Este é um projeto de código aberto que pode ser utilizado para ajudar as pessoas no desenvolvimento de aplicações Web.
 * Copyright (C) 2021 Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
package br.edu.ifnmg.web.sessao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
@Stateless
public class SessaoBean implements SessaoBeanLocal {

    @PersistenceContext
    EntityManager entityManager;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void salvar(Sessao sessao) {
        entityManager.persist(sessao);
    }
    
    
}
