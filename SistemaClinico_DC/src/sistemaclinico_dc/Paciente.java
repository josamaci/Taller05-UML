package sistemaclinico_dc;

import java.util.ArrayList;

public class Paciente extends Persona {

    protected String email;

    protected Cita cita;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public boolean solicitarCita() {
        return true;
    }

    public Paciente() {
        HistoriaClinica hc = new HistoriaClinica();
        Receta rc = new Receta();
    }
}
