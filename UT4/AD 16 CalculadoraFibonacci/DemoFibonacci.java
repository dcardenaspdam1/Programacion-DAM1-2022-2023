
/**
 *  clase DemoFibonacci 
 * 
 */
public class DemoFibonacci
{
    private CalculadoraFibonacci calculadora;
    
    /**
     * Constructor de la clase DemoFibonacci
     * Crea la calculadora 
     */
    public DemoFibonacci()    {
        calculadora = new CalculadoraFibonacci();
    }

    /**
     *    
     */
    public void escribirSerieFibonacci(int terminos)    {
        
        System.out.println("Serie de fibonacci de " + terminos + " términos\n" +
                        calculadora.generarFibonacci(terminos));
    }
}
