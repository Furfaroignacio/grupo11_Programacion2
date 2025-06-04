package interfaces;
import interfaces.INodo;

	public interface IArbol<T> {
	    boolean insertar(Comparable etiqueta, T dato);
	    INodo<T> buscar(Comparable etiqueta);
	    void inOrden();
	}


