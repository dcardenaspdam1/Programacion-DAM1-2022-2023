
/**
 * Clase que prueba la clase Dado
 *  
 */
public class DemoDado
{
    private final int TOTAL = 10;
    private Dado dado;

    /**
     * Constructor de la clase DemoDado
     */
    public DemoDado()    {
        dado = new Dado();
    }

    /**
     * Lanzar el dado TOTAL veces contando
     * las apariciones del 1 y del 6
     *    
     */
    public void test1()    {
        int cuantas = 1;
        int unos = 0;
        int seis = 0;

        while (cuantas <= TOTAL)    {
            dado.tirarDado();
            int cara = dado.getCara();
            if (cara == 1 ) {
                unos++;
            }
            else if (cara == 6) {
                seis++;
            }
            cuantas++;
        }
        escribir("Cantidad Uno: ", unos);
        escribir("Cantidad Seis: ", seis);

    }

    /**
     * Lanzar el dado hasta que salga
     * el 4 o 5 contando las veces que se lanzó
     *    
     */
    public void test2()    {
        int tiradas = 1;
        dado.tirarDado();
        int cara = dado.getCara();
        while (cara != 4 && cara != 5)     {
            System.out.println("Tirada " + tiradas + "\t" + cara);
            dado.tirarDado();
            cara = dado.getCara();            
            tiradas++;
        }
        String str = "Se ha tirado el dado hasta salir el ";
        if (cara == 4)    {
            str = str + "4\n";
        }
        else   {
            str = str + "5\n ";
        }
        escribir(str, tiradas);

    }

    /**
     * tirar el dado mientras la suma de las tiradas no supere el valor 42.
     */
    public void test3()    {
        int sumaTiradas = 0;
        int cuantas = 0;      
        while (sumaTiradas <= 42)  {
            dado.tirarDado();
            cuantas++;
            sumaTiradas += dado.getCara();
            System.out.println("Suma tiradas: " + sumaTiradas);

        }
        escribir("Se ha superado la cantidad de 42 después de ",
            cuantas);
    }

    /**
     * Método privado de ayuda para mostrar un mensaje
     */
    private void escribir(String mensaje, int contador)    {
        System.out.println(mensaje + contador + " veces");
    }

}
