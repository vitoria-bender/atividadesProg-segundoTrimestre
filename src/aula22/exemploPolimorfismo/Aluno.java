package aula22.exemploPolimorfismo;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

        public String obterDados(){
            return "nome: "+getNome()+" "+getSobrenome()+"Matrícula: "+matricula;
        }
}
