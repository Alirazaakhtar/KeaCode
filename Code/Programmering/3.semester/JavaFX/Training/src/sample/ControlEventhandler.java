package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControlEventhandler extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {



        GridPane root = new GridPane();
        root.setVgap(30);
        root.setHgap(50);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.setAlignment(Pos.CENTER);

        Label username = new Label("Name: ");
        TextField usernameField = new TextField();
        HBox hb = new HBox();
        hb.getChildren().addAll(username, usernameField);
        hb.setSpacing(25);

        Label comment = new Label("Enter your comment");
        TextField commentField = new TextField();

        Button submit = new Button("Submit");
        Button clear = new Button("Clear");

        //Laben for confirmation
        Label response = new Label();


        //Når man kører musen over knapperne
        DropShadow shadow = new DropShadow();
        submit.setOnMouseEntered(mouseEvent -> {
            submit.setEffect(shadow);
        });
        submit.setOnMouseExited(mouseEvent -> {
            submit.setEffect(null);
        });
        clear.setOnMouseEntered(mouseEvent -> {
            clear.setEffect(shadow);
        });
        clear.setOnMouseExited(mouseEvent -> {
            clear.setEffect(null);
        });

        //Når man trykker på knappen

        submit.setOnAction(event -> {
            if(commentField.getText() != null && !commentField.getText().isEmpty()){
                response.setText(usernameField.getText() + " thanks for your comment");
            }else {
                response.setText("Missing comment");
            }
        });
        clear.setOnAction(event -> {
            usernameField.clear();
            commentField.clear();
            response.setText(null);

        });

        //Sæt objekterne ind i grid

        root.add(hb, 0, 0);

        root.add(comment, 0, 1);
        root.add(commentField, 0, 2);

        root.add(submit, 0, 3);
        root.add(clear, 2, 3);

        root.add(response, 0, 4);


        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Event");
        primaryStage.show();


    }
}
