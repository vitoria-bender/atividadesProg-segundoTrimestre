package ExemploEncapsulamento;

public class Banco {
    public static void main(String[] args) {
        conta c1 = new conta("jonas", "123456");
        System.out.println("identificador "+c1.getIdentificador());
        c1.depositar(100);
        if(c1.sacar(20)){
            System.out.println("saque realizado");
        }
        else{
            System.out.println("saldo insuficiente");
        }
        System.out.println(c1.verificaSaldo());
    }
}
