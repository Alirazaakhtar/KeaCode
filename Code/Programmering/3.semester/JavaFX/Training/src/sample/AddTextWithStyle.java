package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddTextWithStyle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();


        Scene scene = new Scene(pane, 400, 450);
        pane.setTop(addHBox("Top"));

        pane.setLeft(addVBox("Left"));
        pane.setRight(addVBox("Right"));
        pane.setBottom(addHBox("Bottom"));

        scene.getStylesheets().add("sample/textStyle.css");


        primaryStage.setTitle("Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static HBox addHBox(String str) {
        HBox hBox = new HBox();
        Text text = new Text(str);
        hBox.setId("hbox");
        text.setId("textstyle");
        hBox.getChildren().add(text);

        return hBox;
    }


    public static VBox addVBox(String str) {

        VBox vBox = new VBox();
        Text text = new Text(str);
        text.setId("textstyle");
        vBox.setId("vbox");
        vBox.getChildren().addAll(text);
        return vBox;
    }
}
