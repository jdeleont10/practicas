public class ProductoElectronico extends Producto{
    private double descuento;

    public ProductoElectronico(String nombre, double preciobase, double descuento) {
        super(nombre, preciobase);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return getPreciobase() * 1.12;
    }
}
