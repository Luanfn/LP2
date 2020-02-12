package app;

/*
 * @project linguagemDeProgramacaoDois
 * @author Gabriel Honda on 11/02/2020
 */
public class Aluno extends Pessoa {

    private int semestre;

    public Aluno(int matricula, String nome, int semestre) {
        super(matricula, nome);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
