package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        MyPane myPane = new MyPane();
        MyPane myPane2 = new MyPane();
        MyPane myPane3 = new MyPane();
        MyPane myPane4 = new MyPane();

        FlowPane vBox = new FlowPane(); // root
        vBox.getChildren().addAll(myPane, myPane2, myPane3,myPane4); // tilføjet en label til VBox'en
        Scene scene = new Scene(vBox,400,400);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {

            switch (key.getText()){
                case "a": System.out.println("You pressed a"); break;
                case "d": System.out.println("You pressed d"); break;
                case "w": System.out.println("You pressed w"); break;
                case "s": System.out.println("You pressed s"); break;
                default: System.out.println("not arrow");
            }
                System.out.println(key.getText());
        });
        primaryStage.setScene(scene);// tilføje scene til primaryStage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}







//
//    AliceCounter aliceCounter = new AliceCounter();
//    String txt = aliceCounter.readFile();
//        System.out.println(aliceCounter.countLetters(txt));









//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//    VBox vBox = new VBox();
//    Button button = new Button("Press");
//    TextArea textArea = new TextArea();
//        button.setOnAction(e -> {
//                System.out.println("you clicked");
//                textArea.setText("you clicked");
//                });
//                vBox.getChildren().addAll(textArea,button);
//                primaryStage.setTitle("Hello World");
//                primaryStage.setScene(new Scene(vBox, 300, 275));
//                primaryStage.show();