package aula22.exemplofinal;

public class Teste {
    public static void main(String[] args) {
        //Acesso a uma constante
        System.out.println(Operacoes.PI);
        Operacoes op = new Operacoes(); //o atributo só existe dependente da criação de instância.
        //acessar um atributo final
        System.out.println(op.pi);
        //não é possível alterar o valor de um atributo final.
        //op.pi = 3.14;
    }
}
