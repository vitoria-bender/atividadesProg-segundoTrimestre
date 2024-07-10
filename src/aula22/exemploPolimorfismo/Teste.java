package aula22.exemploPolimorfismo;

public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        System.out.println("Somando três números: "+op.soma(5,3, 20));
        System.out.println("somando duas strings: "+op.soma("programação", "java"));
    }
}
