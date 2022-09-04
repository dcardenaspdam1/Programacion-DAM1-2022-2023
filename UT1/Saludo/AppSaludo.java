
/**
 * La clase principal que incluye el método main e 
 * inicia el proyecto
 * 
 */
public class AppSaludo
{
   
    /**
     * Punto de entrada a la aplicación
     */
    
    public static void main(String[] args)    {
        GeneradorSaludos generador = new GeneradorSaludos();
        generador.emitirSaludo();
    }

   
}
