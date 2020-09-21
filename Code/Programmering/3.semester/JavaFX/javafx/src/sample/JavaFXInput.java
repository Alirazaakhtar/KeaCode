package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXInput extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        Scene scene = new Scene(group, 500,500);

        // printer de bogstv
        scene.setOnKeyPressed(keyEvent -> {
            System.out.println("tryk " + keyEvent.getText());
        });


        stage.setScene(scene);
        stage.show();
    }
}

