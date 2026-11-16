import java.util.ArrayList;
public class CajaRegistradora {
    private ArrayList<ComprobanteFiscal> comprobantes;
    public CajaRegistradora() {
        comprobantes = new ArrayList<>();
    }
    public void agregarComprobante(ComprobanteFiscal comprobante) {
        comprobantes.add(comprobante);
    }
    public void emitirTodos(double montoNeto) {
        for (ComprobanteFiscal comprobante : comprobantes) {
            comprobante.emitirComprobante(montoNeto);
        }
    }
}
