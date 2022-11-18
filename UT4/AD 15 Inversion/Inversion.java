/**
 * Los objetos de la clase Inversión monitorizan el 
 * crecimiento de una cantidad invertida que acumula un
 * determinado tipo de interés anual
 * 
 */
public class Inversion
{
        private double importeInicial;
        private double interes;  // interés anual en porcentaje 5%
             

        /**
         * Constructor de la clase Inversion
         * @param importe cantidad inicial invertida
         * @param interes tipo de interés anual aplicado
         */
        public Inversion(double importe, double interes)    {
                this.importeInicial = importe;
                this.interes = interes;
        }
        
        /**
         * 
         * Accesor para la cantidad inicial    
         */
        public double getInicial()     {
                return importeInicial;
        }
        
         /**
         * 
         * Accesor para el interés
         */
        public double getInteres()   {
                return interes;
        }
        
        
         /**
         * 
         * Mutador para la cantidad inicial    
         */
        public void setInicial(double inicial)   {
               importeInicial = inicial;
        }
        
          
        /**
         * Calcula el valor de la nueva inversión con
         * los intereses acumulados al cabo de los años
         * @param el nº de años en el que se acumulan 
         * intereses
         */
        public double despuesDe(int años)    {
                double importeFinal = importeInicial;
                for (int i = 1; i <= años; i++)   {
                    importeFinal = importeFinal + (importeFinal * (interes / 100 ));
                }
                return importeFinal;
        }

        
        /**
         * Calcular nº años que han de pasar hasta 
         * conseguir un importe determinado
         * @param importeObjetivo el importe a conseguir
         */
        public int añosHastaObjetivo(double importeObjetivo)   {
                int años = 0;
                double balance = importeInicial;
                while (balance < importeObjetivo)    {
                    balance += balance * (interes / 100);
                    años++;
                }
                return años;
        }
        
         /**
         * Calcular nº años que han de pasar hasta 
         * conseguir un importe determinado
         * @param importeObjetivo el importe a conseguir
         */
        public int añosHastaObjetivoV2(double importeObjetivo)   {
                int años = 0;
                double balance = importeInicial;
                while (balance < importeObjetivo) {
                    años++;
                    balance = despuesDe(años);
                    
                }
                return años;
        }
      
        
        /**
         * Inversión año a año en formato texto
         */
        public String tablaDespuesDe(int años)     {
                String str = "Cantidad inicial " + getInicial() + " €\n" +
                              "Interés anual " + (double) interes + " % \n";
                str = str + "Año\t   Balance\n"; 
                for (int i = 1; i <= años; i++)    {
                    double importe = despuesDe(i);
                    str = str + i + "\t" + 
                          String.format("%10.2f ", importe) + "€\n";
                }
                return str;
        }
      
        
}

