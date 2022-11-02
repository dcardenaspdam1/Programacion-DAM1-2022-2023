
/**
 * Representa  a un  objeto que guarda la 
 * hora de alarma
 * 
 * @author 
 * @version 
 */
public class Alarma
{
    private int hora;
    private int minutos;

    /**
     * Constructor de la clase Alarma
     */
    public Alarma()
    {
        this.hora = 7;
        this.minutos = 0;
    }

    /**
     * Cambiar la hora de alarma
     * @param  hora la nueva hora de alarma
     * @param minutos los minutos de la hora de alarma
     */
    public void  setHoraAlarma(int hora, int minutos)
    {
        this.hora = hora;
        this.minutos = minutos;
    }

    /**
     * devuelve la hora de alarma
     * @return     un string representando la hora de alarma
     */
    public String getHoraAlarma()
    {
        // String str = "";+
        // if (hora < 10) {
        // str =  "0";  
        // }
        // str = str + hora + ":" ;
        // if (minutos < 10) {
        // str =  "0";  
        // }
        // str = str + minutos;
        // return str;

        return String.format("%02d:%02d", hora, minutos);
    }

}
