package ExemploHeranca;

public class Teste {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Jonas", "Silva");
        m1.setSobrenome("Souza");
        m1.setSalario(1500);
        m1.setCnh("12345");

        Engenheiro E1 = new Engenheiro("Carlos", "da Rosa");
        E1.setSalario(2300);
        E1.setCrea("123.321");
    }
}
