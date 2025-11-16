package Práctica_11;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainViewController {

    @FXML
    private TableView<Estudiante> tablaEstudiantes;
    @FXML
    private TableColumn colMatricula;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colCarrera;
    @FXML
    private TableColumn colSemestre;

    private ObservableList<Estudiante> listaEstudiantes;

    // EN MainViewController.java, dentro de initialize()

    @FXML
    private void initialize() {
        listaEstudiantes = FXCollections.observableArrayList();

        colMatricula.setCellValueFactory(new PropertyValueFactory("matricula"));
        colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        colCarrera.setCellValueFactory(new PropertyValueFactory("carrera"));
        colSemestre.setCellValueFactory(new PropertyValueFactory("semestre"));

        tablaEstudiantes.setItems(listaEstudiantes);

        listaEstudiantes.add(new Estudiante("2069119", "Angel Carmona", "LCC", "6"));

        tablaEstudiantes.setPlaceholder(null);
        tablaEstudiantes.refresh();
    }

    @FXML
    private void handleNuevoEstudiante() {
        System.out.println("Botón 'Nuevo Estudiante' presionado!");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FormularioEstudiante.fxml"));
            VBox formularioRoot = loader.load();

            FormularioEstudianteController controller = loader.getController();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Registrar Nuevo Estudiante");
            dialogStage.initModality(Modality.APPLICATION_MODAL);
            dialogStage.initOwner(tablaEstudiantes.getScene().getWindow());

            controller.setDialogStage(dialogStage);

            Scene dialogScene = new Scene(formularioRoot);
            String cssPath = getClass().getResource("estilos_9119.css").toExternalForm();
            dialogScene.getStylesheets().add(cssPath);

            dialogStage.setScene(dialogScene);
            dialogStage.showAndWait();

            if (controller.isOkClicked()) {
                Estudiante estudianteGuardado = controller.getNuevoEstudiante();

                listaEstudiantes.add(estudianteGuardado);
                System.out.println("Estudiante " + estudianteGuardado.getNombre() + " agregado a la tabla.");
            }

        } catch (IOException e) {
            e.printStackTrace();
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Carga");
            alerta.setHeaderText("No se pudo abrir el formulario");
            alerta.setContentText("Error al cargar 'FormularioEstudiante.fxml'.");
            alerta.showAndWait();
        }
    }

    @FXML
    private void handleSalir() {
        System.out.println("Saliendo de la aplicación...");
        System.exit(0);
    }
}