package bronsito.pooAbstractas;

public interface Vehiculo {

    int VELOCIDAD_MAXIMA = 120;

    int plazas();
    void acelerar(int velocidad);
    void frenar(int velocidad);
}
