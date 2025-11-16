package Práctica_11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SistemaEstudiantilA9119 extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
            BorderPane root = loader.load();

            Scene scene = new Scene(root, 1000, 600);

            String cssPath = getClass().getResource("estilos_9119.css").toExternalForm();
            scene.getStylesheets().add(cssPath);

            primaryStage.setTitle("Sistema Estudiantil - AECL");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}