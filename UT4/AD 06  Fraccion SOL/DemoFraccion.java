
/**
 * Clase para probar la clase Fraccion 
 *  
 */
public class DemoFraccion
{
    private Fraccion fraccion1;
    private Fraccion fraccion2;

    /**
     * Constructor de la clase DemoFraccion
     */
    public DemoFraccion()    {
        fraccion1 = new Fraccion(-4, 7);
        fraccion2 = new Fraccion(13, 2);
    }

    public void demo1()    {
        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion producto = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        borrarPantalla();

        escribirFraccion("Fracción 1 ", fraccion1);
        escribirFraccion("Fracción 2 ", fraccion2);
        escribirFraccion("la suma es ", suma);
        escribirFraccion("La resta es ", resta);
        escribirFraccion("El producto es ", producto);
        escribirFraccion("la división es ", division);
    }

    private void escribirFraccion(String mensaje, Fraccion laFraccion)    {
        System.out.println(mensaje + " " + laFraccion.toString());
    }

    /**
     *
     * Limpiar la pantalla    
     */
    private void borrarPantalla()    {
        System.out.println('\u000C');
    }

    
    public void demo2()    {

        borrarPantalla();

        fraccion1.setNumerador(17);
        fraccion1.setDenominador(25);
        fraccion2.setNumerador(16);
        fraccion2.setDenominador(11);
        if (fraccion1.igualQue(fraccion2))   {
            escribirFraccion("Fracción 1 ", fraccion1);
            escribirFraccion("Fracción 2 ", fraccion2);
            System.out.println("Son iguales");
        }
        else if (fraccion1.menorQue(fraccion2))    {
            escribirFraccion("Fracción 1 ", fraccion1);
            escribirFraccion("Fracción 2 ", fraccion2);
            System.out.println("La primera es menor que la segunda");
        }
        Fraccion copia = fraccion1.clonar();
        escribirFraccion("la copia es ", copia);

    }

}
