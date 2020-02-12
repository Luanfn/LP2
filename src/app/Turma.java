package app;

/*
 * @project linguagemDeProgramacaoDois
 * @author Gabriel Honda on 11/02/2020
 */
public class Turma extends ElementoAcademico {

    private char periodo;

    public Turma(int codigo, String nome, char periodo) {
        super(codigo, nome);
        this.periodo = periodo;
    }

    public char getPeriodo() {
        return periodo;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "periodo=" + periodo +
                '}';
    }
}
