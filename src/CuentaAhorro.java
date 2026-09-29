public class CuentaAhorro extends   CuentaBancaria {
    private final String tipoCuenta;
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldo, double tasaInteres, String tipoCuenta) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public void calcularBeneficioMensual() {
        double beneficio = getSaldo() * tasaInteres / 100;
        System.out.println("Beneficio mensual: " + beneficio);
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tasa de interés: " + tasaInteres + "%");
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
