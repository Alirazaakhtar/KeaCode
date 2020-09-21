package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddImage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane();
        Text text = new Text("California");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        text.setFill(Color.FIREBRICK);


        Image dessert = new Image("https://static.toiimg.com/photo/msid-75127597,width-96,height-65.cms");
        ImageView imageView = new ImageView(dessert);
        imageView.setFitHeight(300);
        imageView.setFitWidth(500);

        pane.setTop(text);
        pane.setCenter(imageView);

        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("California");
        primaryStage.show();

    }
}
