package com.christensen;

import com.christensen.music.Chord;
import com.christensen.music.Note;

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

            Vector<Chord> chords = new Vector<>();

            // F65
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // D62
            chords.add(new Chord(new Note[]{Note.D4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.A3}, 200));
            // D62
            chords.add(new Chord(new Note[]{Note.D4}, 200));
            // F65
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // D62
            chords.add(new Chord(new Note[]{Note.D4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // D62
            chords.add(new Chord(new Note[]{Note.D4}, 200));
            // ---------------------------

            // F65
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // C60
            chords.add(new Chord(new Note[]{Note.C4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // C60
            chords.add(new Chord(new Note[]{Note.C4}, 200));
            // F65
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // C60
            chords.add(new Chord(new Note[]{Note.C4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.F4}, 200));
            // C60
            chords.add(new Chord(new Note[]{Note.C4}, 200));
            // ---------------------------

            // E64
            chords.add(new Chord(new Note[]{Note.E4}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.A3}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // E64
            chords.add(new Chord(new Note[]{Note.E4}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.A3}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // ---------------------------

            // E64
            chords.add(new Chord(new Note[]{Note.E4}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // A57
            chords.add(new Chord(new Note[]{Note.A3}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // E64
            chords.add(new Chord(new Note[]{Note.E4}, 200));
            // C#61
            chords.add(new Chord(new Note[]{Note.CS4}, 200));
            // E64
            chords.add(new Chord(new Note[]{Note.E4}, 100));
            // C#60
            chords.add(new Chord(new Note[]{Note.CS4}, 100));
            // E64
            chords.add(new Chord(new Note[]{Note.E4}, 100));
            // C#60
            chords.add(new Chord(new Note[]{Note.CS4}, 100));
            // ---------------------------

            //A57 D62
            chords.add(new Chord(new Note[]{Note.A3, Note.D4}, 1200));
            //A57 D62 E64
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.E4}, 400));
            // ---------------------------

            //A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 1600));
            // ---------------------------

            //C60 F65 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, 600));
            // C60 F65 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.G4}, 600));
            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 400));
            // ---------------------------

            // C60
            chords.add(new Chord(new Note[]{Note.C4}, 1600));
            // ---------------------------

            // B59 D62
            chords.add(new Chord(new Note[]{Note.B3, Note.D4}, 1200));
            // B59 D62 E64
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.E4}, 400));
            // ---------------------------

            // B59 D62 F65
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, 800));
            //B59 D62 E64
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.E4}, 800));
            // ---------------------------

            // C60 E64 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.E4, Note.G4}, 800));
            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 800));
            // ----------------------------

            // C#61 G67
            chords.add(new Chord(new Note[]{Note.CS4, Note.G4}, 800));
            // C60 F65
            chords.add(new Chord(new Note[]{Note.C4, Note.F4}, 800));
            // ----------------------------

            // fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 400));
            // A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 400));
            // A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 400));
            // ----------------------------

            // D62 A69
            chords.add(new Chord(new Note[]{Note.D4, Note.A4}, 400));
            // D62 A69
            chords.add(new Chord(new Note[]{Note.D4, Note.A4}, 400));
            // D62 G67
            chords.add(new Chord(new Note[]{Note.D4, Note.G4}, 400));
            // D62 F65
            chords.add(new Chord(new Note[]{Note.D4, Note.F4}, 400));
            // ----------------------------

            // fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // C60 F65 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, 400));
            // C60 F65 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, 400));
            // C60 F65 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.D4, Note.A4}, 400));
            // ----------------------------

            // C60 F65 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.G4},400));
            // C60 F65 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.A4},400));
            // C60 F65 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.F4, Note.G4},400));
            // C60 F65
            chords.add(new Chord(new Note[]{Note.C4, Note.F4},400));
            // ----------------------------

            //fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // B59 D62 F65
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, 400));
            // B59 D62 F65
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, 400));
            // B59 D62 F65
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, 400));
            // ----------------------------

            // B59 D62 A69
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.A4}, 400));
            // B59 D62 A69
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.A4}, 400));
            // B59 D62 G67
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.G4}, 400));
            // B59 D62 F65
            chords.add(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, 400));
            // ----------------------------

            // fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 400));
            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 400));
            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 400));
            // ----------------------------

            // fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // E64 A69 C#73
            chords.add(new Chord(new Note[]{Note.E4, Note.A4, Note.CS5}, 400));
            // E64 A69 C72
            chords.add(new Chord(new Note[]{Note.E4, Note.A4, Note.C5}, 400));
            // E64 A69 C72
            chords.add(new Chord(new Note[]{Note.E4, Note.A4, Note.C5}, 400));
            // ----------------------------

            // fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 400));
            // A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 400));
            // A57 D62 F65
            chords.add(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, 400));
            // ----------------------------

            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 400));
            // C60 A69
            chords.add(new Chord(new Note[]{Note.C4, Note.A4}, 400));
            // C60 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.G4}, 400));
            // C60 F65
            chords.add(new Chord(new Note[]{Note.C4, Note.F4}, 400));
            // ----------------------------

            // fourth rest
            chords.add(new Chord(new Note[]{null}, 400));
            // D62 F65 B71
            chords.add(new Chord(new Note[]{Note.D4, Note.F4, Note.B4},400));
            // D62 F65 B71
            chords.add(new Chord(new Note[]{Note.D4, Note.F4, Note.B4},400));
            // D62 F65 B71
            chords.add(new Chord(new Note[]{Note.D4, Note.F4, Note.B4},400));
            // ----------------------------

            // C60 E64 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.E4, Note.G4},800));
            // C60 E64 G67
            chords.add(new Chord(new Note[]{Note.C4, Note.E4, Note.G4},800));
            // -----------------------------

            // C#61 E64 A69
            chords.add(new Chord(new Note[]{Note.CS4, Note.E4, Note.A4},800));
            // E64 A69 C#73
            chords.add(new Chord(new Note[]{Note.E4, Note.A4, Note.CS5},800));
            // ---------------------------

            // A69 F77
            chords.add(new Chord(new Note[]{Note.A4, Note.F5}, 200));
            // D74
            chords.add(new Chord(new Note[]{Note.D5}, 200));
            // A69 F77
            chords.add(new Chord(new Note[]{Note.A4, Note.F5}, 200));
            // A81
            chords.add(new Chord(new Note[]{Note.A5}, 200));
            // E76
            chords.add(new Chord(new Note[]{Note.E5}, 200));
            // C#73
            chords.add(new Chord(new Note[]{Note.CS5}, 200));
            // A81
            chords.add(new Chord(new Note[]{Note.A5}, 200));
            // C#85
            chords.add(new Chord(new Note[]{Note.CS6}, 200));
            // ----------------------------

            // A81 D86
            chords.add(new Chord(new Note[]{Note.A5, Note.D5},800));
            // D62 F65 A69 D74
            chords.add(new Chord(new Note[]{Note.D4, Note.F4, Note.A4, Note.D5}, 800));
            // -----------------------------


            chords.forEach((note) -> {
                try {
                    note.playNote(channels[1]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

//            Thread.sleep(10000);

            synthesizer.close();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
