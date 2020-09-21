package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();

        Line seesaw = new Line(60, 340, 340, 140);
        seesaw.setStroke(Color.BLACK);
        seesaw.setStrokeWidth(15);

        Circle circle = new Circle(70, 280, 40);
        circle.setStroke(Color.RED);
        circle.setStrokeWidth(5);
        circle.setFill(Color.ORANGE);

        Circle sun = new Circle(0, 0, 140);
        sun.setFill(Color.YELLOW);

        Rectangle cloud = new Rectangle(320, 100, 80, 80);
        cloud.setFill(Color.WHITESMOKE);


        Rectangle rec = new Rectangle(240, 90, 80, 70);
        rec.setStroke(Color.BLACK);
        rec.setStrokeWidth(5);
        rec.setFill(Color.YELLOWGREEN);

        Line left = new Line(200, 240 ,160, 340);
        left.setStrokeWidth(5);
        Line right = new Line(200, 240 ,240, 340);
        right.setStrokeWidth(5);

        root.getChildren().addAll(seesaw, circle, rec, left, right, sun, cloud);



        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 400, Color.SKYBLUE));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
