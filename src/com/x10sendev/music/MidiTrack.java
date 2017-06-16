package com.x10sendev.music;

import javax.sound.midi.*;

public class MidiTrack {

    /**
     * The track that is being used
     */
    private Track _track;

    /**
     * The curent timestamp
     */
    private long _time;

    /**
     * Constructs a MidiTrack from the given Track
     *
     * @param track track to seed the MidiTrack
     */
    public MidiTrack(Track track){
        _track = track;
        _time = 0;
    }

    /**
     * Adds a SysexMessage to the start of the MidiTrack
     *
     * @param bytes message to be added
     */
    public void addSysexMessage(byte[] bytes) {
        SysexMessage sysexMessage = new SysexMessage();
        try {
            sysexMessage.setMessage(bytes, bytes.length);
            MidiEvent midiEvent = new MidiEvent(sysexMessage, (long) 0);
            _track.add(midiEvent);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a MetaMessage to the track at the given location
     * @param command the command to add to the track
     * @param bytes the message to add
     * @param time the place to add the messsage
     */
    public void addMetaMessage(int command, byte[] bytes, long time) {
        try {
            MetaMessage metaMessage = new MetaMessage(command, bytes, bytes.length);
            MidiEvent midiEvent = new MidiEvent(metaMessage, time);
            _track.add(midiEvent);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a ShortMessage to the track at the given location
     * @param command the command to add to the track
     * @param data1 the first bit of data to add
     * @param data2 the second bit of data to add
     * @param time the place to add the message
     */
    public void addShortMessage(int command, int data1, int data2, long time) {
        try {
            ShortMessage shortMessage = new ShortMessage(command, data1, data2);
            MidiEvent midiEvent = new MidiEvent(shortMessage, time);
            _track.add(midiEvent);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the name of the MidiTrack
     * @param trackName the name to give the MidiTrack
     */
    public void setTrackName(String trackName){
        addMetaMessage(0x03, trackName.getBytes(), (long) 0);
    }

    /**
     * Sets the Instrument of the MidiTrack
     * @param instrument the instrument to change to
     */
    public void setInstrument(int instrument) {
        addShortMessage(ShortMessage.PROGRAM_CHANGE, instrument, 0, (long) 0);
    }

    /**
     * Ends the MidiTrack at the current timestamp
     */
    public void setEndOfTrack() {
        incTime(Note.WHOLE);
        addMetaMessage(0x2F, new byte[0], _time);
    }

    /**
     * Adds a Chord to the MidiTrack
     * @param chord the Chord to add the MidiTrack
     */
    public void addChord(Chord chord) {
        long time = _time;
        incTime(chord.getLength());
        for(Note note : chord.getNotes()) {
            addShortMessage(ShortMessage.NOTE_ON, note.code(), 127, time);
            addShortMessage(ShortMessage.NOTE_OFF, note.code(), 0, _time);
        }
    }

    /**
     * Adds a Note to the MidiTrack
     *
     * @param duration the duration of the Note
     * @param note     the Note to add
     */
    public void addNote(long duration, Note note) {
        addShortMessage(ShortMessage.NOTE_ON, note.code(), 127, _time);
        incTime(duration);
        addShortMessage(ShortMessage.NOTE_OFF, note.code(), 127, _time);
    }

    /**
     * Increases the current time of the MidiTrack
     * @param length the length to increase the time by
     */
    public void incTime(long length){
        _time += length;
    }
}
