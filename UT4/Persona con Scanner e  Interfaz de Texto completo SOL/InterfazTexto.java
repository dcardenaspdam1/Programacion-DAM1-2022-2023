
/**
 * Clase que modela un interfaz de texto
 * para interactuar con el usuario
 * 
 */
import java.util.Scanner;
public class InterfazTexto
{
    private final int COMPLETO = 1;
    private final int NOMBRE = 2;
    private final int EDAD = 3;
    private final int SUELDO = 4;
    private final int ESTADO = 5;
    private final int SALIR = 6;
    private Persona persona;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazTexto
     */
    public InterfazTexto()    {
        teclado = new Scanner(System.in);
        persona = new Persona();
    }

    /**
     *         
     */
    public void ejecutar()    {
        bienvenida();
        String nombre = leerNombre();
        persona.setNombre(nombre);
        int edad = leerEdad();
        persona.setEdad(edad);
        double sueldo = leerSueldo();
        persona.setSueldo(sueldo);
        char estado = leerEstado ();
        persona.setEstado(estado);

        int opcion = mostrarMenu();
        while (opcion != SALIR)    {
            switch (opcion)       {
                case COMPLETO: mostrarDatosCompletos();
                break;
                case NOMBRE: mostrarNombre();
                break;
                case EDAD: mostrarEdad();
                break;
                case SUELDO: mostrarSueldo();
                break;
                case ESTADO: mostrarEstadoCivil();
                break;
            }
            opcion = mostrarMenu();
        }

        despedida();
    }

    /**
     *   
     * @return   el nombre de una persona leído
     * desde el teclado
     */
    private String leerNombre()    {
        System.out.println("Dame nombre");
        String nombre = teclado.nextLine();
        return nombre;  
    }

    /**
     *   
     * @return   la edad de una persona leída
     * desde el teclado
     */
    private int leerEdad()    {
        System.out.println("Dame edad");
        int edad = teclado.nextInt();
        //teclado.nextLine();
        return edad;  
    }

    /**
     *   
     * @return  el sueldo de una persona leído
     * desde el teclado
     */
    private double leerSueldo()    {
        System.out.println("Dame sueldo");
        double sueldo = teclado.nextDouble();
        teclado.nextLine();
        return sueldo;  
    }

    /**
     *   
     * @return  el estado civil de una persona leído
     * desde el teclado
     */
    private char leerEstado()    {
        System.out.println("Dame estado civil");
        char estado = teclado.nextLine().charAt(0);
        return estado;  
    }

    /**
     * 
     *    
     */
    private void bienvenida()    {

        System.out.println("Bienvenido/a a nuestra aplicación");
    }

    /**
     *     
     */
    private void despedida()    {
        System.out.println("Adiós");
    }

    /**
     *     
     */
    private void mostrarDatosCompletos()    {
        System.out.println(persona.toString());
      //  hacerPausa();
    }

    /**
     *     
     */
    private void mostrarEdad()    {
        System.out.println("Edad: " + persona.getEdad());
       // hacerPausa();
    }

    /**
     *     
     */
    private void mostrarNombre()    {
        System.out.println("Nombre:" + persona.getNombre());
      //  hacerPausa();
    }

    /**
     *     
     */
    private void mostrarSueldo()    {
        System.out.println("Sueldo:" + persona.getSueldo());
       // hacerPausa();
    }

    /**
     *     
     */
    private void mostrarEstadoCivil()    {
        System.out.println("Esatdo civil:" + persona.getEstado());
      //  hacerPausa();
    }

    /**
     *    
     */
    private int mostrarMenu()    {
       // borrarPantalla();
        System.out.println("1. Mostrar datos completos");
        System.out.println("2. Mostrar nombre");
        System.out.println("3. Mostrar edad");
        System.out.println("4. Mostrar sueldo");
        System.out.println("5. Mostrar estado civil");
        System.out.println("6. Salir");

        int opcion = leerOpcion("Teclea opcion: ");
        while (!opcionValida(opcion))        {
            opcion = leerOpcion("Incorrecta, Teclea opción: ");
        }

        return opcion;
    }

    /**
     *  
     */
    private int leerOpcion(String mensaje)    {
        System.out.println(mensaje);
        int opcion = teclado.nextInt();       
      // teclado.nextLine();
        return opcion;
    }

    /**
     *  
     */
    private boolean opcionValida(int opcion)    {
        return opcion >= COMPLETO && opcion <= SALIR;
    }

    /**
     *  Limpiar la pantalla
     *  
     */
    public void borrarPantalla( )    {
        System.out.println('\u000C');
    }

    /**
     *  Hacer una pausa
     *  
     */
    public void hacerPausa()    {
        System.out.println("Pulse Intro para continuar");
        teclado.nextLine();
    }

}
