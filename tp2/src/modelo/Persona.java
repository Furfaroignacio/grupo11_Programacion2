package modelo;

public class Persona {
    private String nombre;
    private Integer dni;

    public Persona(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }

}


	


