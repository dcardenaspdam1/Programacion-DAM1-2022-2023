/**
 * La clase modela objetos Personaje en un hipotético
 * juego. Los personajes pueden avanzar y girar en diferentes 
 * direcciones
 * 
 * @author 
 * @version 
 */
public class Personaje
{
    private final char NORTE = 'N';
    private final char SUR = 'S';
    private final char ESTE = 'E';
    private final char OESTE = 'O';

    private String nombre;
    private int x;
    private int y;
    private char orientacion;

    /**
     * Constructor de la clase Personaje
     * @paran queNombre elnombre del personaje
     */
    public Personaje(String queNombre)    {
        nombre = queNombre;
        x = 0;
        y = 0;
        orientacion = NORTE;
    }

    /**
     * Cambia la orientación del personaje que
     * siempre gira en el sentido de las
     * agujas del reloj
     */
    public void girar()    {
        if (orientacion == NORTE)  {
            orientacion = ESTE;
        } 
        else if (orientacion == ESTE)  {
            orientacion = SUR;
        }
        else if (orientacion == SUR)  {
            orientacion = OESTE;
        }
        else   {
            orientacion = NORTE;
        }
    }

    /**
     * Avanzar una determinada distancia según
     * la orientación del personaje
     *
     * @param  distancia unidades deavance   
     */
    public void  avanzar(int distancia)    {
        if (orientacion == NORTE) {
            y += distancia;
        }
        else if (orientacion == SUR)  {
            y -= distancia;
        }
        else if (orientacion == ESTE)  {
            x += distancia;
        }
        else  {
            x -= distancia;
        }
    }

    /**
     * Devuelve una representación textual del personaje
     *
     * @return el string que representa el personaje 
     */
    public String toString()    {
        String auxStr = "Personaje " + nombre + "\n" +
                "Orientacion = " + orientacion + "\n" +
                "Posicion = " + "[ " + x + " , " + y + " ] ";
        return auxStr;
    }    

}
