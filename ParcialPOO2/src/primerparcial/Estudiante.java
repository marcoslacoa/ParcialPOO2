package primerparcial;

import java.util.ArrayList;

public class Estudiante extends Usuario{

    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasInscriptas = new ArrayList<String>();

// constructor

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }
// getter and setter

//carrera

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

//materias aprobadas

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    // materias inscriptas

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    //Métodos

    public String imprimirMateriasAprobadas(){
        return "Materias aprobadas: " + "\n" + getMateriasAprobadas();
    }

    public String imprimirMateriasInscriptas(){
        return "Materias inscriptas: " + "\n" + getMateriasInscriptas();
    }


}
