
/**
 * La clase JuegoNumeroSecreto modela las reglas del
 * juego y guarda el estado del mismo
 * 
 */
import java.util.Random;
public class JuegoNumeroSecreto
{
    private static final int MAX_INTENTOS = 5;
    private int numeroSecreto;
    private Contador intentos;
    private boolean terminado;   
    private String resultado; // aquí se deja el mensaje "Más alto", "Más bajo", "Has adivinado el nº", ......
    private static Random generador = new Random();

    /**
     * Constructor de la clase JuegoNumeroSecreto
     * crea el generador y el contador de intentos y prepara
     * el juego para empeazr a jugar
     */
    public JuegoNumeroSecreto()    {
        intentos = new Contador();
        resetJuego();
    }

    /**
     * Prepara todo para empezar a jugar,
     * genera un nº secreto, el contador de intentos se pone otra vez a 0
     * etc, .......
     *   
     */
    public void resetJuego()    {
        numeroSecreto = generador.nextInt(100) + 1; 
        intentos.reset();
        terminado = false;
        resultado = "";
    }

    /**
     * 
     * Accesor para el nº de intentos 
     */
    public int getIntentos()    {
        return intentos.getContador();
    }

    /**
     * 
     * Devuelve el máximo nº de intentos permitidos
     */
    public int getMaximoIntentos()    {
        return MAX_INTENTOS;
    }

    /**
     * Aumenta el nº de intentos por parte del usuario
     */

    public void incrementarIntentos()    {
        intentos.incrementar();
    }

    /**
     * Simula una única jugada
     * 
     * Cada nueva jugada es un intento más. Habrá que comprobar si 
     * ha acertado o no y si ha consumido todos sus intentos actualizando el estado
     * del juego adecuadamente. El resultado "Más alto", "Más bajo", .... se deja
     * en resultado
     * 
     * @param intentado el nº intentado
     */
    public void realizarJugada(int intentado)    {

        incrementarIntentos();
        if (getIntentos() == MAX_INTENTOS || intentado == numeroSecreto)     {
            terminado = true;
            if (numeroSecreto == intentado)     {

                resultado = "Enhorabuena has adivinado el número " + numeroSecreto + 
                "\nen " + getIntentos() + " intentos";   
            }
            else    {
                resultado = "Lo siento, has agotado los " + MAX_INTENTOS + " intentos " +
                "\nEl nº secreto era " + numeroSecreto;
            }
        }
        else  if (numeroSecreto < intentado)     {
            resultado = " Más bajo";
        }
        else    {
            resultado = " Más alto";
        }

    }

    /**
     * 
     * Accesor que devuelve el valor del atributo terminado
     *  
     */
    public boolean haTerminado()   {        
        return terminado;
    }

    /**
     * Accesor para el resultado obtenido
     */
    public String getResultado()    {        
        return resultado;
    }

}
