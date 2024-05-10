/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplothreadsconcorrencia;

/**
 *
 * @author LENOVO
 */
public class Gastao implements Runnable{
    
    private String nome;
    private Conta conta;

    public Gastao(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    @Override
    public void run() {
        for (int i=0; i<1000000; i++){
            //System.out.println(this.nome + " sacou 1 real");
            this.conta.sacar(1);
        }
    }
    
}
