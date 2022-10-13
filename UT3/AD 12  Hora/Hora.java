
/**
 * Clase Hora cuyos objetos almacenan la hora
 * el formato hh, mm, ss
 * 
 *  
 */
public class Hora
{
    private int hora;
    private int minutos;
    private int segundos;

    /**
     * constructor para los objetos de la clase Hora
     */
    public Hora()    {
        hora = 0;
        minutos = 0;
        segundos = 0;
    }

    /**
     * constructor parametrizado para los objetos de la clase Hora
     */
    public Hora(int queHora, int queMinutos, int queSegundos)    {
        hora = queHora;
        minutos = queMinutos;
        segundos = queSegundos;
    }   

    /**
     * Obtener la hora
     */
    public int getHora()   {
        return hora;
    }

    /**
     * Obtener los minutos 
     */
    public int getMinutos()    {
        return minutos;
    }

    /**
     * Obtener lossegundos  
     */
    public int getSegundos()    {
        return segundos;
    }

    /**
     * Establecer una nueva hora
     */
    public void setHora(int queHora)    {
        hora = hora;
    }

    /**
     * Establecer minutos
     */
    public void setMinutos(int queMinutos)    {
       minutos = minutos;
    }

    /**
     * Establecer segundos
     */
    public void setSegundos(int queSegundos)    {
        segundos = queSegundos;
    }

    /**
     * Representación textual de la hora hh:mm:ss
     */
    public String  toString()    {
        String resul = "";

        if (hora < 10)  {
            resul = "0";
        }
        resul +=  hora + ":";
        if (minutos < 10)   {
            resul += "0";
        }
        resul += minutos + ":";
        if (segundos < 10)  {
            resul += "0";
        }
        resul += segundos;
        return resul;
    }

    /**
     * Devolver nº de segundos transcurridos
     */
    public int aSegundos()    {
        return hora * 3600 + minutos * 60 + segundos;
    }

    /**
     * Avanzar un segundo la hora
     */
    public void avanzarSegundo()    {
        segundos++;
        if (segundos == 60)    {
            segundos = 0;
            minutos++;
            if (minutos == 60)  {
                minutos = 0;
                hora++;
                if (hora == 24)   {
                    hora = 0;
                }
            }

        }
    }

    /**
     * Retrasar un segundo la hora
     */
    public void retrasarSegundo()    {
        segundos--;
        if (segundos == -1)  {
            segundos = 59;
            minutos--;
            if (minutos == -1)  {
                minutos = 59;
                hora--;
                if (hora == -1) {
                    hora = 23;
                }
            }

        }
    }

    /**
     *  Convertir a formato de 12h, AM / PM
     *  Ejercicio 17 
     */
    public String enFormatoAmPm()    {
        String ampm = " AM";
        int h = hora;
        int m = minutos;
        int s = segundos;
        h = h % 12;
        int c = hora / 12;
        if (h == 0)     {
            h = 12;             
        }
        if (c > 0)   {
            ampm = " PM";
        }

        String resul = "";

        if (h < 10)    {
            resul = "0";
        }
        resul +=  h + ":";
        if (m < 10)     {
            resul += "0";
        }
        resul += m + ":";
        if (s < 10)    {
            resul += "0";
        }
        resul += s;
        return resul + ampm;

    }

    

}

