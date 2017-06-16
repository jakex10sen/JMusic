package com.x10sendev.sequences;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MusicSequence;
import com.x10sendev.music.Note;

import javax.sound.midi.Sequence;

public class IWriteSinsNotTragedies {

    public static void main(String[] args) {
        MusicSequence sequence = new MusicSequence(Sequence.PPQ, 3, 0);

        sequence.addRestTreble(Note.WHOLE);
        sequence.addRestBass(Note.WHOLE);

        //1-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.C4));
        //2-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.E4));
        //3-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.C4));
        //4-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.E4));
        //5-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.FS3);
        sequence.addChordBass(new Chord(Note.EIGHTH, Note.B3, Note.C4));
        sequence.addChordBass(new Chord(Note.QUARTER, Note.D4, Note.A4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.C4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.D4));
        //6-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.FS3);
        sequence.addChordBass(new Chord(Note.EIGHTH, Note.B3, Note.C4));
        sequence.addChordBass(new Chord(Note.QUARTER, Note.D4, Note.A4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.C4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.D4));
        //7-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.F3);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.D4));
        //8-------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.F3);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.F4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.D4));
        //9-------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.HALF, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addRestTreble(Note.EIGHTH);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addNoteTreble(Note.EIGHTH, Note.C5);
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.C4));
        //10------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteTreble(Note.THREE_EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addChordBass(new Chord(Note.EIGHTH, Note.C4, Note.E4));
        sequence.addRestTreble(Note.EIGHTH);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addNoteTreble(Note.EIGHTH, Note.C5);
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.C4));
        //11------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addNoteTreble(Note.EIGHTH, Note.C5);
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addNoteTreble(Note.EIGHTH, Note.C5);
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.C4));
        //12------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addNoteBass(Note.EIGHTH, Note.A2);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addNoteTreble(Note.EIGHTH, Note.C5);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addNoteTreble(Note.EIGHTH, Note.B4);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteBass(Note.EIGHTH, Note.E3);
        sequence.addNoteTreble(Note.QUARTER, Note.A4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.C4));
        //13------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.QUARTER, Note.D5);
        sequence.addNoteBass(Note.EIGHTH, Note.FS3);
        sequence.addChordBass(new Chord(Note.EIGHTH, Note.B3, Note.C4));
        sequence.addNoteTreble(Note.QUARTER, Note.D5);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.D4, Note.A4));
        sequence.addNoteTreble(Note.QUARTER, Note.D5);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.C4);
        sequence.addNoteTreble(Note.EIGHTH, Note.E5);
        sequence.addNoteTreble(Note.EIGHTH, Note.C5);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.D4));
        //14------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.QUARTER, Note.C5);
        sequence.addNoteBass(Note.EIGHTH, Note.FS3);
        sequence.addChordBass(new Chord(Note.EIGHTH, Note.B3, Note.C4));
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.D4, Note.A4));
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteTreble(Note.EIGHTH, Note.G4);
        sequence.addNoteBass(Note.EIGHTH, Note.C4);
        sequence.addNoteTreble(Note.EIGHTH, Note.G4);
        sequence.addNoteTreble(Note.EIGHTH, Note.A4);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.B3, Note.D4));
        //15------------------------------------------------------------------------------------------------------------
        sequence.addNoteTreble(Note.QUARTER, Note.D5);
        sequence.addNoteBass(Note.EIGHTH, Note.F3);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addNoteTreble(Note.QUARTER, Note.C5);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.E4));
        sequence.addNoteTreble(Note.QUARTER, Note.B4);
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.D4));
        //16------------------------------------------------------------------------------------------------------------
        sequence.addRestTreble(Note.WHOLE);
        sequence.addNoteBass(Note.EIGHTH, Note.F3);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.F4));
        sequence.addRestBass(Note.EIGHTH);
        sequence.addNoteBass(Note.EIGHTH, Note.B3);
        sequence.addChordBass(new Chord(Note.QUARTER, Note.C4, Note.D4));


        //--------------------------------------------------------------------------------------------------------------
        sequence.endSequence();
        String filename = "IWriteSinsNotTragedies.mid";
        sequence.writeAndPlay(filename);
        System.exit(0);
    }
}
