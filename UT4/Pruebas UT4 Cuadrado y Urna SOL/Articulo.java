
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Articulo
{
    private String  nombre;   
    private double precio;

    /**
     * Constructor  
     */
    public Articulo(String nombre, double precio)    {
        this.nombre = nombre;
        this.precio = precio;

    }

    /**
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * 
     */
    public boolean masBaratoQue(Articulo a) {
        if (a == null) {
            throw new NullPointerException("Error, referencia nula");
        }
        return this.precio < a.getPrecio();
    }
	
	 /**
     * 
     */
    public String toString() {
        return "Nombre: " + this.nombre + "\nPrecio: " + this.precio;
    }

}
