package modelo;

import java.util.Objects;

public class Parada {
    private String codigo;
    private String nombre;

    public Parada(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " [" + codigo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parada)) return false;
        Parada parada = (Parada) o;
        return Objects.equals(codigo, parada.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
