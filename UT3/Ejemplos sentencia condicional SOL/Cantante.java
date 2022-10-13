
/**
 *  
 *  UT3 3.18
 */
public class Cantante
{

    private boolean feliz;

    /**
     * Constructor  
     */
    public Cantante()    {
        feliz = true;
    }

    /**
     *  
     */
    public void cantar()    {
        if (feliz)   {
            System.out.println("Cantando bajo la lluvia");
        }
        else       {
            System.out.println("No tiene ánimo para cantar");
        }
    }

    /**
     *  
     */
    public void cambiarEstadoAnimo()    {
        feliz = !feliz;

    }

    /**
     *  
     */
    public boolean estaTriste()    {
        return !feliz;

    }

    /**
     *  
     */
    public boolean estaTristeIf()    {
        if (!feliz)         {
            return true;
        }
        return false;

    }

}
