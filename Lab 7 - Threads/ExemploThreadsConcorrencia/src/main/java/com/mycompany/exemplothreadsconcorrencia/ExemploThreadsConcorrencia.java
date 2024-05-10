/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplothreadsconcorrencia;

/**
 *
 * @author LENOVO
 */
public class ExemploThreadsConcorrencia {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao casamento!");
        Conta c = new Conta(2000);
        Economico tati = new Economico("Tati", c);
        Gastao diogo = new Gastao("Diogo", c);
        
        Thread gastao = new Thread(diogo);
        Thread economico = new Thread(tati);
        
        gastao.start();
        economico.start();
        
        try{
            gastao.join();
            economico.join();
        }catch(Exception e){
            
        }
        
        System.out.println("Saldo final: " + c.getSaldo());
        if(c.getSaldo() != 2000){
            System.out.println("Divórcio!");
        }
    }
}
