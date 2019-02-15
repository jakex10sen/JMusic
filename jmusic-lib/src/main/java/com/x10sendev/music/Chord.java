package com.x10sendev.music;

import java.util.Collections;
import java.util.Vector;

public class Chord {

  /**
   * Holds all the Notes of the Chord
   */
  private Vector<Note> _notes = new Vector<>();

  /**
   * The length of the Chord
   */
  private long _length;

  /**
   * Constructs a Chord with the given Notes and length
   *
   * @param length the length of the Chord
   * @param note   the Notes of the Chord
   */
  public Chord(long length, Note... note) {
    Collections.addAll(_notes, note);
    _length = length;
  }

  /**
   * Returns the Notes of the Chord in a Vector
   *
   * @return the Vector of Notes
   */
  public Vector<Note> getNotes() {
    return _notes;
  }

  /**
   * Returns the length of the Chord
   *
   * @return the length of the Chord
   */
  public long getLength() {
    return _length;
  }

}
