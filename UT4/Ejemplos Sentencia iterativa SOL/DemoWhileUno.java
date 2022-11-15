import java.util.Scanner;
import java.util.Random;
/**
 *  Clase que inclute métodos para probar la
 *  sentencia iterativa while
 *   
 *   
 */
public class DemoWhileUno
{
    private final char ESPACIO = ' ';
    private final char ASTERISCO = '*';
    private Random generador;
    private Scanner teclado;
    private Dado dado;
    private Moneda moneda;

    /**
     * Constructor  
     */
    public DemoWhileUno()    {
        generador = new Random();
        teclado = new Scanner(System.in);
        moneda = new Moneda();
        dado = new Dado();
    }

    /**
     *  
     * Escribir un saludo 10 veces
     *  
     * 
     */
    public void ejemplo01()    {
        int veces = 1;
        while (veces <= 10) {

            System.out.println("Saludo: " + veces);
            veces++;
        }
    }

    /**
     *  
     * Tirar una moneda 10 veces
     * 
     */
    public void ejemplo02()    {
        int tiradas = 1;
        while (tiradas <= 10)  {
            moneda.tirar();
            tiradas++;
        }
    }

    /**
     *  
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     * Uso de contadores
     */
    public void ejemplo03()    {
        int caras = 0;  // es una variable contador
        int cruz = 0;  // es una variable contador
        int tiradas = 1;  // es una variable contador
        while (tiradas <= 30)   {
            moneda.tirar();
            if (moneda.esCara()) {
                caras++;
            }
            else  {
                cruz++;
            }
            tiradas++;
        }
        System.out.println("Ha salido cara " + caras + " veces");
        System.out.println("Ha salido cruz " + cruz + " veces");
    }

    /**
     *  
     * Suma y producto de los números naturales desde el 20 hasta el 1
     * Uso de acumuladores
     */
    public void ejemplo04()    {
        int suma = 0; // variable acumulador
        long producto = 1;  // variable acumulador
        int contador = 20;  // variable contador de control del bucle
        while (contador >= 1)   {
            suma = suma + contador;
            producto = producto * contador;
            contador--;
        }
        System.out.println("La suma vale " + suma);
        System.out.println("El producto vale " + producto);
    }

    /**
     *  Generar aleatorios entre 10 y 50 inclusive y escribirlos
     *  El bucle termina cuando sale el 25
     *  Mostrar los números en filas de 6 formateados a 4 espacios
     *  
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo05()   {
        int total = 0;
        // int aleatorio = (int) (Math.random() *  41) + 10;
        int aleatorio = generador.nextInt(41) + 10;
        while (aleatorio != 25)    {
            System.out.print(String.format("%4d", aleatorio));
            total ++;
            if (total % 6 == 0)  {
                System.out.println();
            }
            aleatorio = generador.nextInt(41) + 10;
        }
    }

    /**
     *  Generar aleatorios entre 10 y 50 inclusive y escribirlos
     *  El bucle termina cuando sale el 25
     *  Mostrar los números en filas de 6 formateados a 4 espacios
     *  
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo05_2()    {
        // int aleatorio = (int) (Math.random() *  41) + 10;
        int aleatorio = generador.nextInt(41) + 10;
        while (aleatorio != 25)    {
            // escribir fila
            int total = 1;
            while (aleatorio != 25 && total <= 6) {
                System.out.print(String.format("%4d", aleatorio));
                aleatorio = generador.nextInt(41) + 10;
                total ++;

            }
            System.out.println();

        }
    }

    /**
     *  Generar aleatorios entre 0 y 50 inclusive y sumarlos.
     *  Parar cuando salga el 0. Escribir al final la suma
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo06()    {
        int suma = 0;
        int aleatorio = generador.nextInt(51);
        while (aleatorio != 0)   {
            suma += aleatorio;
            aleatorio = generador.nextInt(51);
        }
        System.out.println("La suma vale " + suma);

    }

    /**
     *  
     * Tirar una moneda hasta que salga cara o se hayan hecho 30 tiradas
     *  Usar una variable booleana como conmutador (o flag) para
     * salir del bucle
     */
    public void ejemplo07()    {
        boolean salioCara = false; // variable que actúa como flag
        int tiradas = 1;
        while (tiradas <= 30 && !salioCara)    {
            moneda.tirar();
            if (moneda.esCara())    {
                salioCara = true;
            }
            else   {
                tiradas++;
            }
        }
        if (tiradas <= 30) {
            System.out.println("Salió cara en la tirada " + tiradas);            
        }
        else {
            System.out.println("No salió cara en ninguna tirada");        
        }

    }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *  Sin usar switch o conmutadores
     */
    public  void ejemplo08()    {

        int sumaPar = 0;  // es un acumulador
        long productoImpar = 1;   //es un acumulador
        int numero = 1;  //es un contador
        while (numero <= 99)  {
            productoImpar *= numero;  
            sumaPar += (numero + 1);
            numero = numero + 2;
        }
        System.out.println("Suma de pares " + sumaPar);
        System.out.println("Producto de impares " + productoImpar);
    }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *  Usando de switch o conmutadores
     */
    public  void ejemplo09()    {

        int sumaPar = 0;  // es un acumulador
        long productoImpar = 1;   //es un acumulador
        boolean tocaImpar = true;  // es un switch
        int numero = 1;  //es un contador
        while (numero <= 100)    {
            if (tocaImpar)       {
                productoImpar *= numero;                
            }
            else    {
                sumaPar += numero;                 
            }
            tocaImpar = !tocaImpar;
            numero++;
        }
        System.out.println("Suma de pares " + sumaPar);
        System.out.println("Producto de impares " + productoImpar);
    }

    /**
     * Generar n aleatorios entre 5 y 15 inclusive y contar los pares, los que acaban en 2
     * y sumar los impares
     * Calculamos también el máximo de todos ellos
     */
    public  void ejemplo10(int n)    {
        int maximo = 0;
        int pares = 0; // contador de pares
        int suma = 0; // acumulador para impares
        int enDos = 0; //contador para los que acabne en 2
        int cuantos = 1;
        while (cuantos <= n)   {
            int aleatorio = generador.nextInt(11) + 5;
            if (aleatorio % 2 == 0) {
                pares++;
                if (aleatorio % 10 == 2)   {
                    enDos++;
                }
            }
            else  {
                suma += aleatorio;
            }
            if (aleatorio > maximo) {
                maximo = aleatorio;
            }
            cuantos++;
        }
        System.out.println("Total pares: " + pares);
        System.out.println("Suma impares: " + suma);
        System.out.println("Terminan en 2: " + enDos);
        System.out.println("El máximo es:: " + maximo);

    }

    /**
     * Tirar un dado repetidas veces hasta que salga un 6.
     * Contar las tiradas y sumarlas (se excluye el 6 de los cálculos)
     *
     */
    public void ejemplo11()    {
        int tiradas = 1;
        int suma = 0;
        dado.tirarDado();
        int valor = dado.getCara();
        while (valor != 6)      {
            System.out.println("Valor de la tiradas: " + valor);
            suma += valor;            
            dado.tirarDado();
            valor = dado.getCara();
            tiradas++;
        }
        System.out.println("Total suma hasta el 6 " + suma);
        System.out.println("Nº tiradas hasta el 6 " + tiradas);

    }

    /**
     *  Pregunta 9 del cuestionario I UT4
     *  
     *  Pide al usuario una letra y valida con un bucle while que sea una vocal 
     *  minúscula. Si no es así pide de nuevo  al usuario otra letra hasta que 
     *  introduzca una letra correcta (hazlo con un while)
     */
    public void ejemplo12()    {
        char letra = pedirLetra();
        while (!esLetraMinuscula(letra)) {
            letra = pedirLetra();

        }
    }

    /**
     *  
     */
    private char pedirLetra()    {
        System.out.print("Teclea letra:");
        char letra = teclado.nextLine().charAt(0);
        return letra;
    }

    /**
     *  
     */
    private boolean esLetraMinuscula(char letra)    {
        return letra == 'a' || letra == 'e' || letra == 'i' ||
        letra == 'o' || letra == 'u';
    }

    /**
     * Hacer una traza en papel  de este método y deducir qué salida produce
     * para las llamadas  misterio(1);       misterio(6);    
     *              misterio(19);  misterio(39);     misterio(74);
     */
    public void misterio1(int x)    {
        int y = 1;
        int z = 0;
        while (2 * y <= x) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }

    /**
     * Para hacer la traza en papel
     */
    public  int misterio2(int a, int b)    {
        int p = 1;
        int contador = 1;
        while (contador <= b) {
            p = p * a;
            contador ++;
        }
        return p;

    }

    /**
     * Para hacer la traza en papel
     */
    public  int misterio3(int a, int b)    {
        int s = 0;
        int contador = 1;
        while (contador <= b) {
            s = s + a;
            contador ++;
        }
        return s;

    }

    /**
     * Para hacer la traza en papel
     * Qué devuelve si llamamos misterio4(100) ?
     */
    public void misterio4(int n) {
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + "\t");
                n = n / i;
            }
            else {
                i++;
            }
        }
    }

    /**
     * Para hacer la traza en papel
     * Qué devuelve si llamamos misterio5(35207) ?
     */
    public int misterio5(int n)    {
        int r = 0;
        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            if (d % 2 != 0) {
                r += d;
            }
        }
        return r;
    }

    /**
     *  Calcular y devolver el nº de cifras de numero
     */
    public int contarCifras(int numero)    {
        // numero = Math.abs(numero) y (numero > o) condición del while
        int cifras = 0;
        while (numero != 0)  {
            cifras ++;
            numero /= 10;
        }
        return cifras;
    }

    /**
     *  Calcular y devolver el nº de cifras de numero
     */
    public int contarCifrasV2(int numero)    {
        numero = Math.abs(numero);
        int cifras = 1;
        while (numero >= 10)  {
            cifras ++;
            numero /= 10;
        }
        return cifras;
    }

    /**
     *  Calcular el inverso de un nº (sin contar previamente sus cifras)
     */
    public int inversoV1(int numero)    {
        int inverso = 0;
        while (numero != 0)   {
            inverso = inverso * 10 + numero % 10;
            numero /= 10;
        }
        return inverso;
    }

    /**
     *  Calcular el inverso de un nº (contando previamente sus cifras)
     */
    public int inversoV2(int numero)    {
        int cifras = contarCifras(numero);
        int inverso = 0;
        int potencia = (int) Math.pow(10, cifras - 1);
        int c = 1;
        while (c <= cifras)    {
            inverso = inverso  + (numero % 10) * potencia;
            // inverso = inverso  + (numero % 10) * (int) Math.pow(10, cifras - c);
            numero /= 10;
            potencia /= 10;
            c++;
        }
        return inverso;
    }

    /**
     * Generar 20 nºs aleatorios entre 5 y 10 incluidos
     * y para cada número calcular y escribir su sumatorio
     */
    public  void bucleAnidado01()    {

        int cuantos = 1;
        while (cuantos <= 20)   {
            // int aleatorio = (int) (Math.random() * 6) + 5;
            int aleatorio = generador.nextInt(6) + 5;
            int sumatorio = 0;
            int i = 1;
            while (i <= aleatorio)  {
                sumatorio += i;
                i++;
            }
            System.out.println("El sumatorio de " + aleatorio + " es " + sumatorio);
            cuantos++;
        }

    }

    /**
     * Generar 10 nºs aleatorios entre 5 y 50 incluidos
     * y mostrar un  histograma
     * 
     *  7: * * * * * * *
     *  6: * * * * * *
     *  7: * * * * * * *
     *  9: * * * * * * * * *
     *  10: * * * * * * * * * *
     *  8: * * * * * * * *
     *  9: * * * * * * * * *
     *  10: * * * * * * * * * *
     *  5: * * * * *
     *  9: * * * * * * * * *
     */
    public  void bucleAnidado02()    {
        int contador = 1;
        while (contador <= 10) {
            int aleatorio =  generador.nextInt(6) + 5;
            System.out.print(aleatorio + ":");
            int asteriscos = 1;
            while (asteriscos <= aleatorio) {
                System.out.print(String.format("%2c", ASTERISCO));
                asteriscos++;
            }
            System.out.println();
            contador++;
        }

    }

    /**
     * Mostrar la siguiente figura  (6 filas y 10 columnas)
     *  1 1 1 1 1 1 1 1 1 1
     *  2 2 2 2 2 2 2 2 2 2
     *  3 3 3 3 3 3 3 3 3 3
     *  4 4 4 4 4 4 4 4 4 4
     *  5 5 5 5 5 5 5 5 5 5
     *  6 6 6 6 6 6 6 6 6 6
     * 
     */
    public void bucleAnidado03()    {

        int fila = 1;
        while (fila <= 6) {             
            int col = 1;
            while (col <= 10)   {
                System.out.print(String.format("%2d", fila));
                col++;
            }
            System.out.println();
            fila++;
        }

    }

    /**
     *  Mostrar la figura
     *  1
     *  1 2
     *  1 2 3
     *  1 2 3 4
     *  1 2 3 4 5
     *  1 2 3 4 5 6
     *
     *  
     */
    public  void bucleAnidado04(int n)    {

        int fila = 1;
        while (fila <= n)   {             
            int col = 1;
            while (col <= fila)   {
                System.out.print(String.format("%2d", col));
                col++;
            }
            System.out.println();
            fila++;
        }

    }

    /**
     *  Mostrar la serie
     *              1
     *             21
     *            321
     *           4321
     *          54321
     *         654321
     *        7654321       
     *
     *  
     */
    public  void bucleAnidado05(int n)    {

        int fila = 1;
        while (fila <= n)   {   
            escribirEspacios(n - fila);
            int col = fila;
            while (col >= 1)  {
                System.out.print(col);
                col--;
            }
            System.out.println();
            fila++;
        }

    }

    /**
     *  Mostrar la figura de n filas (asumimos n >=1)
     *  usando escribirEspacios()
     *              1
     *             121
     *            12321
     *           1234321
     *          123454321
     *         12345654321
     *
     *  
     */
    public void trianguloV1(int n)   {
        int fila = 1;
        while (fila <= n)  {   
            escribirEspacios(n - fila);
            int col = 1;
            int valor = col;
            while (col <= 2 * fila - 1)  {                 
                if (col <= fila) {
                    valor = col;
                }
                else   {
                    valor--;
                }
                System.out.print(valor);
                col++;
            }
            System.out.println();
            fila++;
        }
    }

    /**
     *  Mostrar la figura de n filas (asumimos n >=1)
     *  usando escribirEspacios()
     *              1
     *             121
     *            12321
     *           1234321
     *          123454321
     *         12345654321
     *
     *  
     */
    public void trianguloV2(int n)   {
        int fila = 1;
        while (fila <= n)    {   
            escribirEspacios(n - fila);
            int col = 1;
            while (col <= fila)     {                 
                System.out.print(col);
                col++;
            }
            col = fila - 1;
            while (col >= 1)      {                 
                System.out.print(col);
                col--;
            }
            System.out.println();
            fila++;
        }
    }

    /**
     *  escribir n espacios
     *  
     */
    private void escribirEspacios(int n)    {
        int contador = 1;
        while (contador <= n)     { 
            System.out.print(ESPACIO);
            contador++;
        }
    }

    /**
     *  Mostrar cada nº y su cuadrado, del 1 al n
     *
     *  
     */
    public void tablaCuadrados(int n)    {
        int contador = 1;
        while (contador <= n)    { 
            System.out.println(contador + "- ( " + contador +
                " * " + contador + " ) = " + (contador * contador));
            contador++;
        }
    }

    /**
     *  Mostrar cada nº y su cuadrado, del 1 al n
     *
     *  
     */
    public void tablaCuadradosV2(int n)    {
        System.out.printf("%20s : %-20s\n", "Número", "Cuadrado");
        int contador = 1;
        while (contador <= n)    { 
            System.out.printf("%20d : %-20s\n", contador, "( " + 
                contador + " * " + contador + " ) = " + (contador * contador));
            contador++;
        }
    }

    /**
     *  Tabla de multiplicar del nºn
     *
     *  
     */
    public void tablaMultiplicar(int n)    {
        int contador = 1;
        while (contador <= n)  { 
            System.out.println(contador + " * " + n + " = " + (n * contador));
            contador++;
        }
    }

    /**
     * El programa hace una pausa de los milisegundos especificados
     */
    public void esperar(int milisegundos)
    {
        try        {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)        {
            // ignorar la excepción
        }
    }

    /**
     * Para hacer la traza en papel
     */
    public  int queHace01(int a, int b)    {
        int p = 1;
        int contador = 1;
        while (contador <= b)    {
            p = p * a;
            contador ++;
        }
        return p;

    }

    /**
     * Para hacer la traza
     */
    public  int queHace02(int a, int b)  {
        int s = 0;
        int contador = 1;
        while (contador <= b)     {
            s = s + a;
            contador ++;
        }
        return s;

    }

    /**
     *  
     * Ejemplo validar un número     
     */
    public void demoValidarNumeroConWhile() {
        System.out.println("Dame nº");
        int n = teclado.nextInt();
        while (n <= 0) {
            System.out.println("Dame nº");
            n = teclado.nextInt();
        }

    }

    /**
     *  
     * Ejemplo validar un número     
     */
    public void demoValidarNumeroConWhileV2() {

        int n = leerNumero();
        while (n <= 0) {
             n = leerNumero();
        }

    }

    /**
     *       
     */
    public int leerNumero() {
        System.out.println("Dame nº");
        int n = teclado.nextInt();
        return n;
    }

    /**
     *  
     * Ejemplo validar un número     
     */
    public void demoValidarNumeroConDoWhile() {

        int n;
        do {
            System.out.println("Dame nº");
            n = teclado.nextInt();
        }
        while (n <= 0);

    }

}
