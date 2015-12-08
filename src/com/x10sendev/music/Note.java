package com.x10sendev.music;

import java.util.HashMap;
import java.util.Map;

/**
 * An enum of Notes to add to Tracks/MidiTracks/MusicSequences
 * also holds the common lengths of Notes
 */
public enum Note {
    A0(21, "A0"), AS0(22, "AS0"),
    B0(23, "B0"),
    C1(24, "C1"), CS1(25, "CS1"),
    D1(26, "D1"), DS1(27, "DS1"),
    E1(28, "E1"),
    F1(29, "F1"), FS1(30, "FS1"),
    G1(31, "G1"), GS1(32, "GS1"),
    A1(33, "A1"), AS1(34, "AS1"),
    B1(35, "B1"),
    C2(36, "C2"), CS2(37, "CS3"),
    D2(38, "D2"), DS2(39, "DS2"),
    E2(40, "E2"),
    F2(41, "F2"), FS2(42, "FS2"),
    G2(43, "G2"), GS2(44, "GS2"),
    A2(45, "A2"), AS2(46, "AS2"),
    B2(47, "B2"),
    C3(48, "C3"), CS3(49, "CS3"),
    D3(50, "D3"), DS3(51, "DS3"),
    E3(52, "E3"),
    F3(53, "F3"), FS3(54, "FS3"),
    G3(55, "G3"), GS3(56, "GS3"),
    A3(57, "A3"), AS3(58, "AS3"),
    B3(59, "B3"),

    C4(60, "C4"), CS4(61, "CS4"),
    D4(62, "D4"), DS4(63, "DS4"),
    E4(64, "E4"),
    F4(65, "F4"), FS4(66, "FS4"),
    G4(67, "G4"), GS4(68, "GS4"),
    A4(69, "A4"), AS4(70, "AS4"),
    B4(71, "B4"),
    C5(72, "C5"), CS5(73, "CS5"),
    D5(74, "D5"), DS5(75, "DS5"),
    E5(76, "E5"),
    F5(77, "F5"), FS5(78, "FS5"),
    G5(79, "G5"), GS5(80, "GS5"),
    A5(81, "A5"), AS5(82, "AS5"),
    B5(83, "B5"),
    C6(84, "C6"), CS6(85, "CS6"),
    D6(86, "D6"), DS6(87, "DS6"),
    E6(88, "E6"),
    F6(89, "F6"), FS6(90, "FS6"),
    G6(91, "G6"), GS6(92, "GS6"),
    A6(93, "A6"), AS6(94, "AS6"),
    B6(95, "B6"),
    C7(96, "C7"), CS7(97, "CS8"),
    D7(98, "D7"), DS7(99, "DS7"),
    E7(100, "E7"),
    F7(101, "F7"), FS7(102, "FS7"),
    G7(103, "G7"), GS7(104, "GS7"),
    A7(105, "A7"), AS7(106, "AS7"),
    B7(107, "B7");


    public static final long WHOLE = 32;
    public static final long THREE_QUARTER = 24;
    public static final long HALF = 16;
    public static final long THREE_EIGHTH = 12;
    public static final long QUARTER = 8;
    public static final long EIGHTH = 4;
    public static final long SIXTEENTH = 2;
    private static final Map<Integer, Note> lookup = new HashMap<>();

    static {
        for (Note note : Note.values()) {
            lookup.put(note.code(), note);
        }
    }

    private final int _code;
    private final String _name;

    Note(int code, String name) {
        _code = code;
        _name = name;
    }

    public static Note get(int code) {
        return lookup.get(code);
    }

    public static String getName(int code) {
        return lookup.get(code).toString();
    }

    public int code(){
        return _code;
    }

    @Override
    public String toString() {
        return _name;
    }



}
