package com.x10sendev.ui.elements;

import javafx.scene.control.TextArea;

import java.io.OutputStream;

public class Console extends OutputStream {

  private TextArea output;

  public Console(TextArea textArea) {
    output = textArea;
  }

  @Override
  public void write(int i) {
    output.appendText(String.valueOf((char) i));
  }
}
