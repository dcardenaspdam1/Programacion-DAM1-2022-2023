
/**
 * Modela objetos Calentador que
 * registran la temperatura de algún lugar y permiten
 * calentar(aumentar) y enfriar(disminuir) esa
 * temperatura
 * 
 */
public class Calentador
{
 
    private int temperatura;  
    private int minimo;
    private int maximo;
    private int incremento;

    /**
     * constructor para los objetos de la clase Calentador
     * Inicialmente la temperatura inicial es 15
     */
    public Calentador(int queMinimo, int queMaximo)    {
        temperatura = 15;
        if (queMinimo > temperatura)  {
            minimo = temperatura;
        }
        else  {
            minimo = queMinimo;
        }
        if (queMaximo < temperatura) {
            maximo = temperatura;
        }
        else  {
            maximo = queMaximo;
        }
        incremento = 5;
        
    }
    
    /**
     * Incrementa la temperatura en 5 grados (luego en incremento)
     * teniendo  en cuenta que no sobrepase el máximo
     */
    
    public void calentar()    {
        int nuevaTempe = temperatura + incremento;
        if (nuevaTempe <= maximo)  {
            temperatura = nuevaTempe;
        }
        else  {
            temperatura = maximo;
        }
    }
    
    /**
     *  Decrementa la temperatura en 5 grados (luego el incremento), no hay que bajar
     *  del mínimo
     */
    public void enfriar()    {
        int nuevaTempe = temperatura - incremento;
        if (nuevaTempe >= minimo) {
            temperatura = nuevaTempe;
        }
        else {
            temperatura = minimo;
        }
    }
    
    /**
     * Establecer el incremento que determina cuando pueden cambiar la 
     * temperatur los métodos enfriar() y calentar()
     */
    public void setIncremento(int queIncremento)    {
        if (queIncremento > 0)  {
            incremento = queIncremento;
        }
    }
    /**
     *  Devuelve la temperatura actual del calentador
     *  @return la temperatura actual del calentador
     */
    public int getTemperatura()    {
        return temperatura;
    }
    

}
