// 1. Diseñar  un  programa  que  lea  y  guarde  razas  de  perros  en  un  ArrayList  de  tipo 
// String. El programa pedirá una raza de perro en un bucle, el mismo se guardará 
// en la lista y después se le preguntará al usuario si quiere guardar otro perro o si 
// quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList. 

// 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le 
// pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
// Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará 
// la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario 
// y se mostrará la lista ordenada.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio1y2 {
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList<String>();

        Scanner leer = new Scanner(System.in);

        String salir;
        do {
            System.out.println("Poné la raza");
            razas.add(leer.nextLine());

            System.out.println("Querés salir? (s/n)");
            salir = leer.nextLine();

        } while (salir.equalsIgnoreCase("n"));

        for (String perro : razas) {
            System.out.println(perro);
        }

        System.out.println("Poné la raza que no te gusta y te la saco");
        String perroASacar = leer.nextLine();

        Iterator<String> razasIterator = razas.iterator();
        Boolean seEncontroLaRaza = false;

        while (razasIterator.hasNext()) {
            if (razasIterator.next().equals(perroASacar)) {
                razas.remove(perroASacar);
                seEncontroLaRaza = true;
            }
        }

        if (!seEncontroLaRaza) {
            System.out.println("No taba :(");

            for (String perro : razas) {
                System.out.println(perro);
            }
        }

    }
}