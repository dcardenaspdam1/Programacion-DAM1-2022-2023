import java.util.Random;
/**
 *  
 * Clase que representa a una moneda con una cara
 */
public class Moneda
{
    private Random generador;
    private boolean cara;

    /**
     * Constructor  
     */
    public Moneda()    {
        generador = new Random();
        cara = true;
    }

    /**
     *  
     *  Simula el lanzamiento de la moneda
     *  Se genera un nº aleatorio, si es 0 suponemos cara, si es 1 suponemos cruz
     * 
     */
    public void tirar()    {
        cara = generador.nextInt(2) == 0;
    }

    /**
     * 
     */
    public  boolean esCara()    {
        return cara;
    }

}
