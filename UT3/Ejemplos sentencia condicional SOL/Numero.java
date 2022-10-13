
/**
 * Ejer 3.19 de la UT3 
 * 
 * @author  
 * @version  
 */
public class Numero
{

    private int numero;

    /**
     * Constructor  
     */
    public Numero(int queNumero)    {
        numero = queNumero;
    }

    /**
     *  
     */
    public boolean esMenorQue(int otroNumero)    {
        return numero < otroNumero;
    }

    /**
     *  
     */
    public boolean esMayorQue(int otroNumero)    {
        return numero > otroNumero;
    }

    /**
     *  
     */
    public boolean esIgualQue(int otroNumero)    {
        return numero == otroNumero;
    }

    /**
     *  
     */
    public String comprobar(int otroNumero)    {       

        if (numero > otroNumero)    {
            return "Más grande";
        }
        if (numero < otroNumero)  {
            return "Más pequeño";
        }
        return "Iguales";
    }

}
