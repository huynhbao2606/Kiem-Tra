package bao.kiemtra.java.thijava;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.*;

public class Bai2Controller {
    @FXML
    private TextField cao;

    @FXML
    private ComboBox<String> danhGia;

    @FXML
    private Button mbi;

    @FXML
    private TextField nang;

    @FXML
    private Label textResult;
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

    public void initialize() {
        addCombBox();
    }

    public void addCombBox() {
        danhGia.getItems().addAll("WHO","IDI & WPRO BMI");
        danhGia.getSelectionModel().selectFirst();
    }

    private float getNang() {
            float weight = Float.parseFloat(nang.getText());
            nang.setText("");
            return weight;
    }

    private float getCao() {
            float height = Float.parseFloat(cao.getText());
            cao.setText("");
            return height;
    }
    public void tinhMBI() {
        float canNang = getCao();
        float chieuCao = getNang()/100;
        float MBI = canNang/(chieuCao*chieuCao);
        if (canNang != -1 && chieuCao != -1) {
            int index = danhGia.getSelectionModel().getSelectedIndex();
            String result;
            if (index == 0) {
                if (MBI < 18.5) {
                    result = "Bạn cân nặng thấp (gầy)";
                } else if (MBI <= 24.9) {
                    result = "Bạn bình thường";
                }  else if (MBI == 25) {
                    result = "Bạn thừa cân";
                } else if (MBI <= 29.9) {
                    result = "Bạn tiền béo phì";
                } else if (MBI <= 34.9) {
                    result = "Bạn béo phì độ I";
                } else if (MBI <= 39.9) {
                    result = "Bạn béo phì độ II";
                } else {
                    result = "Bạn béo phì độ III";
                }
            } else {
                if (MBI < 18.5) {
                    result = "Bạn cân nặng thấp (gầy)";
                } else if (MBI <= 22.9) {
                    result = "Bạn bình thường";
                } else if (MBI == 23) {
                    result = "Bạn thừa cân";
                } else if (MBI <= 24.9) {
                    result = "Bạn tiền béo phì";
                } else if (MBI <= 29.9) {
                    result = "Bạn béo phì độ I";
                } else if (MBI <= 30) {
                    result = "Bạn béo phì độ II";
                } else {
                    result = "Bạn béo phì độ III";
                }
            }
            textResult.setText(result);
        }
    }

}
