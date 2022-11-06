
/**
 * Represenra auna línea en el plano
 * definida por dos puntos
 * 
 * @author 
 * @version 
 */
public class Linea
{
    private Punto p1;
    private Punto p2;

    /**
     * Constructor de la clase Linea
     */
    public Linea()  {
        this.p1 = new Punto(0, 0);
        this.p2 = new Punto(0, 0);
    }

    /**
     * Constructor parametrizado de la clase Linea
     */
    public Linea(Punto p1, Punto p2)  {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Accesor para el punto1
     * @return  El valor de p1  
     */
    public Punto getPunto1()  {   
        return p1;
    }

    /**
     * Accesor para el punto2
     * @return  El valor de p2  
     */
    public Punto getPunto2()  {   
        return p2;
    }

    /**
     * 
     *  Mutador para el punto1
     * @param p es el nuevo valor de p1
     *     
     */
    public void setPunto1(Punto p)  {
        this.p1 = p;        
    }

    /**
     * 
     *  Mutador para el punto2
     * @param p es el nuevo valor de p2
     *     
     */
    public void setPunto2(Punto p)  {
        this.p2 = p;        
    }

    /**
     * 
     * Desplazar a la derecha la línea 
     */
    public void moverDerecha(int distancia)  {
        p1.desplaza(distancia, 0);
        p2.desplaza(distancia, 0);
    }

    /**
     * 
     * Desplazar a la izquierda la línea 
     */
    public void moverIzquierda(int distancia)  {
        p1.desplaza(-distancia, 0);
        p2.desplaza(-distancia, 0);
    }

    /**
     * 
     * Desplazar arriba la línea 
     */
    public void moverArriba(int distancia)  {
        p1.desplaza(0, distancia);
        p2.desplaza(0, distancia);
    }

    /**
     * 
     * Desplazar abajo la línea 
     */
    public void moverAbajo(int distancia) {
        p1.desplaza(0, -distancia);
        p2.desplaza(0, -distancia);
    }

    /**
     *    
     */
    public void printLinea()  {
        System.out.println("Punto 1\n " + p1.toString());
        System.out.println("Punto 2n " + p2.toString());
    }

}
