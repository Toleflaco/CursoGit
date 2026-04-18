package bronsito.poo;

public class Ejercicio1POO {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Manuel", 4500.44);
        CuentaCorriente cuenta2 = new CuentaCorriente("Carlos", 250.44);

        System.out.println("LAS CUENTAS SON");
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());

        //cuenta2.transferencia(cuenta1, 200);

        cuenta1.ingresoCuenta(300);
        cuenta1.reintegroCuenta(1000);
        System.out.println(cuenta1.getSaldo());
        CuentaCorriente.transferencia(cuenta1,cuenta2,3000);
        System.out.println(cuenta1.getDatosCuenta());
        System.out.println(cuenta2.getDatosCuenta());

    }


}
