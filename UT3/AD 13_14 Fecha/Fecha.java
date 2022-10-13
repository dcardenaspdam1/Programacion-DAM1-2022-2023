
/**
 * Clase Fecha que representa a fechas
 * Ejercicios 13 y 14
 *  
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int año;

    /**
     * constructor parametrizado 
     * para los objetos de la clase Fecha
     */
    public Fecha(int queDia, int queMes, int queAnio)    {
        dia = queDia;
        mes = queMes;
        año = queAnio;
    }   

    /**
     * Obtener el día   
     */
    public int getDia()    {
        return dia;
    }

    /**
     * Obtener el mes 
     */
    public int getMes()    {
        return mes;
    }

    /**
     * Obtener el anio  
     */
    public int getAño()    {
        return año;
    }

    /**
     * Establecer un nuevo año
     */
    public void setAño(int queAnio)    {
        año = queAnio;
    }

    /**
     * Establecer un nuevo mes
     */
    public void setMes(int queMes)    {
        mes = queMes;
    }

    /**
     * Establecer un nuevo dia
     */
    public void setDia(int queDia)    {
        dia = dia;
    }

    /**
     * Comprobar si el año es bisiesto
     * Es múltiplo de 4 pero no de 100 o bien múltiplo de 400
     * 
     * @return devuelve true si es bisiesto, false en otro caso
     */
    public boolean esBisiesto()    {
        return (año % 4 == 0  && año % 100 != 0) || 
        (año % 400 == 0);
    }

    /**
     * Devolver el nº de días del mes de la fecha en cuestión dependiendo del año
     * @return devuelve los días del mes
     */
    public int diasMes()    {
        int num = 31;

        switch (mes)   {
            case 4:
            case 6:
            case 9:
            case 11:
            num = 30;
            break;
            case 2:
            if ( año % 4 == 0  && año % 100 != 0 || 
            año % 400 == 0 )  {
                num = 29;
            }
            else     {
                num = 28;
            }
            break;
        } 
        return num;
    }

    /**
     * Escribir la fecha en formato corto
     */
    public void printCorta()    {
        System.out.println(dia + " - " + mes + " - " + año);
    }

    /**
     * Escribir la fecha en formato largo
     */
    public void printLarga()    {
        String nombre = "";
        System.out.print(dia);
        switch (mes)      {
            case 1: nombre = "enero";
            break;
            case 2: nombre = "febrero";
            break;
            case 3: nombre = "marzo";
            break;
            case 4: nombre = "abril";
            break;
            case 5: nombre = "mayo";
            break;
            case 6: nombre = "junio";
            break;
            case 7: nombre = "julio";
            break;
            case 8: nombre = "agosto";
            break;
            case 9: nombre = "septiembre";
            break;
            case 10: nombre = "octubre";
            break;
            case 11: nombre = "noviembre";
            break;
            case 12: nombre = "diciembre";
            break;
        }
        System.out.println(" de " + nombre + " de " + año);

    }

    /**
     * Comprobar si la fecha almacenada es correcta
     */
    public boolean esCorrecta()
    {
        boolean correcta = true;      

        if (dia < 1 || dia > 31)    {
            correcta = false;
        }
        else if (mes < 1 || mes > 12)    {
            correcta = false;
        }
        else if (mes != 2)  {
            switch (mes)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: correcta = (dia <= 31);
                break;
                case 4:
                case 6:
                case 9:
                case 11: correcta = (dia <= 30);
                break;
            }
        }
        else     {                 
            int limite;
            // comprobar si año bisiesto
            if   (año % 4 == 0  && año % 100 != 0 || 
            año % 400 == 0 )   {
                limite = 29;
            }
            else      {
                limite = 28;
            }
            correcta = (dia <= limite);
        }
        return correcta;
    }    

    /**
     *  Comprueba si la fecha preceda a otra
     *  recibida como parámetro
     *
     *  Suponemos los argumentos recibidos todos correctos
     */
    public boolean precedeA(int queDia, int queMes, int queAño)    {
        return (año < queAño) ||
        (año == queAño && (mes < queMes || 
                (mes == queMes &&  dia < queDia)));

    }

    /**
     *  Comprueba si la fecha preceda a otra
     *  recibida como parámetro
     *
     *  Suponemos los argumentos recibidos todos correctos
     */
    public boolean precedeAV2(int queDia, int queMes, int queAño)
    {
        boolean precede;
        if (año < queAño)    {
            precede = true;
        }
        else if (año > queAño)  {
            precede = false;
        }
        else  if (mes < queMes)    {
            precede = true;
        }
        else if (mes > queMes)  {
            precede = false;
        }
        else  if (dia < queDia)  {
            precede = true;
        }
        else if (dia > queDia)  {
            precede = false;
        }
        else   {
            precede = false;
        }
        return precede;
    }

    /**
     *  Avanza un día la fecha
     *
     */
    public void avanzarDia()
    {
        int diasMes = 30;
        switch (mes)   {
            case 2:
            if ( esBisiesto() )  {
                diasMes = 29;
            }
            else    {
                diasMes = 28;
            }
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
            diasMes = 31;
            break;
        }
        dia++;
        if (dia > diasMes)  {
            dia = 1;
            mes++;
            if (mes > 12)  {
                mes = 1;
                año++;
            }
        }
    }

    

}

