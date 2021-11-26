/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.filme;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 * @author Filipi <fmrj at aluno.ifnmg.edu.br>
 */
@Stateless
public class FilmeBean implements FilmeBeanLocal {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvar(Filme filme) {
        entityManager.persist(filme);
    }
}
