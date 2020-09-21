package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyPane extends Pane {
    private boolean toogle = false;
    private VBox vBox = new VBox();
    private int minHeight = 50;
    public MyPane(){
        HBox hBox = new HBox();
        Button button = new Button("Do it, press!");
        Label label = new Label("MyPane Label");
        button.setOnAction(e -> {
            label.setText("you press well.");
            toogle = !toogle;
            String enteredByUser = "abcdef";
            if (toogle){
                enteredByUser = "eeeeee";
            }
            minHeight += 10;
            setMinHeight(minHeight); // will redraw node
            setStyle("-fx-background-color: #" + enteredByUser);
        });
        hBox.getChildren().addAll(button, label);
        vBox.getChildren().add(hBox);
        getChildren().addAll(vBox);
        setImage();

        setMinHeight(minHeight);
        setMaxWidth(260);
    }

    private void setImage(){
        try {
            Image image = new Image(new FileInputStream("m3.jpg"));
            //Setting the image view
            ImageView imageView = new ImageView(image);
            //setting the fit height and width of the image view
            imageView.setFitHeight(60);
            imageView.setFitWidth(100);
            imageView.setPreserveRatio(true);
            vBox.getChildren().add(imageView);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
