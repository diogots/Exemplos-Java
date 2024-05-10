/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primosth;

/**
 *
 * @author LENOVO
 */
public class Master {
    
    private int num;
    private int max;

    public Master(int max) {
        this.num = 1;
        this.max = max;
    }
    
    public int proximo(){
        if(num>max)
            return 0;
        else {
            num += 2;
            return num;
        }
    }
}
