package primerparcial;

public abstract class Usuario {

    private int dni;
    private String nombre;
    private String apellido;

    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

// DNI
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
//NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//APELLIDO
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

//METODO TO STRING


    @Override
    public String toString() {
        return "El Dni de " + nombre + " es " + dni;
    }
}
