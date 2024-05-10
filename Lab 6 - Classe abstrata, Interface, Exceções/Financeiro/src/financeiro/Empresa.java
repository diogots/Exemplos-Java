/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financeiro;

import com.mycompany.aulapolmorfismo.Util.IO;
import financeiro.base.Entidade;

import financeiro.base.LerConsole;
import financeiro.base.Receita;
import financeiro.base.Despesa;

/**
 *
 * @author LENOVO
 */
public class Empresa extends Entidade implements LerConsole, Receita, Despesa {

    private String cnpj;
    private double entrada;
    private double saida;

    public Empresa() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.isEmpty()) {
            throw new IllegalArgumentException("CNPJ não pode ser vazio!");
        }
        this.cnpj = cnpj;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        if (entrada <= 0) {
            throw new IllegalArgumentException("Entrada deve ser maior que zero!");
        }
        this.entrada = entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        if (saida <= 0) {
            throw new IllegalArgumentException("Saída deve ser maior que zero!");
        }
        this.saida = saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    @Override
    public void lerDados() {
        IO.print("Lendo dados da empresa:");

        while (true) {
            try {
                this.setNome(IO.readString("Nome:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }

        while (true) {
            try {
                this.setCnpj(IO.readString("CNPJ:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }

        while (true) {
            try {
                this.setEntrada(IO.readDouble("Entrada:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }

        while (true) {
            try {
                this.setSaida(IO.readDouble("Saída:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }
    }

    @Override
    public double getReceita() {
        return entrada;
    }

    @Override
    public double getDespesa() {
        return saida;
    }
}
