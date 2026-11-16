public class FacturaB implements ComprobanteFiscal {
    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * 0.21;
        double total = montoNeto + iva;
        System.out.println("factura B");
        System.out.println("monto neto: " + montoNeto);
        System.out.println("iva incluido en el total: " + iva);
        System.out.println("total: " + total);
        System.out.println("--------------------");
    }
}
