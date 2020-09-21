package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        /*

        VBox vBox = new VBox(); // root

        Label label = new Label("Hi there");

        TextArea textArea = new TextArea("Hi there");

        Button button = new Button("Press me");
        button.setOnAction(e ->{
            label.setText("you Pressed med");
            label.setVisible(false);
            vBox.getChildren().add(new Label("more Labels "));

        });

        vBox.getChildren().addAll(label, button); // Nu har vi tilføjet en label til Vbox


        Scene scene = new Scene(vBox, 300, 300);
        primaryStage.setScene(scene); // tilføje scene til primaryStage
        primaryStage.show();

*/

    }


    public static void main(String[] args) {
        launch(args); // statics metode

    }
}
