
/**
 * Modela a objetos Calculadora que registran una serie de n�s y
 * calculan la media, el m�ximo y el m�nimo
 * 
 *  
 */
public class Calculadora
{
    private int cantidad; // cantidad de n�s introducidos
    private double suma; // suma de todos los n�s
    private int maximo; // el valor m�ximo de los n�s introducidos
    private int minimo;  // el valor m�nimo de los n�s introducidos

    /**
     * constructor para los objetos de la clase Calculadora
     */
    public Calculadora()
    {
        cantidad = 0;
        suma = 0;
        maximo = Integer.MIN_VALUE;
        minimo = Integer.MAX_VALUE;
    }

    /**
     * a�ade un n� a la calculadora
     * 
     * @param  el n� a a�adir   
     */
    public void addNumero(int numero)
    {
        suma += numero;
        cantidad++;
        if (numero > maximo)  {
            maximo = numero;
        }
        if (numero < minimo)  {
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
     * Escribir las estad�sticas
     */
    public void printEstadisticas()
    {
        if (cantidad != 0) {
            System.out.println("Estad�stica final ");
            System.out.println("N� total del n�s introducidos: " + cantidad);
            System.out.println("Suma total de los  n�s introducidos: " + suma);
            System.out.println("Valor m�ximo: " + maximo);
            System.out.println("Valor m�nimo: " + minimo);
            System.out.println("Media de todos los n�s: " + getMedia());   

        }
        else {
            System.out.println("No han llegado n�meros a la calculadora ");
        }

    }
}
