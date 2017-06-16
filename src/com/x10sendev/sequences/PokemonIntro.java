package com.x10sendev.sequences;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MusicSequence;
import com.x10sendev.music.Note;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;

public class PokemonIntro {

    private static final int RESOLUTION = 3;

    public static void main(String[] args) throws InvalidMidiDataException {
        MusicSequence musicSequence = new MusicSequence(Sequence.PPQ, RESOLUTION, 5);

        musicSequence.addRestTreble(Note.WHOLE + Note.WHOLE);
        musicSequence.addRestBass(Note.WHOLE + Note.WHOLE);
        //1-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        //2-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.C4));
        musicSequence.addNoteBass(Note.QUARTER, Note.F3);
        //3-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.FS4, Note.C5));
        musicSequence.addNoteBass(Note.QUARTER, Note.A3);
        //4-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.GS4, Note.CS5));
        musicSequence.addNoteBass(Note.HALF, Note.GS3);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.HALF, Note.CS3);
        //5-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.E4, Note.B4));
        musicSequence.addNoteBass(Note.HALF, Note.A3);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.E3, Note.B3));
        musicSequence.addNoteBass(Note.HALF, Note.CS3);
        //6-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        //7-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4));
        musicSequence.addNoteBass(Note.QUARTER, Note.A3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.FS4, Note.C5));
        musicSequence.addNoteBass(Note.QUARTER, Note.GS3);
        //8-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.WHOLE, Note.F4, Note.CS5));
        musicSequence.addNoteBass(Note.WHOLE, Note.GS3);
        //9-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.CS5, Note.CS6));
        musicSequence.addNoteBass(Note.EIGHTH, Note.CS3);
        musicSequence.addRestTreble(Note.EIGHTH + Note.THREE_QUARTER);
        musicSequence.addRestBass(Note.EIGHTH + Note.THREE_QUARTER);
        //--------------------------------------------------------------------------------------------------------------
        musicSequence.endSequence();
        String filename = "Pokemon_Intro.mid";
        musicSequence.writeAndPlay(filename);

        System.exit(0);
    }
}
