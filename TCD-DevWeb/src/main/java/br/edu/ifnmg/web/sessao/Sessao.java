/*
 * Este código foi desenvolvido com intuito de aprender sobre desenvolvimento de aplicações WEB.
 * Este trabalho foi desenvolvido na disciplina de Desenvolvimento Web do IFNMG - Campus - Montes Claros.
 * Este é um projeto de código aberto que pode ser utilizado para ajudar as pessoas no desenvolvimento de aplicações Web.
 * Copyright (C) 2021 Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
package br.edu.ifnmg.web.sessao;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */
@Entity
public class Sessao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate dataInicio;
    private LocalDate dataTermino;
    
    public Sessao(){
        this.dataInicio = LocalDate.now();
        this.dataTermino = LocalDate.now();
    }
    
    public Sessao(LocalDate dataInicio, LocalDate dataTermino){
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }
    
    
    public Long getId() {
        return id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sessao)) {
            return false;
        }
        Sessao other = (Sessao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.web.sessao.Sessao[ id=" + id + " ]";
    }
    
}
