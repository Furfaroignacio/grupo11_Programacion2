package modelo;

import interfaces.IGrafoPonderado;
import java.util.*;

public class GrafoPonderado<T> implements IGrafoPonderado<T> {

    private Map<T, Map<T, Integer>> adyacencias = new HashMap<>();

    @Override
    public void agregarVertice(T dato) {
        adyacencias.putIfAbsent(dato, new HashMap<>());
    }

    @Override
    public void conectar(T origen, T destino, int peso) {
        adyacencias.get(origen).put(destino, peso);
    }

    @Override
    public List<T> dijkstra(T origen, T destino) {
        Map<T, Integer> distancias = new HashMap<>();
        Map<T, T> predecesores = new HashMap<>();
        Set<T> visitados = new HashSet<>();
        PriorityQueue<T> cola = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        for (T vertice : adyacencias.keySet()) {
            distancias.put(vertice, Integer.MAX_VALUE);
        }
        distancias.put(origen, 0);
        cola.add(origen);

        while (!cola.isEmpty()) {
            T actual = cola.poll();
            if (!visitados.add(actual)) continue;

            for (Map.Entry<T, Integer> vecino : adyacencias.get(actual).entrySet()) {
                T destinoVecino = vecino.getKey();
                int peso = vecino.getValue();

                if (distancias.get(actual) + peso < distancias.get(destinoVecino)) {
                    distancias.put(destinoVecino, distancias.get(actual) + peso);
                    predecesores.put(destinoVecino, actual);
                    cola.add(destinoVecino);
                }
            }
        }

       
        List<T> camino = new ArrayList<>();
        T paso = destino;
        while (paso != null) {
            camino.add(0, paso);
            paso = predecesores.get(paso);
        }

        if (!camino.isEmpty() && camino.get(0).equals(origen)) {
            return camino;
        } else {
            return Collections.emptyList();
        }
    }

    public Map<T, Integer> dijkstraDistancias(T origen) {
        Map<T, Integer> distancias = new HashMap<>();
        Set<T> visitados = new HashSet<>();
        PriorityQueue<T> cola = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        for (T vertice : adyacencias.keySet()) {
            distancias.put(vertice, Integer.MAX_VALUE);
        }
        distancias.put(origen, 0);
        cola.add(origen);

        while (!cola.isEmpty()) {
            T actual = cola.poll();
            if (!visitados.add(actual)) continue;

            for (Map.Entry<T, Integer> vecino : adyacencias.get(actual).entrySet()) {
                T destinoVecino = vecino.getKey();
                int peso = vecino.getValue();

                if (distancias.get(actual) + peso < distancias.get(destinoVecino)) {
                    distancias.put(destinoVecino, distancias.get(actual) + peso);
                    cola.add(destinoVecino);
                }
            }
        }
        return distancias;
    }

   
    public void imprimirConexiones() {
        for (T origen : adyacencias.keySet()) {
            Map<T, Integer> destinos = adyacencias.get(origen);
            for (Map.Entry<T, Integer> entrada : destinos.entrySet()) {
                System.out.println(origen + " -> " + entrada.getKey() + " (peso: " + entrada.getValue() + ")");
            }
        }
    }
}
