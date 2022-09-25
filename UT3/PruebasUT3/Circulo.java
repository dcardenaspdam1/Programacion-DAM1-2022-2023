
/**
 *  
 * Modela círculos de un radio determinado
 */
public class Circulo
{

    private double radio;

    /**
     * Constructor  
     */
    public Circulo(double queRadio)    {
        radio = queRadio;
    }

    /**
     *  accesor para el radio
     */
    public double getRadio()    {
        return radio;
    }

    /**
     *  mutador para el radio
     */
    public void setRadio(double queRadio)    {
        radio = queRadio;
    }
    
    /**
     *  calcular el área
     */
    public double calcularAreaV1()    {
        double area = Math.PI * radio * radio; // area es una variable local
        return area;
    }
    
     /**
     *  calcular el área
     */
    public double calcularAreaV2()    {
        return Math.PI * radio * radio; 
        
    }
    
      /**
     *  calcular el perímetro
     */
    public double calcularPerimetro()    {
        return 2 * Math.PI * radio; 
        
    }
    
    /**
     *  mostrar en pantalla los datos del círculo
     */
    public void printDatosCirculo()    {
        System.out.println("Datos del círculo");
        System.out.println("Radio: " + radio);
    }

    

}
