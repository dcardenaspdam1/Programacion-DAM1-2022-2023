
/**
 * Representa a una persona  
 * 
 */
public class Persona
{
    private String nombre;
    private int edad;
    private double sueldo;
    private char estadoCivil;
    /**
     * Constructor de la clase Persona
     */
    public Persona()    {
        nombre = "";
        edad = 0;
        sueldo = 0.0;
        estadoCivil = ' ';
        
    }
    
     /**
     * Constructor de la clase Persona
     */
    public Persona(String nombre, int edad, double sueldo, char estado)    {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        estadoCivil = estado;
        
    }
    
    /**
     * Accesor para el nombre
     *
     */
    public String getNombre()    {
        return nombre;
    }
    
     /**
     * Mutador para el nombre
     *
     */
    public void setNombre(String nombre)    {
         this.nombre = nombre;
    }
     /**
     * Accesor para la edad
     *
     */
    public int getEdad()    {
        return edad;
    }
    
     /**
     * Accesor para el sueldo
     *
     */
    public double getSueldo()    {
        return sueldo;
    }
    
       /**
     * Mutador para la edad
     *
     */
    public void setSueldo(double sueldo)    {
         this.sueldo = sueldo;
    }
    

      /**
     * Mutador para la edad
     *
     */
    public void setEdad(int edad)    {
         this.edad = edad;
    }
    
    /**
     * Mutador para el estado
     *
     */
    public void setEstado(char estado)    {
        estadoCivil = estado;
    }
    
       /**
     * Accesor para el estado
     *
     */
    public char getEstado()    {
        return estadoCivil;
    }

    
    
    /**
     * Representación textual de un objeto Persona
     *  
     */
    public String toString()    {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nSueldo: " + sueldo +
                "\nEstado civil: " + estadoCivil;
    }
}
