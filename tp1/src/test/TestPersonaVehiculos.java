<<<<<<< HEAD
package test;

import modelo.Lista;
import modelo.Vehiculo;
import modelo.Persona;

public class TestPersonaVehiculos {

    public static void main(String[] args) {
        // Test Lista
        Lista lista = new Lista();

        // Test esVacia
        if (!lista.esVacia()) {
            System.err.println("Error: La lista debería estar vacía al inicio");
        }

        // Test insertarPrimero
        Vehiculo vehiculo1 = new Vehiculo("ZBC993", "Modelo1");
        lista.insertarPrimero(vehiculo1);
        if (lista.esVacia()) {
            System.err.println("Error: La lista no debería estar vacía después de insertar un elemento");
        }
        if (!lista.obtenerPrimero().equals(vehiculo1)) {
            System.err.println("Error: El primer elemento debería ser el vehículo insertado");
        }

        // Test insertarUltimo
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Modelo2");
        lista.insertarUltimo(vehiculo2);
        if (lista.cantidadElementos() != 2) {
            System.err.println("Error: La lista debería tener 2 elementos");
        }
       
        // Test mostrarLista
        System.out.println("Mostrando lista:");
        lista.mostrarLista();

        // Test ordenarPorPatente
        Vehiculo vehiculo3 = new Vehiculo("DEF456", "Modelo3");
        lista.insertarUltimo(vehiculo3);
        lista.ordenarPorPatente();
        System.out.println("Mostrando lista ordenada por patente:");
        lista.mostrarLista();

        // Test Persona
        Persona persona = new Persona(12345678, "Juan Perez");
        persona.getListaVehiculos().insertarPrimero(vehiculo1);
        persona.getListaVehiculos().insertarUltimo(vehiculo2);
        persona.getListaVehiculos().insertarUltimo(vehiculo3);
        
        System.out.println("Mostrando persona y sus vehículos:");
        persona.mostrarPersona();

       

        System.out.println("Todos los tests pasaron correctamente.");
    }
}

=======
package test;

import modelo.Persona;
import modelo.Vehiculo;

public class TestPersonaVehiculos {
    public static void main(String[] args) {
        Persona persona = new Persona(12345678, "Bautista");
        Vehiculo vehiculo1 = new Vehiculo("XYZ789", "Toyota Corolla");
        Vehiculo vehiculo2 = new Vehiculo("ABC123", "Honda Civic");

        persona.getListaVehiculos().insertarUltimo(vehiculo1);
        persona.getListaVehiculos().insertarUltimo(vehiculo2);

        System.out.println("Información de la persona:");
        persona.mostrarPersona();

        System.out.println("\nBuscando patente 'ABC123':");
        Vehiculo encontrado = persona.getListaVehiculos().buscarPorPatente("ABC123");
        if (encontrado != null) {
            System.out.println("Vehículo encontrado: " + encontrado);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
}
>>>>>>> 195b788c2f2bdb1042b225a80d5361007e2dfad1
