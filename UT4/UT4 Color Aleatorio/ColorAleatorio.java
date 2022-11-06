
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorAleatorio extends Application
{
    private Random generador;
    private Pane panelNorte;
    private Button btnCambiar;

    public ColorAleatorio()    {
        generador = new Random();
    }

    @Override
    public void start(Stage stage)    {
        BorderPane root = crearGui();

        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setTitle("Color aleatorio");
        stage.show();
    }

    private BorderPane crearGui()    {
        BorderPane panel = new BorderPane();
        panelNorte = new Pane();
        panelNorte.setId("panelNorte");

        panel.setCenter(panelNorte);
        btnCambiar = new Button("CambiarColor");
        btnCambiar.setMaxSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        btnCambiar.setOnAction(new EventHandler<ActionEvent>()    {

                @Override
                public void handle(ActionEvent event)      {
                    cambiarColorFondoPanel();                
                }

            });
        panel.setBottom(btnCambiar);
        return panel;
    }

    private void cambiarColorFondoPanel()    {
        BackgroundFill fill = new BackgroundFill(generarColor(), CornerRadii.EMPTY,
                Insets.EMPTY);
        Background background = new Background(fill);
        panelNorte.setBackground(background);

    }

    /**
     * Método privado de ayuda
     * Se hace una llamada interna a este método cuando se necesita generar un color de forma aleatoria
     * Un color es un objeto de tipo Color que se construye con tres parámetros de tipo int,
     * la cantidad  de rojo, verde y azul (un valor entre 0 y 255 inclusive)
     * 
     * El objeto se genera con Color.rgb() 
     */
    private Color generarColor()   {
        int rojo = generador.nextInt(256);
        int verde = generador.nextInt(256);
        int azul = generador.nextInt(256);
        return  Color.rgb(rojo,  verde,  azul);

    }

    public static void main(String[] args)    {
        launch(args);
    }
}
