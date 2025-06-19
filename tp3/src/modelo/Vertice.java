package modelo;

import interfaces.IVertice;
import java.util.ArrayList;
import java.util.List;

public class Vertice<T> implements IVertice<T> {
    private T dato;
    private List<IVertice<T>> adyacentes;

    public Vertice(T dato) {
        this.dato = dato;
        this.adyacentes = new ArrayList<>();
    }

    @Override
    public T getDato() {
        return dato;
    }

    @Override
    public void agregarAdyacente(IVertice<T> destino) {
        if (!adyacentes.contains(destino)) {
            adyacentes.add(destino);
        }
    }

    @Override
    public List<IVertice<T>> getAdyacentes() {
        return adyacentes;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
