
/**
 * 
 */
public class Moneda
{
   private boolean cara; 

    /**
     * Constructor  
     */
    public Moneda()    {
         cara = true;
    }

    /**
     *  Valor aleatorio entre 1 y 2
     *  Si 1 cara, si 2 cruz
     */
    public void tirar()    {
         int tirada = (int) (Math.random() * 2) + 1;
         cara = tirada == 1;
    }
    
    /**
     *  
     *
     */
    public boolean esCara()    {
        return cara;
    }

}
