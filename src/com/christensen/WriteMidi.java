package com.christensen;

import com.christensen.music.Note;

import javax.sound.midi.*;
import java.io.IOException;

public class WriteMidi {

    public static final int TICKS = 3;

    private static long trebleTime = 1;
    private static long bassTime = 1;

    private static Track treble;
    private static Track bass;

    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, IOException {
        Sequence s = new Sequence(Sequence.PPQ, TICKS);
        treble = s.createTrack();
        bass = s.createTrack();

        // Turn on General MIDI sound set
        byte[] b = {(byte) SysexMessage.SYSTEM_EXCLUSIVE, 0x7E, 0x7F, 0x09, 0x01, (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE};
        SysexMessage sm = new SysexMessage();
        sm.setMessage(b, 6);
        MidiEvent me = new MidiEvent(sm, (long) 0);
        treble.add(me);
        bass.add(me);

        // Set temp (meta event)
        MetaMessage mt = new MetaMessage();
        byte[] bt = {0x02, (byte)0x00, 0x00};
        mt.setMessage(0x51, bt, 3);
        me = new MidiEvent(mt, (long) 0);
        treble.add(me);
        bass.add(me);

        //Set track name (meta event)
        mt = new MetaMessage();
        String TrackName = "midifile track";
        mt.setMessage(0x03, TrackName.getBytes(), TrackName.length());
        me = new MidiEvent(mt, (long) 0);
        treble.add(me);
        bass.add(me);

        //Set omni on
        ShortMessage mm = new ShortMessage();
        mm.setMessage(ShortMessage.CONTROL_CHANGE, 0x7D, 0x00);
        me = new MidiEvent(mm, (long) 0);
        treble.add(me);
        bass.add(me);

        //Set poly on
        mm = new ShortMessage();
        mm.setMessage(ShortMessage.CONTROL_CHANGE, 0x7F, 0x00);
        me = new MidiEvent(mm, (long) 0);
        treble.add(me);
        bass.add(me);

        //Set instrument
        mm = new ShortMessage();
        mm.setMessage(ShortMessage.PROGRAM_CHANGE, 5, 0);
        me = new MidiEvent(mm, (long) 0);
        treble.add(me);
        bass.add(me);


        //1-------------------------------------------------------------------------------------------------------------
        addNoteTreble(Note.F4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.D4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.D4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.F4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.D4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.D4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        //2-------------------------------------------------------------------------------------------------------------
        addNoteTreble(Note.F4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.F4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        //3-------------------------------------------------------------------------------------------------------------
        addNoteTreble(Note.E4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.CS4, Note.EIGHTH);                                               incBassTime(Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.E4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.CS4, Note.EIGHTH);                                               incBassTime(Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                                incBassTime(Note.EIGHTH);
        //4-------------------------------------------------------------------------------------------------------------
        addNoteTreble(Note.CS4, Note.EIGHTH);                                       addNoteBass(Note.A2, Note.EIGHTH);
        addNoteTreble(Note.A3, Note.EIGHTH);                                        addNoteBass(Note.A1, Note.EIGHTH);
        addNoteTreble(Note.E4, Note.EIGHTH);                                        addNoteBass(Note.A1, Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                        addNoteBass(Note.A2, Note.EIGHTH);
        addNoteTreble(Note.E4, Note.EIGHTH);                                        addNoteBass(Note.A1, Note.EIGHTH);
        addNoteTreble(Note.C4, Note.EIGHTH);                                        addNoteBass(Note.A2, Note.EIGHTH);
        addNoteTreble(Note.E4, Note.SIXTEENTH);                                     addNoteBass(Note.A1, Note.EIGHTH);
        addNoteTreble(Note.C4, Note.SIXTEENTH);
        addNoteTreble(Note.E4, Note.SIXTEENTH);                                     addNoteBass(Note.A2, Note.EIGHTH);
        addNoteTreble(Note.C4, Note.SIXTEENTH);
        //5-------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.A3, Note.D4}, Note.THREE_QUARTER);           addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.E4}, Note.QUARTER);        addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        //6-------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.WHOLE);          addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        //7-------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.A3, Note.F4, Note.A4}, Note.THREE_EIGHTH);   addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.F3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.F4, Note.G4}, Note.THREE_EIGHTH);   addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.A4}, Note.QUARTER);                 addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        //8-------------------------------------------------------------------------------------------------------------
        addNoteTreble(Note.C4, Note.WHOLE);                                         addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
                                                            addChordBass(new Note[]{Note.F2, Note.F3}, Note.QUARTER);
                                                            addChordBass(new Note[]{Note.E2, Note.E2}, Note.QUARTER);
        //9-------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.B3, Note.D4}, Note.THREE_QUARTER);           addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.E4}, Note.QUARTER);        addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        //10------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.F4},Note.HALF);            addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.E4}, Note.HALF);           addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        //11------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.C4, Note.E4, Note.G4}, Note.HALF);           addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.A4}, Note.HALF);                    addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        //12------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.CS4, Note.G4}, Note.HALF);                   addNoteBass(Note.A1, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4}, Note.HALF);                    addNoteBass(Note.A1, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
        //13------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER);        addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER);        addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER);        addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        //14------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.D4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.D4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.D4, Note.G4}, Note.QUARTER); addChordBass(new Note[]{Note.D2, Note.D3}, Note.QUARTER);
        addChordTreble(new Note[]{Note.D4, Note.F4}, Note.QUARTER); addChordBass(new Note[]{Note.D2, Note.D3}, Note.QUARTER);
        //15------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER);        addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER);        addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER);        addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        //16------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.C4, Note.F4, Note.G4}, Note.QUARTER);        addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4, Note.A4}, Note.QUARTER);        addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4, Note.G4}, Note.QUARTER); addChordBass(new Note[]{Note.F2, Note.F3}, Note.QUARTER);
        addChordTreble(new Note[]{Note.C4, Note.F4}, Note.QUARTER);          addChordBass(new Note[]{Note.F2, Note.F3}, Note.QUARTER);
        //17------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4,Note.F4}, Note.QUARTER);         addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4,Note.F4}, Note.QUARTER);         addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4,Note.F4}, Note.QUARTER);         addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        //18------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.A4}, Note.QUARTER);        addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.A4}, Note.QUARTER);        addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.G4}, Note.QUARTER); addChordBass(new Note[]{Note.B1, Note.B2}, Note.QUARTER);
        addChordTreble(new Note[]{Note.B3, Note.D4, Note.F4}, Note.QUARTER); addChordBass(new Note[]{Note.B1, Note.B2}, Note.QUARTER);
        //19------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        //20------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.A1, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.QUARTER);       addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.QUARTER);       addNoteBass(Note.A1, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.QUARTER);       addNoteBass(Note.A2, Note.EIGHTH);
                                                                                    addNoteBass(Note.E2, Note.EIGHTH);
        //21------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER);        addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER);        addNoteBass(Note.D2, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A3, Note.D4, Note.F4}, Note.QUARTER);        addNoteBass(Note.D3, Note.EIGHTH);
                                                                                    addNoteBass(Note.A2, Note.EIGHTH);
        //22------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.C4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.A4}, Note.QUARTER);                 addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.G4}, Note.QUARTER);                 addNoteBass(Note.F2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        addChordTreble(new Note[]{Note.C4, Note.F4}, Note.QUARTER);                 addNoteBass(Note.F3, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
        //23------------------------------------------------------------------------------------------------------------
        incTrebleTime(Note.QUARTER);                                                addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.D4, Note.F4, Note.B4}, Note.QUARTER);        addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.D4, Note.F4, Note.B4}, Note.QUARTER);        addNoteBass(Note.B1, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.D4, Note.F4, Note.B4}, Note.QUARTER);        addNoteBass(Note.B2, Note.EIGHTH);
                                                                                    addNoteBass(Note.F2, Note.EIGHTH);
        //24------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.C4, Note.E4,Note.G4}, Note.HALF);            addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.E4, Note.G4,Note.C5}, Note.HALF);            addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        //25------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.CS4, Note.E4, Note.A4}, Note.HALF);          addNoteBass(Note.C2, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
                                                                                    addNoteBass(Note.C3, Note.EIGHTH);
                                                                                    addNoteBass(Note.G2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.E4, Note.A4, Note.CS5}, Note.HALF);  addChordBass(new Note[]{Note.C2, Note.C3}, Note.QUARTER);
                                                                            addChordBass(new Note[]{Note.C2,Note.C3}, Note.QUARTER);
        //26------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.A4, Note.F5}, Note.EIGHTH);                  addNoteBass(Note.D2, Note.EIGHTH);
        addNoteTreble(Note.D5, Note.EIGHTH);                                        addNoteBass(Note.A2, Note.EIGHTH);
        addChordTreble(new Note[]{Note.A4, Note.F5}, Note.EIGHTH);                  addNoteBass(Note.D3, Note.EIGHTH);
        addNoteTreble(Note.A5, Note.EIGHTH);                                        addNoteBass(Note.A2, Note.EIGHTH);
        addNoteTreble(Note.E5, Note.EIGHTH);                                        addNoteBass(Note.D2, Note.EIGHTH);
        addNoteTreble(Note.CS5, Note.EIGHTH);                                       addNoteBass(Note.A2, Note.EIGHTH);
        addNoteTreble(Note.A5, Note.EIGHTH);                                        addNoteBass(Note.D3, Note.EIGHTH);
        addNoteTreble(Note.CS6, Note.EIGHTH);                                       addNoteBass(Note.A2, Note.EIGHTH);
        //27------------------------------------------------------------------------------------------------------------
        addChordTreble(new Note[]{Note.A5, Note.D6}, Note.HALF); addChordBass(new Note[]{Note.B1, Note.D3}, Note.HALF);
        addChordTreble(new Note[]{Note.D4, Note.F4, Note.D5}, Note.HALF); addChordBass(new Note[]{Note.D1, Note.D2}, Note.HALF);

        //set end of track (meta event)
        mt = new MetaMessage();
        byte[] bet = {};
        mt.setMessage(0x2F, bet, 0);
        incTrebleTime(Note.WHOLE);
        me = new MidiEvent(mm, trebleTime);
        treble.add(me);
        bass.add(me);

        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        sequencer.setSequence(s);
        sequencer.start();


    }

    public static void addChordTreble(Note[] notes, long duration) throws InvalidMidiDataException {
        ShortMessage shortMessage;
        MidiEvent midiEvent;
        long time = trebleTime;
        incTrebleTime(duration);
        for(Note note : notes) {
            shortMessage = new ShortMessage(ShortMessage.NOTE_ON, note.code(), 127);
            midiEvent = new MidiEvent(shortMessage, time);
            treble.add(midiEvent);
            shortMessage = new ShortMessage(ShortMessage.NOTE_OFF, note.code(), 0);
            midiEvent = new MidiEvent(shortMessage, trebleTime);
            treble.add(midiEvent);
        }
    }

    public static void addChordBass(Note[] notes, long duration) throws InvalidMidiDataException {
        ShortMessage shortMessage;
        MidiEvent midiEvent;
        long time = bassTime;
        incBassTime(duration);
        for(Note note : notes) {
            shortMessage = new ShortMessage(ShortMessage.NOTE_ON, note.code(), 127);
            midiEvent = new MidiEvent(shortMessage, time);
            bass.add(midiEvent);
            shortMessage = new ShortMessage(ShortMessage.NOTE_OFF, note.code(), 0);
            midiEvent = new MidiEvent(shortMessage, bassTime);
            bass.add(midiEvent);
        }
    }

    public static void addNoteTreble(Note note, long duration) throws InvalidMidiDataException {
        ShortMessage shortMessage;
        MidiEvent midiEvent;

        shortMessage = new ShortMessage(ShortMessage.NOTE_ON, note.code(), 127);
        midiEvent = new MidiEvent(shortMessage, trebleTime);
        treble.add(midiEvent);

        incTrebleTime(duration);
        shortMessage = new ShortMessage(ShortMessage.NOTE_OFF, note.code(), 0);
        midiEvent = new MidiEvent(shortMessage, trebleTime);
        treble.add(midiEvent);
    }

    public static void addNoteBass(Note note, long duration) throws InvalidMidiDataException {
        ShortMessage shortMessage;
        MidiEvent midiEvent;

        shortMessage = new ShortMessage(ShortMessage.NOTE_ON, note.code(), 127);
        midiEvent = new MidiEvent(shortMessage, bassTime);
        bass.add(midiEvent);

        incBassTime(duration);
        shortMessage = new ShortMessage(ShortMessage.NOTE_OFF, note.code(), 0);
        midiEvent = new MidiEvent(shortMessage, bassTime);
        bass.add(midiEvent);
    }

    public static void incTrebleTime(long length){
        trebleTime += length;
    }

    public static void incBassTime(long length){
        bassTime += length;
    }
}
