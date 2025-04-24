package test;

import modelo.Persona;
import modelo.Vehiculo;

public class TestPersonaVehiculos {
    public static void main(String[] args) {
        Persona persona = new Persona(12345678, "Bautista");
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla");
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "Honda Civic");

        persona.getListaVehiculos().insertarUltimo(vehiculo1);
        persona.getListaVehiculos().insertarUltimo(vehiculo2);

        System.out.println("Información de la persona:");
        persona.mostrarPersona();
    }
}