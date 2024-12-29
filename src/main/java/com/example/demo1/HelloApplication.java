package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Load FXML files for the two pages
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("Appointment.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("ProgressBar.fxml"));

        // Create tabs for each page
        Tab tab1 = new Tab("Rendez-vous par service", fxmlLoader1.load());
        tab1.setClosable(false); // Disable tab closing

        Tab tab2 = new Tab("Progression des Rendez-vous", fxmlLoader2.load());
        tab2.setClosable(false); // Disable tab closing

        // Add the tabs to a TabPane
        TabPane tabPane = new TabPane();
        tabPane.getTabs().addAll(tab1, tab2);

        // Set the scene with the TabPane
        Scene scene = new Scene(tabPane, 800, 600);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());  // Add any stylesheets if needed
        stage.setTitle("Hospital Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
