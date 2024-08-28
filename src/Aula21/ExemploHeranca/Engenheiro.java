package Aula21.ExemploHeranca;

public class Engenheiro extends Funcionario {
    private String Crea;

    public Engenheiro (String nome, String sobrenome){
        super(nome, sobrenome);
    }
    public String getCrea() {
        return Crea;
    }

    public void setCrea(String crea) {
        Crea = crea;
    }
}
