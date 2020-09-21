package sample;

import javafx.application.Platform;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;


public class Snake {

    private List<Rectangle> rectangles = new ArrayList<>();


    public void updateSnake() {// kaldes fra en anden Tråd.
        Platform.runLater(() -> {
            for (Rectangle r : rectangles) {
                r.setX(r.getX() + 130);
            }
        });


    }

    public void myShape(Rectangle rectangle) {
        rectangles.add(rectangle);
    }




}
