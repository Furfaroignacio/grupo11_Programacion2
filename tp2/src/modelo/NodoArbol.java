package modelo;
import interfaces.INodo;

public class NodoArbol<T> implements INodo<T> {
    private Comparable etiqueta;
    private T dato;
    private INodo<T> izquierdo;
    private INodo<T> derecho;

    public NodoArbol(Comparable etiqueta, T dato) {
        this.etiqueta = etiqueta;
        this.dato = dato;
    }

    public Comparable getEtiqueta() {
        return etiqueta;
    }

    public INodo<T> getIzquierdo() {
        return izquierdo;
    }

    public INodo<T> getDerecho() {
        return derecho;
    }

    public void setIzquierdo(INodo<T> nodo) {
        this.izquierdo = nodo;
    }

    public void setDerecho(INodo<T> nodo) {
        this.derecho = nodo;
    }

    public boolean insertar(INodo<T> nodo) {
        if (nodo.getEtiqueta().compareTo(this.etiqueta) < 0) {
            if (this.izquierdo == null) {
                this.izquierdo = nodo;
                return true;
            } else {
                return this.izquierdo.insertar(nodo);
            }
        } else if (nodo.getEtiqueta().compareTo(this.etiqueta) > 0) {
            if (this.derecho == null) {
                this.derecho = nodo;
                return true;
            } else {
                return this.derecho.insertar(nodo);
            }
        }
        return false; 
    }

    public INodo<T> buscar(Comparable etiqueta) {
        int cmp = etiqueta.compareTo(this.etiqueta);
        if (cmp == 0) {
            return this;
        } else if (cmp < 0 && izquierdo != null) {
            return izquierdo.buscar(etiqueta);
        } else if (cmp > 0 && derecho != null) {
            return derecho.buscar(etiqueta);
        }
        return null;
    }

    public void inOrden() {
        if (izquierdo != null) izquierdo.inOrden();
        System.out.println(dato.toString());
        if (derecho != null) derecho.inOrden();
    }
    
    public void preOrden() {
    	System.out.println(dato.toString());
        if (izquierdo != null) izquierdo.preOrden();
        if (derecho != null) derecho.preOrden();
    }
    
    public void postOrden() {
        if (izquierdo != null) izquierdo.postOrden();
        if (derecho != null) derecho.postOrden();
        System.out.println(dato.toString());
    }

	@Override
	public INodo<T> eliminar(Comparable etiqueta) {

		    int cmp = etiqueta.compareTo(this.etiqueta);

		    if (cmp < 0 && izquierdo != null) {
		        izquierdo = izquierdo.eliminar(etiqueta);
		    } else if (cmp > 0 && derecho != null) {
		        derecho = derecho.eliminar(etiqueta);
		    } else if (cmp == 0) {
		        // Caso 1: Sin hijos
		        if (izquierdo == null && derecho == null) {
		            return null;
		        }

		        // Ceaso 2
		        if (izquierdo == null) return derecho;
		        if (derecho == null) return izquierdo;

		        // Caso 3
		        INodo<T> sucesor = derecho;
		        while (sucesor.getIzquierdo() != null) {
		            sucesor = sucesor.getIzquierdo();
		        }

		        // Reemplazar
		        this.etiqueta = sucesor.getEtiqueta();
		        this.dato = ((NodoArbol<T>) sucesor).dato;

		        // eliminar sucesor duplicado del subárbol derecho
		        derecho = derecho.eliminar(sucesor.getEtiqueta());
		    }

		    return this;
	}
}



