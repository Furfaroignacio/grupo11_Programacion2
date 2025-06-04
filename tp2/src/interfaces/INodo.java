package interfaces;


	public interface INodo<T> {
	    Comparable getEtiqueta();
	    INodo<T> getIzquierdo();
	    INodo<T> getDerecho();
	    void setIzquierdo(INodo<T> nodo);
	    void setDerecho(INodo<T> nodo);
	    boolean insertar(INodo<T> nodo);
	    INodo<T> buscar(Comparable etiqueta);
	    INodo<T> eliminar(Comparable etiqueta);
	    void inOrden(); 
	    void postOrden();
	    void preOrden();
	}


