package test;
import java.util.*;
import modelo.GrafoPonderado;

public class TestGrafoPonderado {
    public static void main(String[] args) {
        GrafoPonderado<String> redColectivos = new GrafoPonderado<>();

        
        redColectivos.agregarVertice("A");
        redColectivos.agregarVertice("B");
        redColectivos.agregarVertice("C");
        redColectivos.agregarVertice("D");

        redColectivos.conectar("A", "B", 5);
        redColectivos.conectar("A", "C", 10);
        redColectivos.conectar("B", "D", 7);
        redColectivos.conectar("C", "D", 2);
        
        redColectivos.imprimirConexiones();

        System.out.println("Test inicial de conexiones realizado correctamente.");
        
        System.out.println("\n=== Camino más corto de A a D ===");
        List<String> camino = redColectivos.dijkstra("A", "D");
        System.out.println(camino);

    }
}
