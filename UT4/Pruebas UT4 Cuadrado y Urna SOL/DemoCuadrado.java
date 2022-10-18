
/**
 *  
 * 
 * @author  
 * @version  
 */
public class DemoCuadrado
{
    private Cuadrado cuadrado;

    /**
     * Constructor  
     */
    public DemoCuadrado()   {

    }

    /**
     * 
     */
    public void demoConstructor1() {
        cuadrado = new Cuadrado();

    }

    /**
     * 
     */
    public void demoConstructor2() {
        cuadrado = new Cuadrado(7, 9, 8.3);

    }

    /**
     * 
     */
    public void demoConstructor3() {
        Punto punto = new Punto(3, 4);
        cuadrado = new Cuadrado(punto, 12.7);

    }
}
