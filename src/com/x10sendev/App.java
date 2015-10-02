package com.x10sendev;

import com.x10sendev.music.Chord;
import com.x10sendev.music.Note;

import javax.sound.midi.*;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws InterruptedException {
        try {
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            MidiChannel channels[] = synthesizer.getChannels();
            Soundbank bank = synthesizer.getDefaultSoundbank();
            synthesizer.loadAllInstruments(bank);
            Instrument instruments[] = synthesizer.getLoadedInstruments();

            Instrument instrument = null;
            String find = "1345";
//            String find = "Synth Bass 1";
            for (int i = 0; i < instruments.length; i++) {
                System.out.println(instruments[i].getName() + " " + i);
                if (instruments[i].getName().contains(find)) {
//                    System.out.println("-----------------");
//                    System.out.println("Found: " + find);
//                    System.out.println("-----------------");
                    instrument = instruments[i];
                    System.out.println(find + ": " + i);
                    break;
                }
            }

            if(instrument == null){
                System.out.println("Can't find " + find);
                System.exit(0);
            }

            Patch patch = instrument.getPatch();
            channels[1].programChange(patch.getBank(), patch.getProgram());
            channels[2].programChange(patch.getBank(), patch.getProgram());
            channels[3].programChange(patch.getBank(), patch.getProgram());

            synthesizer.close();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
