package sistemaclinico_dc;

import java.time.LocalDateTime;

public class Cita {

    protected LocalDateTime fecha;

    protected boolean pagada;
    
    protected Paciente paciente;

    protected String registradoPor;

    public void realizarPago(Pago pago) {
    }
}
