package interfaces;

import java.util.List;

public interface IGrafo<T> {
    void agregarVertice(T dato);
    void conectar(T origen, T destino);
    void recorrerDFS(T inicio);
    void recorrerBFS(T inicio);
    List<List<Integer>> matrizAdyacencia();
}
