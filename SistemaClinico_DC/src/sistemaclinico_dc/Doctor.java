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

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Cita> getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
        this.citasPendientes = citasPendientes;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public Secretaria getS() {
        return s;
    }

    public void setS(Secretaria s) {
        this.s = s;
    }

    public void imprimirReceta() {
    }

    public void registrarSecretaria(Secretaria secretaria) {
        secretaria = s;
    }
}
