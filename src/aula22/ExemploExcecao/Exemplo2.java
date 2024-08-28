package aula22.ExemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean valido;
        do{
            try {
                System.out.println("Digite um número: ");
                int n1 = ler.nextInt();
                valido = true;
            }
            catch(InputMismatchException a){
                System.out.println("Precisam ser números!");
                ler.next();
                valido = false;
            }
        }
        while(!valido);
    }
}
