import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = DATA.listaDeAlumnos();
        for (Alumno cadaObjeto : alumnos) {
            System.out.println(cadaObjeto);
        }
    }
}

