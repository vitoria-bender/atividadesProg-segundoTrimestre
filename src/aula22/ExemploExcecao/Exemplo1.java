package aula22.ExemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean valido;
        do{
            try {
                System.out.println("Digite um número: ");
                int n1 = ler.nextInt();
                System.out.println("Digite outro número: ");
                int n2 = ler.nextInt();
                int resposta = n1 / n2;
                System.out.println(resposta);
                valido = true;
            }
            catch(InputMismatchException a){
                System.out.println("Precisam ser números!");
                ler.next();
                valido = false;
            }
            catch(ArithmeticException b){
                System.out.println("Não é possível dividir por zero!");
                ler.next();
                valido = false;
            }
        }
        while(!valido);
    }
}
