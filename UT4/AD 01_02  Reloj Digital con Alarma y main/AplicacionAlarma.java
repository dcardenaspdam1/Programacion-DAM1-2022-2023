
/**
 * Clase que inicia la aplicación
 * Punto de entrada a la aplicación
 */
import java.util.Scanner;

public class AplicacionAlarma
{
    public static void main (String[] args)    {
        Scanner teclado = new Scanner(System.in); //System.in es la entrada standard, el teclado
        System.out.println("Dame las horas: ");
        int horas = teclado.nextInt();
        while (horas < 0 || horas > 23)      {
            System.out.println("Error, Dame las horas: ");
            horas = teclado.nextInt();
        }

        
        System.out.println("Dame los minutos: ");
        int minutos = teclado.nextInt();
        while (minutos < 0 || minutos > 59)    {
            System.out.println("Error, Dame los minutos: ");
            minutos = teclado.nextInt();
        }
        
        
        RelojAlarma elReloj = new RelojAlarma(horas, minutos);
        elReloj.emitirTic();
        System.out.println("La hora es " + elReloj.getHora());

    }

}
