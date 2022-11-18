
/**
 * Representa a un nº entero
 * 
 *  
 */
public class Numero
{
    private final char ASTERISCO = '*';
    private int numero;

    /**
     * constructor por defecto para los objetos de la clase Numero
     */
    public Numero()   {
        this.numero = 0;
    }

    /**
     * constructor para los objetos de la clase Numero
     */
    public Numero(int numero)   {
        this.numero = numero;
    }

    /**
     * constructor para los objetos de la clase Numero
     * inicializa el atributo numero del objeto actual con el
     * que guarda el objeto recibido como parámetro
     */
    public Numero(Numero numero)   {
        this.numero = numero.getNumero();
    }

    /**
     * accesor para el atributo
     */
    public int getNumero()   {
        return numero;
    }

    /**
     * mutador para el atributo
     */
    public void setNumero(int numero)   {
        this.numero = numero;
    }
    
     /**
     * @param otroNumero  el numero con el que se va a comparar
     * @return true si los dos núemros son iguales, falso en otro caso
     */
    public boolean esMayorQue(Numero otroNumero)    {
        return (numero > otroNumero.getNumero());
    }

    /**
     * calcula y devuelve el factorial de numero con for
     *      6! = 6 * 5 * 4 * 3 * 2 * 1
     *      0! = 1
     */
    public int factorial()    {
        int facto = 1;
        for (int n = 2; n <= numero; n++)  {
            facto = facto * n;
        }

        return facto;
    }
    
      /**
     * detecta si un nº es primo o no
     */
    public boolean esPrimo()    {
        if (numero == 1) {
            return false;
        }
        for (int divisor = 2; divisor <= numero / 2; divisor++)  {
           if (numero % divisor == 0) {
               return false;
            }
        }

        return true;
    }

    /**
     *   
     * Dibuja un cuadrado relleno en la pantalla
     * con for
     *    Si numero = 5
     *    *****
     *    *****
     *    *****
     *    *****
     *    *****
     */
    public void escribirFigura()    {
        for (int fila = 1; fila <= numero; fila++)    {
            for (int col = 1; col <= numero; col++)    {
                System.out.print(String.format("%2c", ASTERISCO));
            }
            System.out.println();
        }
    }


    /**
     * @return la cantidad de cifras del nº
     */
    public int contarCifras()    {
        int cuantas = 0;

        int aux = numero;
        while (aux != 0)    {
            cuantas++;
            aux = aux / 10;
        }
        return cuantas;
    }


    /**
     * @param numero el nº del que se calculará el inverso 
     * @return el inverso
     */
    private int inverso(int numero)    {
        // lo hacemos sin contar previamente las cifras 
        int cuantas = 0;

        int invertido = 0;
        int aux = numero;
        while (aux != 0)   {
            int cifra = aux % 10;
            invertido = invertido * 10 + cifra;   
            aux = aux / 10;
        }
        return invertido;
    }

    /**
     * @return true si numero es capicúa
     */
    public boolean esCapicua()   {
        return this.numero ==  inverso(numero);
    }

      /**
     * Convertir a base 8 
     * @return   el nº convertido
     * Si numero = 17 devuelve 21
     * Si numero = 245 devuelve 365
     * Si numero = 6 devuelve 6
     * Si numero = 8 devuelve 10
     */
    public int aBase8()    {
        int potencia = 1;
        int enBase8 = 0;
        int aux = this.numero;
        while (aux != 0)   {
            int resto = aux % 8;
            enBase8 += potencia * resto;
            potencia = potencia * 10;
            aux = aux / 8;

        }
        return enBase8;
    }

     /**
     *  devuelve true si cifra está en numero
     *  Con ayuda del método privado estaCifra()
     */
    public boolean estaCifra(int cifra)    {
        return estaCifra(this.numero, cifra);

    }

    /**
     * Detecta si está o no una cifra en el nº
     * @param  cifra la cifra a localizar
     * @return   true si está la cifra
     */
    private boolean estaCifra(int numero, int cifra)    {
        int aux = numero;
        while (aux != 0)  {
            int resto = aux % 10;
            if (resto == cifra)   {
                return true;
            }
            aux = aux / 10;
        }
        return false;
    }

    
   /**
     * Detecta si el atributo numero  tiene cifras repetidas
     * Usa el método privado anterior 
     */
    public boolean hayCifrasRepetidas()    {
        int aux = this.numero;
        while (aux != 0)  {
            int cifra = aux % 10;
            if (estaCifra(aux / 10, cifra)) {
                return true;
            }
            aux = aux / 10;
        }

        return false;
    }


    /**
     * Calcula y devuelve la representación binario
     * del atributo numero (lo convierte a base 2)
     * @return   el nº convertido a base 2
     * 
     * Si numero = 15 devuelve 1111
     * Si numero = 252 devuelve 11111100
     * Si numero = 13 devuelve 1101
     */
    public int aBase2()    {
        int potencia = 1;
        int enBase2 = 0;
        int aux = this.numero;
        while (aux != 0)     {
            int resto = aux % 2;
            enBase2 += potencia * resto;
            potencia = potencia * 10;
            aux = aux / 2;

        }
        return enBase2;
    }

   
}

