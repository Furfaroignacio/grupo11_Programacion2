package interfaces;

import java.util.List;

public interface IGrafoPonderado<T> {
    void agregarVertice(T dato);
    void conectar(T origen, T destino, int peso);
    List<T> dijkstra(T origen, T destino);
    int[][] floyd();
}
