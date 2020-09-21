package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewList extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label response = new Label("Select a college or university:");


        Text title = new Text("PA Colleges and Universities");
        title.setFill(Paint.valueOf("#2A5058"));
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);

        ObservableList<String> colleges =
                FXCollections.observableArrayList("Penn State", "Ishøj Gym", "DTU", "KU",
                        "ITU", "KEA");

        ListView<String> lvColleges = new ListView<String>(colleges);
        lvColleges.setPrefSize(300, 150);


        root.getChildren().add(title);
        root.getChildren().add(lvColleges);
        root.getChildren().add(response);

        Scene scene = new Scene(root, 350, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("List");
        primaryStage.show();



    }
}
