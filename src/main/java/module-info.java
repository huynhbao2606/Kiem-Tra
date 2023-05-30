module bao.kiemtra.java.thijava {
    requires javafx.controls;
    requires javafx.fxml;


    opens bao.kiemtra.java.thijava to javafx.fxml;
    exports bao.kiemtra.java.thijava;
}