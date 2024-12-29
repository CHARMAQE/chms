package com.example.demo1.Controller;

import com.example.demo1.Model.ProgressModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class ProgressBarController {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private Label percentageLabel;

    @FXML
    public void initialize() {
        // Initialize ProgressModel
        ProgressModel progressModel = new ProgressModel();
        double progress = progressModel.getAppointmentsProgressThisYear();

        // Set the progress to the progress bar
        progressBar.setProgress(progress / 100.0);

        // Set the percentage text below the progress bar
        percentageLabel.setText(String.format("%.2f%%", progress));
    }
}
