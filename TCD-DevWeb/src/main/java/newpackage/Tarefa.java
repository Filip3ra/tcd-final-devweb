package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Filip
 * 
 * A classe Tarefa representa minha tabela no BD. 
 * Cada variável representa uma coluna.
 * 
 * O servelet usado vai obter os dados e chamar o TarefaBeanLocal com os métodos dele.
 * 
 * TarefaBeanLocal contém os métodos que vão ser usados para persistência.
 * Exemplo, salvar.
 * 
 * TarefaBean fará a persistência. 
 * 
 * --------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 */
@Entity
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Transient
    private Short idade;
    
    @Column(length = 150, nullable = true)
    private String descricao;
    
//    private Boolean concluida;

    private Integer duracao;

    
    
    
    
    
    
    public Short getIdade() {
        return idade;
    }

    public void setIdade(Short idade) {
        this.idade = idade;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    
    
    
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    public Boolean getConcluida() {
//        return concluida;
//    }
//
//    public void setConcluida(Boolean concluida) {
//        this.concluida = concluida;
//    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "newpackage.Tarefa[ id=" + id + " ]";
    }
    
}
