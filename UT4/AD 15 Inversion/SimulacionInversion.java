
/**
 * Un  objeto de esta clase nos permite simular el
 * comportamiento de la clase anterior
 *  
 */
public class SimulacionInversion
{
        private final double INICIAL = 3000;
        private final double INTERES = 5;
        private final int AÑOS = 5;
        private Inversion miInversion;
        

        /**
         * Constructor de la clase DemoInversion
         */
        public SimulacionInversion()    {
                miInversion = new Inversion(INICIAL, INTERES);
               
                
        }
        
        /**
         * Probamos el método despuesDe()
         */
        public void simularDespuesDe()   {
                double inicial = miInversion.getInicial();
                double importeFinal = miInversion.despuesDe(AÑOS);
                System.out.println("Inversión inicial = " + inicial + "€" +
                                   "\nDespués de " + AÑOS + " años = " +
                                   String.format("%10.2f €", importeFinal));
        }
        
        /**
         *  
         * Probamos el método tablaDespuesDe()
         */
        public void simularTablaDespuesDe()   {
                System.out.println(miInversion.tablaDespuesDe(AÑOS));     
        }
        
        /**
         *  
         * Probamos el método añosHastaObjetivo()
         */
        public void simularHastaObjetivo()   {
                double objetivo = 5000;
                System.out.println("Años hasta conseguir \n el objetivo de "+
                                    objetivo + " €  " +
                                    miInversion.añosHastaObjetivo(objetivo) + " años");
        }
        
       
        
        
}
