package com.x10sendev.test;

import com.x10sendev.util.Console;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.PrintStream;

public class TestConsole extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextArea textArea = new TextArea();
        textArea.setPrefSize(800, 600);
        Console console = new Console(textArea);
        PrintStream ps = new PrintStream(console, true);
        System.setOut(ps);
        System.setErr(ps);
        Scene scene = new Scene(textArea);

        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println("hello");
        ps.close();
    }
}
