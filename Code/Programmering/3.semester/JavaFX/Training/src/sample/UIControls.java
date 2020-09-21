package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UIControls extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Commonly used Controls
        // Label
        // Button
        // Checkbox
        // TextField
        // PasswordField
        //Radiobutton
        //Checkbox
        //progressbar
        //Hyperlink


        // 1. Række
        Button btn = new Button("Im a Button");
        TextField textField = new TextField();
        Label label = new Label("Change me");
        textField.setOnAction(event -> {
            label.setText(textField.getText());
        });


//        2. Række
        Hyperlink hyperlink = new Hyperlink("Google.com");
        RadioButton radioButton = new RadioButton();
        radioButton.setStyle("-fx-base: #61a2b1");
        CheckBox checkBox = new CheckBox("CheckBox");
        checkBox.setOnMouseClicked(mouseEvent -> {
            System.out.println("checked");
        });

        // 3. Række
        ProgressBar bar = new ProgressBar();
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setMin(60);
        scrollBar.setMax(180);
        Text value = new Text();
        scrollBar.setOnMouseClicked(mouseEvent -> {
        value.setText(Double.toString(scrollBar.getValue()));
        });

        // 4.Række
        PasswordField pw = new PasswordField();
        pw.setOnAction(event -> {
            System.out.println(pw.getText());
        });


        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(50);
        root.setPadding(new Insets(25, 25, 25, 25));

        root.add(btn, 0, 0);
        root.add(textField, 1, 0);
        root.add(label, 2, 0);

        root.add(hyperlink, 0, 1);
        root.add(radioButton, 1, 1);
        root.add(checkBox, 2, 1);

        root.add(bar, 0, 2);
        root.add(scrollBar, 1, 2);
        root.add(value, 2, 2);

        // De sidste 2 tal, betyder at den skal fylde alle 3 koloner, men kun 1 række
        root.add(pw, 0, 3, 3, 1);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("UI Controls");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
