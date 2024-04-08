/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapolmorfismo;

/**
 *
 * @author LENOVO
 */
public class TempoParcial extends Empregado {
    
    //atibutos
    private double valorFixo;
    private double salHora;
    private double qtdeHoras;

    public TempoParcial(String nome, String pis, double valorFixo, double salHora, double qtdeHoras) {
        super(nome, pis);
        this.valorFixo = valorFixo;
        this.salHora = salHora;
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    public double getSalHora() {
        return salHora;
    }

    public void setSalHora(double salHora) {
        this.salHora = salHora;
    }

    public double getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(double qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    @Override
    public void pagarSalario() {
        this.salario = (this.salHora*this.qtdeHoras)+this.valorFixo;
    }
    
    public void atualizarQtdHoras(double novaQtd){
        this.qtdeHoras = novaQtd;
    }
    
    
}
