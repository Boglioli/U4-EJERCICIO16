public class FacturaA implements ComprobanteFiscal {
    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * 0.21;
        double retencion = montoNeto * 0.02;
        double total = montoNeto + iva - retencion;
        System.out.println("factura A");
        System.out.println("monto neto: "+ montoNeto);
        System.out.println("retencion: " + retencion);
        System.out.println("total: " + total);
        System.out.println("--------------------");
    }
}
