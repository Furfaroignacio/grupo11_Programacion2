package test;

import modelo.Parada;
import modelo.GrafoPonderado;
import java.util.*;

public class TestGrafoPonderadoMain {
    public static void main(String[] args) {
        GrafoPonderado<Parada> grafo = new GrafoPonderado<>();

        Parada pA = new Parada("P01", "Plaza Central");
        Parada pB = new Parada("P02", "Avenida Norte");
        Parada pC = new Parada("P03", "Estación Sur");
        Parada pD = new Parada("P04", "Terminal Este");

        grafo.agregarVertice(pA);
        grafo.agregarVertice(pB);
        grafo.agregarVertice(pC);
        grafo.agregarVertice(pD);

        grafo.conectar(pA, pB, 10);
        grafo.conectar(pA, pC, 15);
        grafo.conectar(pB, pD, 12);
        grafo.conectar(pC, pD, 10);

        System.out.println("=== Conexiones del Grafo ===");
        grafo.imprimirConexiones();

        // Dijkstra 
        System.out.println("\n=== Camino más corto de Plaza Central a Terminal Este ===");
        List<Parada> camino = grafo.dijkstra(pA, pD);
        for (Parada parada : camino) {
            System.out.print(parada + " -> ");
        }
        System.out.println("FIN");

        // distancia minima
        System.out.println("\n=== Distancias desde Plaza Central ===");
        Map<Parada, Integer> distancias = grafo.dijkstraDistancias(pA);
        for (Map.Entry<Parada, Integer> entry : distancias.entrySet()) {
            System.out.println("Hasta " + entry.getKey() + ": " + entry.getValue() + " minutos");
        }
    }
}
