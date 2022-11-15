import java.util.Random;

/**
 * 
 */
public class DemoFor
{
    private final char PUNTO = '.';
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Moneda moneda;
    private Random generador;

    /**
     * Constructor  
     */
    public DemoFor()    {
        moneda = new Moneda();
        generador = new Random();
    }

    /**
     * Saludar 10 veces con for
     */
    public  void ejemploFor01()    {
        for (int veces = 1; veces <= 10; veces++)    {
            System.out.println("Saludo " + veces);
        }
       

    }

    /**
     * Tirar una moneda 10 veces con for
     */
    public  void ejemploFor02()    {
        for (int tiradas = 1; tiradas <= 30; tiradas++)  {
            moneda.tirar();
        }
    }

    /**
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     */
    public  void ejemploFor03()    {
        int caras = 0;
        int cruces = 0;
        for (int tiradas = 1; tiradas <= 30; tiradas++)   {
            moneda.tirar();
            if  (moneda.esCara()) {
                caras++;
            }
            else {
                cruces++;
            }
        }
    }

    /**
     *  Impares entre 1 y 19
     *  1, 3, 5, 7, 9, 11, 13, 15, 17, 19
     *  
     */
    public void imparesEntre1y20()
    {
        for (int impar = 1; impar <= 19; impar += 2)  {
            System.out.print(impar + " , ");
        }

    }

    /**
     *  Generar n aleatorios entre -10 y 50 y calcular
     *  y escribir el máximo y cuántas veces aparece
     *
     *  
     */
    public void maximo(int n)
    {
        int totalMaximos = 0;
        int max = Integer.MIN_VALUE;
        for (int contador = 1; contador <= n; contador++)     {
            int aleatorio =  (int) (Math.random() * 61) - 10;
            if (aleatorio > max)      {
                max = aleatorio;
                totalMaximos = 1;
            }
            else if (aleatorio == max)     {
                totalMaximos ++;
            }
        }
        System.out.println("Máximo: " + max + " aparece " + totalMaximos + " veces");
    }

    /**
     * Cuenta la cantidad de divisores del parámetro recibido
     * Con for
     */
    public int contarDivisores(int numero)    {
        if (numero == 1)        {
            return 1;
        }
        int divisores = 2;
        for (int divisor = 2; divisor <= numero / 2; divisor++)    {
            if (numero % divisor == 0)   {
                divisores ++;
            }

        }
        return divisores;

    }

    /**
     * Ejer 4.14 f)
     *  Calcula y devuelve la suma de los divisores de 
     *  numero - Con for
     */
    public int sumarDivisores(int numero)    {
        if (numero == 1)        {
            return 1;
        }
        int suma = 0;
        for (int divisor = 2; divisor <= numero / 2; divisor++)    {
            if (numero % divisor == 0)   {
                suma += divisor;
            }

        }
        suma += 1 + numero;
        return suma;
    }

    /**
     * Ejer 4.14 h)
     * Sin método adicional de ayuda
     * Buscamos divisores desde el 2 hasta la mitad del número
     * Si se encuentra alguno sabremos que no es primo, en caso contrario lo será
     * Con for saliendo del bucle con return en cuanto sepamos que no es primo
     */
    public  boolean esPrimo(int numero)    {
        if (numero == 1)        {
            return false;
        }
        for (int divisor = 2; divisor <= numero / 2; divisor++)    {
            if (numero % divisor == 0)   {
                return false;
            }

        }
        return true;
    }

    /**
     *  Calcula y escribe la siguiente serie
     *  1 + 2 elevado a 2 + 3 elevado a 2 + 4 elevado a 2 +   .... + n elevado a 2
     *
     */
    public void serieCuadrados(int n)    {
        int suma = 0;
        for (int contador = 1; contador <= n; contador ++)  {
            suma += contador * contador;
        }
        System.out.println("Suma = " + suma);
    }

    /**
     *  Genera n pares de números entre 5 y 20 y
     *  calcula su producto mediante sumas
     *
     */
    public void productoMedianteSumas(int n)    {
        for (int par = 1; par <= n; par++)  {
            int numero1 = generador.nextInt(16) + 5;
            int numero2 = generador.nextInt(16) + 5;
            int producto = 0;
            for (int contador = 1; contador <= numero2; contador ++)  {
                producto += numero1;

            }
            System.out.printf("Producto de %4d y %4d = %6d\n", numero1, numero2, producto);
        }
    }

    /**
     * Ejer 4.15 a) de la UT4
     */
    public  void escribirFiguraA(int n)    {
        for (int fila = 1; fila <= n; fila++)   {
            for (int col = 1; col <= n; col++)  {
                System.out.print(fila + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Ejer 4.15 b) de la UT4
     */
    public  void escribirFiguraB(int n)    {
        for (int fila = 1; fila <= n; fila++)    {
            for (int col = 1; col <= fila; col++)   {
                System.out.print(fila + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Ejer 4.15 c) de la UT4
     */
    public  void escribirFiguraC(int n)    {
        for (int fila = 1; fila <= n; fila++)    {
            for (int col = 1; col <= fila; col++)   {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    /**
     *  Ejer 4.15 d) de la UT4
     */
    public  void   escribirTablasMultiplicar(int  numero)    {
        for (int n = 1; n <= numero; n++)   {
            System.out.println("Tabla de multiplicar del " + n);

            int conta = 1;
            while (conta <= 10)  {
                System.out.println(conta + " * " + n + " = " + (conta * n));
                conta++;
            }

            System.out.println();
            if (n % 2 == 0) {
                esperar(4000); 
            }
        }
    }

    /**
     *  ....1
     *  ...2.
     *  ..3..
     *  .4...
     *  5....
     *
     *  
     */
    public void cuadroConPuntos(int n)    { 
        for (int fila = 1; fila <= n; fila++)     {
            escribirPuntos(n - fila);
            System.out.print(fila);
            escribirPuntos(fila - 1);    
            System.out.println();
        }
    }

    /**
     *  Escribe n puntos en la misma línea
     *  
     */
    public void escribirPuntos(int n)    {
        for (int col = 1; col <= n; col++)    {
            System.out.print(PUNTO);
        }
    }

    /**
     *  Mostrar figura para N filas
     *  A
     *  BB
     *  CCC
     *  DDDD
     *  EEEEE
     *  FFFFFF
     *  GGGGGGG
     *  .........
     *  MMMMMMMMMMMM
     *
     *  
     */
    public void trianguloLetras(int n)    {
        char letra = 'A';
        for (int fila = 1; fila <= n; fila++)     {
            for (int col = 1; col <= fila; col++)  {
                System.out.print(letra);
            }
            System.out.println();
            letra++;
        }

    }

    /**
     *  Mostrar la siguiente figura 
     *  ABCD...................Z
     *  BCD...................Z
     *  CDEF.................Z
     *   ..........
     *
     *  Z
     */
    public void trianguloLetrasOtro()    {
        for (char fila = 'A'; fila <= 'Z'; fila++)     {
            for (char col = fila; col <= 'Z'; col++)     {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    /**
     * El programa hace una pausa de los milisegundos especificados
     */
    public void esperar(int milisegundos)    {
        try     {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)        {
            // ignorar la excepción
        }
    }

   
}
