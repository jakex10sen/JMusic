package com.x10sendev.sequences;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MidiTrack;
import com.x10sendev.music.Note;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class PokemonIntro {

    private static final int TICKS = 3;

    public static void main(String[] args) throws InvalidMidiDataException {
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

        treble.incTime(Note.WHOLE + Note.WHOLE);
        bass.incTime(Note.WHOLE + Note.WHOLE);
        //1-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        bass.addNote(Note.QUARTER, Note.GS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.A4));
        bass.addNote(Note.QUARTER, Note.GS3);
        //2-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        bass.addNote(Note.QUARTER, Note.GS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.A3, Note.C4));
        bass.addNote(Note.QUARTER, Note.F3);
        //3-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        bass.addNote(Note.QUARTER, Note.GS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.FS4, Note.C5));
        bass.addNote(Note.QUARTER, Note.A3);
        //4-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.GS4, Note.CS5));
        bass.addNote(Note.HALF, Note.GS3);
        treble.addChord(new Chord(Note.HALF, Note.GS3, Note.CS4));
        bass.addNote(Note.HALF, Note.CS3);
        //5-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.HALF, Note.E4, Note.B4));
        bass.addNote(Note.HALF, Note.A3);
        treble.addChord(new Chord(Note.HALF, Note.E3, Note.B3));
        bass.addNote(Note.HALF, Note.CS3);
        //6-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        bass.addNote(Note.QUARTER, Note.GS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.D4, Note.A4));
        bass.addNote(Note.QUARTER, Note.GS3);
        //7-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.E4, Note.A4));
        bass.addNote(Note.QUARTER, Note.A3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.addChord(new Chord(Note.QUARTER, Note.FS4, Note.C5));
        bass.addNote(Note.QUARTER, Note.GS3);
        //8-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.WHOLE, Note.F4, Note.CS5));
        bass.addNote(Note.WHOLE, Note.GS3);
        //9-------------------------------------------------------------------------------------------------------------
        treble.addChord(new Chord(Note.EIGHTH, Note.CS5, Note.CS6));
        bass.addNote(Note.EIGHTH, Note.CS3);
        treble.incTime(Note.EIGHTH + Note.THREE_QUARTER);
        bass.incTime(Note.EIGHTH + Note.THREE_QUARTER);
        //--------------------------------------------------------------------------------------------------------------
        treble.setEndOfTrack();
        bass.setEndOfTrack();

        try {
            File file = new File("Pokemon_Intro.mid");
            MidiSystem.write(sequence, 1, file);
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(MidiSystem.getSequence(file));
            sequencer.start();
            sequence.getMicrosecondLength();
            while (sequencer.getTickLength() > sequencer.getTickPosition()) {

            }
            sequencer.stop();
            sequencer.close();
            System.exit(0);

        } catch (IOException | MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
