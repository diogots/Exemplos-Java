/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraimc;

/**
 *
 * @author LENOVO
 */
public class Aluno {
    //atributos da classe
    private String nome;
    private float peso;
    private float alt;

    public Aluno(String nome, float peso, float alt) {
        this.nome = nome;
        this.peso = peso;
        this.alt = alt;
    }    
    

    
    
    public float calcularIMC(){
        float imc;
        imc = this.peso/(this.alt*this.alt);
        return imc;
    }
    
        public String avaliarAluno(){
        float imc = calcularIMC();
        String aval;
        if (imc <=18.5){
            aval = "Magreza";
        }else if(imc > 18.5 && imc < 25.0){
            aval = "Peso saudável";
        }else if(imc >= 25.0 && imc < 30.0){
            aval = "Sobrepeso";
        }else if(imc >= 30.0 && imc < 35.0){
            aval = "Obesidade";
        }else if(imc >= 35.0 && imc < 40.0){
            aval = "Obesidade severa";
        }else{
            aval = "Obesidade Mórbida";
        }
        return aval;
    }

    @Override
    public String toString() {
        return "Informações do Aluno:\n"+ 
                "Nome: "+this.nome+"\n"+
                "Peso: "+this.peso+"kg\n"+
                "Altura: "+this.alt+"m\n"+
                "IMC: "+calcularIMC()+"\n"+
                "Avaliação: "+avaliarAluno()+"\n";
    }
        
        
    
}












