/*
 * Este código foi desenvolvido com intuito de aprender sobre desenvolvimento de aplicações WEB.
 * Este trabalho foi desenvolvido na disciplina de Desenvolvimento Web do IFNMG - Campus - Montes Claros.
 * Este é um projeto de código aberto que pode ser utilizado para ajudar as pessoas no desenvolvimento de aplicações Web.
 * Copyright (C) 2021 Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
package br.edu.ifnmg.web.ingresso;

import javax.ejb.Local;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
@Local
public interface IngressoBeanLocal {

    void salvar(Ingresso ingresso);
    
}
