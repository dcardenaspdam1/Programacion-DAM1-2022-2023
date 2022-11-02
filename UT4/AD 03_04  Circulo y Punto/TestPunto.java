
/**
 * Prueba de la clasePunto 
 *  
 */
public class TestPunto
{

    public TestPunto()    {

    }

    /**
     * 
     * @param 
     * @return   
     */
    public void test()    {
        Punto p1 = new Punto(3, 8); 
        Punto p2 = new Punto(12, 9);
        System.out.println("Punto 1 \n" + p1.toString());
        System.out.println("Punto 2 \n" + p2.toString());
        //         System.out.println("Distancia del punto 1 al origen  \n" +
        //                           p1.getDistanciaDesdeOrigen());
        //         System.out.println("Distancia del punto 1 al punto 2  \n" +
        //                           p1.getDistanciaDesde(p2));
        
        System.out.println("Formateando con printf()\n");
        System.out.printf("Distancia del punto 1 al origen %8.2f \n",
            p1.getDistanciaDesdeOrigen());
        System.out.printf("Distancia del punto 1 al punto2 %8.2f \n",
            p1.getDistanciaDesde(p2)); 

        System.out.println("\nFormateando con String.format()\n");
        System.out.print(String.format("Distancia del punto 1 al origen %8.2f \n",
                p1.getDistanciaDesdeOrigen()));
        System.out.print(String.format("Distancia del punto 1 al punto2 %8.2f \n",
                p1.getDistanciaDesde(p2)));
    }
}
