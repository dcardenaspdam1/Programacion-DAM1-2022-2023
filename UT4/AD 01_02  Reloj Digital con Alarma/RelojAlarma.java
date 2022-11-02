
/**
 * Modela un reloj digital que incorpora una alarma
 * Al avanzar el reloj, si la hora coincide con la 
 * hora de alarma se emite  RINGGGGGGGGGG
 * 
 * @author 
 * @version 
 */
public class RelojAlarma
{
    private VisorReloj reloj;
    private Alarma alarma;

    /**
     * Constructor de la clase RelojAlarma
     */
    public RelojAlarma()
    {
        reloj = new VisorReloj();
        alarma = new Alarma();
    }

    /**
     * Constructor de la clase RelojAlarma
     */
    public RelojAlarma(int horas, int minutos)
    {
        reloj = new VisorReloj(horas, minutos);
        alarma = new Alarma();
    }

    /**
     * 
     * @param  hora miutos  La hora en que se activará la alarma    
     */
    public void setAlarma(int hora, int minutos)
    {
        alarma.setHoraAlarma(hora, minutos);
    }

    /**
     * 
     * 
     * @param  hora minutos  La nueva hora del reloj
     */
    public void ponerEnHora(int hora, int minutos)
    {
        reloj.ponerEnHora(hora, minutos);
    }

    /**
     * Indica si ya es la hora de alarma
     * @return true si la hora coincide con la de alarma
     */
    private boolean esHoraAlarma()
    {
        return  reloj.getHora().equals(alarma.getHoraAlarma());
    }

    /**
     * Avanzar el reloj
     *
     */
    public void emitirTic()
    {
        reloj.emitirTic();
        if (esHoraAlarma())    {
            System.out.println("RRRRIIIIIINNNNNNNGGGGGGGGG");
        }
    }

    /**
     * Devuelve la hora actual en el formato HH:MM.
     */
    public String getHora()
    {
        return reloj.getHora();
    }

    /**
     * 
     * 
     * @return  la hora de alarma en foramto string
     */
    public String getAlarma()
    {
        return alarma.getHoraAlarma();
    }

}
