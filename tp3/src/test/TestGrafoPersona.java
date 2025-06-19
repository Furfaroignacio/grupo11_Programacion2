package test;

import modelo.Grafo;
import modelo.Persona;

import java.util.List;

public class TestGrafoPersona {
    public static void main(String[] args) {
        System.out.println("INICIO");

    	Grafo<Persona> grafo = new Grafo<>(true);

       
        Persona p1 = new Persona(74019685, "Julian");
        Persona p2 = new Persona(23847192, "Ignacio");
        Persona p3 = new Persona(51928430, "Camila");
        Persona p4 = new Persona(86713029, "Mateo");
        Persona p5 = new Persona(39427561, "Valentina");

       
        grafo.agregarVertice(p1);
        grafo.agregarVertice(p2);
        grafo.agregarVertice(p3);
        grafo.agregarVertice(p4);
        grafo.agregarVertice(p5);

        
        grafo.conectar(p1, p2);
        grafo.conectar(p1, p3);
        grafo.conectar(p2, p4);
        grafo.conectar(p3, p4);
        grafo.conectar(p4, p5);

      
        System.out.println("=== Recorrido DFS desde Julian ===");
        grafo.recorrerDFS(p1);

        System.out.println("=== Recorrido BFS desde Julian ===");
        grafo.recorrerBFS(p1);

       
        System.out.println("\n=== Matriz de Adyacencia ===");
        List<List<Integer>> matriz = grafo.matrizAdyacencia();
        for (List<Integer> fila : matriz) {
            for (Integer val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
