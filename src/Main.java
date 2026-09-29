import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new ProductoAlimentico("Yogur", 120.0, 0.10));
        productos.add(new ProductoElectronico("Auriculares", 250.0, 0.12));
        productos.add(new ProductoRopa("Camisa", 180.0, 0.20));

        System.out.println("Sistema de productos");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - Precio final: Q" + producto.calcularPrecio());
        }
    }
}