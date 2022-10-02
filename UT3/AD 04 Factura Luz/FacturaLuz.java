
/**
 * La clase mantiene información acerca del
 * consumo de luz efectuado 
 *  
 */
public class FacturaLuz {
    private final double IVA = 0.16;
    private final double VALOR_KW = 8.67;
    // consumo en el inicio del período a facturar
    private int lecturaAnterior;
    // consumo al final del período a facturar
    private int lecturaActual;

    /**
     * Constructor de la clase FacturaLuz
     */
    public FacturaLuz(int anterior, int actual)   {
        lecturaAnterior = anterior;
        lecturaActual = actual;
    }

    /**
     * Accesor
     * @return devuelve los kw consumidos
     */
    public int obtenerConsumo()    {
        // se puede hacer con variable local
        return lecturaActual - lecturaAnterior;
    }
    
    /**
     * Devuelve el importe correspondiente a
     * la factura, lo que hay que pagar por consumo
     * @return  el valor a pagar   
     */
    public double obtenerImporteTotal()    {
        int consumo = lecturaActual - lecturaAnterior;
        double importeSinIva = consumo * VALOR_KW;
        
        double totalIva = importeSinIva * IVA;
        double importeConIva = importeSinIva + totalIva;
        return importeConIva;
    }
    
    
    
    
    
}
