
/**
 *  
 * 
 * Clase que contiene miembros static
 */
public class Circulo
{
    public static final double PI = 3.1416;
    private static int contadorCirculos = 0;
    private double radio;
    private int numero;

    /**
     * Constructor  
     */
    public Circulo(double radio)   {
        contadorCirculos ++;
        this.radio = radio;
        numero = contadorCirculos;

    }

    /**
     *    
     * 
     */
    public double getPerimetro()    {
        return 2 * PI * radio;
    }

    /**
     *    
     * 
     */
    public  static int getContadorCirculos()   {
        
        return contadorCirculos;
    }

    /**
     *  
     */
    public String toString()    {
        return "Círculo: " + this.numero + 
        "\nRadio:" + radio + "\n";
    }

}
