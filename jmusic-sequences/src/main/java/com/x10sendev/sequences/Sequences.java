package com.x10sendev.sequences;

import com.x10sendev.music.Chord;
import com.x10sendev.music.MusicSequence;
import com.x10sendev.music.Note;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.Sequence;

public class Sequences {
  public static MusicSequence GravityFalls() throws InvalidMidiDataException {
    MusicSequence sequence = new MusicSequence(Sequence.PPQ, 3, 5);

    //1-------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.WHOLE + Note.WHOLE);
    sequence.addRestBass(Note.WHOLE + Note.WHOLE);
    sequence.addNoteTreble(Note.EIGHTH, Note.F4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.D4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.D4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.F4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.D4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.D4);
    sequence.addRestBass(Note.EIGHTH);
    //2-------------------------------------------------------------------------------------------------------------
    sequence.addNoteTreble(Note.EIGHTH, Note.F4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.F4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addRestBass(Note.EIGHTH);
    //3-------------------------------------------------------------------------------------------------------------
    sequence.addNoteTreble(Note.EIGHTH, Note.E4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.CS4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.E4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.CS4);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addRestBass(Note.EIGHTH);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addRestBass(Note.EIGHTH);
    //4-------------------------------------------------------------------------------------------------------------
    sequence.addNoteTreble(Note.EIGHTH, Note.CS4);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteTreble(Note.EIGHTH, Note.A3);
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteTreble(Note.EIGHTH, Note.E4);
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteTreble(Note.EIGHTH, Note.E4);
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteTreble(Note.EIGHTH, Note.C4);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteTreble(Note.SIXTEENTH, Note.E4);
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteTreble(Note.SIXTEENTH, Note.C4);
    sequence.addNoteTreble(Note.SIXTEENTH, Note.E4);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteTreble(Note.SIXTEENTH, Note.C4);
    //5-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.THREE_QUARTER, Note.A3, Note.D4));
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.E4));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    //6-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.WHOLE, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    //7-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.THREE_EIGHTH, Note.A3, Note.F4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addChordTreble(new Chord(Note.THREE_EIGHTH, Note.A3, Note.F4, Note.G4));
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    //8-------------------------------------------------------------------------------------------------------------
    sequence.addNoteTreble(Note.WHOLE, Note.C4);
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordBass(new Chord(Note.QUARTER, Note.F2, Note.F3));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.E2, Note.E2));
    //9-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.THREE_QUARTER, Note.B3, Note.D4));
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.E4));
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    //10------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.B3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.HALF, Note.B3, Note.D4, Note.E4));
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    //11------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.E4, Note.G4));
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    //12------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.CS4, Note.G4));
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    sequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    //13------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    //14------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.G4));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.D2, Note.D3));
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.D2, Note.D3));
    //15------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    //16------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.G4));
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4, Note.G4));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.F2, Note.F3));
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.F2, Note.F3));
    //17------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    //18------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.G4));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.B1, Note.B2));
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.B3, Note.D4, Note.F4));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.B1, Note.B2));
    //19------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    //20------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
    sequence.addNoteBass(Note.EIGHTH, Note.A1);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4, Note.CS5));
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteBass(Note.EIGHTH, Note.E2);
    //21------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.D4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    //22------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.G4));
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.C4, Note.F4));
    sequence.addNoteBass(Note.EIGHTH, Note.F3);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    //23------------------------------------------------------------------------------------------------------------
    sequence.addRestTreble(Note.QUARTER);
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
    sequence.addNoteBass(Note.EIGHTH, Note.B1);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.F4, Note.B4));
    sequence.addNoteBass(Note.EIGHTH, Note.B2);
    sequence.addNoteBass(Note.EIGHTH, Note.F2);
    //24------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.C4, Note.E4, Note.G4));
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addChordTreble(new Chord(Note.HALF, Note.E4, Note.G4, Note.C5));
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    //25------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.CS4, Note.E4, Note.A4));
    sequence.addNoteBass(Note.EIGHTH, Note.C2);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addNoteBass(Note.EIGHTH, Note.C3);
    sequence.addNoteBass(Note.EIGHTH, Note.G2);
    sequence.addChordTreble(new Chord(Note.HALF, Note.E4, Note.A4, Note.CS5));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.C2, Note.C3));
    sequence.addChordBass(new Chord(Note.QUARTER, Note.C2, Note.C3));
    //26------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.A4, Note.F5));
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteTreble(Note.EIGHTH, Note.D5);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.A4, Note.F5));
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteTreble(Note.EIGHTH, Note.A5);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteTreble(Note.EIGHTH, Note.E5);
    sequence.addNoteBass(Note.EIGHTH, Note.D2);
    sequence.addNoteTreble(Note.EIGHTH, Note.CS5);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    sequence.addNoteTreble(Note.EIGHTH, Note.A5);
    sequence.addNoteBass(Note.EIGHTH, Note.D3);
    sequence.addNoteTreble(Note.EIGHTH, Note.CS6);
    sequence.addNoteBass(Note.EIGHTH, Note.A2);
    //27------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.A5, Note.D6));
    sequence.addChordBass(new Chord(Note.HALF, Note.B1, Note.D3));
    sequence.addChordTreble(new Chord(Note.HALF, Note.D4, Note.F4, Note.D5));
    sequence.addChordBass(new Chord(Note.HALF, Note.D1, Note.D2));

    //set end of track (meta event)
    sequence.endSequence();
    return sequence;
  }

  public static MusicSequence PokemonIntro() throws InvalidMidiDataException {
    MusicSequence sequence = new MusicSequence(Sequence.PPQ, 3, 5);

    sequence.addRestTreble(Note.WHOLE + Note.WHOLE);
    sequence.addRestBass(Note.WHOLE + Note.WHOLE);
    //1-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    //2-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.A3, Note.C4));
    sequence.addNoteBass(Note.QUARTER, Note.F3);
    //3-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.FS4, Note.C5));
    sequence.addNoteBass(Note.QUARTER, Note.A3);
    //4-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.GS4, Note.CS5));
    sequence.addNoteBass(Note.HALF, Note.GS3);
    sequence.addChordTreble(new Chord(Note.HALF, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.HALF, Note.CS3);
    //5-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.HALF, Note.E4, Note.B4));
    sequence.addNoteBass(Note.HALF, Note.A3);
    sequence.addChordTreble(new Chord(Note.HALF, Note.E3, Note.B3));
    sequence.addNoteBass(Note.HALF, Note.CS3);
    //6-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.CS4, Note.GS4));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.D4, Note.A4));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    //7-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.E4, Note.A4));
    sequence.addNoteBass(Note.QUARTER, Note.A3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.GS3, Note.CS4));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addChordTreble(new Chord(Note.QUARTER, Note.FS4, Note.C5));
    sequence.addNoteBass(Note.QUARTER, Note.GS3);
    //8-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.WHOLE, Note.F4, Note.CS5));
    sequence.addNoteBass(Note.WHOLE, Note.GS3);
    //9-------------------------------------------------------------------------------------------------------------
    sequence.addChordTreble(new Chord(Note.EIGHTH, Note.CS5, Note.CS6));
    sequence.addNoteBass(Note.EIGHTH, Note.CS3);
    sequence.addRestTreble(Note.EIGHTH + Note.THREE_QUARTER);
    sequence.addRestBass(Note.EIGHTH + Note.THREE_QUARTER);
    //--------------------------------------------------------------------------------------------------------------
    sequence.endSequence();
    return sequence;
  }

  public static MusicSequence IWriteSinsNotTragedies() throws InvalidMidiDataException {
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
    return sequence;
  }
}
