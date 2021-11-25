/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Lucas <lsm3 at aluno.ifnmg.edu.br>
 */

public class Calc {
    private Double n1;
    private Double n2;
    private String op;
    
    public Calc(){
        this.n1 = 0.0;
        this.n2 = 0.0;
        this.op = "somar";
    }
    
    public Calc(Double n1, Double n2, String op){
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    public Double Somar(){
        return this.n1+this.n2;
    } 
}