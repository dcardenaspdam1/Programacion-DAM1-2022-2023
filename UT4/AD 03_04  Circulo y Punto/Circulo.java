/**
 * Ej. Ad. 03_04 UT4
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 *  
 */
public class Circulo 
{
    private final double PI = 3.14;
    private double radio;
    private Punto centro;

    /**
     * constructor para los objetos de la clase Circulo
     */
    public Circulo(double radio, Punto centro)    {
        this.radio = radio;
        this.centro = centro;
    }

    /**
     * constructor para los objetos de la clase Circulo
     */
    public Circulo(double radio)    {
        this.radio = radio;
        centro = new Punto(0, 0);
    }

    /**
     * 
     * @return devuelve el radio del círculo    
     */
    public double getRadio()    {
        return radio;
    }

    /**
     * 
     * @return devuelve el centro del círculo    
     */
    public Punto getCentro()    {
        return centro;
    }

    /**
     * 
     * @param   
     */
    public void setRadio(int radio)   {
        this.radio = radio;
    }

    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea()    {
        return PI * radio * radio;
    }

    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerímetro()   {
        return 2 * PI * radio;
    }

    /**
     * 
     *   Cambia la coordenada x del centro del círculo
     */
    public void setCentroX(int nuevaX)   {
        centro.setX(nuevaX);
    }

    /**
     * 
     *   Cambia la coordenada y del centro del círculo
     */
    public void setCentroY(int nuevaY)   {
        centro.setY(nuevaY);
    }

    /**
     * @return  Devuelve una cadena con la representación del 
     *          circulo
     */
    public String toString()   {
        String str = centro.toString();
        str = str + "Valor del radio = " + radio;
        return str;
    }

    /**
     * Muestra en pantalla las características del círculo
     */
    public void printCirculo()   {
        System.out.println(toString());
    }
}