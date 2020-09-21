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
    private List<Rectangle> rectangles = new ArrayList<>();

    @Override
    public void start(Stage stage){

        Group group = new Group();
        Scene scene = new Scene(group, 500, 500);
        Rectangle rectangle = new Rectangle(100, 100, 50, 50); // x, y, w ,h
        rectangle.setFill(Color.GREEN);

        updateSnake();

//        rectangle.setX(300);
        group.getChildren().add(rectangle);
        stage.setScene(scene);
        stage.show();

    }

    public void updateSnake(){ // kaldes fra en anden tråd
//        Platform.runLater(()-> {
//            for(Rectangle r : rectangles){
//                r.setX(r.getX() + 30);
//            }
//        });


        for(Rectangle r : rectangles){
               r.setX(r.getX() + 100);
         }


    }


}
