package sistemaclinico_dc;
import java.time.LocalDateTime;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JMaci
 */
public class Cita {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    
    public void realizarPago(Pago pago){
        
    }
}
