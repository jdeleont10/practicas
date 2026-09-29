public abstract class Producto {

    private String nombre;
    private double preciobase;

    public Producto(String nombre, double preciobase) {
        this.nombre = nombre;
        this.preciobase = preciobase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public abstract double calcularPrecio();
}
