package interfaces;

import modelo.Vehiculo;

public interface ILista {
    void insertarPrimero(Vehiculo dato);
    
    void insertarUltimo(Vehiculo dato);
    
    Vehiculo obtenerPrimero();
    
    int cantidadElementos();
    
    boolean esVacia();
    
    void mostrarLista();
    
}
