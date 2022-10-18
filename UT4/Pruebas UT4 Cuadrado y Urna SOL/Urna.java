
/**
 * Representa a una urna que contiene dos bolas
 */
public class Urna
{
    private Bola bola1;
    private Bola bola2;

    /**
     * Constructor  
     */
    public Urna()    {
        bola1 = new Bola();
        bola2 = new Bola();
    }

    /**
     * Constructor  
     */
    public Urna(int c)    {
        bola1 = new Bola(c);
        bola2 = new Bola(c);
    }

    /**
     * Constructor  
     */
    public Urna(Bola queBola1, Bola queBola2)    {
        bola1 = queBola1;
        bola2 = queBola2;
        // bola1 = new Bola(queBola1.getColor());
        // bola2 = new Bola(queBola2.getColor());
    }

    /**
     * contar las del color pasado como parámetro
     */
    public int cuantasDeColor(int c) {
        int total = 0;
        if (bola1.getColor() == c) {
            total++;
        }
        if (bola2.getColor() == c) {
            total++;
        }
        return total;

    }

    /**
     * Representación textual de la urna
     */
    public String toString() {
        return bola1.toString() + "\n" + bola2.toString();

    }

    /**
     *  
     *     
     */
    public void printUrna() {
        System.out.println(this);
    }


}
