import java.util.Random;

/**
 * Modela un dado de de 6 caras
 * 
 * @author 
 * 
 */

public class Dado
{
    private Random generador;
    private int cara;

    /**
     * Constructor de la clase Dado
     */
    public Dado()    {
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
        cara = generador.nextInt(6) + 1;
    }
}
