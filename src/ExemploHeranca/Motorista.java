package ExemploHeranca;

public class Motorista extends Funcionario{
    //o extends expressa herança da classe motorista para funcionário.
    private String cnh;

    public Motorista (String nome, String sobrenome){
        super(nome, sobrenome);
    }
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


}
