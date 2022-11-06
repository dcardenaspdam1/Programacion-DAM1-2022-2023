
/**
 *  
 * 
 * @author  
 * @version  
 */
public class TestLinea
{
    private Linea linea;

    /**
     * Constructor  
     */
    public TestLinea()  {
        linea = new Linea(new Punto(2, 2), new Punto(9, 2));

    }

    /**
     * 
     */
    public void demo() {
        linea.printLinea();
        linea.moverDerecha(10);
        linea.printLinea();
        linea.moverAbajo(20);
        linea.printLinea();  

    }
}
