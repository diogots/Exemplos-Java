/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financeiro;

import com.mycompany.aulapolmorfismo.Util.IO;
import financeiro.base.LerConsole;
import financeiro.base.Pessoa;
import financeiro.base.Receita;


/**
 *
 * @author LENOVO
 */
public class Aluno extends Pessoa implements LerConsole, Receita {

    private String ra;
    private double mensalidade;

    public Aluno() {
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        if (ra.isEmpty()) {
            throw new IllegalArgumentException("RA não pode ser vazio!");
        }
        this.ra = ra;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        if (mensalidade <= 0) {
            throw new IllegalArgumentException("Mensalidade deve ser maior que zero!");
        }
        this.mensalidade = mensalidade;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        if (cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser vazio!");
        }
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Não se pode inserir um nome vazio!");
        }
    }

    @Override
    public String getDoc() {
        return this.ra;
    }

    @Override
    public void lerDados() {
        IO.print("Lendo dados do aluno:");

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
                this.setRa(IO.readString("RA:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }

        while (true) {
            try {
                this.setCpf(IO.readString("CPF:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }

        while (true) {
            try {
                this.setMensalidade(IO.readDouble("Mensalidade:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }
    }

    @Override
    public double getReceita() {
        return this.mensalidade;
    }
}