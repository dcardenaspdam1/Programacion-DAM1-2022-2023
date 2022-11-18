
/**
 * clase CalculadoraFibonacci 
 *
 */
public class CalculadoraFibonacci
{

    /**
     * Constructor de la clase CalculadoraFibonacci
     */
    public CalculadoraFibonacci()    {

    }

    /**
     * @param  cuantos  nº de términos de la serie 
     * de Fibonacci a generar 
     * @return   una representación textual de la serie generada  
     */
    public String generarFibonacci(int cuantos)    {
        String str = "";
        for (int i = 1; i <= cuantos; i++)     {
            str = str + generarTerminoFibonacci(i) + "\t";
        }
        return str;

    }

    /**
     * @param  pos la posición del término a generar
     * @return  el término generado   
     */
    public int generarTerminoFibonacci(int pos)    {
        int anterior = 0;
        int actual = 1;
        int siguiente = 0;
        switch (pos)   {
            case 1:   siguiente = anterior;
                break;
            case 2:   siguiente = anterior + actual;
                break;
            default:   
                int i = 3;
                while (i <= pos)   {
                    siguiente = anterior + actual;
                    anterior = actual;
                    actual = siguiente;
                    i++;
                }
        }
        return siguiente;

    }

    /**
     * @param  pos la posición del término a generar
     * @return  el término generado   
     */
    public int generarTerminoFibonacciV2(int pos)    {
        if (pos == 1)    {
            return 0;
        }
        if (pos == 2)  {
            return 1;
        }   
        int anterior1 = 0;
        int anterior2 = 1;
        int actual = 0;
        for (int n = 3; n <= pos; n++)    {
            actual = anterior1 + anterior2;
            anterior1 = anterior2;
            anterior2 = actual;
        }
        return actual;

    }

}
