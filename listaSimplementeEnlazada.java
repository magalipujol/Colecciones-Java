

public class listaSimplementeEnlazada<T>{
    T valor;    
    listaSimplementeEnlazada<T> colaLista;

    public void mostrarLista() {
        System.out.println(this.valor);
        if (this.colaLista == null) {
            return;
        } else {
            this.colaLista.mostrarLista();
        }
    }

    public void agregarValor(T loQueQuieroAgregar) {
        if (this.valor == null) {
            this.valor = loQueQuieroAgregar;
        } else if (this.colaLista == null) {
            listaSimplementeEnlazada<T> cola = new listaSimplementeEnlazada<>();
            cola.valor = loQueQuieroAgregar;
            this.colaLista = cola;
        } else {
            this.colaLista.agregarValor(loQueQuieroAgregar);
        }
    }

    // TODO terminar esto
    public void agregarValorDondeYoQuiero(T loQueQuieroAgregar, Integer donde) {
        
    }
} 