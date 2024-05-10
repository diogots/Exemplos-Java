/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primosth;

/**
 *
 * @author LENOVO
 */
public class Slave implements Runnable{
    
    private Master mestre;

    public Slave(Master mestre) {
        this.mestre = mestre;
    }
    
    private boolean ehPrimo(int num){
        
        for(int i=2; i<num/2; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
        
    }
    
    
    @Override
    public void run() {
        int num;
        while((num = mestre.proximo())!=0){
           boolean v = ehPrimo(num);
                            
        }
    }
    
    
}
