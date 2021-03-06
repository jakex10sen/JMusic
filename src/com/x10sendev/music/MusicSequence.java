package com.x10sendev.music;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class MusicSequence {

    /**
     * java.sound.midi.MidiTrack for the treble
     */
    private MidiTrack _treble;

    /**
     * java.sound.midi.MidiTrack for the base
     */
    private MidiTrack _bass;

    /**
     * java.sound.midi.Sequence that contains the
     */
    private Sequence _sequence;

    /**
     * Creates a MusicSequence with the given params
     *
     * @param divisionType the timing division type (PPQ or one of the SMPTE types)
     * @param resolution   the timing resolution
     * @param instrument   the instrument code
     * @throws InvalidMidiDataException
     */
    public MusicSequence(float divisionType, int resolution, int instrument) throws InvalidMidiDataException {
        _sequence = new Sequence(divisionType, resolution);
        _treble = new MidiTrack(_sequence.createTrack());
        _bass = new MidiTrack(_sequence.createTrack());

        // Turn on General MIDI sound set
        _treble.addSysexMessage(new byte[]{(byte) SysexMessage.SYSTEM_EXCLUSIVE, 0x7E, 0x7F, 0x09, 0x01, (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE});
        _bass.addSysexMessage(new byte[]{(byte) SysexMessage.SYSTEM_EXCLUSIVE, 0x7E, 0x7F, 0x09, 0x01, (byte) SysexMessage.SPECIAL_SYSTEM_EXCLUSIVE});

        // Set temp (meta event)
        _treble.addMetaMessage(0x51, new byte[]{0x02, (byte) 0x00, 0x00}, (long) 0);
        _bass.addMetaMessage(0x51, new byte[]{0x02, (byte) 0x00, 0x00}, (long) 0);

        //Set track name (meta event)
        _treble.setTrackName("treble");
        _bass.setTrackName("bass");

        //Set omni on
        _treble.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7D, 0x00, (long) 0);
        _bass.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7D, 0x00, (long) 0);

        //Set poly on
        _treble.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7E, 0, (long) 0);
        _bass.addShortMessage(ShortMessage.CONTROL_CHANGE, 0x7E, 0, (long) 0);

        //Set instrument
        _treble.setInstrument(instrument);
        _bass.setInstrument(instrument);
    }

    /**
     * Adds a chord to the treble MidiTrack
     *
     * @param chord the Chord to be added
     * @throws InvalidMidiDataException
     */
    public void addChordTreble(Chord chord) throws InvalidMidiDataException {
        _treble.addChord(chord);
    }

    /**
     * Adds a chord to the bass MidiTrack
     *
     * @param chord the Chord to be added
     * @throws InvalidMidiDataException
     */
    public void addChordBass(Chord chord) throws InvalidMidiDataException {
        _bass.addChord(chord);
    }

    /**
     * Adds a note to the treble MidiTrack
     *
     * @param duration duration of the note
     * @param note     the note to add
     * @throws InvalidMidiDataException
     */
    public void addNoteTreble(long duration, Note note) throws InvalidMidiDataException {
        _treble.addNote(duration, note);
    }

    /**
     * Adds a note to the bass MidiTrack
     *
     * @param duration duration of the note
     * @param note     the note to add
     * @throws InvalidMidiDataException
     */
    public void addNoteBass(long duration, Note note) throws InvalidMidiDataException {
        _bass.addNote(duration, note);
    }

    /**
     * Adds a rest to the treble MidiTrack
     *
     * @param duration duration of the rest
     */
    public void addRestTreble(long duration) {
        _treble.incTime(duration);
    }

    /**
     * Adds a rest to the bass MidiTrack
     *
     * @param duration duration of the rest
     */
    public void addRestBass(long duration) {
        _bass.incTime(duration);
    }

    /**
     * Changes the instrument of both the bass and treble MidiTrack
     *
     * @param instrument the code of the instrument to change to
     * @throws InvalidMidiDataException
     */
    public void changeInstrument(int instrument) throws InvalidMidiDataException {
        changeInstrumentTreble(instrument);
        changeInstrumentBass(instrument);
    }

    /**
     * Changes the instrument of the treble MidiTrack
     *
     * @param instrument the code of the instrument to change to
     * @throws InvalidMidiDataException
     */
    public void changeInstrumentTreble(int instrument) throws InvalidMidiDataException {
        _treble.setInstrument(instrument);
    }

    /**
     * Changes the instrument of the bass MidiTrack
     *
     * @param instrument the code of the instrument to change to
     * @throws InvalidMidiDataException
     */
    public void changeInstrumentBass(int instrument) throws InvalidMidiDataException {
        _bass.setInstrument(instrument);
    }

    /**
     * Ends the Sequence at the current timestamp
     *
     * @throws InvalidMidiDataException
     */
    public void endSequence() throws InvalidMidiDataException {
        _treble.setEndOfTrack();
        _bass.setEndOfTrack();
    }

    /**
     * Writes the sequence to the given filename
     *
     * @param filename the filename of were to write the sequence
     * @throws IOException
     */
    public void write(String filename) throws IOException {
        File file = new File(filename);
        MidiSystem.write(_sequence, 1, file);
    }

}
