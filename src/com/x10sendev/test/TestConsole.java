package com.x10sendev.test;

import com.x10sendev.util.Console;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.PrintStream;

public class TestConsole extends Application {

    TextArea output;
    Button button;
    VBox box;
    Scene scene;

    Console console;
    PrintStream printStream;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        output = new TextArea();
        output.setPrefSize(800, 600);
        output.setEditable(false);

        console = new Console(output);
        printStream = new PrintStream(console, true);

        System.setOut(printStream);
        System.setErr(printStream);

        box = new VBox();
        box.getChildren().add(output);
        scene = new Scene(box);

        button = new Button("Click me!");
        button.setOnAction(event -> System.out.println("Hello"));
        box.getChildren().add(button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
