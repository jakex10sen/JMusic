package com.x10sendev.music;

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

}
