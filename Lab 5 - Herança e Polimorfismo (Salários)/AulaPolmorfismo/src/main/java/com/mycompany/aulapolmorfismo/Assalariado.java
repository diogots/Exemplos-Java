/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapolmorfismo;

/**
 *
 * @author LENOVO
 */
public class Assalariado extends Empregado{
    
    private double salarioMensal;
    
    public Assalariado(String nome, String pis, double salarioMensal) {
        super(nome, pis);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void pagarSalario() {
        this.salario = salarioMensal;
    }
    

    
    
}
 
