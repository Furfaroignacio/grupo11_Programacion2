package test;

import interfaces.INodo;
import modelo.ArbolBinario;
import modelo.Persona;

public class TestArbol {
    public static void main(String[] args) {

        ArbolBinario<Persona> arbol = new ArbolBinario<>();

        arbol.insertar(45123456, new Persona("Ana", 45123456));
        arbol.insertar(40111222, new Persona("Bruno", 40111222));
        arbol.insertar(47889999, new Persona("Carla", 47889999));
        arbol.insertar(39887766, new Persona("David", 39887766));
        arbol.insertar(46223344, new Persona("Elena", 46223344));
        arbol.insertar(42551100, new Persona("Fabio", 42551100));
        arbol.insertar(48999999, new Persona("Gina", 48999999));
        arbol.insertar(37224411, new Persona("Hugo", 37224411));
        arbol.insertar(44445555, new Persona("Ivana", 44445555));
        arbol.insertar(41332211, new Persona("Julián", 41332211));
        arbol.insertar(47778866, new Persona("Karen", 47778866));
        arbol.insertar(38662233, new Persona("Leo", 38662233));
        arbol.insertar(45991122, new Persona("Micaela", 45991122));
        arbol.insertar(43334444, new Persona("Nicolás", 43334444));
        arbol.insertar(49887766, new Persona("Olga", 49887766));

        

        System.out.println(" Recorrido inOrden del árbol:");
        arbol.inOrden();

        System.out.println("\n Recorrido preOrden del árbol:");
        arbol.preOrden();

        System.out.println("\n Recorrido postOrden del árbol:");
        arbol.postOrden();

    }
}


