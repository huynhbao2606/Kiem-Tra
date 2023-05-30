package bao.kiemtra.java.thijava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class homeController {
    @FXML
    private Button baiTap1;

    @FXML
    private Button baiTap2;

    @FXML
    private Button baiTap3;

    @FXML
    private Button close;
    @FXML
    private Stage stage;

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public void setBaiTap1() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bai1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Bai1Controller controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setScene(scene);
    }
    public void setBaiTap2() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bai2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Bai2Controller controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setScene(scene);
    }
    public void setBaiTap3() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bai3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Bai3Controller controller = fxmlLoader.getController();
        controller.setStage(stage);
        stage.setScene(scene);
    }

    public void close() {
        this.stage.close();
    }


}