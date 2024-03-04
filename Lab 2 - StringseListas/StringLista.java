package stringlista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class StringLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //criar lista de palavras vazia
        ArrayList<String> palavras;
        palavras = new ArrayList<>();

        //criar o scanner pra preencher lista
        Scanner ler = new Scanner(System.in);

        //ler até o usuário pedir para parar
        String opc = "s";

        do {
            System.out.println("Digite uma palavra que deseja ler:");
            String plv = ler.nextLine();
            palavras.add(plv);
            System.out.println("Deseja ler mais uma palavra? 's' ou 'n':");
            opc = ler.nextLine();
            opc = opc.toLowerCase();
        } while (opc.equals("s"));

        //ler qual letra inicia a palavra
        String letra = "";
        String AZ = "qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLÇZXCVBNM";
        do {
            System.out.println("Digite a letra inicial que deseja filtrar palavras:");
            letra = ler.nextLine();
        } while (letra.length() > 1 || !AZ.contains(letra));

        System.out.println("Buscando palavras iniciadas por " + letra + ":");
        for (String item : palavras) {
            if (item.startsWith(letra)) {
                System.out.println(item);
            }
        }

    }

}
