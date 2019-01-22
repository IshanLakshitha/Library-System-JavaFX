package com.ijse.sys.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(this.getClass().getResource("/com/ijse/sys/view/MainFormView.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.show();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main Form");
        primaryStage.centerOnScreen();
        primaryStage.resizableProperty();
    }
}
