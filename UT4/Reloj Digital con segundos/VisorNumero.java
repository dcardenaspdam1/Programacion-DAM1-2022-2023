/**
 * La clase VisorNumero representa un visor digital que permite almacenar
 * valores entre 0 y un límite. El límite puede ser especificado cuando se crea
 * el visor. El rango de valores va de 0 a límite-1. Si se usa, por ejemplo, para 
 * los segundos un reloj digital, el límite sería 60, resultando en este caso que 
 * el visor mostraría valores entre 0 y 59. Al incrementarse, el visor da la vuelta 
 * automáticamente y se pone a 0 al alcanzar el límite.
 */

public class VisorNumero 
{
    private int limite;
    private int valor;

    /**
     * Constructor para objetos de la clase VisorNumero
     */
    public VisorNumero(int limiteMaximo)
    {
        limite = limiteMaximo;
        valor = 0;
    }

    /**
     * Devuelve el valor actual
     */
    public int getValor() 
    {
        return valor;
    }

    /**
     * Devuelve el valor del visor como una cadena de dos dígitos
     * Si el valor es menor que 10 se le añade a la iquierda un 0
     */

    public String getValorVisor()
    {
        if (valor < 10)    {
            return "0" + valor;
        }
        else    {
            return "" + valor;
        }
    }

    /**
     * Pone el valor del visor al nuevo valor especificado. Si el
     * nuevo valor es menor que 0 o ssupera el límite no hace nada
     */

    public void setValor(int nuevoValor) 
    {
        if ((nuevoValor >= 0) && (nuevoValor < limite))   {
            valor = nuevoValor;
        }
    }

    /**
     * Incrementa el valor del display en 1, dando la vuelta a cero
     * si se alcanza el límite
     */

    public void incrementar() 
    {
        valor = (valor + 1) % limite;
    }
}