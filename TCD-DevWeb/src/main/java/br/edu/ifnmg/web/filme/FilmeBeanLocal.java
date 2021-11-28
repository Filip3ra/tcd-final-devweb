/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.filme;

import javax.ejb.Local;

/**
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 * @author Filipi <fmrj at aluno.ifnmg.edu.br>
 */
@Local
public interface FilmeBeanLocal {

    void salvar(Filme filme);
    
    void atualizar(Filme filme);
    
    Filme buscar(Long id);
    
    void deletar(Filme filme);
    
}
