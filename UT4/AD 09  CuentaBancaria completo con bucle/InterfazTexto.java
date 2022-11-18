
/**
 *  
 */
import java.util.Scanner;
public class InterfazTexto
{
    private final int INGRESO = 1;
    private final int REINTEGRO = 2;
    private final int CONSULTA = 3;
    private final int IMPRIMIR = 4;
    private final int SALIR = 5;

    private Cuenta cuenta;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazUsuario
     */
    public InterfazTexto()    {
        teclado = new Scanner(System.in);
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()    {
        borrarPantalla();
        System.out.println("Introduzca el número de cuenta");
        int numeroCuenta = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca el nombre del titular");
        String titular = teclado.nextLine();
        cuenta = new Cuenta(numeroCuenta, titular);  
        int opcion = menu();
        while (opcion != SALIR)   {
            switch (opcion)    {       
                case INGRESO:
                realizarIngreso();
                break;
                case REINTEGRO:
                realizarReintegro();
                break;
                case CONSULTA:
                consultarSaldo();
                break;
                case IMPRIMIR:
                imprimirDatosCuenta();
                break;

            }  
            opcion = menu();
        }
        System.out.println("¡¡¡ Fin de la aplicación bancaria !!!!");

    }

    /**
     * Método privado que pide la cantidad a ingreasar y lo ingresa en la cuenta
     */

    private void realizarIngreso()   {
        double cantidad;  
        System.out.println("Introduzca cantidad a ingresar ");  
        cantidad = teclado.nextDouble();
        cuenta.ingresar(cantidad);
    }

    /**
     * Método privado que pide la cantidad a reintegrar y lo saca de la cuenta
     */
    private void realizarReintegro()   {
        double cantidad;  
        System.out.println("Introduzca cantidad a reintegrar ");  
        cantidad = teclado.nextDouble();
        cuenta.reintegrar(cantidad);
    }

    /**
     * Método privado que muestra el saldo
     */
    private void consultarSaldo()    { 
        System.out.println("El saldo de su cuenta es  " +
            cuenta.getSaldo());  
    }

    /**
     * Método privado que muestra los datos de la cuenta
     */
    private void imprimirDatosCuenta()    { 
        System.out.println("Datos de la cuenta");
        System.out.println(cuenta.toString());
    }

    /**
     * Presenta un menú en la pantalla
     * para que el usuario pueda elegir su opción
     * @return  devuelve la opción seleccionada
     */ 

    private int menu()    {
        System.out.println(" ..........................................................");
        System.out.println(" Elige una opción ......");
        System.out.println(" ..........................................................");
        System.out.println(" 1.- Ingreso");
        System.out.println(" 2.- Reintegro");
        System.out.println(" 3.- Consulta saldo");
        System.out.println(" 4.- Imprimir datos cuenta");
        System.out.println(" 5.- Salir");
        int opcion = leerOpcion(" Teclea opción....");
        while (!opcionValida(opcion))   {
            opcion = leerOpcion("Error, Teclea opción correcta ....");

        }
        return opcion;
    }

    /**
     *  Pide y devuelve una opción
     *  
     */
    private int  leerOpcion(String mensaje)    {
        System.out.println(mensaje);
        int opcion = teclado.nextInt();
        return opcion;
    }

    /**
     * Valida que una opción esté entre 1 y 5
     */
    private boolean opcionValida(int opcion)    {
        return opcion >= INGRESO && opcion <= SALIR;
    }

    /**
     * Borrar la pantalla  
     */
    private void borrarPantalla()    {
        System.out.print('\u000C');
    }

}
