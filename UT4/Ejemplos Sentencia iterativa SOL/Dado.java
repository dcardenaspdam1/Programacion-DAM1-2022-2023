
/**
 * Modela un dado de de 6 caras
 * 
 */
import java.util.Random;

public class Dado
{
    private Random generador;
    private int cara;

    /**
     * Constructor de la clase Dado
     */
    public Dado()   {
        generador = new Random();
        cara = 1;

    }

    /**
     * Accesor
     * @return  el valor actual de la cara del dado  
     */
    public int getCara()    {
        return cara;
    }

    /**
     * Simula el lanzamiento del dado
     */

    public void tirarDado()    {
        //         cara = (int) (Math.random() * 6) + 1;
        cara = generador.nextInt(6) + 1;

    }
}
