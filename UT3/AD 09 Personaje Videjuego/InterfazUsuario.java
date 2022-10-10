/**
 * La clase InterfazUsuario modela una interfaz de texto
 *  Los usuarios podrán interactuar a través
 *  de esta interfaz seleccionando diversas opciones 
 */
import java.util.Scanner;

public class InterfazUsuario
{
    private final int AVANZAR = 1;
    private final int GIRAR = 2;
    private final int MOSTRAR = 3;
    private final int SALIR = 4;
    private Scanner teclado;
    private Personaje personaje;

    public InterfazUsuario()     {
        teclado = new Scanner(System.in);
    }

    public void ejecutar()    {

        borrarPantalla();
        System.out.println(" ..........................................................");
        System.out.println(" ¡¡¡BIENVENIDO A NUESTRO JUEGO!!! ");
        System.out.println(" ..........................................................");
        System.out.println("¿QUIERES JUGAR? ..... PUES TIENES QUE  CREAR TU PERSONAJE");
        System.out.println("Teclea el nombre de tu personaje...");
        String nombre = teclado.nextLine();
        personaje = new Personaje(nombre);  
        int opcion = menu();
        while (opcion != SALIR)  {       
            switch (opcion)   {
                case AVANZAR:
                avanzarPersonaje();
                break;
                case GIRAR:
                girarPersonaje();
                break;
                case MOSTRAR:
                mostrarPersonaje();
                break;
            }
            opcion = menu();
        }
        System.out.println("Fin del juego...");
    }

    /**
     * 
     *  Permite avanzar el personaje
     *     
     */
    public void avanzarPersonaje()    {
        System.out.print("Distancia a avanzar ");
        int distancia = teclado.nextInt();
        personaje.avanzar(distancia);   
    }

    /**
     * 
     *  Permite girar el personaje
     *    
     */
    public void girarPersonaje()    {
        personaje.girar();   
    }

    /**
     * 
     *  Muestra la situación actual del personaje
     */
    public void mostrarPersonaje()    {
        System.out.println("Situación actual del personaje ");
        System.out.println(personaje.toString());
    }

    /**
     * Presenta un menú en la pantalla
     * para que el usuario pueda elegir su opción
     * @return  devuelve la opción seleccionada
     */ 

    private int menu()    {

        //borrarPantalla();
        System.out.println(" ..........................................................");
        System.out.println(" Elige una opción ......");
        System.out.println(" ..........................................................");
        System.out.println(" 1.- Avanzar personaje");
        System.out.println(" 2.- Girar personaje");
        System.out.println(" 3.- Mostrar situación del personaje");
        System.out.println(" 4.- Salir");
        System.out.println(" Teclea opción....");
        int opcion = teclado.nextInt();
        return opcion;
    }

    /**
     * Borrar la pantalla  
     */
    private void borrarPantalla()    {
        System.out.print('\u000C');
    }

}
