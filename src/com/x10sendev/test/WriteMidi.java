package com.x10sendev.test;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MidiTrack;
import com.x10sendev.music.Note;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class WriteMidi {

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
        treble.incTime(Note.WHOLE+Note.WHOLE);
        bass.incTime(Note.WHOLE+Note.WHOLE);
        treble.addNote(Note.F4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.D4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.D4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.F4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.D4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.D4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        //2-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.F4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.F4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        //3-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.E4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.CS4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.E4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.CS4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.incTime(Note.EIGHTH);
        //4-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.CS4, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addNote(Note.A3, Note.EIGHTH);
        bass.addNote(Note.A1, Note.EIGHTH);
        treble.addNote(Note.E4, Note.EIGHTH);
        bass.addNote(Note.A1, Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addNote(Note.E4, Note.EIGHTH);
        bass.addNote(Note.A1, Note.EIGHTH);
        treble.addNote(Note.C4, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addNote(Note.E4, Note.SIXTEENTH);
        bass.addNote(Note.A1, Note.EIGHTH);
        treble.addNote(Note.C4, Note.SIXTEENTH);
        treble.addNote(Note.E4, Note.SIXTEENTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addNote(Note.C4, Note.SIXTEENTH);
        //5-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4}, Note.THREE_QUARTER));
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.E4}, Note.QUARTER));
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        //6-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.WHOLE));
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        //7-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.A3, Note.F4, Note.A4}, Note.THREE_EIGHTH));
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.F3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.F4, Note.G4}, Note.THREE_EIGHTH));
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        //8-------------------------------------------------------------------------------------------------------------
        treble.addNote(Note.C4, Note.WHOLE);
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addChord(new Chord(new Note[]{Note.F2, Note.F3}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.E2, Note.E2}, Note.QUARTER));
        //9-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4}, Note.THREE_QUARTER));
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.E4}, Note.QUARTER));
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        //10------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, Note.HALF));
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.E4}, Note.HALF));
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        //11------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.C4, Note.E4, Note.G4}, Note.HALF));
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.A4}, Note.HALF));
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        //12------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.CS4, Note.G4}, Note.HALF));
        bass.addNote(Note.A1, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4}, Note.HALF));
        bass.addNote(Note.A1, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        //13------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        //14------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.D4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.D4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.D4, Note.G4}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.D2, Note.D3}, Note.QUARTER));
        treble.addChord(new Chord(new Note[]{Note.D4, Note.F4}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.D2, Note.D3}, Note.QUARTER));
        //15------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        //16------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4, Note.G4}, Note.QUARTER));
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4, Note.G4}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.F2, Note.F3}, Note.QUARTER));
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.F2, Note.F3}, Note.QUARTER));
        //17------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        //18------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.G4}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.B1, Note.B2}, Note.QUARTER));
        treble.addChord(new Chord(new Note[]{Note.B3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.B1, Note.B2}, Note.QUARTER));
        //19------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        //20------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.A1, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.QUARTER));
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.QUARTER));
        bass.addNote(Note.A1, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.QUARTER));
        bass.addNote(Note.A2, Note.EIGHTH);
        bass.addNote(Note.E2, Note.EIGHTH);
        //21------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.D2, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.D3, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        //22------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.C4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.A4}, Note.QUARTER));
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.G4}, Note.QUARTER));
        bass.addNote(Note.F2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.C4, Note.F4}, Note.QUARTER));
        bass.addNote(Note.F3, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        //23------------------------------------------------------------------------------------------------------------
        treble.incTime(Note.QUARTER);
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.D4, Note.F4, Note.B4}, Note.QUARTER));
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.D4, Note.F4, Note.B4}, Note.QUARTER));
        bass.addNote(Note.B1, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.D4, Note.F4, Note.B4}, Note.QUARTER));
        bass.addNote(Note.B2, Note.EIGHTH);
        bass.addNote(Note.F2, Note.EIGHTH);
        //24------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.C4, Note.E4, Note.G4}, Note.HALF));
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.E4, Note.G4, Note.C5}, Note.HALF));
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        //25------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.CS4, Note.E4, Note.A4}, Note.HALF));
        bass.addNote(Note.C2, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        bass.addNote(Note.C3, Note.EIGHTH);
        bass.addNote(Note.G2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.HALF));
        bass.addChord(new Chord(new Note[]{Note.C2, Note.C3}, Note.QUARTER));
        bass.addChord(new Chord(new Note[]{Note.C2, Note.C3}, Note.QUARTER));
        //26------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.A4, Note.F5}, Note.EIGHTH));
        bass.addNote(Note.D2, Note.EIGHTH);
        treble.addNote(Note.D5, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addChord(new Chord(new Note[]{Note.A4, Note.F5}, Note.EIGHTH));
        bass.addNote(Note.D3, Note.EIGHTH);
        treble.addNote(Note.A5, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addNote(Note.E5, Note.EIGHTH);
        bass.addNote(Note.D2, Note.EIGHTH);
        treble.addNote(Note.CS5, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        treble.addNote(Note.A5, Note.EIGHTH);
        bass.addNote(Note.D3, Note.EIGHTH);
        treble.addNote(Note.CS6, Note.EIGHTH);
        bass.addNote(Note.A2, Note.EIGHTH);
        //27------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(new Note[]{Note.A5, Note.D6}, Note.HALF));
        bass.addChord(new Chord(new Note[]{Note.B1, Note.D3}, Note.HALF));
        treble.addChord(new Chord(new Note[]{Note.D4, Note.F4, Note.D5}, Note.HALF));
        bass.addChord(new Chord(new Note[]{Note.D1, Note.D2}, Note.HALF));

        //set end of track (meta event)
        treble.setEndOfTrack();
        bass.setEndOfTrack();

        File file = new File("Gravity_falls.mid");
        MidiSystem.write(sequence, 1, file);

        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        sequencer.setSequence(MidiSystem.getSequence(file));
        sequencer.start();
    }
}
