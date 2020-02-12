package app;

/*
 * @project linguagemDeProgramacaoDois
 * @author Gabriel Honda on 11/02/2020
 */
public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(int matricula, String nome, String cargo) {
        super(matricula, nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
