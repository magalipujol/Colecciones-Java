package ejercicio3;
import java.util.ArrayList;


public class AlumnoServicio {
    
    public static Alumno crearAlumno(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        return new Alumno(nombre, notas);
    }

    public static void mostrarAlumno(Alumno alumno) {
        System.out.println("Nombre: " +  alumno.getNombre());
        System.out.print("Notas: ");
        for (Integer nota : alumno.getNotas()) {
            System.out.print(nota + "  ");
        }
    }

    public static double calcularNotaFinal(Alumno alumno) {
        Integer suma = 0;
        for (Integer nota : alumno.getNotas()) {
            suma += nota;
        }
        return suma / 3;
    }
}

