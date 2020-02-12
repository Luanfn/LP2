package app;


public class Main {

    public static void main(String[] args) {

        Aluno aluno;
        Professor professor;
        Disciplina disciplina;
        ColecaoGenerica colecaoGenerica = new ColecaoGenerica();
        ImprimeColecao relatorio;
        aluno = new Aluno(10, "fulano",1);

        professor = new Professor(9, "Jorge", "Matemática");

        disciplina = new Disciplina(3, "Matemática", 7, 90);

        colecaoGenerica.adicionaGenerica(aluno);
        colecaoGenerica.adicionaGenerica(professor);
        colecaoGenerica.adicionaGenerica(disciplina);

        relatorio =  new ImprimeColecao(colecaoGenerica);
        relatorio.imprimir();

    }
}
