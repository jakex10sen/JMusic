package com.christensen.music;

import javax.sound.midi.MidiChannel;


public class Chord {
    private Note[] _note;
    private int _time;

    public Chord(Note[] note, int time){
        _note = note;
        _time = time;
    }
    public void playNote(MidiChannel channel) throws InterruptedException {
        for(Note note : _note){
            if(note != null) {
                channel.noteOn(note.code(), 127);
            }
        }
        Thread.sleep(_time);
        for(Note note : _note){
            if(note != null){
                channel.noteOff(note.code());
            }
        }
    }


}
