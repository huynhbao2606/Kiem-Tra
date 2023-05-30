package bao.kiemtra.java.thijava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class home extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(homeController.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        homeController controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}