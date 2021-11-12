package sistemaclinico_dc;

import java.util.ArrayList;

public class Paciente extends Persona {

    protected String email;

    protected Cita cita;

    public boolean solicitarCita() {
        return true;
    }

    public Paciente() {
        HistoriaClinica hc = new HistoriaClinica();
        Receta rc = new Receta();
    }
}
