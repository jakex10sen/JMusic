package com.x10sendev.sequences;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MusicSequence;
import com.x10sendev.music.Note;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import java.io.IOException;


public class GravityFalls {

    private static final int RESOLUTION = 3;


    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, IOException {
        MusicSequence musicSequence = new MusicSequence(Sequence.PPQ, RESOLUTION, 5);


        musicSequence.addRestTreble(Note.WHOLE);
        musicSequence.addRestBass(Note.WHOLE);

        //1-------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.WHOLE + Note.WHOLE);
        musicSequence.addRestBass(Note.WHOLE + Note.WHOLE);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.F4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.D4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.D4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.F4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.D4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.D4);
        musicSequence.addRestBass(Note.EIGHTH);
        //2-------------------------------------------------------------------------------------------------------------
        musicSequence.addNoteTreble(Note.EIGHTH, Note.F4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.F4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addRestBass(Note.EIGHTH);
        //3-------------------------------------------------------------------------------------------------------------
        musicSequence.addNoteTreble(Note.EIGHTH, Note.E4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.CS4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.E4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.CS4);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addRestBass(Note.EIGHTH);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addRestBass(Note.EIGHTH);
        //4-------------------------------------------------------------------------------------------------------------
        musicSequence.addNoteTreble(Note.EIGHTH, Note.CS4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.E4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.E4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.C4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteTreble(Note.SIXTEENTH, Note.E4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteTreble(Note.SIXTEENTH, Note.C4);
        musicSequence.addNoteTreble(Note.SIXTEENTH, Note.E4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteTreble(Note.SIXTEENTH, Note.C4);
        //5-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.THREE_QUARTER, Note.A3, Note.D4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.E4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        //6-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.WHOLE, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        //7-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.THREE_EIGHTH, Note.A3, Note.F4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addChordTreble(new Chord(Note.THREE_EIGHTH, Note.A3, Note.F4, Note.G4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        //8-------------------------------------------------------------------------------------------------------------
        musicSequence.addNoteTreble(Note.WHOLE, Note.C4);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.F2, Note.F3));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.E2, Note.E2));
        //9-------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.THREE_QUARTER, Note.B3, Note.D4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.E4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        //10------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.B3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.B3, Note.D4, Note.E4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        //11------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.E4, Note.G4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        //12------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.CS4, Note.G4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        //13------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        //14------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.G4));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.D2, Note.D3));
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.D2, Note.D3));
        //15------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        //16------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.G4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.G4));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.F2, Note.F3));
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.F2, Note.F3));
        //17------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        //18------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.G4));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.B1, Note.B2));
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.B1, Note.B2));
        //19------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        //20------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
        musicSequence.addNoteBass(Note.EIGHTH, Note.A1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.E2);
        //21------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        //22------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.G4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.F3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        //23------------------------------------------------------------------------------------------------------------
        musicSequence.addRestTreble(Note.QUARTER);
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B1);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        musicSequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.B2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.F2);
        //24------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.E4, Note.G4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.E4, Note.G4, Note.C5));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        //25------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.CS4, Note.E4, Note.A4));
        musicSequence.addNoteBass(Note.EIGHTH, Note.C2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addNoteBass(Note.EIGHTH, Note.C3);
        musicSequence.addNoteBass(Note.EIGHTH, Note.G2);
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.E4, Note.A4, Note.CS5));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.C2, Note.C3));
        musicSequence.addChordBass(new Chord(Note.QUARTER, Note.C2, Note.C3));
        //26------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.A4, Note.F5));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.D5);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addChordTreble(new Chord(Note.EIGHTH, Note.A4, Note.F5));
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A5);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.E5);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D2);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.CS5);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.A5);
        musicSequence.addNoteBass(Note.EIGHTH, Note.D3);
        musicSequence.addNoteTreble(Note.EIGHTH, Note.CS6);
        musicSequence.addNoteBass(Note.EIGHTH, Note.A2);
        //27------------------------------------------------------------------------------------------------------------
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.A5, Note.D6));
        musicSequence.addChordBass(new Chord(Note.HALF, Note.B1, Note.D3));
        musicSequence.addChordTreble(new Chord(Note.HALF, Note.D4, Note.F4, Note.D5));
        musicSequence.addChordBass(new Chord(Note.HALF, Note.D1, Note.D2));

        //set end of track (meta event)
        musicSequence.endSequence();

        String filename = "Gravity_Falls.mid";
        musicSequence.writeAndPlay(filename);

        System.exit(0);
    }
}
