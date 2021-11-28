/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.web.endereco;

import javax.ejb.Local;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
@Local
public interface EnderecoBeanLocal {

    void salvar(Endereco endereco);
    
}
