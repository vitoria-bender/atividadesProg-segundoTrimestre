package ExercicioConta;

public class ContaCorrente extends Conta {
    protected float limite;

    public ContaCorrente (String titular, String senha){
        super(titular,senha);
    }
    public String verificaSaldo(){
        return String.format("Seu saldo é de R$%.2f", saldo);
    }
   /* boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    } */
}
