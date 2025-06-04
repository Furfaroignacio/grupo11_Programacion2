package modelo;
import interfaces.IArbol;
import interfaces.INodo;



	public class ArbolBinario<T> implements IArbol<T> {
	    private INodo<T> raiz;

	    public boolean insertar(Comparable etiqueta, T dato) {
	        INodo<T> nuevo = new NodoArbol<>(etiqueta, dato);
	        if (raiz == null) {
	            raiz = nuevo;
	            return true;
	        }
	        return raiz.insertar(nuevo);
	    }

	    public INodo<T> buscar(Comparable etiqueta) {
	        if (raiz != null) {
	            return raiz.buscar(etiqueta);
	        }
	        return null;
	    }

	    public boolean eliminar(Comparable etiqueta) {
	        if (raiz != null) {
	            raiz = raiz.eliminar(etiqueta);
	            return true;
	        }
	        return false;
	    }

	    //recorridos
	    public void inOrden() {
	        if (raiz != null) {
	            raiz.inOrden();
	        } else {
	            System.out.println("Árbol vacío");
	        }
	    }

	    public void preOrden() {
	        if (raiz != null) {
	            raiz.preOrden();
	        } else {
	            System.out.println("Árbol vacío");
	        }
	    }

	    public void postOrden() {
	        if (raiz != null) {
	            raiz.postOrden();
	        } else {
	            System.out.println("Árbol vacío");
	        }
	    }

	}


