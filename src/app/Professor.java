package app;

/*
 * @project linguagemDeProgramacaoDois
 * @author Gabriel Honda on 11/02/2020
 */
public class Professor extends Pessoa {

    private String especialidade;

    public Professor(int matricula, String nome, String especialidade) {
        super(matricula, nome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }
}
