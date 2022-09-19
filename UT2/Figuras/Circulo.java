import java.awt.*;
import java.awt.geom.*;

/**
 * Un círculo que puede ser manipulado y que se 
 * dibuja a sí mismo en el canvas
 * 
 * @author  Michael Kolling y David J. Barnes
 */

public class Circulo 
{
    private int diametro;
    private int xPosicion;
    private int yPosicion;
    private String color;
    private boolean esVisible;
    
    /**
     * Crear un círculo en la posición por defecto y
     * con el color por defecto
     */
    public Circulo()    {
        diametro = 30;
        xPosicion = 20;
        yPosicion = 60;
        color = "blue";
        esVisible = false;
    }
    

    /**
     * Hacer el círculo visible, si ya lo está no pasa nada
     */
    public void hacerVisible()    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer el círculo invisible, si ya lo está no pasa nada
     */
    public void hacerInvisible()    {
        borrar();
        esVisible = false;
    }
    
    /**
     * Mover el círculo unos cuanto píxeles a la derecha
     */
    public void moverDerecha()    {
        moverHorizontal(20);
    }

    /**
     * Mover el círculo unos cuanto píxeles a la izquierda
     */
    public void moverIzquierda()    {
        moverHorizontal(-20);
    }

    /**
     * Mover el círculo unos cuanto píxeles hacia arriba
     */
    public void moverArriba()    {
        moverVertical(-20);
    }

    /**
     * Mover el círculo unos cuanto píxeles hacia abajo
     */
    public void moverAbajo()    {
        moverVertical(20);
    }

    /**
     * Mover el círculo horizontalmente
     */
    public void moverHorizontal(int distancia)    {
        borrar();
        xPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el círculo verticalmente
     */
    public void moverVertical(int distancia)    {
        borrar();
        yPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el círculo despacio horizontalmente
     */
    public void despacioMoverHorizontal(int distancia)    {
        int delta;

        if (distancia < 0)         {
            delta = -1;
            distancia = -distancia;
        }
        else      {
            delta = 1;
        }

        for (int i = 0; i < distancia; i++)    {
            xPosicion += delta;
            dibujar();
        }
    }

    /**
     * Mover el círculo despacio verticalmente
     */
    public void despacioMoverVertical(int distancia)    {
        int delta;

        if (distancia < 0)    {
            delta = -1;
            distancia = -distancia;
        }
        else    {
            delta = 1;
        }

        for (int i = 0; i < distancia; i++)    {
            yPosicion += delta;
            dibujar();
        }
    }

    /**
     * Cambiar el tamaño al nuevo tamaño (en pixeles). Debe ser >= 0.
     */
    public void cambiarTamano(int nuevoDiametro)    {
        borrar();
        diametro = nuevoDiametro;
        dibujar();
    }

    /**
     * Cambiar el color. Colores válidos son "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void cambiarColor(String nuevoColor)    {
        color = nuevoColor;
        dibujar();
    }

    /**
     * Dibujar el círculo con las especificaciones actuales en la pantalla
     */
    
    private void dibujar()    {
        if (esVisible)    {
            Canvas canvas = Canvas.getCanvas();
            canvas.dibujar(this, color, new Ellipse2D.Double(xPosicion, yPosicion, 
                                                          diametro, diametro));
            canvas.esperar(10);
        }
    }

    /**
     * Borra el círculo de la pantalla
     */
    private void borrar()    {
        if (esVisible)     {
            Canvas canvas = Canvas.getCanvas();
            canvas.borrar(this);
        }
    }
}
