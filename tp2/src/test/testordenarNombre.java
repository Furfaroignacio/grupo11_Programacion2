package test;
import interfaces.INodo;
import modelo.ArbolBinario;
import modelo.Persona;


public class testordenarNombre {
	public static void main(String[] args) {
		 
        ArbolBinario<Persona> arbolPorNombre = new ArbolBinario<>();
        arbolPorNombre.insertar("Ana", new Persona("Ana", 45123456));
        arbolPorNombre.insertar("Bruno", new Persona("Bruno", 40111222));
        arbolPorNombre.insertar("Carla", new Persona("Carla", 47889999));
        arbolPorNombre.insertar("David", new Persona("David", 39887766));
        arbolPorNombre.insertar("Elena", new Persona("Elena", 46223344));
        arbolPorNombre.insertar("Fabio", new Persona("Fabio", 42551100));
        arbolPorNombre.insertar("Gina", new Persona("Gina", 48999999));
        arbolPorNombre.insertar("Hugo", new Persona("Hugo", 37224411));
        arbolPorNombre.insertar("Ivana", new Persona("Ivana", 44445555));
        arbolPorNombre.insertar("Julián", new Persona("Julián", 41332211));
        arbolPorNombre.insertar("Karen", new Persona("Karen", 47778866));
        arbolPorNombre.insertar("Leo", new Persona("Leo", 38662233));
        arbolPorNombre.insertar("Micaela", new Persona("Micaela", 45991122));
        arbolPorNombre.insertar("Nicolás", new Persona("Nicolás", 43334444));
        arbolPorNombre.insertar("Olga", new Persona("Olga", 49887766));


        System.out.println(" Recorrido inOrden, postOrden y preOrden del árbol por NOMBRE:");
        arbolPorNombre.preOrden();
        System.out.println("--------------------------------------------------");
        arbolPorNombre.inOrden();
        System.out.println("--------------------------------------------------");
        arbolPorNombre.postOrden();

        System.out.println("--------------------------------------------------");
        System.out.println("\n Buscar nombre \"David\":");
        INodo<Persona> resultadoNombre = arbolPorNombre.buscar("David");
        if (resultadoNombre != null) {
            System.out.println("Encontrado: " + resultadoNombre.getEtiqueta());
        } else {
            System.out.println("No encontrado");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("\nEliminar nombre \"Bruno\" (nodo con un hijo o dos):");
        arbolPorNombre.eliminar("Bruno");
        arbolPorNombre.inOrden();

        System.out.println("\nEliminar nombre \"Ana\" (raíz):");
        arbolPorNombre.eliminar("Ana");
        arbolPorNombre.inOrden();

        
}
}