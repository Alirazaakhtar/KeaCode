package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Menus extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);


        // File menu
        Menu fileMenu = new Menu("File");
        CheckMenuItem newMenuItem = new CheckMenuItem("New");
        CheckMenuItem saveMenuItem = new CheckMenuItem("Save");
        CheckMenuItem exitMenuItem = new CheckMenuItem("Exit");

        saveMenuItem.setSelected(true);

        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, new SeparatorMenuItem(), exitMenuItem);

        exitMenuItem.setOnAction(event -> {
            primaryStage.close();
        });


        Menu languageMenu = new Menu("Language");
        MenuItem javaMenuItem = new MenuItem("Java");
        MenuItem pythonMenuItem = new MenuItem("Python");
        MenuItem htmlMenuItem = new MenuItem("HTML");

        Menu tMenu = new Menu("Tutorial");
        tMenu.getItems().addAll(new MenuItem("Buttons"), new MenuItem("Menus"),
                new MenuItem("Images"));

        languageMenu.getItems().addAll(javaMenuItem, pythonMenuItem, htmlMenuItem, tMenu);

        menuBar.getMenus().addAll(fileMenu, languageMenu);



        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
