/**
 * Representa a un punto en el espacio bidimensional
 *  
 */
public class Punto 
{
    private int x;
    private int y;

    /**
     * Constructor de la clase Punto
     */
    public Punto(int x, int y)   {
        this.x = x;
        this.y = y;
    }

    /**
     * Accesor para el atributo x
     * @return  El valor de la coordenada x   
     */
    public int getX()   {
        return x;
    }

    /**
     * Accesor para el atributo y
     * @return  El valor de la coordenada y   
     */
    public int getY()  {
        return y;
    }

    /**
     * 
     *  Mutador para la coordenada x
     * @param x es el nuevo valor de x
     */
    public void setX(int x)  {
        this.x = x;
    }

    /**
     * Mutador para la coordenada y
     * @param  y es el nuevo de y  
     */
    public void setY(int y)   {
        this.y = y;
    }
    
    /**
      * 
      * Calcula la distancia desde el origen (0, 0)
      * @param  
      * @return     
      */
     public double getDistanciaDesdeOrigen()   {
        return Math.sqrt( x * x + y * y );
     }
     
      /**
      * 
      * Calcula la distancia desde el punto p
      * @param  p el punto para calcular la distancia desde él
      * @return     
      */
     public double getDistanciaDesde(Punto p)  {
             double restaX = x - p.getX();
             double restaY = y - p.getY();
             return Math.sqrt(Math.pow(restaX, 2) + Math.pow(restaY, 2));
     }

    /**
     * @return  Devuelve una cadena con la representación del 
     *          punto
     */
    public String toString()  {
        String str = "";
        str = str + "Valor de x = " + x + "\n" + "Valor de y = " + y + "\n";
        return str;
    }

}