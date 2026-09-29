public class CuentaCorriente extends CuentaBancaria {
    private double cuotaMantenimiento;
    private final String tipoCuenta;


    public CuentaCorriente(String titular, double saldo, double cuotaMantenimiento, String tipoCuenta) {
        super(titular, saldo);
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public void calcularBeneficioMensual() {
        double beneficio = getSaldo() - cuotaMantenimiento;
        System.out.println("Cuota mensual: " + beneficio);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cuota de mantenimiento: " + cuotaMantenimiento);
    }
}
