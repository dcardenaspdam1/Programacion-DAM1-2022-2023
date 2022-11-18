
/**
 * Clase de utilidades
 * Contienen métodos estáticos recursivos
 * 
 */
public class LibreriaRecursiva
{

    /**
     * Calcula y devuelve el factorial
     * de n
     */
    public static int factorial(int n)    {
        if (n == 0 || n == 1)        {
            return 1;
        }

        return n * factorial(n - 1);
    }

    /**
     * Calcula y devuelve el sumatorio
     * de n
     */
    public static int sumatorio(int n)    {
        if (n == 1)        {
            return 1;
        }

        return n + sumatorio(n - 1);
    }

    /**
     * Calcula y devuelve el mcd
     * de a y b utilizando el algoritmo
     * de Euclides
     */
    public static int mcd(int a, int b)    {
        if (a % b == 0)     {
            return b;
        }
        return mcd(b, a % b);
    }

    /**
     * Calcula y devuelve la potencia
     * de base elevado a expon 
     */
    public static int potencia(int base, int expon)    {
        if (expon == 0)    {
            return 1;
        }
        return base * potencia(base, expon - 1);
    }

    /**
     * Cuenta los dígitos de n
     */
    public static int contarDigitos(int n)    {
        if (n < 10)     {
            return 1;
        }
        return 1 + contarDigitos(n / 10);
    }

    /**
     * Calcular la suma de los digitos de n
     */
    public static int sumarDigitos(int n)    {
        if (n < 10)        {
            return n;
        }
        return n % 10 + sumarDigitos(n / 10);
    }

    /**
     *  1 + 1/2 + 1/3 + 1/4 + .....
     *
     */
    public static double serie01(int n)    {
        if (n == 1)   {
            return 1;
        }
        return (double) 1 / n + serie01(n - 1);
    }

    /**
     *  3   6  9  12  15  18  21  24
     *  Escribe los n primeros multiplos de 3 de forma recursiva
     */
    public static void serieMultiplos3(int n)    {
        //         if (n >= 1) // caso general
        //         {          
        //             serieMultiplos3(n - 1);
        //             System.out.print(n * 3 + "\t");
        //         }
        if (n == 1)      {
            System.out.print(3 + "\t");
        }
        else       {
            serieMultiplos3(n - 1);
            System.out.print(3 * n + "\t");
        }

    }

    /**
     *  10  13  16  19
     *  Escribe la serie para los n primeros términos
     */
    public static void serie02(int n)    {
        //         if (n >= 1) // caso general
        //         {          
        //             serie02(n - 1);
        //             System.out.print(10 + n * 3 + "\t");
        //         }

        if (n == 1)      {
            System.out.print(10 + "\t");
        }
        else     {
            serie02(n - 1);
            System.out.print(10 + (n - 1) * 3 + "\t");
        }
    }

    /**
     * Calcula y devuelve el n-simo término
     * de la serie de Fibonacci
     */
    public static int fibonnaci(int n)   {
        if (n == 1)      {
            return 0;
        }
        if (n == 2)   {
            return 1;
        }

        return fibonnaci(n - 2) + fibonnaci(n - 1);
    }

    /**
     * Cuenta los dígitos pares de n
     */
    public static int contarDigitosPares(int n)
    {
        if (n < 10)        {
            if (n % 2 == 0)            {
                return 1;
            }

            return 0;
        }
        else if ((n % 10) % 2 == 0)        {
            return 1 + contarDigitosPares(n / 10);
        }

        return contarDigitosPares(n / 10);
    }

    /**
     * Cuenta las apariciones de d en el
     * número n
     */
    public static int contarApariciones(int n, int d)
    {
        if (n < 10)      {
            if (n == d)     {
                return 1;
            }

            return 0;
        }
        else if (n % 10 == d)   {
            return 1 + contarApariciones(n / 10, d);
        }

        return contarApariciones(n / 10, d);
    }

    /**
     *  Devuelve true si n contiene algún 7, false en otro caso
     *
     */
    public static boolean tiene7(int numero)   {
        if (numero < 10)    {
            return numero == 7;
        }
        else if (numero % 10 == 7)    {
            return true;
        }
        else       {
            return tiene7(numero / 10);
        }
    }

    /**
     *  Multiplicar a * b mediante sumas
     *
     * 
     */
    public static int producto(int a, int b)   {

        if (b == 1)    {
            return a;
        }
        return a + producto(a, b - 1);
    }

    /**
     *  Sumar a + b
     *
     * 
     */
    public static int sumar(int a, int b)   {

        if (b == 0)   {
            return a;
        }
        return 1 + sumar(a, b - 1);
    }

    /**
     * 
     * Sumar un intervalo, por ejemplo, sumar(5, 9) es 5 + 6 + 7 + 8 + 9 = 35
     *  Asumimos desde <= hasta 
     */
    public static int sumarIntervalo(int desde, int hasta)
    {
        if (desde == hasta)    {
            return desde;
        }
        return desde + sumarIntervalo(desde + 1, hasta);
    
    }

    /**
     *  calcula y devuelve el producto de los n primeros pares (2 * 4 * 6 * 8 * ....)
     */
    public static int multiplicarPares(int n)   {
        if (n == 1)       {
            return  2;
        }
        return  n * 2 * multiplicarPares(n - 1);

    }

    /**
     *  muestra cada uno de los dígitos binarios de n 
     *  (Si n = 13 entonces 1101, si n = 9 entonces 101, ...)
     */
    public static void printEnBinario(int n)    {
        if (n < 2)    {
            System.out.print(n);
        }
        else      {
            printEnBinario(n / 2);
            System.out.print(n % 2);
        }
    }

    /**
     *  escribir la secuencia 1,  2,   3,   4,   5
     */
    public static void secuencia01(int n)   {
        if (n == 1)    {
            System.out.print(n);
        }
        else   {
            secuencia01(n - 1);
            System.out.print(", " + n);
        }
    }

    /**
     *  escribir la secuencia   5,  4,   3,   2,   1 
     */
    public static void secuencia02(int n)    {
        if (n == 0)   {
            System.out.println();
        }
        else    {          
            System.out.print(n + "\t");
            secuencia02(n - 1);
        }
    }

    /**
     *  genera un nº con tantas cifras como indique n, su primera cifra será 1,
     *  la segunda 2, .... desde el 1. Ej. si n = 5 entonces se genera 12345, si n = 8 el 12345678, ....
     */
    public static int generarNumero(int n)    {
        if (n == 1)    {
            return n;
        }
        return generarNumero(n - 1) * 10 + n;

    }

    /**
     *  Pasar un nº supuesto en base 2 a base 10
     *
     * 
     */
    public static int aBase10(int n)   {
        int a10 = 0;
        if (n < 2)     {
            a10 = n;
        }
        else     {
            a10 = aBase10(n / 10) * 2 + (n % 10); 
        }
        return a10;
    }

    /**
     *  Pasar un nº supuesto en base 10 a base 2
     *
     * 
     */
    public static int aBase2(int n)   {
        int a2 = 0;
        if (n < 2)    {
            a2 = n;
        }
        else     {
            a2 = aBase2(n / 2) * 10 + (n % 2); 
        }
        return a2;
    }

    /**
     * escribe los  n primeros nºs  de forma que los impares se muestran antes y 
     * en orden decreciente y los pares después y en orden creciente. Por ejemplo, 
     * imparesPares(5)  daría como resultado  5  3  1  2  4  
     * e imparesPares(8)  daría  7  5  3  1  2  4  6  8
     */
    public static void imparesPares(int n)    {
        if (n == 1)     {
            System.out.print(n + "\t");
        }
        else if  (n % 2 == 0)    {
            imparesPares(n - 1);
            System.out.print(n + "\t");
        }
        else      {
            System.out.print(n + "\t");
            imparesPares(n - 1);
        }

    }

    /**
     *  Para cuestionario 
     * 
     * queHace04(5)   queHace04(13)
     */
    public static int queHace04(int n)
    {
        if (n == 0)    {
            return 0;
        }
        if (n == 1)   {
            return 1;
        }
        return 2 * n + queHace04(n / 2 - 1);
    }


}
