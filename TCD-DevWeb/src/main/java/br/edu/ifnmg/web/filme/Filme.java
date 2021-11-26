/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.web.filme;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 * @author Filipi <fmrj at aluno.ifnmg.edu.br>
 */
@Entity
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)//@Column defini restrições/caracterisicas da coluna no BD
    private String nome;
    
    private String genero;
    
    private String sinopse;
    
    private String classificacao;
    
    private LocalDate dataLancamento;
    
    private Integer duracao; //Duração em minutos

    // <editor-fold defaultstate="collapsed" desc="Contrutores. Click on the + sign on the left to edit the code.">
    
    public Filme() {
        this.nome = "Não definido";
        this.genero = "Não definido";
        this.sinopse = "Não definido";
        this.classificacao = "Não definido";
        this.dataLancamento = LocalDate.now();
        this.duracao = 0;
    }
    
    public Filme(String nome, String genero, String sinopse, String classificacao, LocalDate dataLancamento, Integer duracao){
        this.nome = nome;
        this.genero = genero;
        this.sinopse = sinopse;
        this.classificacao = classificacao;
        this.dataLancamento = dataLancamento;
        this.duracao = duracao;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters/Setters. Click on the + sign on the left to edit the code.">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
// </editor-fold>
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filme)) {
            return false;
        }
        Filme other = (Filme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.web.filme.Filme[ id=" + id + " ]";
    }
    
}
