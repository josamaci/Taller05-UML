/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico_dc;

import java.time.LocalDateTime;

/**
 *
 * @author JMaci
 */
public class PagoTarjeta implements Pago{
    protected float monto;
    protected String numero;
    protected LocalDateTime date;
    protected String propietario;
    protected String banco;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
