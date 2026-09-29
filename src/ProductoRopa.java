public class ProductoRopa extends Producto {
    private double descuento;

    public ProductoRopa(String nombre, double preciobase, double descuento) {
        super(nombre, preciobase);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return getPreciobase() * 1.10;
    }
}
