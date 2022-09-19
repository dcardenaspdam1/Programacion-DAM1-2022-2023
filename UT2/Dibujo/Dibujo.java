
/**
 * Esta clase representa un dibujo simple. Se puede realizar el dibujo
 * utilizando el método dibujar(). Como es un dibujo electrónico, puede cambiar. 
 * Se puede ver en negro y blanco y en color
 * 
 * @author Michael Kölling y David.J. Barnes
 */

public class Dibujo
{

    private Cuadrado pared;
    private Cuadrado ventana;
    private Triangulo tejado;
    private Circulo sol;
    private Circulo sol2;

    /**
     * Constructor para objetos de la clase Dibujo
     */
    public Dibujo()    {
        // no se hace nada, las variables instancia son inicializadas
        // automáticamente a null
    }

    /**
     * Realizar el dibujo
     */

    public void dibujar()    {
        pared = new Cuadrado();
        pared.moverVertical(80);
        pared.cambiarTamano(100);
        pared.hacerVisible();

        ventana = new Cuadrado();
        ventana.cambiarColor("black");
        ventana.moverHorizontal(20);
        ventana.moverVertical(100);
        ventana.hacerVisible();

        tejado = new Triangulo();
        tejado.cambiarTamano(50, 140);
        tejado.moverHorizontal(60);
        tejado.moverVertical(70);
        tejado.hacerVisible();

        sol = new Circulo();
        // sol.cambiarColor("yellow");
        sol.cambiarColor("blue");
        sol.moverHorizontal(150);
        sol.moverVertical(-10);
        sol.cambiarTamano(60);
        sol.hacerVisible();

        sol2 = new Circulo();
        sol2.cambiarColor("magenta");
        sol2.moverHorizontal(210);
        sol2.moverVertical(-30);
        sol2.cambiarTamano(40);
        sol2.hacerVisible();


    }

    /**
     * Cambiar dibujo a negro/blanco
     */

    public void setNegroBlanco()    {
        // solo si está dibujado ya ....
        if (pared != null)  { 
            pared.cambiarColor("black");
            ventana.cambiarColor("white");
            tejado.cambiarColor("black");
            sol.cambiarColor("black");
        }
    }

    /**
     * Cambiar dibujo para ver en modo color
     */

    public void setColor()    {
        // solo si está dibujado ya ....
        if (pared != null)   {
            pared.cambiarColor("red");
            ventana.cambiarColor("black");
            tejado.cambiarColor("green");
            sol.cambiarColor("yellow");
        }
    }

}
