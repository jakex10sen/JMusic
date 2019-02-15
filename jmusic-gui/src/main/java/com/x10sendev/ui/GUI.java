package com.x10sendev.ui;

import com.x10sendev.ui.elements.Console;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.PrintStream;

public class GUI extends Application {

  private static PrintStream ps;
  private GridPane gridPane;
  private Button synthBtn;
  private ToolBar toolBar;
  private TextArea textArea;
  private ScrollPane scrollPane;
  private Scene scene;
  private Background background;
  private BackgroundFill backgroundFill;

  public static void main(String[] args) {
    ps = null;
    launch(args);
    if (ps != null) {
      ps.close();
    }
  }

  @Override
  public void start(Stage stage) {
    stage.setTitle("MIDI Control");

    backgroundFill = new BackgroundFill(Color.DARKSLATEGRAY, CornerRadii.EMPTY, Insets.EMPTY);
    background = new Background(backgroundFill);

    gridPane = new GridPane();
    textArea = new TextArea();

    Console console = new Console(textArea);
    ps = new PrintStream(console, true);
    System.setOut(ps);
    System.setErr(ps);

    gridPane.setAlignment(Pos.TOP_LEFT);
    gridPane.setBackground(background);

    synthBtn = new Button("Synth");
    synthBtn.setOnAction(event -> System.out.println("Clicked"));
    synthBtn.setBackground(background);

    toolBar = new ToolBar(synthBtn);
    toolBar.setBackground(background);

    gridPane.add(toolBar, 0, 0);

    textArea.setWrapText(true);
    textArea.setEditable(false);
    textArea.setStyle("-fx-text-fill: white; -fx-font-family: monospace;");
    textArea.setBackground(background);

    scrollPane = new ScrollPane(textArea);
    scrollPane.setBackground(background);

    gridPane.add(scrollPane, 0, 1);

    scene = new Scene(gridPane);
    scene.setFill(Color.SLATEGRAY);
    scene.getStylesheets().add("com/x10sendev/gui/style.css");


    stage.setScene(scene);
    stage.show();
  }
}
