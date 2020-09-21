package sample;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextEffects extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox(5);
        root.setSpacing(20);

//        Text a = new Text("Linkedin");
//        Text b = new Text("Reflection in JavaFX");
//        Text c = new Text("Shadow");
        root.getChildren().addAll(dropShadow(), reflection());


        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Effect");
        primaryStage.show();

    }

    static Node dropShadow() {

        Text t = new Text();
        t.setCache(true);
        t.setFill(Color.FIREBRICK);
        t.setText("DropShadow Effect");
        t.setFont(Font.font("null", FontWeight.BOLD, 32));

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(3.0);
        ds.setColor(Color.GRAY);
        t.setEffect(ds);
        return t;


    }

    static Node reflection() {
        Text text = new Text();
        text.setCache(true);
        text.setFill(Color.CORNFLOWERBLUE);
        text.setFont(Font.font("null", FontWeight.BOLD, 32));
        text.setText("Reflection in JavaFX");

        Reflection reflection = new Reflection();
        reflection.setFraction(0.9);
        text.setEffect(reflection);
        text.setTranslateY(50);

        return text;

    }



}
