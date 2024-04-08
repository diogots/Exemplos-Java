/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulapolmorfismo;

/**
 *
 * @author LENOVO
 */
public class Empregado {
    //atributos
    private String nome;
    protected String pis;
    protected double salario;
    
    //métodos

    public Empregado(String nome, String pis) {
        this.nome = nome;
        this.pis = pis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void pagarSalario(){
        System.out.println("Pagar salário");
    }

    @Override
    public String toString() {
        String str = "Empregado:\n"
                + "Nome: " + this.nome +"\n"
                + " Salário: " + this.salario + "\n";
        return str;
    }
    
    
}
