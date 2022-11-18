
/**
 * Modela una cuenta bancaria
 * 
 *
 */
public class Cuenta
{
    private int numero; 
    private String titular;
    private double saldo;

    /**
     * Constructor para los objetos de la clase Cuenta
     *  
     */
    public Cuenta(int numero, String titular)    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    /**
     * mutador para el nº de cuenta
     * @param  nuevoNumero  el nuevo número de cuenta
     */
    public void setnumero(int numero)    {
        this.numero = numero;
    }
    
    /**
     * accesor para el nº de cuenta
     */
    public int getNumero()     {
        return numero;
    }
    
    /**
     *  ingresar dinero en la cuenta
     *   
     */
    public void ingresar(double cantidad)     {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        }
    }
    
    /** 
     * reintegrar dinero de la cuenta
     * @param cantidad  la cantidad a reintegrar
     */
    public void reintegrar(double cantidad)     {
         if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
    } 

    
    /** 
     * accesor para el saldo de la cuenta
     */
    public double getSaldo()     {
        return saldo;
    }
 

    /**
     * visualizar datos de la cuenta
     */
    public String toString()    {
        return "\nNúmero de cuenta: " + numero 
                  + "\nTitular: " + titular 
                  + "\nSaldo: " + saldo;
         
    }
    
}
