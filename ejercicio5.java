import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ejercicio5 {
    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<>();

        paises.add("Holanda");
        paises.add("Argentina");
        paises.add("Brasil");
        paises.add("Argentina");

        System.out.println("Países desordenados");
        for (String pais : paises) {
            System.out.println(pais);
        }

        // lo paso a tree set porque hash set no tiene sort
        TreeSet<String> paisesTreeSet = new TreeSet<String>(paises);

        System.out.println("Países ordenados");
        for (String pais : paisesTreeSet) {
            System.out.println(pais);
        }

        String paisASacar = "Argentina";
        System.out.println("Lista de paises sin " + paisASacar);
        Boolean elPaisEstaba = false;
        Iterator<String> paisesIterator = paises.iterator();
        while (paisesIterator.hasNext()) {
            String paisTemporal = paisesIterator.next();
            if (paisTemporal.equalsIgnoreCase(paisASacar)) {
                paises.remove(paisTemporal);
                elPaisEstaba = true;
            }
        }
        for (String pais : paises) {
            System.out.println(pais);
        }

        if (!elPaisEstaba) {
            System.out.println("El país no está en la lista");
        }
    }
}
