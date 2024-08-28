package aula19;

public class pessoaTeste {
    public class Teste {
        public static void main(String[] args) {
            Pessoa pessoaUm = new Pessoa();

            pessoaUm.nome = "Jonas";
            pessoaUm.sobrenome = "Silva";
            pessoaUm.altura =  170;
            pessoaUm.corOlhos = "verdes";
            pessoaUm.dataNascimento = "15/10/2000";
            pessoaUm.andar();
            pessoaUm.correr();

            Pessoa pessoaDois = new Pessoa();
            pessoaUm.nome = "Ana";
            pessoaUm.sobrenome = "Silva";
            pessoaUm.altura =  170;
            pessoaUm.corOlhos = "azuis";
            pessoaUm.dataNascimento = "10/05/1999";
            pessoaUm.andar();
            pessoaUm.correr();

            System.out.println("A pessoa dois chama "+pessoaDois.nome+" "+pessoaDois.sobrenome);
        }
    }

}
