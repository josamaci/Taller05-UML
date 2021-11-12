package sistemaclinico_dc;

import java.util.ArrayList;

public class AreaMedica {

    protected String especialidad;

    protected float costo;

    public ArrayList<Doctor> doctores;
    
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }
    
    
}
