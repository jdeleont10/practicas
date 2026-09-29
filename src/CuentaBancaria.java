public abstract class CuentaBancaria {
    private String titular;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + " realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad a depositar debe ser mayor que cero.");
        }

    }

    public abstract void calcularBeneficioMensual();

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
