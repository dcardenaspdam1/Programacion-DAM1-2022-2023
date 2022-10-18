/**
 * La clase VisorReloj implementa un panel de un reloj digital para un reloj
 * estilo 24 horas europeo. El reloj muestra horas y minutos. El rango del reloj es
 * 00:00 (medianoche) a 23:59 (un minuto antes de medianoche)
 * 
 * El reloj recibe "ticks" (via método emitirTicReloj) cada minuto y reacciona 
 * incrementando el visor. Esto se hace de la manera habitual: la hora se incrementa 
 * cuando los minutos alcanzan de nuevo el valor cero.
 *  
 */

public class VisorReloj
{
    private VisorNumero horas;
    private VisorNumero minutos;
    private String visorString; // simula el visor actual

    /**
     * Constructor de objetos VisorReloj. Este constructor crea un nuevo
     * reloj puesto en hora a las 00:00
     */

    public VisorReloj() 
    {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        actualizarReloj();
        
    }

      
    /**
     * Constructor de objetos VisorReloj. Este constructor crea un nuevo
     * reloj puesto en hora a lpartir de los parámetros pasaados 
     * al constructor
     */

    public VisorReloj(int hora, int minuto) 
    {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        ponerEnHora(hora, minuto);
         
    }

    /**
     * Este método debería llamarse una vez cada minuto - 
     * permite que el reloj avance un minuto
     */

    public void emitirTic()
    {
        minutos.incrementar();
        if (minutos.getValor() == 0) {  // se da la vuelta
        
            horas.incrementar();
        }
        actualizarReloj();
    }

    /**
     * Pone la hora en el visor a un deternminado valor de hora y minuto
     */

    public void ponerEnHora(int hora, int minuto)
    {
        horas.setValor(hora);
        minutos.setValor(minuto);
        actualizarReloj();
    }

    /**
     * Devuelve la hora actual en el formato HH:MM.
     */
    public String getHora() 
    {
        return visorString;
    }

    /**
     * Actualiza la cadena interna que representa el visor
     */
    private void actualizarReloj()
    {
        visorString = horas.getValorVisor() + ":" + minutos.getValorVisor();
    }
    
   

}