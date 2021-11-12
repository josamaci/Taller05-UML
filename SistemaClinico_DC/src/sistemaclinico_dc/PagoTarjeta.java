package sistemaclinico_dc;

import java.time.LocalDateTime;

public class PagoTarjeta implements Pago {

    protected float monto;

    protected String numero;

    protected LocalDateTime date;

    protected String propietario;

    protected String banco;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
