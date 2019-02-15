package com.x10sendev;

import com.x10sendev.music.MusicSequence;
import com.x10sendev.sequences.Sequences;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {
  public static void main(String[] args) throws InvalidMidiDataException {
    Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    MusicSequence gravityFalls = Sequences.GravityFalls();
    try {
      gravityFalls.write("Gravity_Falls.mid");
      Sequencer sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.setSequence(MidiSystem.getSequence(new File("Gravity_Falls.mid")));
      sequencer.start();
    } catch (IOException | MidiUnavailableException e) {
      logger.log(Level.SEVERE, Arrays.toString(e.getStackTrace()));
    }

    MusicSequence pokemonIntro = Sequences.PokemonIntro();
    try {
      pokemonIntro.write("PokemonIntro.mid");
      Sequencer sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.setSequence(MidiSystem.getSequence(new File("PokemonIntro.mid")));
      sequencer.start();
    } catch (IOException | MidiUnavailableException e) {
      logger.log(Level.SEVERE, Arrays.toString(e.getStackTrace()));
    }

    MusicSequence iWriteSinsNotTragedies = Sequences.IWriteSinsNotTragedies();
    try {
      iWriteSinsNotTragedies.write("IWriteSinsNotTragedies.mid");
      Sequencer sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.setSequence(MidiSystem.getSequence(new File("IWriteSinsNotTragedies.mid")));
      sequencer.start();
    } catch (IOException | MidiUnavailableException e) {
      logger.log(Level.SEVERE, Arrays.toString(e.getStackTrace()));
    }


  }
}
