import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// Se  necesita  una  aplicación  para  una  tienda  en  la  cual  queremos  almacenar  los 
// distintos productos que venderemos y el precio que tendrán. Además, se necesita 
// que la aplicación cuente con las funciones básicas.  
// Estas  las  realizaremos  en  el  main.  Como,  introducir  un  elemento,  modificar  su 
// precio, eliminar un producto y mostrar los productos que tenemos con su precio 
// (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor 
// el precio. Realizar un menú para lograr todas las acciones previamente 
// mencionadas. 

public class ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, Integer> productos = new HashMap<>();

        Scanner leer = new Scanner(System.in);
        Integer opcionMenu;
        do {
            System.out.println("1. Añadir un producto \n2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto \n4. Mostrar todos los productos \n5. Salir");
            opcionMenu = leer.nextInt();
            leer.nextLine();
            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese el nombre y el precio");
                    ServiceHashMap.agregarProducto(productos, leer.nextLine(), leer.nextInt());
                    break;
                case 2: 
                    System.out.println("Ingrese el producto y el precio nuevo");
                    productos.replace(leer.nextLine(), leer.nextInt());
                    break;
                case 3:
                    System.out.println("Ingrese el producto que desea remover");
                    productos.remove(leer.nextLine());
                    break;
                case 4: 
                    for (Map.Entry<String, Integer> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Integer value = aux.getValue();
                        System.out.println(key + ": $" + value);
                    }
                    break;
                default:
                    break;
            }
            System.out.println("-------------");
        } while(opcionMenu != 5);
        System.out.println("-------------\nTODOS LOS PRODUCTOS");
        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println(key + ": $" + value);
        }

    }
}
