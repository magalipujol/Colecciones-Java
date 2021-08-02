import java.util.HashMap;

public class ServiceHashMap {
    public static void agregarProducto(HashMap<String, Integer> productos, String nombre, Integer precio) {
        productos.put(nombre, precio);
    }
}
