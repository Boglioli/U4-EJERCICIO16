public class NotaCredito implements ComprobanteFiscal {
    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * 0.21;
        double total = montoNeto + iva;
        System.out.println("nota de retencion");
        System.out.println("monto neto: " + montoNeto);
        System.out.println("iva: " + iva);
        System.out.println("total: " + total);
        System.out.println("--------------------");
    }
}
