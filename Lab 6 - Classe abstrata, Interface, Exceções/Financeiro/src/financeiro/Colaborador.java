/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package financeiro;

import com.mycompany.aulapolmorfismo.Util.IO;
import financeiro.base.Despesa;
import financeiro.base.LerConsole;
import financeiro.base.Pessoa;

/**
 *
 * @author LENOVO
 */
public class Colaborador extends Pessoa implements LerConsole, Despesa {

    private String funcional;
    private double salario;

    public Colaborador() {
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        if (funcional.isEmpty()) {
            throw new IllegalArgumentException("Funcional não pode ser vazio!");
        }
        this.funcional = funcional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero!");
        }
        this.salario = salario;
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
        return funcional;
    }

    @Override
    public void lerDados() {
        IO.print("Lendo dados do colaborador:");

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
                this.setFuncional(IO.readString("Funcional:"));
                break;
            } catch (IllegalArgumentException e) {
                IO.print(e.getMessage());
            }
        }

        while (true) {
            try {
                this.setSalario(IO.readDouble("Salário:"));
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
    }

    @Override
    public double getDespesa() {
        return salario;
    }
}
