package com.example.demo1.Controller;

import com.example.demo1.Model.AppointmentModel;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class AppointmentController {

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    public void initialize() {
        AppointmentModel model = new AppointmentModel();
        var appointmentsData = model.getAppointmentsPerService();  // Assuming this returns the list of services and appointment count

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Rendez-vous par service");

        // Add data to the series
        for (var appointment : appointmentsData) {
            series.getData().add(new XYChart.Data<>(appointment.getServiceName(), appointment.getNumberOfAppointments()));
        }

        barChart.getData().add(series);
    }
}
