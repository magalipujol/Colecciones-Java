public class Clase {
    public static void main(String[] args) {
        listaSimplementeEnlazada<String> lista = new listaSimplementeEnlazada<>();
        
        lista.agregarValor("Gugu puto");
        lista.agregarValor("Gugu buena onda");
        lista.agregarValor("Gugu lindo");
        lista.agregarValor("Gugu re puto");
        lista.mostrarLista();
        
    }
}
