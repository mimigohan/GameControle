package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginScreenMain extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root=FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root,300,275));
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
