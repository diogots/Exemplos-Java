/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapolmorfismo;

/**
 *
 * @author LENOVO
 */
public class Horista extends Empregado{
    
    private double salHora;
    private double qtdeHoras;
    
    public Horista(String nome, String pis, double salHora, double qtdHoras) {
        super(nome, pis);
        this.salHora = salHora;
        this.qtdeHoras = qtdHoras;
                
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
        this.salario = this.salHora*this.qtdeHoras;
    }
    
    public void atualizarQtdHoras(double novaQtd){
        this.qtdeHoras = novaQtd;
    }
    
    
    
}
