package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();

        Scene scene = new Scene(root, 400, 400, Color.BLACK);

        Random random = new Random();

        Rectangle snake = new Rectangle(200, 200, 20, 20);
        snake.setFill(Color.GREEN);

        Circle apple = new Circle(10, Color.RED);
        apple.setCenterX(random.nextInt(400));
        apple.setCenterY(random.nextInt(400));



        scene.setOnKeyPressed(keyEvent -> {




            if (keyEvent.getText().equals("w")) {
                snake.setY(snake.getY() - 10);
            }
            if (keyEvent.getText().equals("s")) {
                snake.setY(snake.getY() + 10);
            }
            if (keyEvent.getText().equals("d")) {
                snake.setX(snake.getX() + 10);
            }
            if (keyEvent.getText().equals("a")) {
                snake.setX(snake.getX() - 10);
            }


            System.out.println("Apple: " + apple.getCenterX() + " " + apple.getCenterY());
            System.out.println("snake: " + snake.getX() + " " + snake.getY());


        });





        root.getChildren().addAll(snake, apple);

        primaryStage.setTitle("Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
