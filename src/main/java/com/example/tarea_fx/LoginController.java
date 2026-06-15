package com.example.tarea_fx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    public void initialize() {
        cmbRol.getItems().addAll(
                "Administrador",
                "Usuario"
        );
    }

    @FXML
    private void ingresar() {

        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();

        if (usuario.equals("admin")
                && password.equals("1234")
                && cmbRol.getValue() != null
                && cmbRol.getValue().equals("Administrador")) {

            try {

                FXMLLoader loader =
                        new FXMLLoader(getClass().getResource("dashboard.fxml"));

                Scene scene = new Scene(loader.load());

                scene.getStylesheets().add(
                        getClass()
                                .getResource("/css/style.css")
                                .toExternalForm()
                );

                Stage stage =
                        (Stage) txtUsuario.getScene().getWindow();

                stage.setScene(scene);
                stage.setTitle("Mi Tienda - Productos");
                stage.centerOnScreen();

            } catch (Exception e) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("No se pudo abrir el Dashboard");
                alert.setContentText(e.getMessage());
                alert.showAndWait();

                e.printStackTrace();
            }

        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Usuario o contraseña incorrectos");
            alert.showAndWait();

        }
    }
}