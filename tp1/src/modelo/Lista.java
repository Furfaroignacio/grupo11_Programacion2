package modelo;

import interfaces.ILista;
import interfaces.INodo;

//Saque la implementación implements ILista, OJO ustedes la mantienen
public class Lista implements ILista  {
	
    private Nodo primero;

    public Lista() {
        this.primero = null;
    }

    
    public boolean esVacia() {
        return primero == null;
    }

    
    public void insertarPrimero(Vehiculo dato) {
        Nodo nuevo = new Nodo(dato);
        if (!esVacia()) {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
        }
        primero = nuevo;
    }


    
    public void insertarUltimo(Vehiculo dato) {
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            primero = nuevo;
        } else {
            INodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual); 
        }
    }


  

   
    public Vehiculo obtenerPrimero() {
        if (esVacia()) throw new IllegalStateException("Lista vacía");
        return primero.getDato();
    }


   
    public int cantidadElementos() {
        int contador = 0;
        INodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

 
    public void mostrarLista() {
        INodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() +"\n");
            actual = actual.getSiguiente();
        }
        
    }
    
    public Vehiculo buscarPorPatente(String patente) {
        INodo actual = primero;
        while (actual != null) {
            if (actual.getDato().getPatente().equalsIgnoreCase(patente)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    
  
    
}