package modelo;

import interfaces.ILista;
import interfaces.INodo;


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
<<<<<<< HEAD
    public void ordenarPorPatente() {
        if (esVacia() || primero.getSiguiente() == null) {
            return; 
        }

        boolean ordenado;
        do {
            ordenado = true;
            INodo actual = primero;
            while (actual.getSiguiente() != null) {
                if (actual.getDato().getPatente().compareTo(actual.getSiguiente().getDato().getPatente()) > 0) {
                    Vehiculo temp = actual.getDato();
                    actual.setDato(actual.getSiguiente().getDato());
                    actual.getSiguiente().setDato(temp);
                    ordenado = false;
                }
                actual = actual.getSiguiente();
            }
        } while (!ordenado); 
    }


}
=======
    
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
>>>>>>> 195b788c2f2bdb1042b225a80d5361007e2dfad1
