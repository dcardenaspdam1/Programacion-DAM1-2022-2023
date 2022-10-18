
/**
 * Representa a una rueda de una bicicleta
 */
public class Rueda  
{
    private double  presion;   

    /**
     * Constructor
     */
    public Rueda(double p)
    {
        presion = p;
    }

    /**
     * inflar la rueda
     */
    public void inflar( )
    {
        this.presion += 0.5; 
    }

    /**
     * desinflar la rueda
     */
    public void desinflar()
    {
        presion -= 0.5; 
    }

    /**
     * true si está desinflada
     */
    public boolean estaDesinflada()
    {
        return (presion == 0.0);
    }  

    /**
     * 
     */
    public Rueda getRuedaActual() {
        return this;

    }

    /**
     * 
     */
    public String toString() {
        return "Presión: " + this.presion;
    }

    /**
     * 
     */
    public Rueda getCopiaRuedaActual() {
        Rueda copia = new Rueda(this.presion);
        return copia;

    }

}
