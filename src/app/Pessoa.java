package app;

/*
 * @project linguagemDeProgramacaoDois
 * @author Gabriel Honda on 11/02/2020
 */
public class Pessoa implements IPossuiNome {

    private int matricula;
    private String nome;

    public Pessoa() {}

    public Pessoa(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
