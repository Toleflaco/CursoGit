package bronsito.poo;

public class Vehiculos {

    private int ruedas;
    private String color;
    private int largo;
    private double ancho;
    private int peso;
    private boolean climatizador;
    private boolean gps;
    private boolean cuero;


    public Vehiculos(int ruedas) {
        this.ruedas = ruedas;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "Sin Color";
    }
    public Vehiculos(int ruedas, int largo, double ancho, int peso) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        this.color = "sin colorrr";
    }

    public void setExtra(boolean climatizador) {
        this.climatizador = climatizador;
    }
    public void setExtra(boolean climatizador, boolean gps, boolean cuero) {
        this.gps = gps;
        this.climatizador = climatizador;
        this.cuero = cuero;
    }
    public String getExtra() {
        if (climatizador && gps == false && cuero == false) return "Tu coche solo tiene climatizador";
        else if (climatizador && gps && cuero ) return "Tienes todos los extras";
        else return "Tu coche no tiene extras";
    }




    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDatosVehiculos() {
        return "Tu vehiculo tiene " + ruedas + " ruedas, tiene " + ancho + " metros de ancho y tiene " + largo +
                 " metros de largo";
    }
}
