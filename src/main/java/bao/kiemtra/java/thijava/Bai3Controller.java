package bao.kiemtra.java.thijava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Bai3Controller {

    @FXML
    private Stage stage;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void goHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(homeController.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        homeController controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setScene(scene);
    }
}
