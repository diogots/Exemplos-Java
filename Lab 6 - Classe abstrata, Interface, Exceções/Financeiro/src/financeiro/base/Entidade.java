/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financeiro.base;

/**
 *
 * @author LENOVO
 */
public abstract class Entidade implements Comparable<Entidade> {
    
    protected String nome;

    @Override
    public int compareTo(Entidade o){
        return this.nome.compareTo(o.nome);
    }
    
    
    
    
}
