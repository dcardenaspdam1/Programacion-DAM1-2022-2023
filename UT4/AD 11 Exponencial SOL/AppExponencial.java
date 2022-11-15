import java.util.Scanner;
/**
 * 
 * 
 */
public class AppExponencial
{

    
    public static void main(String[] args)    {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame base para el primer número exponencial: ");
        int base = teclado.nextInt();
        System.out.println("Dame exponente para el primer número exponencial: ");
        int exponente = teclado.nextInt();        
        Exponencial expo1 = new Exponencial(base, exponente);

        System.out.println("Dame base para el segundo número exponencial: ");
        int base2 = teclado.nextInt();
        while (base2 != base) {
            System.out.println("Error, Dame base para el segundo número exponencial: ");
            base2 = teclado.nextInt();
        }
        System.out.println("Dame exponente para el segundo número exponencial: ");
        int exponente2 = teclado.nextInt();
        Exponencial expo2 = new Exponencial(base2, exponente2);
        
        teclado.nextLine(); // ignorar Intro     
        teclado.nextLine();  // hacer pausa
        
        
        System.out.println("\u000C"); // borrar pantalla

        System.out.println("Exponencial 1\n\t" + expo1.toString());
        System.out.println("Exponencial 2 \n\t" + expo2.toString());


        Exponencial producto = expo1.multiplicar(expo2);
        System.out.println("Producto \n\t" + producto.toString());

        Exponencial cociente = expo1.dividir(expo2);
        System.out.println("Cociente \n\t" + cociente.toString());

        int pot = (int) (Math.random() * 7) + 2;
        Exponencial potencia = expo1.elevar(pot);
        System.out.println("Potencia " + pot + " de número exponencial 1 \n\t" + potencia.toString());

    }
}
