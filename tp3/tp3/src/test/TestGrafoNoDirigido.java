package test;

import modelo.Grafo;
import modelo.Persona;

import java.util.List;

public class TestGrafoNoDirigido {
    public static void main(String[] args) {
        Grafo<Persona> grafo = new Grafo<>(false); 

       
        Persona p1 = new Persona(123, "Agustín");
        Persona p2 = new Persona(456, "Lucía");
        Persona p3 = new Persona(789, "Camila");

        
        grafo.agregarVertice(p1);
        grafo.agregarVertice(p2);
        grafo.agregarVertice(p3);

        
        grafo.conectar(p1, p2);
        grafo.conectar(p2, p3);

       
        System.out.println("DFS desde Agustín (No dirigido)");
        grafo.recorrerDFS(p1);

        System.out.println("BFS desde Agustín (No dirigido)");
        grafo.recorrerBFS(p1);

      
        System.out.println("\nMatriz de Adyacencia (No dirigido)");
        List<List<Integer>> matriz = grafo.matrizAdyacencia();
        for (List<Integer> fila : matriz) {
            for (Integer val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
