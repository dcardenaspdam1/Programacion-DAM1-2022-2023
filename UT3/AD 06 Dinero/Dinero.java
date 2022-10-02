/**
 * Los objetos de esta clase contiene una cantidad de dinero 
 * en euros 
 * 
 */
public class Dinero  {
        //constantes
        private final int DIEZ = 10;
        private final int CINCO = 5;
        private final int DOS = 2;
        private final int UNO = 1;
       //asumimos que la cantidad es <=100€
        private int euros;

        /**
        ** Constructor 
        */
        public Dinero(int cantidad)    {
            euros = cantidad;
        }
    
        /**
         * Establecer la cantidad de dinero
         */
        public void setCantidad(int cantidad)     {
            euros = cantidad;
        }
    
        /**
         * Accesor para el dinero
         * @return el dinero que hay en el objeto
         *
         */
    
        public int getDinero()    {
            return euros;
        }
    
        /**
         * Muestra en pantalla la descomposición
         * mínima de monedas que representa la
         * cantidad guardada
         */
        public void printDescomposicionMonedas()     {  
                int auxDinero = euros; // guardamos en una variable el valor del atributo para no perderlo
                
                int diez = auxDinero / DIEZ;
                auxDinero = auxDinero % DIEZ;
                
                int cinco = auxDinero / CINCO;
                auxDinero = auxDinero % CINCO;
                
                int dos = auxDinero / DOS;
                auxDinero = auxDinero % DOS;
                
                System.out.println(euros + " € son\n" +
                                    "Billetes de " + DIEZ + " = " + diez +
                                    "\nBilletes de " + CINCO + " = " + cinco +
                                    "\nMonedas de " + DOS + " = " + dos +
                                    "\nMonedas de " + UNO + " = " + auxDinero);
        }
        
        /**
         * Limpia el terminal  
         */
        public void borrarPantalla()     {
            System.out.println('\u000C');
        }
    
    

 

}
