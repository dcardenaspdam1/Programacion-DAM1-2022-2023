
/**
 *  
 * 
 * @author  
 * @version  
 */
public class DemoUrna
{
    private Urna urna1;
    private Urna urna2;
    private Urna urna3;
     

    /**
     * Constructor  
     */
    public DemoUrna()    {
        urna1 = new Urna();
        urna2 = new Urna(1);
        urna3 = new Urna(new Bola(), new Bola(1));
         
    }

    /**
     * 
     */
    public void mostrarUrnas() {
        System.out.println("Urna 1\n" + urna1.toString());
        System.out.println("Urna 2\n" + urna2.toString());
        System.out.println("Urna 3\n" + urna3.toString());
         
    }
}
