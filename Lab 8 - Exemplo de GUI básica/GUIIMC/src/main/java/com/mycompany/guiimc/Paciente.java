/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiimc;

/**
 *
 * @author LENOVO
 */
public class Paciente {
    
    //atributos
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
               this.nome = nome;
        }else throw new IllegalArgumentException("O campo nome não deve ser vazio!");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if ( peso > 0){
            this.peso = peso;
        } else throw new IllegalArgumentException("O peso deve ser positivo!");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if ( altura > 0){
            this.altura = altura;
        } else throw new IllegalArgumentException("A altura deve ser positiva!");
    }
    
    public double calcIMC(){
        return (peso/(altura*altura));
    }
    
    public String gerarAvaliacao(){
        double imc  = calcIMC();
        if (imc < 18.5) {
            return "Abaixo do peso ideal";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III ou mórbida";
        }
    }

    public String gerarRelatorio(){
        String msg = 
                "Relatório de avaliação IMC:\n"+
                "Nome: " + this.nome + "\n" +
                "Peso: " + this.peso + "Kg\n" +
                "Altura: " + this.altura + "m\n" +
                "IMC: " + calcIMC() + "\n" +
                "Diagnóstico: " + gerarAvaliacao() + "\n";
       return msg;
                
    }   
    
    
}
