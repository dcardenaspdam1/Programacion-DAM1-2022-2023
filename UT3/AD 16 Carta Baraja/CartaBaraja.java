
/**
 * Modela una carta de la baraja española
 * 
 * 
 */
public class CartaBaraja
{
    private final int OROS = 1;
    private final int COPAS = 2;
    private final int ESPADAS = 3;
    private final int BASTOS = 4;

    private int palo;
    private int valor;

    /**
     * constructor para los objetos de la clase CartaBaraja
     * @param valor el valor de la carta
     * @param palo el palo de la carta
     */
    public CartaBaraja(int valor, int palo)    {
        this.palo = palo;
        this.valor = valor;
    }

    /**
     * Accesor para el palo
     * 
     * @return   el palo de la carta  
     */
    public String getPalo()    {
        String strRetorno = "";
        switch (palo)  {
            case OROS: strRetorno = "oros";
            break;
            case COPAS: strRetorno = "copas";
            break;
            case ESPADAS: strRetorno = "espadas";
            break;
            case BASTOS: strRetorno = "bastos";
            break;
        }        
        return strRetorno;
    }

    /**
     * Accesor para el valor de la carta
     * 
     * @return   el valor  de la carta  
     */
    public String  getValor()    {
        String strRetorno = "";

        if (valor == 1)  {
            strRetorno = "as";
        }
        else if (valor == 2)  {
            strRetorno = "dos";
        }
        else if (valor == 3)    {
            strRetorno = "tres";
        }
        else if (valor == 4)  {
            strRetorno = "cuatro";
        }
        else if (valor == 5)    {
            strRetorno = "cinco";
        }
        else if (valor == 6)  {
            strRetorno = "seis";
        }
        else if (valor == 7)   {
            strRetorno = "siete";
        }
        else if (valor == 10)  {
            strRetorno = "sota";
        }
        else if (valor == 11)  {
            strRetorno = "caballo";
        }
        else if (valor == 12)  {
            strRetorno = "rey";
        }

        return strRetorno;
    }

    /**
     * Representación textual de la carta
     */
    public String toString()    {
        return getValor() + " de " + getPalo();
        
    }

}   
