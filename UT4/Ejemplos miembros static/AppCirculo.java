
/**
 *  
 * 
 * @author  
 * @version  
 */
public class AppCirculo
{

    /**
     *  
     */
    public static void main(String[] args)    {
        System.out.println("Valor de la constante PI:" + Circulo.PI);     
        
        Circulo circulo1 = new Circulo(8);
        System.out.println(circulo1.toString());

        Circulo circulo2 = new Circulo(18);
        System.out.println(circulo2.toString());

        Circulo circulo3 = new Circulo(23);
        System.out.println(circulo3.toString());

        System.out.println("Total círculos creados: " + 
				Circulo.getContadorCirculos()); 

    }
}
