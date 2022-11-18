
/**
 * Modela un dado de de 6 caras
 * 
 */
import java.util.Random;

public class Dado
{
    private int cara;
    private Random generador;

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
