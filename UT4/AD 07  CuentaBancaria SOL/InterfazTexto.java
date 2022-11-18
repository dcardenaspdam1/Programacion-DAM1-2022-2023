
/**
 * Modela un interfaz de texto para interactuar con el usuario
 * 
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
        cuenta = null;
    }

    /**
     * Controla la lógica del objeto InterfazTexto
     */
    public void iniciar()    {

        borrarPantalla();
        
        int numeroCuenta = leerNumeroCuenta();        
        String titular = leerTitular();        
        cuenta = new Cuenta(numeroCuenta, titular);  
        
        int opcion = menu();
        switch (opcion)  {       
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
            case SALIR:
                System.out.println("Ha seleccionado la opción de salir ");
        }                          

    }

    /**
     *  pedir nº cuenta y devolverlo
     */
    private int leerNumeroCuenta()    {
        System.out.println("Introduzca el número de cuenta");
        int numeroCuenta = teclado.nextInt();
        teclado.nextLine();
        return numeroCuenta;

    }
    
      /**
     *  pedir titular y devolverlo
     */
    private String leerTitular()    {
        System.out.println("Introduzca el nombre del titular");
        String titular = teclado.nextLine();
        return titular;

    }

    /**
     * pedir cantidad de ingreso e ingresar
     */
    private void realizarIngreso()    { 
        System.out.println("Introduzca cantidad a ingresar ");  
        double cantidad = teclado.nextDouble();
        cuenta.ingresar(cantidad);
    }

    /**
     * pedir cantidad y reintegrar
     */
    private void realizarReintegro()    {  
        System.out.println("Introduzca cantidad a reintegrar ");  
        double cantidad = teclado.nextDouble();
        cuenta.reintegrar(cantidad);
    }

    /**
     * Mostrar saldo de la cuenta
     */
    private void consultarSaldo()    { 
        System.out.println("El saldo de su cuenta es  " +
            cuenta.getSaldo());  
    }

    /**
     * mostrar datos de la cuenta
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
