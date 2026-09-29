public class CuentaPlazoFijo extends CuentaBancaria {
    private final String tipoCuenta;
    private double tasaInteres;
    private int plazoMeses;

    public CuentaPlazoFijo(String titular, double saldo, String tipoCuenta, double tasaInteres, int plazoMeses) {
        super(titular, saldo);
        this.tipoCuenta = tipoCuenta;
        this.tasaInteres = tasaInteres;
        this.plazoMeses = plazoMeses;
    }

    @Override
    public void calcularBeneficioMensual() {
        double beneficio = getSaldo() * tasaInteres / 100 * plazoMeses / 12;
        System.out.println("Beneficio mensual: " + beneficio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tasa de interés: " + tasaInteres + "%");
        System.out.println("Plazo en meses: " + plazoMeses);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
