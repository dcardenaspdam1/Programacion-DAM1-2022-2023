
/**
 * Modela un contador
 * 
 * @author 
 * @version 
 */
public class Contador {
    private int valor;

    /**
     * Constructorde la clase Contador
     */
    public Contador()   {  
       valor = 0;
    }
    
    /**
     * accesor
     */
    public int getContador()    {
        return valor;
    }
    
    /**
     * mutador, incrementa en uno el contador
     */
    public void incrementar()   {
        valor++;
    }
    
    /**
     * mutador, decrementa en uno el contador
     */
    public void decrementar()   {
            valor--;
    }
    
    /**
     * Mostrar detalles del contador
     */
    public void printContador()    {
        System.out.println("Valor del contador: " + valor);
    }
  
     /**
     * mutador, inicializa (hace un reset)
     * a 0 el contador
     */
    public void reset()    {
            valor = 0;
    }
    
    
    
    
}
