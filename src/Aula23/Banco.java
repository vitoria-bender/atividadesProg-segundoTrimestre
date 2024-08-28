package Aula23;

import java.io.File;
import java.util.Scanner;
public class Banco {

    private static File arquivo = new File("C:\\Users\\vitor\\OneDrive\\area\\prog");

        public static Conta cadastraConta(){
            System.out.println("Cadastro de conta");
            System.out.print("Qual o titular: ");
            String titular = new Scanner(System.in).next();
            System.out.print("Qual a nova senha: ");
            String senha = new Scanner(System.in).next();
            System.out.print("Qual o deposito inicial: ");
            float valor = new Scanner(System.in).nextFloat();
            return new Conta(titular, senha, valor);
        }

        public static Conta acessaConta(Conta c1){
            System.out.println("Acessando a conta "+c1.identificador);
            char opc;
            do{
                System.out.println("Selecione uma opção");
                System.out.println("d - depositar");
                System.out.println("s - sacar");
                System.out.println("v - verificar saldo");
                System.out.println("e - sair");
                opc = new Scanner(System.in).next().toLowerCase().charAt(0);
                switch (opc){
                    case 'd'->{
                        System.out.print("Qual valor deseja depositar: ");
                        float valor = new Scanner(System.in).nextFloat();
                        c1.depositar(valor);
                        System.out.println("Deposito realizado!");
                    }
                    case 's'->{
                        System.out.println("Qual valor deseja sacar: ");
                        float valor = new Scanner(System.in).nextFloat();
                        if(c1.sacar(valor))
                            System.out.println("Saque realizado!");
                        else
                            System.out.println("Saldo insuficiente");
                    }
                    case 'v'-> System.out.println(c1.verificaSaldo());
                }
            }
            while(opc!='e');
            return c1;
        }

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            Conta[] lista = new Conta[10];
            int cont = 0;
            char opc;
            do{
                System.out.println("c - cadastrar uma nova conta");
                System.out.println("a - acessar uma conta");
                System.out.println("l - listar as contas");
                System.out.println("e - sair");
                opc = ler.next().toLowerCase().charAt(0);
                switch (opc){
                    case 'c'->{
                        lista[cont] = cadastraConta();
                        System.out.println("Conta cadastrado obteve o identificador "+lista[cont].identificador);
                        cont++;
                    }
                    case 'a'->{
                        System.out.print("Digite o identificador: ");
                        String id = ler.next();
                        System.out.print("Digite a senha: ");
                        String senha = ler.next();
                        int posicao = -1;
                        for(int i=0;i<cont;i++){
                            if(lista[i].identificador.equals(id) && lista[i].senha.equals(senha))
                                posicao = i;
                        }
                        if(posicao>=0){
                            lista[posicao] = acessaConta(lista[posicao]);
                        }
                        else
                            System.out.println("Dados de acesso inválidos!");
                    }
                    case 'l'->{
                        System.out.println("Listagem de contas...");
                        for(int i=0;i<cont;i++){
                            System.out.println("Titular: "+lista[i].titular);
                            System.out.println("Identificador: "+lista[i].identificador);
                            System.out.println("------");
                        }
                    }
                }
            }
            while(opc!='e');
        }
    }