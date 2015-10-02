package com.x10sendev.music;

import javax.sound.midi.MidiChannel;


public class Chord {
    private Note[] _notes;
    private long _length;

    public Chord(Note[] note, long length){
        _notes = note;
        _length = length;
    }

    public Note[] getNotes(){
        return _notes;
    }
    public long getLength() {
        return _length;
    }

    @Deprecated
    public void playNote(MidiChannel channel) throws InterruptedException {
        for(Note note : _notes){
            if(note != null) {
                channel.noteOn(note.code(), 127);
            }
        }
        Thread.sleep(_length);
        for(Note note : _notes){
            if(note != null){
                channel.noteOff(note.code());
            }
        }
    }


}
