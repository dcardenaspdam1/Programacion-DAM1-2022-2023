
/**
 * Representa a un cuadrado con un centro y un lado
 */
public class Cuadrado
{
     private Punto centro;
     private double lado;

    /**
     * Constructor  
     */
    public Cuadrado()
    {
         centro = new Punto();
         lado = 0;
    }
    
     /**
     * Constructor  
     */
    public Cuadrado(int queX, int queY, double queLado)
    {
         centro = new Punto(queX, queY);
         lado = queLado;
    }
    
      /**
     * Constructor  
     */
    public Cuadrado(Punto queCentro, double queLado)
    {
         centro = queCentro;
         // centro = new Punto(queCentro.getX(), queCentro.getY());
         lado = queLado;
    }
    
    /**
     * 
     */
    public double calcularArea() {
        return lado * lado;

    }
    
    /**
     * 
     */
    public void printArea() {
        System.out.println("Área del cuadrado: " + calcularArea());

    }

    /**
     *  
     */
    public String toString()
    {
        return "Punto: " + centro.toString() +
                "\nLado: " + String.format("%7.2f", lado);
    }


    
}
