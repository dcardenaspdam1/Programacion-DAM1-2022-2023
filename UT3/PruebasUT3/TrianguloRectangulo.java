
/**
 *   Modela un triángulo rectángulo
 *   con dos catetos
 */
public class TrianguloRectangulo 
{
     
    private double cateto1;
    private double cateto2;

    /**
     * Constructor  
     */
    public TrianguloRectangulo(double queCateto1, double queCateto2)     {
          cateto1 = queCateto1;
          cateto2 = queCateto2;
    }

    /**
     *  accesor para el cateto 1
     */
    public double getCateto1()    {
        return cateto1;
         
    }
    
     /**
     *  accesor para el cateto 2
     */
    public double getCateto2()    {
        return cateto2;
         
    }
    
    /**
     *  mutador para el cateto1
     */
    public void setCateto1(double queCateto1)    {
        cateto1 = queCateto1;
    }
    
    /**
     *  mutador para el cateto2
     */
    public void setCateto2(double queCateto2)    {
        cateto2 = queCateto2;
    }
    
    /**
     *  obtener hipotenusa
     */
    public double obtenerHipotenusa()    {
       // return Math.hypot(cateto1, cateto2);
       // return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto1, 2));
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }


}
