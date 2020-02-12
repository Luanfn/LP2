package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class ColecaoGenerica implements IColecaoGenerica {

    ArrayList<IPossuiNome> listaGenerica;

    public ColecaoGenerica() {
        listaGenerica = new ArrayList<>();
    }

    public void adicionaGenerica (IPossuiNome generica) {
        listaGenerica.add(generica);
    }

    public Iterator getIterator() {
        return listaGenerica.iterator();
    }

    public void ordena() {
        Collections.sort(listaGenerica, new ComparaNome());
    }

}
