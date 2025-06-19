package modelo;

import interfaces.IGrafo;
import interfaces.IVertice;

import java.util.*;

public class Grafo<T> implements IGrafo<T> {

    private Map<T, IVertice<T>> vertices = new HashMap<>();
    private boolean dirigido;

    public Grafo(boolean dirigido) {
        this.dirigido = dirigido;
    }

    @Override
    public void agregarVertice(T dato) {
        if (!vertices.containsKey(dato)) {
            vertices.put(dato, new Vertice<>(dato));
        }
    }

    @Override
    public void conectar(T origen, T destino) {
        IVertice<T> vOrigen = vertices.get(origen);
        IVertice<T> vDestino = vertices.get(destino);
        if (vOrigen != null && vDestino != null) {
            vOrigen.agregarAdyacente(vDestino);
            if (!dirigido) {
                vDestino.agregarAdyacente(vOrigen);
            }
        }
    }


    @Override
    public void recorrerDFS(T inicio) {
        Set<T> visitados = new HashSet<>();
        System.out.print("DFS: ");
        dfs(vertices.get(inicio), visitados);
        System.out.println();
    }

    private void dfs(IVertice<T> vertice, Set<T> visitados) {
        if (vertice == null || visitados.contains(vertice.getDato())) return;

        System.out.print(vertice.getDato() + " ");
        visitados.add(vertice.getDato());

        for (IVertice<T> ady : vertice.getAdyacentes()) {
            dfs(ady, visitados);
        }
    }

    @Override
    public void recorrerBFS(T inicio) {
        Set<T> visitados = new HashSet<>();
        Queue<IVertice<T>> cola = new LinkedList<>();

        IVertice<T> inicial = vertices.get(inicio);
        if (inicial == null) return;

        cola.add(inicial);
        visitados.add(inicio);

        System.out.print("BFS: ");
        while (!cola.isEmpty()) {
            IVertice<T> actual = cola.poll();
            System.out.print(actual.getDato() + " ");

            for (IVertice<T> ady : actual.getAdyacentes()) {
                if (!visitados.contains(ady.getDato())) {
                    visitados.add(ady.getDato());
                    cola.add(ady);
                }
            }
        }
        System.out.println();
    }

    @Override
    public List<List<Integer>> matrizAdyacencia() {
        List<T> listaVertices = new ArrayList<>(vertices.keySet());
        Collections.sort(listaVertices, Comparator.comparing(Object::toString)); // para orden estable

        List<List<Integer>> matriz = new ArrayList<>();

        for (T origen : listaVertices) {
            List<Integer> fila = new ArrayList<>();
            Set<T> adyacentes = new HashSet<>();
            for (IVertice<T> ady : vertices.get(origen).getAdyacentes()) {
                adyacentes.add(ady.getDato());
            }

            for (T destino : listaVertices) {
                fila.add(adyacentes.contains(destino) ? 1 : 0);
            }

            matriz.add(fila);
        }

        return matriz;
    }
}
