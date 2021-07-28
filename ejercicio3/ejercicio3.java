package ejercicio3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Crear una clase llamada Alumno que mantenga información sobre las notas de 
// distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista 
// de tipo Integer con sus 3 notas.  
// En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la 
// información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
// pregunta al usuario si quiere crear otro Alumno o no. 
// Despues de ese bluce tendremos el siguiente método en la clase Alumno: 
// Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular 
// su nota final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al 
// método. Dentro del método se usará la lista notas para calcular el promedio final 
// de alumno. Siendo este promedio final, devuelto por el método y mostrado en el 
// main. 

public class ejercicio3 {
    public static void main(String[] args) {
        
        // AlumnoServicio.mostrarAlumno(alumno);
        
        Scanner leer = new Scanner(System.in);
        
        // acá agrego a cada alumno creado
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        String ingresarOtroAlumno = "s";
        do {
            System.out.println("Ingrese el nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese 3 notas");
            Integer nota1 = leer.nextInt();
            Integer nota2 = leer.nextInt();
            Integer nota3 = leer.nextInt();
            leer.nextLine();
            
            Alumno alumno = AlumnoServicio.crearAlumno(nombre, nota1, nota2, nota3);

            alumnos.add(alumno);

            System.out.println("Desea ingresar otro alumno?");
            ingresarOtroAlumno = leer.nextLine();
        } while(ingresarOtroAlumno.equalsIgnoreCase("s"));

        System.out.println("Ingrese el nombre para conocer su nota final");
        String nombreAlumnoParaNotaFinal = leer.nextLine();
        // if (alumnos.contains(nombreAlumnoParaNotaFinal)) {
            
        // }

        Iterator<Alumno> alumnosIterator = alumnos.iterator();
        Boolean elAlumnoExiste = false;

        while (alumnosIterator.hasNext()) {
            Alumno alumnoTemporal = alumnosIterator.next();
            if (alumnoTemporal.getNombre().equals(nombreAlumnoParaNotaFinal)) {
                System.out.print("La nota final de " + nombreAlumnoParaNotaFinal + " es:");
                System.out.println(AlumnoServicio.calcularNotaFinal(alumnoTemporal)); 
                elAlumnoExiste = true;
            }
        }

        if (!elAlumnoExiste) {
            System.out.println("El alumno no existe");
        }
    }
}
