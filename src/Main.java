import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {
        List<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorro("Juan Pérez", 1000.0, 1.5, "Ahorro"));
        cuentas.add(new CuentaCorriente("María López", 500.0, 10.0, "Corriente"));
        cuentas.add(new CuentaPlazoFijo("Carlos García", 2000.0, "Plazo Fijo", 2.0, 12));

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarInformacion();
            cuenta.calcularBeneficioMensual();

            System.out.println();
        }
    }

}