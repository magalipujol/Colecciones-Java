package ejercicio4;

import java.util.Comparator;

public class PeliculaService {
    public static Pelicula crearPelicula(String titulo, String director, Double duracion) {
        return new Pelicula(titulo, director, duracion);
    }

    public static void mostrarPelicula(Pelicula pelicula) {
        System.out.print("Titulo: " + pelicula.getTitulo());
        System.out.print("  Director: " + pelicula.getDirector());
        System.out.println("  Titulo: " + pelicula.getDuracion());
    }

    public static Comparator <Pelicula> comparadorDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            if (peli1.getDuracion() > peli2.getDuracion()) {
                return 1;
            } else if (peli1.getDuracion() < peli2.getDuracion()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    public static Comparator <Pelicula> comparadorDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            if (peli1.getDuracion() < peli2.getDuracion()) {
                return 1;
            } else if (peli1.getDuracion() > peli2.getDuracion()) {
                return -1;
            } else {
                return 0;
            }
        }
    };
    public static Comparator <Pelicula> comparadorTituloAlfabetico = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula peli1, Pelicula peli2) {
            return peli1.getTitulo().compareTo(peli2.getTitulo());
        }
    };
    
}
