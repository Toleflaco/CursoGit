package bronsito.poo;

public class Alumno {

    private String nombre;
    private Colegio colegio;
    private double notaMedia;
    private int id;
    public static int idSiguiente=1;

    public Alumno(String nombre, Colegio colegio, double notaMedia) {
        this.nombre = nombre;
        this.colegio = colegio;
        this.notaMedia = notaMedia;
        id = idSiguiente;
        idSiguiente++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreColegioAlumno() {
        return this.colegio.getNombre();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", colegio=" + this.getNombreColegioAlumno() +
                ", notaMedia=" + notaMedia +
                ", id=" + id +
                '}';
    }
}
