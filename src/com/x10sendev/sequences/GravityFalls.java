package com.x10sendev.sequences;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MidiTrack;
import com.x10sendev.music.Note;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class GravityFalls {

    public static final int TICKS = 3;


    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, IOException {
        Sequence sequence = new Sequence(Sequence.PPQ, TICKS);
        MidiTrack treble = new MidiTrack(sequence.createTrack());
        MidiTrack bass = new MidiTrack(sequence.createTrack());

        // Turn on General MIDI sound set
        treble.addSysexMessage(new byte[]{(byte) SysexMessage.SYSTEM_EXCLUSIVE, 0x7E, 0x7F, 0x09, 0x01, (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE});
        bass.addSysexMessage(new byte[]{(byte) SysexMessage.SYSTEM_EXCLUSIVE, 0x7E, 0x7F, 0x09, 0x01, (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE});

        // Set temp (meta event)
        treble.addMetaMessage(0x51, new byte[]{0x02, (byte) 0x00, 0x00}, (long) 0);
        bass.addMetaMessage(0x51, new byte[]{0x02, (byte) 0x00, 0x00}, (long) 0);

        //Set track name (meta event)
        treble.setTrackName("treble");
        bass.setTrackName("bass");

        //Set omni on
        treble.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7D, 0x00, (long) 0);
        bass.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7D, 0x00, (long) 0);

        //Set poly on
        treble.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7E, 0, (long) 0);
        bass.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7E, 0, (long) 0);

        //Set instrument
        treble.setInstrument(5);
        bass.setInstrument(5);


        //1-------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.WHOLE + Note.WHOLE);
        bass.incTime(Note.WHOLE + Note.WHOLE);
        treble.addNote(Note.EIGHTH, Note.F4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.D4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.D4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.F4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.D4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.D4);
        bass.incTime(Note.EIGHTH);
        //2-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.EIGHTH, Note.F4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.F4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.incTime(Note.EIGHTH);
        //3-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.EIGHTH, Note.E4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.CS4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.E4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.CS4);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.incTime(Note.EIGHTH);
        //4-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.EIGHTH, Note.CS4);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addNote(Note.EIGHTH, Note.A3);
        bass.addNote(Note.EIGHTH, Note.A1);
        treble.addNote(Note.EIGHTH, Note.E4);
        bass.addNote(Note.EIGHTH, Note.A1);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addNote(Note.EIGHTH, Note.E4);
        bass.addNote(Note.EIGHTH, Note.A1);
        treble.addNote(Note.EIGHTH, Note.C4);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addNote(Note.SIXTEENTH, Note.E4);
        bass.addNote(Note.EIGHTH, Note.A1);
        treble.addNote(Note.SIXTEENTH, Note.C4);
        treble.addNote(Note.SIXTEENTH, Note.E4);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addNote(Note.SIXTEENTH, Note.C4);
        //5-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.THREE_QUARTER, Note.A3, Note.D4));
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.E4));
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        //6-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.WHOLE, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        //7-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.THREE_EIGHTH, Note.A3, Note.F4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.F3);
        treble.addChord(new Chord(Note.THREE_EIGHTH, Note.A3, Note.F4, Note.G4));
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        //8-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.WHOLE, Note.C4);
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addChord(new Chord(Note.QUARTER, Note.F2, Note.F3));
        bass.addChord(new Chord(Note.QUARTER, Note.E2, Note.E2));
        //9-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.THREE_QUARTER, Note.B3, Note.D4));
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.E4));
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        //10------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.B3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.HALF, Note.B3, Note.D4, Note.E4));
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        //11------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.C4, Note.E4, Note.G4));
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.G2);
        treble.addChord(new Chord(Note.HALF, Note.C4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.G2);
        //12------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.CS4, Note.G4));
        bass.addNote(Note.EIGHTH, Note.A1);
        bass.addNote(Note.EIGHTH, Note.E2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.E2);
        treble.addChord(new Chord(Note.HALF, Note.C4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.A1);
        bass.addNote(Note.EIGHTH, Note.E2);
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.E2);
        //13------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        //14------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.G4));
        bass.addChord(new Chord(Note.QUARTER, Note.D2, Note.D3));
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.F4));
        bass.addChord(new Chord(Note.QUARTER, Note.D2, Note.D3));
        //15------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        //16------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.G4));
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.G4));
        bass.addChord(new Chord(Note.QUARTER, Note.F2, Note.F3));
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4));
        bass.addChord(new Chord(Note.QUARTER, Note.F2, Note.F3));
        //17------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        //18------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.G4));
        bass.addChord(new Chord(Note.QUARTER, Note.B1, Note.B2));
        treble.addChord(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        bass.addChord(new Chord(Note.QUARTER, Note.B1, Note.B2));
        //19------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.G2);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.G2);
        //20------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.A1);
        bass.addNote(Note.EIGHTH, Note.E2);
        treble.addChord(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.E2);
        treble.addChord(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
        bass.addNote(Note.EIGHTH, Note.A1);
        bass.addNote(Note.EIGHTH, Note.E2);
        treble.addChord(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
        bass.addNote(Note.EIGHTH, Note.A2);
        bass.addNote(Note.EIGHTH, Note.E2);
        //21------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D2);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.D3);
        bass.addNote(Note.EIGHTH, Note.A2);
        //22------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.G4));
        bass.addNote(Note.EIGHTH, Note.F2);
        bass.addNote(Note.EIGHTH, Note.C3);
        treble.addChord(new Chord(Note.QUARTER, Note.C4, Note.F4));
        bass.addNote(Note.EIGHTH, Note.F3);
        bass.addNote(Note.EIGHTH, Note.C3);
        //23------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
        bass.addNote(Note.EIGHTH, Note.B1);
        bass.addNote(Note.EIGHTH, Note.F2);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
        bass.addNote(Note.EIGHTH, Note.B2);
        bass.addNote(Note.EIGHTH, Note.F2);
        //24------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.C4, Note.E4, Note.G4));
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.G2);
        treble.addChord(new Chord(Note.HALF, Note.E4, Note.G4, Note.C5));
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.G2);
        //25------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.CS4, Note.E4, Note.A4));
        bass.addNote(Note.EIGHTH, Note.C2);
        bass.addNote(Note.EIGHTH, Note.G2);
        bass.addNote(Note.EIGHTH, Note.C3);
        bass.addNote(Note.EIGHTH, Note.G2);
        treble.addChord(new Chord(Note.HALF, Note.E4, Note.A4, Note.CS5));
        bass.addChord(new Chord(Note.QUARTER, Note.C2, Note.C3));
        bass.addChord(new Chord(Note.QUARTER, Note.C2, Note.C3));
        //26------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.A4, Note.F5));
        bass.addNote(Note.EIGHTH, Note.D2);
        treble.addNote(Note.EIGHTH, Note.D5);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addChord(new Chord(Note.EIGHTH, Note.A4, Note.F5));
        bass.addNote(Note.EIGHTH, Note.D3);
        treble.addNote(Note.EIGHTH, Note.A5);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addNote(Note.EIGHTH, Note.E5);
        bass.addNote(Note.EIGHTH, Note.D2);
        treble.addNote(Note.EIGHTH, Note.CS5);
        bass.addNote(Note.EIGHTH, Note.A2);
        treble.addNote(Note.EIGHTH, Note.A5);
        bass.addNote(Note.EIGHTH, Note.D3);
        treble.addNote(Note.EIGHTH, Note.CS6);
        bass.addNote(Note.EIGHTH, Note.A2);
        //27------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.A5, Note.D6));
        bass.addChord(new Chord(Note.HALF, Note.B1, Note.D3));
        treble.addChord(new Chord(Note.HALF, Note.D4, Note.F4, Note.D5));
        bass.addChord(new Chord(Note.HALF, Note.D1, Note.D2));

        //set end of track (meta event)
        treble.setEndOfTrack();
        bass.setEndOfTrack();

        File file = new File("Gravity_Falls.mid");
        MidiSystem.write(sequence, 1, file);

        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        sequencer.setSequence(MidiSystem.getSequence(file));
        sequencer.start();
    }
}
