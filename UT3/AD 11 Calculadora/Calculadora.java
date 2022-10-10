
/**
 * Modela a objetos Calculadora que registran una serie de nºs y
 * calculan la media, el máximo y el mínimo
 * 
 *  
 */
public class Calculadora
{
    private int cantidad; // cantidad de nºs introducidos
    private double suma; // suma de todos los nºs
    private int maximo; // el valor máximo de los nºs introducidos
    private int minimo;  // el valor mínimo de los nºs introducidos

    /**
     * constructor para los objetos de la clase Calculadora
     */
    public Calculadora()
    {
        cantidad = 0;
        suma = 0;
        maximo = 0;  
        minimo = 0; 
         
    }

    /**
     * añade un nº a la calculadora
     * 
     * @param  el nº a añadir   
     */
    public void addNumero(int numero)
    {
        suma += numero;
        cantidad++;
        if (cantidad == 1)   {
            maximo = numero;
            minimo = numero;
        }
        else if (numero > maximo)  {
            maximo = numero;
        }
        else if (numero < minimo)  {
            minimo = numero;
        }
    }

    

    public double getMedia()
    {
        if (cantidad != 0) {
            return ( (double) suma / cantidad );
        }
        return 0;
    }

    /**
     * Escribir las estadísticas
     */
    public void printEstadisticas()
    {
        System.out.println("Estadística final ");
        System.out.println("Nº total del nºs introducidos: " + cantidad);
        System.out.println("Suma total de los  nºs introducidos: " + suma);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Media de todos los nºs: " + getMedia());   
        // System.out.printf("Media de todos los nºs: %5.2f ", getMedia()); 
    }
}
