package ExemploEncapsulamento;

import java.util.Random;

public class conta {
    private String titular;
    private String identificador;
    private String senha;
    float saldo;

    conta(String titular, String senha){
        this.titular = titular;
        this.senha = senha;
        geraIdentificador();
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular (String titular){
        this.titular=titular;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getIdentificador(){
        return identificador;
    }

    private void geraIdentificador() {
        Random aleatorio = new Random();
        String Identificador = "";
        for (int i = 0; i < 4; i++) {
            identificador += (char) aleatorio.nextInt(65, 90);
        }
        identificador += aleatorio.nextInt(1000, 2000);
        this.identificador = identificador;
    }

    void depositar(float valor) {
        saldo += valor;
    }

    boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return String.format("Seu saldo é de R$%.2f", saldo);
    }

    boolean validaAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }


}
