
/**
 * Modela a una bicicleta
 */
public class Bicicleta
{
    private Rueda delantera;
    private Rueda trasera;

    /**
     *  el constructor cree las ruedas con una presión inicial de 0.0 
     */
    public Bicicleta()    {
        delantera = new Rueda(0.0);
        trasera = new Rueda(0.0);
    }

    /**
     *   verifica cada una de las ruedas de la bici.
     *   Si están desinfladas las infla quedando las ruedas con una presión de 1.5.
     */
    public void verificar()    {
        if (delantera.estaDesinflada())  {
            delantera.inflar();
            delantera.inflar();
            delantera.inflar();
        }
        if (trasera.estaDesinflada())   {
            trasera.inflar();
            trasera.inflar();
            trasera.inflar();
        }
    }
}
