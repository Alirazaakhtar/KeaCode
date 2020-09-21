package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class UILayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        FlowPane pane = new FlowPane();
        Circle c = new Circle(150, 135, 70);
        c.setFill(Color.BLUEVIOLET);


        Button button = new Button("Hello");
        button.setOnAction(event -> {
            System.out.println("Clicked");
        });

        HBox h = new HBox();
        h.getChildren().addAll(button);
        h.setAlignment(Pos.CENTER);


// Til Bordpane
//        pane.setTop(h);
//        pane.setCenter(c);

        pane.getChildren().addAll(c, button);

        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello");
        primaryStage.show();



    }
}
