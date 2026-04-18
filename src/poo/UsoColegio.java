package bronsito.poo;

public class UsoColegio {

    public static void main(String[] args) {

        Colegio colegio1 = new Colegio("Paules",300);
        Colegio colegio2 = new Colegio("Cervantes", 100);

        colegio1.nuevoAlumno("Manuel",8.3);
        colegio1.nuevoAlumno("Juan",5.0);
        colegio1.nuevoAlumno("Joan",5.0);
        colegio1.getTodosAlumnos();
        colegio2.nuevoAlumno("Pepe", 3.2);
        colegio2.getAlumno("Pepe");
        colegio2.setNotaMedia("Pepe",9.9);
        colegio2.getTodosAlumnos();
        colegio1.expulsaAlumno("Juan");
        colegio1.getTodosAlumnos();
    }
}
