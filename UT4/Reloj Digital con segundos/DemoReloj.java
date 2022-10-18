import java.util.Random;

/**
 * 
 */
public class DemoReloj
{
    private Random generador;
    private VisorReloj miReloj; 
 

    /**
     * Constructor  
     */
    public DemoReloj()
    {
        generador = new Random();
        miReloj = new VisorReloj();
    }

    /**
     *  
     */
    public void demo1()
    {
        System.out.println(miReloj.getHora());
        miReloj.emitirTic();
        miReloj.emitirTic();
        System.out.println(miReloj.getHora());
        miReloj.ponerEnHora(3, 15, 34);
        System.out.println(miReloj.getHora());

        miReloj.ponerEnHora(3, 59, 59);
        miReloj.emitirTic();
        miReloj.emitirTic();
        System.out.println(miReloj.getHora());

    }
    
     /**
     *  
     */
    public void demo2()
    {
         int hora = generador.nextInt(24);
         int minutos =  generador.nextInt(60); 
         int segundos = generador.nextInt(60); 
         miReloj.ponerEnHora(hora, minutos, segundos);
         System.out.println(miReloj.getHora());
         

    }
}
