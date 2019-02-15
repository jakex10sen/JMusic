package com.x10sendev.test;

import javax.sound.midi.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {
  public static void main(String[] args) {
    Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    try {
      Synthesizer synthesizer = MidiSystem.getSynthesizer();
      synthesizer.open();
      MidiChannel[] channels = synthesizer.getChannels();
      Soundbank bank = synthesizer.getDefaultSoundbank();
      synthesizer.loadAllInstruments(bank);
      Instrument[] instruments = synthesizer.getLoadedInstruments();

      Instrument instrument = null;
      String find = "1345";
//            String find = "Synth Bass 1";
      for (int i = 0; i < instruments.length; i++) {
        logger.log(Level.INFO, instruments[i].getName() + " " + i);
        if (instruments[i].getName().contains(find)) {
//                    System.out.println("-----------------");
//                    System.out.println("Found: " + find);
//                    System.out.println("-----------------");
          instrument = instruments[i];
          logger.log(Level.INFO, find + ": " + i);
          break;
        }
      }

      if (instrument == null) {
        logger.log(Level.SEVERE, "Can't find " + find);
        System.exit(0);
      }

      Patch patch = instrument.getPatch();
      channels[1].programChange(patch.getBank(), patch.getProgram());
      channels[2].programChange(patch.getBank(), patch.getProgram());
      channels[3].programChange(patch.getBank(), patch.getProgram());

      synthesizer.close();

    } catch (MidiUnavailableException e) {
      logger.log(Level.SEVERE, Arrays.toString(e.getStackTrace()));
    }
  }
}
