/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import javax.ejb.Local;

/**
 *
 * @author Filip
 */
@Local
public interface TarefaBeanLocal {

    void salvar(Tarefa tarefa);

}
