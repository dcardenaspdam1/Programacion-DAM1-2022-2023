import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
 * Canvas es una clase para realizar dibujos gráficos de una forma simple sobre el 
 * Canvas, el lienzo
 * @author: Bruce Quig
 * @author: Michael Kolling (mik)
 */

public class Canvas
{
    // La implementación de esta clase (el manejo de la identidad de la figura y colores)
    // es un poco más complejo de lo necesario. Se ha hecho así con el propósito de mantener
    // la interfaz y los atributos de instancia de los objetos figura claros y simples para
    // propósitos educacionales

    private static Canvas canvasSingleton;

    /**
     * Factory method to get the canvas singleton object.
     */
    public static Canvas getCanvas()    {
        if (canvasSingleton == null) {
            canvasSingleton = new Canvas("BlueJ Figuras Demo", 300, 300, 
                                         Color.white);
        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    //  ----- parte de atributos de instancia -----

    private JFrame marco;
    private CanvasPane canvas;
    private Graphics2D grafico;
    private Color fondoColor;
    private Image canvasImagen;
    private List<Object> objetos;
    private HashMap<Object, DescripcionFigura> figuras;
    
    /**
     * Crea el Canvas
     * @param titulo título que aparece en el marco del canvas
     * @param ancho el ancho deseado para el canvas
     * @param alto el alto deseado para el canvas
     * @param bgColor el color de fondo deseado para el canvas
     */
    private Canvas(String titulo, int ancho, int alto, Color bgColor)    {
        marco = new JFrame();
        canvas = new CanvasPane();
        marco.setContentPane(canvas);
        marco.setTitle(titulo);
        canvas.setPreferredSize(new Dimension(ancho, alto));
        fondoColor = bgColor;
        marco.pack();
        objetos = new ArrayList<Object>();
        figuras = new HashMap<Object, DescripcionFigura>();
    }

    /**
     * Establece la visibilidad del canvas y trae el canvas al frente de la pantalla 
     * cuando se hace visible. Este método puede ser utilizado también para traer delante 
     * de otras ventanas a un canvas ya visible.
     * @param visible  valor booleano que representa la visibilidad deseada del canvas true
     * o false
     */
    public void setVisible(boolean visible)    {
        if (grafico == null) {
            // primera vez: instanciar la imagen fuera de la ventana
            // y rellenarla con el color de fondo
            Dimension tamano = canvas.getSize();
            canvasImagen = canvas.createImage(tamano.width, tamano.height);
            grafico = (Graphics2D)canvasImagen.getGraphics();
            grafico.setColor(fondoColor);
            grafico.fillRect(0, 0, tamano.width, tamano.height);
            grafico.setColor(Color.black);
        }
        marco.setVisible(visible);
    }

    /**
     * Dibuja una determinada figura en el canvas
     * @param  referenciaObjeto un objeto para definir la identidad de la figura
     * @param  color            el color de la figura
     * @param  figura         el objeto figura a ser dibujado en el canvas
     */
    
     // Esta es una manera un poco "atrasada" de mantener los objetos figura.
     // Se ha hecho así para mantener los interfaces de figura claros y simples
     // para propósitos educacionales
     
     public void dibujar(Object referenciaObjeto, String color, Shape figura)    {
        objetos.remove(referenciaObjeto);   // solo en caso de que ya esté
        objetos.add(referenciaObjeto);      // añadir al final
        figuras.put(referenciaObjeto, new DescripcionFigura(figura, color));
        redibujar();
    }
 
    /**
     * Borra una determinada figura de la pantalla
     * @param  referenciaObjeto  el objeto figura a ser borrado
     */
    public void borrar(Object referenciaObjeto)    {
        objetos.remove(referenciaObjeto);   // just in case it was already there
        figuras.remove(referenciaObjeto);
        redibujar();
    }

    /**
     * Establecer el color de fondo del Canvas
     * @param  nuevoColor el nuevo color para el fondo del canvas
     */
    public void setFondoColor(String colorString)    {
        if (colorString.equals("red")) {
            grafico.setColor(Color.red);
        }
        else if (colorString.equals("black")) {
            grafico.setColor(Color.black);
        }
        else if (colorString.equals("blue")) {
            grafico.setColor(Color.blue);
        }
        else if (colorString.equals("yellow")) {
            grafico.setColor(Color.yellow);
        }
        else if (colorString.equals("green")) {
            grafico.setColor(Color.green);
        }
        else if (colorString.equals("magenta")) {
            grafico.setColor(Color.magenta);
        }
        else if (colorString.equals("white")) {
            grafico.setColor(Color.white);
        }
        else {
            grafico.setColor(Color.black);
        }
    }

    /**
     * Esperar un núemro determinado de milisegundos antes de acabar.
     * Esto proporciona una manera de especificar un pequeño retraso 
     * que puede ser utilizado para producir animaciones
     * @param  milisegundos  tiempo de espera
     */
    
    public void esperar(int milisegundos)    {
        try     {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)     {
            // ignorar la excepción en este momento
        }
    }

    /**
     * Redibujar todas las figuras que están actualmente en el canvas
     */
    private void redibujar()    {
        borrar();
        for (Object figura : objetos)      {
            figuras.get(figura).dibujar(grafico);
        }
       
        canvas.repaint();
        
       
    }
       
    /**
     * Borrar todo el canvas
     */
    private void borrar()    {
        Color original = grafico.getColor();
        grafico.setColor(fondoColor);
        Dimension tamano = canvas.getSize();
        grafico.fill(new Rectangle(0, 0, tamano.width, tamano.height));
        grafico.setColor(original);
    }


    /************************************************************************
     * Clase interna, anidada, Canvaspane - El actual componente canvas 
     * contenido en el marco Canvas. Es esencialmente un JPanel con capacidad
     * añadida para refrescar la imagen dibujada en el
     */
    
    private class CanvasPane extends JPanel    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImagen, 0, 0, null);
        }
    }
    
    /************************************************************************
     * Clase anidada DescripcionFigura -
     */
    
    private class DescripcionFigura    {
        private Shape figura;
        private String colorString;

        public DescripcionFigura(Shape figura, String color)        {
            this.figura = figura;
            colorString = color;
        }

        public void dibujar(Graphics2D grafico)        {
            setFondoColor(colorString);
            grafico.fill(figura);
        }
    }

}
