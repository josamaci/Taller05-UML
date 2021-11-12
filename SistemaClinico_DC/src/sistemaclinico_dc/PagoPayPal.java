package sistemaclinico_dc;

public class PagoPayPal implements Pago {

    protected float monto;

    protected String email;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
