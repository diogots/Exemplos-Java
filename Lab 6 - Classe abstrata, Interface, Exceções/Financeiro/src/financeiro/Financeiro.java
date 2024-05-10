/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package financeiro;

import com.mycompany.aulapolmorfismo.Util.IO;
import financeiro.base.Entidade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/**
 *
 * @author LENOVO
 */
public class Financeiro {

    /**
     * @param args the command line arguments
     */
    public static void exibirMenu() {
        String menu
                = "---Controle Financeiro---\n"
                + "Escolha a opção desejada:\n"
                + "1. Cadastrar\n"
                + "2. Relatório de Faturamento\n"
                + "3. Listar entidades";
        IO.print(menu);
    }

    public static void gerarRelat(ArrayList<Entidade> entidades) {
        double despesas = 0;
        double receitas = 0;

        for (Entidade e : entidades) {

            if (e instanceof Aluno) {
                receitas += ((Aluno) e).getReceita();
            } else if (e instanceof Colaborador) {
                despesas += ((Colaborador) e).getDespesa();
            } else {
                receitas += ((Empresa) e).getReceita();
                despesas += ((Empresa) e).getDespesa();
            }

        }
        String relat
                = "Total de despesas: " + despesas + "\n"
                + "Total de receitas: " + receitas + "\n"
                + "Balanço: " + (double) (receitas - despesas) + "\n";
        IO.print(relat);

    }
    
    public static void listarEntidades(ArrayList<Entidade> entidades){
        Collections.sort(entidades);
        IO.print("Relação de entidades:");
        for (Entidade e : entidades){
            IO.print(e);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Entidade> entidades = new ArrayList<>();
        do {
            exibirMenu();
            int opc = IO.readInt("Opção:");
            switch (opc) {
                case 1:
                //cadastrar();
                case 2:
                    gerarRelat(entidades);
                case 3:
                    listarEntidades(entidades);
                case 4:
                    break;
                default:
                    IO.print("Opção inválida!");
            }

        } while (true);

    }

}
