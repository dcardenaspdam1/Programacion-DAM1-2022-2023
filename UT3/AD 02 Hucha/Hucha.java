
/**
 * Modela una hucha en la que podemos meter
 * y sacar dinero
 *  
 */
public class Hucha  {
    private int dinero;

    /**
     * Constructor de objetos de la clase Hucha
     */
    public Hucha()    {
        dinero = 0;
    }

    /**
     * Accesor para el dinero que
     * hay en la hucha
     * @return  la cantidad de dinero
     */
    public int getDinero()   {
        return dinero;
    }
    
    /**
     * Mutador para añadir más dinero
     * a la hucha
     * @param  cuanto la cantidad a añadir
     */
    public void añadir(int cuanto)   {
        dinero += cuanto;
    }
    
     /**
     * Mutador para sacar dinero de la hucha
     * @param  cuanto la cantidad a sacar
     */
    public void sacar(int cuanto)   {
        dinero -= cuanto;
    }
    
    /**
     * Mostrar detalles de la hucha 
     */
    public void printDetalles()    {
        System.out.println("******** HUCHA **************");
        System.out.println("Hay " + dinero + " euros");
        System.out.println("*****************************");
    }
    
    
}
