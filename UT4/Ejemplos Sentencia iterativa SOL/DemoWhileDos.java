import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * 
 */
public class DemoWhileDos
{
    private final char BARRA = '\u007C';
    private final char ESPACIO = ' ';
    private final char ASTERISCO = '*';
    private Scanner teclado;

    /**
     * Constructor  
     */
    public DemoWhileDos()    {
        teclado = new Scanner(System.in);
    }

    /**
     * Ejer 4.14 a)
     *  escribe los números que están comprendidos 
     *  entre el parámetro desde y el parámetro hasta. Si desde = 10 y hasta =30, escribe 10, 11, 12, 
     *  ….. ,30  
     *  Se escriben 5 números en cada línea
     */
    public void escribirNumeros(int desde, int hasta)    {
        int columna = 0;
        int conta = desde;
        while (conta <= hasta)   {
            System.out.print(conta + "\t");
            columna++;
            if (columna == 5) { // (conta - desde + 1 == 5)
                System.out.println();
                columna = 0;
            }
            conta++;
        }

    }

    /**
     * Ejer 4.14 b)
     * 
     * Mostrar números pares entre 2 y 50  
     */
    public void mostrarPares()    {
        int numero = 2;
        while (numero <= 50)   {
            System.out.print(numero + "\t");
            numero += 2;
        }

    }

    /**
     * Ejer 4.14 c)
     *  genera y escribe  os   aleatorios entre 1 y 100 parando  el 
     *  proceso cuando se generan 30 o bien cuando salga un 99. El método cuenta también las 
     *  veces que sale el 12 y devuelve este valor.
     *  En cada línea se escriben 8 números
     */
    public int generarAleatorios()    {
        boolean salio99 = false;
        int cuantosDoce = 0;
        int aleatorio = (int) (Math.random() * 100 + 1);
        int i = 1;
        while (i <= 30 && aleatorio != 99)   {            
            System.out.print(String.format("%4d", aleatorio));
            if (i % 8 == 0)     {
                System.out.println();
            }
            if (aleatorio == 12)     {
                cuantosDoce++;
            }
            aleatorio = (int) (Math.random() * 100 + 1);
            i = i + 1;        
        }
        // System.out.println("\n" + aleatorio);
        esperar(1000);
        return cuantosDoce;
    }

    /**
     * Ejer 4.14 d)
     *
     *  Calcula   y   devuelve   la   suma   de   la   serie 1/1 + 1/2 + 1/3 + 1/4 + ... 1/n
     */
    public double sumarSerie(int n)    {
        double serie = 0;
        int conta = 1;
        while (conta <= n)    {
            serie = serie + (double) 1 / conta;
            conta++;
        }
        return serie;   
    }

    /**
     * Ejer 4.14 d) Idem pero formateado como String a 2 decimales
     */
    public String sumarSerieV2(int n)    {
        double serie = 0;
        int conta = 1;
        while (conta <= n)   {
            serie = serie + (double) 1 / conta;
            conta++;
        }
        return String.format("%8.2f", serie);   
    }

    /**
     * Ejer 4.14 e)
     *    Calcula   y   devuelve   la   suma   de   la   serie 1/1 - 1/2 + 1/3 - 1/4 + 1/5 - .....
     *     
     */
    public double sumarSerieConSigno(int n)    {
        boolean positivo = true;
        double serie = 0;
        int conta = 1;
        while (conta <= n)   {
            if (positivo)      {
                serie = serie + (double) 1 / conta;
            }
            else            {
                serie = serie - (double) 1 / conta;
            }
            positivo = !positivo;
            conta++;
        }
        return serie;   
    }

    /**
     * Ejer 4.14 f)
     *  Calcula y devuelve la suma de los divisores de 
     *  numero
     */
    public int sumarDivisores(int numero)
    {
        if (numero == 1)  {
            return 1;
        }
        int mitad = numero / 2;
        int sumaDivisores = 1;
        int divisor = 2;
        while (divisor <= mitad)   {
            if (numero % divisor == 0)     {
                sumaDivisores += divisor;
            }
            divisor++;
        }
        sumaDivisores += numero;
        return sumaDivisores;   
    }

    /**
     * Ejer 4.14 g)
     *  Calcula y devuelve la suma de los dígitos de numero
     */
    public int sumarDigitos(int numero)
    {
        int cifra;
        int sumaDigitos = 0;
        int auxNumero = numero;
        while (auxNumero != 0)    {
            cifra = auxNumero % 10;
            sumaDigitos += cifra;
            auxNumero = auxNumero / 10;
        }
        // return sumaDigitos;
        return Math.abs(sumaDigitos);   

    }

    /**
     * Ejer 4.14 h)
     *  devuelve true si numero es primo, false en otro caso, Un 
     *  nº es primo si únicamente tiene como divisores él mismo y la unidad
     *  El 1 no se considera primo
     *  
     * Contamos los divisores de numero con el método 
     * contarDividores() que dado un nº devuelve el total de divisores que tiene
     */
    public  boolean esPrimoV1(int numero)    {
        int totalDivisores = contarDivisores(numero);
        return totalDivisores == 2;
    }

    /**
     * Cuenta la cantidad de divisores del parámetro recibido
     * Asumimos numero >= 1
     */
    public int contarDivisores(int numero)    {
        if (numero == 1)        {
            return 1;
        }

        int divisores = 2;
        int mitad = numero / 2;
        int divisor = 2;
        while (divisor <= mitad)    {
            if (numero % divisor == 0)   {
                divisores ++;
            }
            divisor++;
        }
        return divisores;

    }

    /**
     * Ejer 4.14 h)
     * Sin método adicional de ayuda
     * Buscamos divisores desde el 2 hasta la mitad del número
     * Si se encuentra alguno sabremos que no es primo, en caso contrario lo será
     * 
     */
    public  boolean esPrimoV2(int numero)    {
        if (numero == 1)    {
            return false;
        }

        int divisor = 2;
        while (divisor <= numero / 2)   {
            if (numero % divisor == 0)  {
                return false;
            }
            else      {
                divisor++;
            }

        }
        return true;

    }

    /**
     * Devolver la tabla de multiplicar del parámetro (hasta el 10)
     */
    public String tablaMultiplicarV2(int numero)    {
        String str = "Tabla de multiplicar del " + numero + "\n";
        int conta = 1;
        while (conta <= 10)    {
            str = str + numero + " * " + conta + 
            " = " + (numero * conta) + "\n";
            conta++;
        }
        return str;   
    }

    /**
     * Borrar la pantalla  
     */
    public void borrarPantalla()    {
        System.out.print('\u000C');
    }

    /**
     * Generar aletorios entre 0 y 100. Parar el proceso cuando salga el 0
     * Hay que calcular y mostrar en pantalla la suma de los impares, el producto de los pares, 
     * cuántos son múltiplos de 6 y múltiplos de 3 y cuántos acaban en 7
     */
    public  void ejemplo01()    {
        int termina7 = 0;
        int multiplo3 = 0;
        int multiplo6 = 0;
        int sumaImpares = 0;
        int productoPares = 1;
        int aleatorio = (int) (Math.random() * 101);
        while (aleatorio != 0)     {
            System.out.print(aleatorio + "\t");
            if (aleatorio % 2 == 0) { // es par
                productoPares *= aleatorio;
                if (aleatorio % 6 == 0)   {   // múltiplo de 6 y de 3               
                    multiplo6++;
                    multiplo3++;
                }
            }
            else  { // es impar 
                sumaImpares += aleatorio;
                if (aleatorio % 3 == 0)     { // múltiplo de 3
                    multiplo3++;
                }
                if (aleatorio % 10 == 7) { // acaba en 7
                    termina7++;
                }
            }
            aleatorio = (int) (Math.random() * 101);

        }
        System.out.println("\nSuma de impares: " + sumaImpares);
        System.out.println("Producto de  pares: " + productoPares);
        System.out.println("Múltiplos de 3: " + multiplo3);
        System.out.println("Múltiplo6: " + multiplo6);
        System.out.println("Acaban en 7: " + termina7);
    }

    /**
     * pausa 
     */
    public void esperar(int milisegundos)    {
        try   {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)    {
            // ignorar la excepción
        }
    }

    /**
     *  Factorial con do ... while
     *
     *  
     */
    public int factorialDoWhile(int n)    {
        int factorial = 1;
        int contador = 1;
        do  {
            factorial *= contador;
            contador++;

        }
        while (contador <= n);
        return factorial;
    }

    
}
