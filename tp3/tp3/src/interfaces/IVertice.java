package interfaces;

import java.util.List;

public interface IVertice<T> {
    T getDato();
    void agregarAdyacente(IVertice<T> destino);
    List<IVertice<T>> getAdyacentes();
}
