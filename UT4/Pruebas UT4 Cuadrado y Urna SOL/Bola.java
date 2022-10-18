
/**
 * Modela a una bola de un determinado color
 */
public class Bola
{
    private final int BLANCA = 1;
    private final int NEGRA = 2;
    private int color;

    /**
     * 
     */
    public Bola()    {
        color = NEGRA;
    }

    /**
     * 
     */
    public Bola(int c)    {
        color = c;
    }

    /**
     * Devuelve true si la bola es negra, false en otro caso
     */
    public boolean esNegra()    {
        return color == NEGRA;
    }

    /**
     * Accesor para el color de la bola
     */
    public int getColor()    {
        return color;
    }

    /**
     * Representación textual de la bola
     */
    public String  toString()    {
        String resul = "Bola ";
        if (color == NEGRA)   {
            resul += "negra";
        }
        else   {
            resul += "blanca";
        }
        return resul;
    }
}
