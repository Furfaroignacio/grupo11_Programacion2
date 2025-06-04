package test;
import interfaces.INodo;
import modelo.ArbolBinario;
import modelo.Persona;

public class testordenarDni {
	 public static void main(String[] args) {

	        
	        ArbolBinario<Persona> arbolPorDNI = new ArbolBinario<>();
	        arbolPorDNI.insertar(45123456, new Persona("Ana", 45123456));
	        arbolPorDNI.insertar(40111222, new Persona("Bruno", 40111222));
	        arbolPorDNI.insertar(47889999, new Persona("Carla", 47889999));
	        arbolPorDNI.insertar(39887766, new Persona("David", 39887766));
	        arbolPorDNI.insertar(46223344, new Persona("Elena", 46223344));
	        arbolPorDNI.insertar(42551100, new Persona("Fabio", 42551100));
	        arbolPorDNI.insertar(48999999, new Persona("Gina", 48999999));
	        arbolPorDNI.insertar(37224411, new Persona("Hugo", 37224411));
	        arbolPorDNI.insertar(44445555, new Persona("Ivana", 44445555));
	        arbolPorDNI.insertar(41332211, new Persona("Julián", 41332211));
	        arbolPorDNI.insertar(47778866, new Persona("Karen", 47778866));
	        arbolPorDNI.insertar(38662233, new Persona("Leo", 38662233));
	        arbolPorDNI.insertar(45991122, new Persona("Micaela", 45991122));
	        arbolPorDNI.insertar(43334444, new Persona("Nicolás", 43334444));
	        arbolPorDNI.insertar(49887766, new Persona("Olga", 49887766));


	        System.out.println(" Recorrido preOrden, inOrden y postOrden del árbol por DNI:");
	        arbolPorDNI.preOrden();
	        System.out.println("--------------------------------------------------");
	        arbolPorDNI.inOrden();
	        System.out.println("--------------------------------------------------");
	        arbolPorDNI.postOrden();

	        System.out.println("--------------------------------------------------");
	        // Buscar por dni
	        System.out.println(" Buscar DNI 40111222:");
	        INodo<Persona> resultadoDNI = arbolPorDNI.buscar(40111222);
	        if (resultadoDNI != null) {
	            System.out.println("Encontrado: " + resultadoDNI.getEtiqueta());
	        } else {
	            System.out.println("No encontrado");
	        }

	        System.out.println("--------------------------------------------------");
	        // Eliminar nodo 
	        System.out.println(" Eliminar DNI 40111222 (nodo con un hijo o dos):");
	        arbolPorDNI.eliminar(40111222);
	        arbolPorDNI.inOrden();

	        System.out.println("--------------------------------------------------");
	        // Eliminar raíz
	        System.out.println(" Eliminar DNI 45123456 (raíz):");
	        arbolPorDNI.eliminar(45123456);
	        arbolPorDNI.inOrden();
	 }
}

