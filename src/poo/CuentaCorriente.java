package bronsito.poo;

import java.util.Random;

class CuentaCorriente {

    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    // Constructor
    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random rnd = new Random();
        numeroCuenta = Math.abs(rnd.nextLong());

    }

    //Métodos

    public String getDatosCuenta() {
        return "La cuenta número " + numeroCuenta + " está a nombre de " + nombreTitular + " y tiene de saldo: " + saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresoCuenta(double saldo) {
        this.saldo += saldo;
    }
    public double reintegroCuenta(double saldo) {
        return (this.saldo -= saldo);
    }
//
//    public void transferencia (CuentaCorriente cuentaDestino, double saldo) {
//        this.saldo = this.saldo - saldo;
//        cuentaDestino.saldo += saldo;
//    }

    public static void transferencia (CuentaCorriente cuentaOrigen, CuentaCorriente cuentaDestino, double saldo) {
        cuentaOrigen.saldo -= saldo;
        cuentaDestino.saldo += saldo;
    }
}
