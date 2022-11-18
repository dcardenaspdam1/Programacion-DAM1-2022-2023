
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GuiNumeroSecreto extends Application
{
    private TextField txtNumero;
    private Button btnIntentar;
    private Button btnSeguir;
    private Button btnAyuda;
    private TextArea areaTexto;
    private JuegoNumeroSecreto juego;        // el modelo

    @Override
    public void start(Stage stage)    {
        this.juego = new JuegoNumeroSecreto(); // crear el modelo
        BorderPane root = crearGui();
        Scene scene = new Scene(root, 750, 450);
        stage.setScene(scene);
        stage.setTitle("Juego del nº secreto");
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.show();
    }

    private BorderPane crearGui()    {
        HBox pnlNorte = crearPanelNorte();
        BorderPane pnlCentral = crearPanelCentral();

        BorderPane pnlPrincipal = new BorderPane();
        pnlPrincipal.setTop(pnlNorte);
        pnlPrincipal.setCenter(pnlCentral);
        return pnlPrincipal;
    }

    private BorderPane crearPanelCentral()    {
        BorderPane panel = new BorderPane();
        areaTexto = new TextArea();

        areaTexto.getStyleClass().add("textArea");
        panel.setCenter(areaTexto);
        panel.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
            + "-fx-border-insets:  5;" + "-fx-border-radius: 2;" + "-fx-border-color:  gray;");
        return panel;
    }

    private HBox crearPanelNorte()    {
        HBox panel = new HBox();
        panel.setSpacing(8);
        panel.setPadding(new Insets(6));

        panel.setAlignment(Pos.CENTER);
        panel.setId("norte");

        Label lblNumero = new Label("Teclea nº");

        txtNumero = new TextField();
        txtNumero.setPrefColumnCount(20);

        btnIntentar = new Button("Intentar");
        btnIntentar.setDefaultButton(true);
        btnIntentar.setPrefWidth(100);
        btnIntentar.setOnAction(new EventHandler<ActionEvent>()    {

                @Override
                public void handle(ActionEvent event){
                    intentarJugada();

                }
            });

        btnSeguir = new Button("Seguir");
        btnSeguir.setDisable(true);
        btnSeguir.setPrefWidth(100);
        btnSeguir.setOnAction(new EventHandler<ActionEvent>()    {

                @Override
                public void handle(ActionEvent event)    {
                    continuarJugando();

                }
            });

        Image image = new Image(getClass().getResourceAsStream("/images/help.PNG"));
        btnAyuda = new Button();
        btnAyuda.setId("btnAyuda");
        btnAyuda.setGraphic(new ImageView(image));
        btnAyuda.setOnAction(new EventHandler<ActionEvent>()    {
                @Override
                public void handle(ActionEvent event)    {
                    ayuda();

                }
            });

        panel.setBorder(new Border(
                new BorderStroke(Color.MAROON, BorderStrokeStyle.SOLID, new CornerRadii(2), new BorderWidths(2.0))));
        panel.getChildren().addAll(lblNumero, txtNumero, btnIntentar, btnSeguir, btnAyuda);
        return panel;
    }

    private void ayuda()    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ayuda del juego");
        alert.setHeaderText("Información");
        String s = "  Teclea un nº entre 1 y 100   \n  Has de adivinarlo en un máximo de 5 intentos ";

        alert.setContentText(s);
        alert.show();
        cogerFoco();

    }

    /**
     * Intenta una jugada. Muestra el resutlado de la jugada en el área de texto
     */
    private void intentarJugada()    {

        String strNumero = txtNumero.getText();
        if (strNumero.equals(""))        {
            areaTexto.appendText("Teclee un valor\n");
        }
        else    {
            try    {
                int numero = Integer.parseInt(strNumero);
                if (numero < 1 || numero > 100)    {
                    areaTexto.appendText("Teclee un valor entre 1 y 100\n");
                }
                else if (!juego.haTerminado())    {
                    juego.realizarJugada(numero);
                    areaTexto.appendText("Ha tecleado el nº " + numero + "\n");
                    areaTexto.appendText(juego.getResultado() + "\n");
                    if (juego.haTerminado()){
                        btnIntentar.setDisable(true);
                        btnSeguir.setDisable(false);
                    }
                }

            }
            catch (NumberFormatException e)    {
                areaTexto.appendText("Teclee valor numérico\n");
            }

        }

        cogerFoco();

    }

    /**
     * Llevar el foco a la caja de texto
     */
    private void cogerFoco()    {
        txtNumero.requestFocus();
        txtNumero.selectAll();
    }

    /**
     * Limpia el área de texto
     */
    private void limpiar()    {
        areaTexto.setText("");
    }

    /**
     * continuar con el juego
     */
    private void continuarJugando()    {
        limpiar();
        cogerFoco();
        juego.resetJuego();
        btnIntentar.setDisable(false);
        btnSeguir.setDisable(true);
        txtNumero.setText("");

    }

    public static void main(String[] args)    {
        launch(args);
    }
}
