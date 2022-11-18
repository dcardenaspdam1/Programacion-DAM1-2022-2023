
/**
 * Un  objeto de esta clase nos permite simular el
 * comportamiento de la clase anterior
 *  
 */
public class SimulacionInversion
{
        private final double INICIAL = 3000;
        private final double INTERES = 5;
        private final int A�OS = 5;
        private Inversion miInversion;
        

        /**
         * Constructor de la clase DemoInversion
         */
        public SimulacionInversion()    {
                miInversion = new Inversion(INICIAL, INTERES);
               
                
        }
        
        /**
         * Probamos el m�todo despuesDe()
         */
        public void simularDespuesDe()   {
                double inicial = miInversion.getInicial();
                double importeFinal = miInversion.despuesDe(A�OS);
                System.out.println("Inversi�n inicial = " + inicial + "�" +
                                   "\nDespu�s de " + A�OS + " a�os = " +
                                   String.format("%10.2f �", importeFinal));
        }
        
        /**
         *  
         * Probamos el m�todo tablaDespuesDe()
         */
        public void simularTablaDespuesDe()   {
                System.out.println(miInversion.tablaDespuesDe(A�OS));     
        }
        
        /**
         *  
         * Probamos el m�todo a�osHastaObjetivo()
         */
        public void simularHastaObjetivo()   {
                double objetivo = 5000;
                System.out.println("A�os hasta conseguir \n el objetivo de "+
                                    objetivo + " �  " +
                                    miInversion.a�osHastaObjetivo(objetivo) + " a�os");
        }
        
       
        
        
}
