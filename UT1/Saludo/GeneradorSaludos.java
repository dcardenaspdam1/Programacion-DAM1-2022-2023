
/**
 * Clase cuyos objetos generan saludos
 * 
 */
public class GeneradorSaludos
{
    
    private String mensaje;

    /**
     * Constructor de objetos de la
     * clase GeneradorSaludos
     */
    public GeneradorSaludos()    {
        mensaje = "Bienvenido/a al curso de programación \n" + 
                   "orientada a objetos en Java utilizando BlueJ";
    }

    /**
     * Emite un saludo inicial al usuario  
     */
    public void emitirSaludo()    {
        //borrarPantalla();
        System.out.println(mensaje);
    }
    
    /**
     * Limpia el terminal
     *   
     */
    private void borrarPantalla()    {
        System.out.print('\u000C');
    }
    
    
    
}
