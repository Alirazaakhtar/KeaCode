package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXInput extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        Rectangle rectangle = new Rectangle(100,100,50,50);//x,y,w,h

        Scene scene = new Scene(group, 500, 500);
        scene.setOnKeyPressed(keyEvent -> {

            switch (keyEvent.getText()){
                case "w": rectangle.setY(rectangle.getY() - 50); break;
                case "s": rectangle.setY(rectangle.getX() + 50); break;
                case "d": rectangle.setX(rectangle.getX() + 50); break;
                case "a": rectangle.setX(rectangle.getX() - 50); break;

            }

            System.out.println("tryk " + keyEvent.getText());
        });
        group.getChildren().add(rectangle);
        stage.setScene(scene);
        stage.show();
    }
}
