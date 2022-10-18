
/**
 *  
 * 
 * @author  
 * @version  
 */
public class TestRueda
{
     
     

    /**
     * Constructor  
     */
    public TestRueda()    {
         
    }

    /**
     * 
     */
    public void test() {
        Rueda rueda1 = new Rueda(4);
        System.out.println(rueda1.toString());
        Rueda rueda2 = rueda1.getRuedaActual();
        System.out.println(rueda2.toString());
        System.out.println();
        
        rueda2.inflar();
        System.out.println(rueda1.toString());
        System.out.println(rueda2.toString());
        System.out.println();
        
        Rueda rueda3 = rueda1.getCopiaRuedaActual();
        System.out.println(rueda3.toString());
        rueda3.inflar();
        System.out.println(rueda3.toString());
        System.out.println(rueda2.toString());
        
        
         
    }
}
