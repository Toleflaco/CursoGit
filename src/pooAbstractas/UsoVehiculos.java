package bronsito.pooAbstractas;

public class UsoVehiculos {

    public static void main(String[] args) {

        Vehiculo vehiculos[] = new Vehiculo[3];

        vehiculos[0] = new Coche(80);
        vehiculos[1] = new Coche(50);
        vehiculos[2] = new Moto(67);

        System.out.println("tu vehiculo tiene :" +vehiculos[0].plazas() + " plazas");
        System.out.println("tu vehiculo tiene :" +vehiculos[1].plazas() + " plazas");
        System.out.println("tu vehiculo tiene :" +vehiculos[2].plazas() + " plazas");

        vehiculos[0].acelerar(100);
        vehiculos[0].acelerar(12);
        vehiculos[0].frenar(67);

        vehiculos[1].acelerar(100);
        vehiculos[1].acelerar(12);
        vehiculos[1].frenar(67);

        vehiculos[2].acelerar(100);
        vehiculos[2].acelerar(12);
        vehiculos[2].frenar(67);


    }
}
