package primerparcial;

import java.util.ArrayList;

public class Profesor extends Usuario{

    private ArrayList<String> comisiones = new ArrayList<String>();

    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);

    }

    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }

    public String imprimirComisiones(){
        return "Comisiones: " + "\n" + getComisiones();
    }
}
