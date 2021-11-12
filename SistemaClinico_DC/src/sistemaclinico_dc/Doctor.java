package sistemaclinico_dc;

import java.util.ArrayList;

public class Doctor extends Persona {

    protected int regDoctor;

    protected String especialidad;

    protected ArrayList<Cita> citasPendientes;

    protected ArrayList<Receta> recetas;
    
    protected Secretaria s;

    public void recetar() {
    }

    public void agregarPlanNut() {
    }

    public void imprimirReceta() {
    }

    public void registrarSecretaria(Secretaria secretaria) {
        secretaria = s;
    }
}
