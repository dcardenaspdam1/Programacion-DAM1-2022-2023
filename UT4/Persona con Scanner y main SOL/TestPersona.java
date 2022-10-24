import java.util.Scanner;

/**
 * Punto de entrada a la aplicación
 * 
 * Desde línea de comandos nos situamos en el directorio base del proyecto:
 *      C:\.....>java TestPersona
 */
public class TestPersona
{
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);  // crear el teclado

        // pedir datos al usuario (nombre, edad, sueldo y estado civil
        // crear un objeto Persona y
        // mostrar los datos de la persona

        System.out.print("Teclee nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Teclee edad: ");
        int edad = teclado.nextInt();    

        System.out.print("Teclee sueldo: ");
        double sueldo = teclado.nextDouble();

        teclado.nextLine();  // ignorar el intro último

        System.out.print("Teclee estado civil: ");
        char estado = teclado.nextLine().charAt(0);

        Persona persona = new Persona(nombre, edad, sueldo, estado);
        System.out.println(persona.toString());
 

    }
}