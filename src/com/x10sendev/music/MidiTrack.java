package com.x10sendev.music;

import javax.sound.midi.*;

public class MidiTrack {
    private Track _track;
    private long _time;

    public MidiTrack(Track track){
        _track = track;
        _time = 0;
    }

    public void addSysexMessage(byte[] bytes) throws InvalidMidiDataException {
        SysexMessage sysexMessage = new SysexMessage();
        sysexMessage.setMessage(bytes, bytes.length);
        MidiEvent midiEvent = new MidiEvent(sysexMessage, (long) 0);
        _track.add(midiEvent);
    }

    public void addMetaMessage(int command, byte[] bytes, long time) throws InvalidMidiDataException {
        MetaMessage metaMessage = new MetaMessage(command, bytes, bytes.length);
        MidiEvent midiEvent = new MidiEvent(metaMessage, time);
        _track.add(midiEvent);
    }

    public void addShortMessage(int command, int data1, int data2, long time) throws InvalidMidiDataException {
        ShortMessage shortMessage = new ShortMessage(command, data1, data2);
        MidiEvent midiEvent = new MidiEvent(shortMessage, time);
        _track.add(midiEvent);
    }

    //Set track name (meta event)
    public void setTrackName(String trackName) throws InvalidMidiDataException {
        addMetaMessage(0x03, trackName.getBytes(), (long) 0);
    }

    //Set instrument
    public void setInstrument(int instrument) throws InvalidMidiDataException {
        addShortMessage(ShortMessage.PROGRAM_CHANGE, instrument, 0, (long) 0);
    }
    public void setEndOfTrack() throws InvalidMidiDataException {
        incTime(Note.WHOLE);
        addMetaMessage(0x2F, new byte[0], _time);
    }

    public void addChord(Chord chord) throws InvalidMidiDataException {
        long time = _time;
        incTime(chord.getLength());
        for(Note note : chord.getNotes()) {
            addShortMessage(ShortMessage.NOTE_ON, note.code(), 127, time);
            addShortMessage(ShortMessage.NOTE_OFF, note.code(), 0, _time);
        }
    }
    public void addNote(Note note, long duration) throws InvalidMidiDataException {
        addShortMessage(ShortMessage.NOTE_ON, note.code(), 127, _time);
        incTime(duration);
        addShortMessage(ShortMessage.NOTE_OFF, note.code(), 127, _time);
    }
    public void incTime(long length){
        _time += length;
    }
}
