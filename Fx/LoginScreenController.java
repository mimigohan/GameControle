package test;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;


public class LoginScreenController
{
@FXML
private TextField UserNameField;
@FXML
private TextField PasswordField;



@FXML
protected void Login(){
    Alert alert=new Alert(AlertType.INFORMATION);
    alert.setTitle("Info");
    alert.setHeaderText("Information für Anwender");
    alert.setContentText("Hallo "+UserNameField.getText());
    
    alert.showAndWait();
}
}
