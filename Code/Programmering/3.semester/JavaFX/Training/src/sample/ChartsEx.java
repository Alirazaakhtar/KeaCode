package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ChartsEx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        FlowPane root = new FlowPane();

        setUserAgentStylesheet(STYLESHEET_CASPIAN);

        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                new PieChart.Data("Rent", 125),
                new PieChart.Data("Groceries", 235),
                new PieChart.Data("Entertaiment", 200),
                new PieChart.Data("Cell phone", 80)
        );

        PieChart budget = new PieChart(pieData);
        budget.setTitle("Monthly Expanses");

        root.getChildren().add(budget);


        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
