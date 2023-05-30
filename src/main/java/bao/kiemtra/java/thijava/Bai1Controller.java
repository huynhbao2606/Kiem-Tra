package bao.kiemtra.java.thijava;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;

public class Bai1Controller {
    @FXML
    private Button back;


    @FXML
    private BarChart<String,Integer> chart;

    @FXML
    private Button chonFile;
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
    @FXML
    private void getFile(ActionEvent event){
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(this.stage);
        if (file != null) {
            String fileName = file.getName();
            if (fileName.endsWith(".txt")) {
                try {
                    String content = Files.readString(file.toPath());
                    String[] data = content.split(" ");
                    showChart(data);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    private void showChart(String[] data) {
        XYChart.Series<String,Integer> series = new XYChart.Series<>();
        series.setName("2022");
        for (String listData : data) {
            String[] parts = listData.split(":");
            String xValue = parts[0];
            Integer yValue = Integer.parseInt(parts[0]);
            series.getData().add(new XYChart.Data<>(xValue, yValue));
        }
        chart.getData().add(series);
    }



}
