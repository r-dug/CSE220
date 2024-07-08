package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 * Built with Maven and JavaFX in VS code
 */
public class App extends Application {
    private Pane pieChartPane;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Custom Pie Chart with User Input Example");
        String[] labels = {"Java", "Python", "JavaScript", "C#", "C++"};
        // Create a layout pane for user input
        GridPane inputPane = new GridPane();
        inputPane.setHgap(1);
        inputPane.setVgap(1);
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPrefWidth(300); 
        col1.setMinWidth(250); 
        col1.setMaxWidth(300);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPrefWidth(200); 
        col2.setMinWidth(100); 
        col2.setMaxWidth(300);

        inputPane.getColumnConstraints().addAll(col1, col2);
        // Create text fields for user input
        TextField[] valueFields = new TextField[4];
        for (int i = 0; i < valueFields.length; i++) {
            Label label = new Label("How many students know " + labels[i] + ":");
            valueFields[i] = new TextField();
            inputPane.add(label, 0, i);
            inputPane.add(valueFields[i], 4, i);
        }

        // Create a button to generate the pie chart
        Button generateButton = new Button("Generate Pie Chart");
        inputPane.add(generateButton, 0, valueFields.length, 2, 1);

        // Create a layout pane for the pie chart
        pieChartPane = new Pane();
        pieChartPane.setPrefSize(800, 600);

        // Create a main layout pane
        GridPane mainPane = new GridPane();
        mainPane.add(inputPane, 0, 0);
        mainPane.add(pieChartPane, 1, 0);

        // Create the scene with the main layout pane
        Scene scene = new Scene(mainPane, 1000, 600);

        // Set the scene to the stage and show the stage
        stage.setScene(scene);
        stage.show();

        // Set button action to generate pie chart
        generateButton.setOnAction(event -> generatePieChart(valueFields, labels));
    }

    private void generatePieChart(TextField[] valueFields, String[] labels) {
        pieChartPane.getChildren().clear();

        double[] values = new double[valueFields.length];
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.PURPLE};
        

        double total = 0;
        for (int i = 0; i < valueFields.length; i++) {
            values[i] = Double.parseDouble(valueFields[i].getText());
            total += values[i];
        }

        double centerX = 400;
        double centerY = 300;
        double radius = 200;

        double startAngle = 0;
        for (int i = 0; i < values.length; i++) {
            double length = (values[i] / total) * 360;

            Arc arc = new Arc(centerX, centerY, radius, radius, startAngle, length);
            arc.setFill(colors[i]);
            arc.setType(ArcType.ROUND);

            pieChartPane.getChildren().add(arc);

            double labelX = 0;
            double labelY = 400+(i*35);

            Text label = new Text(labelX, labelY, labels[i]);
            label.setFill(colors[i]);
            label.setFont(Font.font("Roboto", 25 ));
        
            label.setX(labelX);

            pieChartPane.getChildren().add(label);

            startAngle += length;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}