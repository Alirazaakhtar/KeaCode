package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class RotateBtn extends Application {

    double angle = 0.0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Rotate rotate = new Rotate();
        Button btnRotate = new Button("Click the button");
        btnRotate.getTransforms().add(rotate);

        btnRotate.setOnAction(event -> {
            angle += 15;
            rotate.setAngle(angle);
            rotate.setPivotX(btnRotate.getWidth()/2);
            rotate.setPivotY(btnRotate.getHeight()/2);
        });


        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25, 25, 25,25));
        root.getChildren().add(btnRotate);


        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Rotate");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
