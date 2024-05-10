/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primosth;

/**
 *
 * @author LENOVO
 */
public class PrimosTh {
    
    
    
    public static void main(String[] args) throws InterruptedException {
        
        Master gerente = new Master(1000000);
        System.out.println("Calculo de primos!");
        Thread escravos[] = new Thread[32];
        
        for(int i=0; i<escravos.length;i++){
            escravos[i] = new Thread(new Slave(gerente));
            escravos[i].start();
        }
        for (Thread escravo : escravos) {
            escravo.join();
        }
    }
}
