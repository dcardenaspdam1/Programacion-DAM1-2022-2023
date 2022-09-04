import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.geometry.Pos;
import javafx.stage.Stage; 
import javafx.application.Platform;

/**
 *
 */
public class SaludoGrafico extends Application
{
    private Button btnSalir;

    /**
     * 
     *
     * @param  stage el escenario 
     */
    @Override
    public void start(Stage stage)    {
        BorderPane root = crearGui();
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Saludo gráfico en Java");
        scene.getStylesheets().add(
            getClass().getResource("estilo.css")
            .toExternalForm());
        stage.show();
    }

    private BorderPane crearGui() {

        BorderPane panel = new BorderPane();

        Label lblSaludo = new Label("Bienvenido/a a la POO en Java");
        lblSaludo.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        panel.setCenter(lblSaludo);

        btnSalir = new Button("Salir"); 
        btnSalir.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        btnSalir.setOnAction(e -> salir());
        panel.setBottom(btnSalir);
        BorderPane.setAlignment(btnSalir, Pos.CENTER);

        return panel;
    }

    /**
     * 
     */
    public void salir() {
        Platform.exit();
    }

    public static void main(String[] args)     {  
        launch(args); 
    } 

}
