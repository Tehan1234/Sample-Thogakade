package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {

    @FXML
    void btnAddMainOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/add_customer_form.fxml"))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Add Customer Form ");
        stage.show();

    }

    @FXML
    void btnAddViewMainOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/view_customer_form.fxml"))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("View Customer Form ");
        stage.show();
    }

}
