package sistemaclinico_dc;

import java.util.ArrayList;

public class AreaMedica {

    protected String especialidad;

    protected float costo;

    public ArrayList<Doctor> doctores;
    
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }
}
