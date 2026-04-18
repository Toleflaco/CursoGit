package bronsito.poo;

public class Colegio {

    private String nombre;
    private int numAlumnos;
    private Alumno alumnos[];
    private int posicionArray = 0;


    public Colegio(String nombre, int numAlumnos) {
        this.nombre = nombre;
        this.numAlumnos = numAlumnos;
        alumnos = new Alumno[numAlumnos];

    }

    public void nuevoAlumno(String nombre, double notaMedia)  {
        Alumno nuevoAlumno = new Alumno(nombre,this,notaMedia);
        alumnos[posicionArray] = nuevoAlumno;
        posicionArray++;

    }

    public String getNombre() {
        return nombre;
    }
    private Alumno getAlumno(int num) {
        return alumnos[num];
    }

    public void getTodosAlumnos () {


        for (int i=0; i<alumnos.length; i++){
            if (this.getAlumno(i)!=null) {
                System.out.println(this.getAlumno(i));
                System.out.println();
            }
        }
    }

    public void getAlumno (String nombre) {


        for (int i = 0; i < alumnos.length; i++) {

            if (this.getAlumno(i)!= null) {
                if(alumnos[i].getNombreColegioAlumno().equals(nombre)) {
                    System.out.println(this.getAlumno(i));
                    System.out.println();
                }
            }
        }
    }
    public void setNotaMedia(String nombreAlumno, double nuevaNota) {
        for(int i =0; i< alumnos.length;i++){
            if (this.getAlumno(i)!= null) {
                if (alumnos[i].getNombre().equals(nombreAlumno)) {
                    alumnos[i].setNotaMedia(nuevaNota);
                }
            }
        }
    }

    public void expulsaAlumno (String nombreAlumno) {
        for(int i =0; i< alumnos.length;i++){
            if (this.getAlumno(i)!= null) {
                if (alumnos[i].getNombre().equals(nombreAlumno)) {
                    alumnos[i] = null;
                }
            }
        }
    }
}
