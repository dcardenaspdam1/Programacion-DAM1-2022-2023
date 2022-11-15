
/**
 * La clase modela un nº exponencial y permite realizar operaciones
 * con exponenciales
 * 
 */
public class Exponencial
{
    // cada objeto de la clase almacena la base y el exponente de un nº exponencial
    private int base;  
    private int exponente;

    /**
     * constructor para los objetos de la clase Exponencial
     * Construtor de un nº exponecial a partir de una base y exponente
     * @param base la base del nº
     * @param exponente el exponente del nº
     */
    public Exponencial(int base, int exponente)    {
        this.base = base;
        this.exponente = exponente;
    }

    /**
     * constructor para los objetos de la clase Exponencial
     * Construtor de un nº exponecial a partir de otro
     * @param otro el nº exponencial con el que se construirá
     * el actual
     */
    public Exponencial(Exponencial otro)    {
        base = otro.getBase();
        exponente = otro.getExponente();
    }

    /**
     * Accesor para la base
     */
    public int getBase()    {
        return base;
    }

    /**
     * Accesor para el exponente
     */
    public int getExponente()    {
        return exponente;
    }

    /**
     * Mutador para la base
     */
    public void setBase(int base)    {
        this.base = base;
    }

    /**
     * Mutador para el exponente
     */
    public void setExponente(int exponente)    {
        this.exponente = exponente;
    }

    /**
     * calcula a elevado a b
     * b siempre es un valor >= 0
     * 
     * 
     */
    private int potencia(int a, int b)    {
        int resul = 1;

        for (int i = 1; i <= b; i++)  {
            resul = resul * a;
        }
        return resul;
    }      

    /**
     * @return el valor exponencial del nº
     */
    public double valorExponencial()    {
        double resultado;
        int poten = potencia(base , Math.abs(exponente));
        if (exponente < 0)     {
            resultado = (double) 1 / poten;
        }
        else   {
            resultado = poten;
        }
        return resultado;
    }

    /**
     * Multiplica el actual nº exponencial por el que 
     * se recibe como parámetro
     * @param otro  nº exponencial por el que se multiplica
     * @return  el producto de dos nºs exponenciales
     */
    public Exponencial multiplicar(Exponencial otro)   {
        Exponencial tmp = new Exponencial(base, exponente + otro.getExponente());
        return tmp;
    }

    /**
     * Divide el actual nº exponencial entre el que 
     * se recibe como parámetro
     * @param otro  nº exponencial entre el que se dividirá
     * @return  el cociente de dos nºs exponenciales
     */
    public Exponencial dividir(Exponencial otro)   {
        Exponencial tmp = new Exponencial(base, exponente - otro.getExponente());
        return tmp;
    }

    /**
     * Eleva a una potencia un nº exponencial
     * 
     * @param n potencia a la que se eleva el nº
     * @return  nuevo nº exponencial elevado a n
     */
    public Exponencial elevar(int n)   {
        return new Exponencial(base, exponente * n);
    }

    /**
     * Representación textual del número
     */
    public String toString()
    {
        return "Base:" + base +
            "\tExponente:" + exponente + "\n\tValor: " +
            this.valorExponencial();
       
    }

}
