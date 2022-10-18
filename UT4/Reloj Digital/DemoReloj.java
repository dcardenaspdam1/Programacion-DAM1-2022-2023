
/**
 * 
 */
public class DemoReloj
{
    private VisorReloj miReloj; 

    /**
     * Constructor  
     */
    public DemoReloj()
    {
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
        miReloj.ponerEnHora(3, 15);
        System.out.println(miReloj.getHora());
    }
}
