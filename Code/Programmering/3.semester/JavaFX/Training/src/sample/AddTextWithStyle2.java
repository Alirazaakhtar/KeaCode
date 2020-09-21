package sample;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddTextWithStyle2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        BorderPane pane = new BorderPane();

        pane.setTop(addHbox("Top"));
        pane.setBottom(addHbox("Bottom"));
        pane.setRight(addVbox("Right"));
        pane.setLeft(addVbox("Left"));

        pane.getStylesheets().add("sample/textStyle.css");

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TextStyle");
        primaryStage.show();

    }

    public static Node addHbox(String str){
        HBox hBox = new HBox();
        Text hText = new Text(str);
        hBox.setId("hbox");
        hText.setId("textstyle");
        hBox.getChildren().add(hText);

        return hBox;
    }


    public static Node addVbox(String str) {
        VBox vBox = new VBox();
        Text vText = new Text(str);
        vBox.setId("vbox");
        vText.setId("textstyle");
        vBox.getChildren().add(vText);

        return vBox;


    }


}
