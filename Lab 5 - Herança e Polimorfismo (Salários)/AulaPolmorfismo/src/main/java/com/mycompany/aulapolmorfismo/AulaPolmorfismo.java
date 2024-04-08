/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulapolmorfismo;

import com.mycompany.aulapolmorfismo.Util.IO;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class AulaPolmorfismo {

    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();
        
        Empregado a1 = new Assalariado("Fulano", "57845656", 1100.0); //upcasting
        Empregado a2 = new Assalariado("Beltrano", "57845658", 1000.0);
        Empregado h1 = new Horista("Ciclano", "34832923489", 50, 80);
        Empregado h2 = new Horista("Ditano", "348329345689", 60, 80);
        Empregado tp1 = new TempoParcial("Mutano", "234567890", 500, 45, 75);
        Empregado tp2 = new TempoParcial("Nulano", "234598790", 500, 90, 75);
        empregados.add(a1);
        empregados.add(a2);
        empregados.add(h1);
        empregados.add(h2);
        empregados.add(tp1);
        empregados.add(tp2);
        
        for(Empregado e : empregados){
            if( e instanceof Horista){
                Horista h = (Horista) e; //downcasting
                h.atualizarQtdHoras(IO.readDouble("nova qtd de horas:"));
                h.pagarSalario();
            }else if ( e instanceof TempoParcial){
                TempoParcial tp = (TempoParcial) e; //downcasting
                tp.atualizarQtdHoras(IO.readDouble("nova qtd de horas:"));
                tp.pagarSalario();
            } else e.pagarSalario();
            IO.print(e);
        }
    }
}
