/**
 * Los objetos de la clase Inversi�n monitorizan el 
 * crecimiento de una cantidad invertida que acumula un
 * determinado tipo de inter�s anual
 * 
 */
public class Inversion
{
        private double importeInicial;
        private double interes;  // inter�s anual en porcentaje 5%
             

        /**
         * Constructor de la clase Inversion
         * @param importe cantidad inicial invertida
         * @param interes tipo de inter�s anual aplicado
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
         * Accesor para el inter�s
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
         * Calcula el valor de la nueva inversi�n con
         * los intereses acumulados al cabo de los a�os
         * @param el n� de a�os en el que se acumulan 
         * intereses
         */
        public double despuesDe(int a�os)    {
                double importeFinal = importeInicial;
                for (int i = 1; i <= a�os; i++)   {
                    importeFinal = importeFinal + (importeFinal * (interes / 100 ));
                }
                return importeFinal;
        }

        
        /**
         * Calcular n� a�os que han de pasar hasta 
         * conseguir un importe determinado
         * @param importeObjetivo el importe a conseguir
         */
        public int a�osHastaObjetivo(double importeObjetivo)   {
                int a�os = 0;
                double balance = importeInicial;
                while (balance < importeObjetivo)    {
                    balance += balance * (interes / 100);
                    a�os++;
                }
                return a�os;
        }
        
         /**
         * Calcular n� a�os que han de pasar hasta 
         * conseguir un importe determinado
         * @param importeObjetivo el importe a conseguir
         */
        public int a�osHastaObjetivoV2(double importeObjetivo)   {
                int a�os = 0;
                double balance = importeInicial;
                while (balance < importeObjetivo) {
                    a�os++;
                    balance = despuesDe(a�os);
                    
                }
                return a�os;
        }
      
        
        /**
         * Inversi�n a�o a a�o en formato texto
         */
        public String tablaDespuesDe(int a�os)     {
                String str = "Cantidad inicial " + getInicial() + " �\n" +
                              "Inter�s anual " + (double) interes + " % \n";
                str = str + "A�o\t   Balance\n"; 
                for (int i = 1; i <= a�os; i++)    {
                    double importe = despuesDe(i);
                    str = str + i + "\t" + 
                          String.format("%10.2f ", importe) + "�\n";
                }
                return str;
        }
      
        
}

