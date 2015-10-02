package com.christensen.music;

public enum Note {
    A0(21), AS0(22),
    B0(23),
    C1(24), CS1(25),
    D1(26), DS1(27),
    E1(28),
    F1(29), FS1(30),
    G1(31), GS1(32),
    A1(33), AS1(34),
    B1(35),
    C2(36), CS2(37),
    D2(38), DS2(39),
    E2(40),
    F2(41), FS2(42),
    G2(43), GS2(44),
    A2(45), AS2(46),
    B2(47),
    C3(48), CS3(49),
    D3(50), DS3(51),
    E3(52),
    F3(53), FS3(54),
    G3(55), GS3(56),
    A3(57), AS3(58),
    B3(59),
    C4(60), CS4(61),
    D4(62), DS4(63),
    E4(64),
    F4(65), FS4(66),
    G4(67), GS4(68),
    A4(69), AS4(70),
    B4(71),

    C5(72), CS5(73),
    D5(74), DS5(75),
    E5(76),
    F5(77), FS5(78),
    G5(79), GS5(80),
    A5(81), AS5(82),
    B5(83),
    C6(84), CS6(85),
    D6(86), DS6(87),
    E6(88),
    F6(89), FS6(90),
    G6(91), GS6(92),
    A6(93), AS6(94),
    B6(95),
    C7(96), CS8(97),
    D7(98), DS7(99),
    E7(100),
    F7(101), FS7(102),
    G7(103), GS7(104),
    A7(105), AS7(106),
    B7(107);


    public static final long WHOLE = 32;
    public static final long THREE_QUARTER = 24;
    public static final long HALF = 16;
    public static final long THREE_EIGHTH = 12;
    public static final long QUARTER = 8;
    public static final long EIGHTH = 4;
    public static final long SIXTEENTH = 2;

    private final int _code;

    Note(int code){
        _code = code;
    }

    public int code(){
        return _code;
    }


}
