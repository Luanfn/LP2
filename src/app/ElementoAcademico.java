package app;

/*
 * @project linguagemDeProgramacaoDois
 * @author Gabriel Honda on 11/02/2020
 */
public class ElementoAcademico implements IPossuiNome {

    private int codigo;
    private String nome;

    public ElementoAcademico(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ElementoAcademico{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
