
/**
 * Representa a cafeteras con una determinada capacidad
 * sobre la que podemos realziar ciertas operaciones
 *  
 */
public class Cafetera
{
    private int capacidadMaxima;
    private int cantidadActual;

    /**
     * constructor para los objetos de la clase Cafetera
     */
    public Cafetera()    {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    /**
     * M�todo accesor 
     *
     * @return   capacidad m�xima de la cafetera  
     */
    public int getCapacidadMaxima()    {
        return capacidadMaxima;
    }

    /**
     * M�todo accesor 
     *
     * @return   capacidad actual de la cafetera  
     */
    public int getCantidadActual()    {
        return cantidadActual;
    }

    /**
     * M�todo mutador
     *
     * @param   capacidad m�xima de la cafetera  
     */
    public void setCapacidadMaxima(int queCapacidadMaxima)    {
        capacidadMaxima = queCapacidadMaxima; 
    }

    /**
     * M�todo mutador
     *
     * @param  cantidad actual de la cafetera  
     */
    public void setCantidadActual(int queCantidadActual)    {
        cantidadActual = queCantidadActual; 
    }

    /**
     * M�todo mutador
     *
     * Llena la cafetera poniendo la cantidad actual a su capacidad m�xima
     */
    public void llenarCafetera()    {
        cantidadActual = capacidadMaxima;
    }

    /**
     * M�todo mutador, sirve una taza de caf� de un determinado tama�o
     * @param cantidad  la capacidad de una taza de caf� 
     */

    public void servirTaza(int cantidad)    {
        if (cantidadActual < cantidad)  {
            // no llega para toda la taza, se sirve lo que hay
            cantidadActual = 0;
        }
        else  {
            cantidadActual -= cantidad;
        }
    } 

    /**
     * M�todo mutador
     *
     * Vaciar la cafetera poniendo la cantidad actual a 0
     */
    public void vaciarCafetera()    {
        cantidadActual = 0;
    }

    /**
     * M�todo mutador
     *
     * Agrega caf� a la cafetera
     * @param  cantidad de caf� a agregar
     */
    public void agregarCafe(int cantidad)    {
        if (capacidadMaxima - cantidadActual <= cantidad)  {
            cantidadActual = capacidadMaxima;
        }
        else  {
            cantidadActual += cantidad;
        }
    }

}
