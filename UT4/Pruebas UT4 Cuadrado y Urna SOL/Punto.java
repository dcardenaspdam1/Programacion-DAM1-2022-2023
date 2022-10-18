/**
 * 
 */
public class Punto
{
     private int x;
     private int y;

    /**
     * Constructor  
     */
    public Punto()
    {
         x = 0;
         y = 0;
    }
    
    /**
     * Constructor  
     */
    public Punto(int queX, int queY)
    {
         x = queX;
         y = queY;
    }

    /**
     *  Accesor para la x
     */
    public int getX()
    {
         return x;
    }
    
     /**
     *  Mutador para la x
     */
    public void setX(int queX)
    {
         x = queX;
    }
    
    
    
     /**
     *  Accesor para la y
     */
    public int getY()
    {
         return y;
    }
    
      /**
     *  Mutador para la y
     */
    public void setY(int queY)
    {
         y = queY;
    }
    
    /**
     *  Representación textual del punto
     *
     *  
     */
    public String toString( )
    {
        return "[ " + x + " , " + y + " ]";
    }

    
}
