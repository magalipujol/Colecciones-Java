package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);  

    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    Pelicula pelicula1 = PeliculaService.crearPelicula("jeje", "peter pan", 1.0);
    Pelicula pelicula2 = PeliculaService.crearPelicula("jejox", "un tipo", 3.2);
    Pelicula pelicula3 = PeliculaService.crearPelicula("abc", "yo", 4.0);
    Pelicula pelicula4 = PeliculaService.crearPelicula("hfg", "vos", 0.5);

    peliculas.add(pelicula1);
    peliculas.add(pelicula2);
    peliculas.add(pelicula3);
    peliculas.add(pelicula4);


    // String ingresarOtraPelicula;

    // do {
    //     System.out.println("Ingrese el titulo");
    //     String titulo = leer.nextLine();
    //     System.out.println("Ingrese el director");
    //     String director = leer.nextLine();
    //     System.out.println("Ingrese la duración");
    //     Double duracion = leer.nextDouble();
    //     leer.nextLine();

    //     Pelicula pelicula = PeliculaService.crearPelicula(titulo, director, duracion);

    //     peliculas.add(pelicula);

    //     System.out.println("Desea ingresar otra película?");
    //     ingresarOtraPelicula = leer.nextLine();
    // } while (ingresarOtraPelicula.equals("s"));

    // mostrar en pantalla todas las peliculas
    System.out.println("Cartelera:");
    for (Pelicula pelicula : peliculas) {
        PeliculaService.mostrarPelicula(pelicula);
    }

    System.out.println("-------------");

    //mostrar todas las peliculas con una duración mayor a una hora
    System.out.println("Peliculas larrrrrgas (+1h)");
    Iterator<Pelicula> peliculasIterator = peliculas.iterator();
    while (peliculasIterator.hasNext()) {
        Pelicula peliculaTemporal = peliculasIterator.next();
        if(peliculaTemporal.getDuracion() >= 1) {
            PeliculaService.mostrarPelicula(peliculaTemporal);
        }
    }

    System.out.println("-------------");

    System.out.println("Peliculas de la mas cortita a la mas larguita");
    peliculas.sort(PeliculaService.comparadorDuracionAscendente);
    for (Pelicula pelicula : peliculas) {
        PeliculaService.mostrarPelicula(pelicula);
    }

    System.out.println("-------------");

    System.out.println("Peliculas de la mas larguita a la mas cortita");
    peliculas.sort(PeliculaService.comparadorDuracionDescendente);
    for (Pelicula pelicula : peliculas) {
        PeliculaService.mostrarPelicula(pelicula);
    }

    System.out.println("-------------");

    System.out.println("Pelis ordenadas alfabeticamente segun su titulo");
    peliculas.sort(PeliculaService.comparadorTituloAlfabetico);
    for (Pelicula pelicula : peliculas) {
        PeliculaService.mostrarPelicula(pelicula);
    }


    }
}