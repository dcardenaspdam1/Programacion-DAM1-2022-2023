
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Intercambio
{

    private int a;
    private int b;

    /**
     * Constructor  
     */
    public Intercambio(int queA, int queB)    {
        a = queA;
        b = queB;

    }

    /**
     *  sin variable local
     */
    public void intercambiarV0()    {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    /**
     *  con variable local
     */
    public void intercambiar()    {
        int tmp = a;
        a = b;
        b = tmp;
    }

    /**
     *  
     */
    public void promptAntes()    {
        System.out.println("Antes del intercambio");
    }

    /**
     *  
     */
    public void promptDespues()    {
        System.out.println("Después del intercambio");
    }

    /**
     *  
     */
    public void escribir()    {
        System.out.println("Atributo a = " + a);
        System.out.println("Atributo b = " + b);
    }

    /**
     *  
     *
     * @param  
     * @return      
     */
    public static void m1() {
        String resul;
        int puntos = 89;
        if (puntos >= 90) {
            resul = "A";
        }
        if (puntos >= 80) {
            resul = "B";
        }
        if (puntos >= 70)  {
            resul = "C";
        }
        if (puntos >= 60) {
            resul = "D";
        }
        else {
            resul = "F";
        }
        System.out.println(resul);

    }

}
