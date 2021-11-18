package primerparcial;

public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor(100, "John" , "Doe");
        Estudiante estudiante = new Estudiante(44254952, "Marcos" , "Lacoa", "Analista");

        estudiante.getMateriasAprobadas().add("3");
        estudiante.getMateriasInscriptas().add("2");

        System.out.println(profesor);
        System.out.println(estudiante);

        System.out.println(estudiante.imprimirMateriasAprobadas());
        System.out.println(estudiante.imprimirMateriasInscriptas());



    }

}
