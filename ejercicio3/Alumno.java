package ejercicio3;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;


    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.notas = notas;
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" +
            " notas='" + getNotas() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }


}
