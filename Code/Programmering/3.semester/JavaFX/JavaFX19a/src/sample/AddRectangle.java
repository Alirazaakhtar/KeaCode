package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class AddRectangle extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Snake snake = new Snake();

        Group group = new Group();
        Scene scene = new Scene(group, 500,500);
        Rectangle rectangle = new Rectangle(100,100,50,50);//x,y,w,h
        snake.myShape(rectangle);
        rectangle.setFill(Color.GREEN);
        snake.updateSnake();
        group.getChildren().add(rectangle);
        stage.setScene(scene);
        stage.show();
    }


}
