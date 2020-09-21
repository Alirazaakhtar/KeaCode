package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BlendedShapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        StackPane pane = new StackPane();

        pane.getChildren().addAll(blendModeObjects());


        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setTitle("Blended Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    static Node blendModeObjects(){

        Group group = new Group();

        Circle c = new Circle(50, 50, 30);
        c.setFill(Color.DARKGRAY);
        c.setBlendMode(BlendMode.MULTIPLY);

        Rectangle r = new Rectangle(50, 50, 30 ,30);



        return group;
    }

}
