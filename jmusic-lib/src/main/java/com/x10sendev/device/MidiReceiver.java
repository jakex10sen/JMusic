package com.x10sendev.device;

import com.x10sendev.music.Note;

import javax.sound.midi.*;

public class MidiReceiver implements Receiver {

    private Receiver _receiver;

    public MidiReceiver(Receiver receiver) {
        _receiver = receiver;
    }

    @Override
    public void send(MidiMessage message, long timeStamp) {
        _receiver.send(message, timeStamp);
        if (message instanceof ShortMessage) {
            shortMessageReceived((ShortMessage) message);
        } else if (message instanceof MetaMessage) {
            metaMessageReceived((MetaMessage) message);
        } else if (message instanceof SysexMessage) {
            sysexReceived((SysexMessage) message);
        }
    }

    private void sysexReceived(SysexMessage sysexMessage) {
        byte[] data = sysexMessage.getData();
        System.out.print("SYSEXMESSAGE: [");
        for (byte b : data) {
            System.out.print(b + " ");
        }
        System.out.print("]");
    }

    private void metaMessageReceived(MetaMessage metaMessage) {
        byte[] data = metaMessage.getData();
        int type = metaMessage.getType();
        System.out.print("METAMESSAGE: " + type + " [");
        for (byte b : data) {
            System.out.print(b + " ");
        }
        System.out.print("]");
    }

    @Override
    public void close() {
      _receiver.close();
    }

    public void shortMessageReceived(ShortMessage message) {
        int command = message.getCommand();
        int data1 = message.getData1();
        int data2 = message.getData2();
        switch (command) {
            case ShortMessage.CONTROL_CHANGE:
                System.out.println("Control Change " + data1 + ": " + data2);
                break;
            case ShortMessage.PROGRAM_CHANGE:
                System.out.println("Instrument changed to " + data1);
                break;
            case ShortMessage.NOTE_OFF:
                System.out.println("Note " + Note.getName(data1) + ": OFF");
                break;
            case ShortMessage.NOTE_ON:
                System.out.println("Note " + Note.getName(data1) + ": ON at velocity: " + data2);
                break;
            case ShortMessage.ACTIVE_SENSING:
                System.out.println("Active Sensing: " + data1 + ": " + data2);
                break;
            case ShortMessage.CHANNEL_PRESSURE:
                System.out.println("Channel Pressure: " + data1 + ": " + data2);
                break;
            case ShortMessage.CONTINUE:
                System.out.println("Continue: " + data1 + ": " + data2);
                break;
            case ShortMessage.END_OF_EXCLUSIVE:
                System.out.println("End of Exclusive: " + data1 + ": " + data2);
                break;
            case ShortMessage.MIDI_TIME_CODE:
                System.out.println("MIDI Time Code: " + data1 + ": " + data2);
                break;
            case ShortMessage.PITCH_BEND:
                System.out.println("Pich Bend: " + data1 + ": " + data2);
                break;
            case ShortMessage.POLY_PRESSURE:
                System.out.println("Poly Pressure: " + data1 + ": " + data2);
                break;
            case ShortMessage.SONG_POSITION_POINTER:
                System.out.println("Song Position Pointer: " + data1 + ": " + data2);
                break;
            case ShortMessage.SONG_SELECT:
                System.out.println("Song Select: " + data1 + ": " + data2);
                break;
            case ShortMessage.START:
                System.out.println("Start: " + data1 + ": " + data2);
                break;
            case ShortMessage.STOP:
                System.out.println("Stop: " + data1 + ": " + data2);
                break;
            case ShortMessage.SYSTEM_RESET:
                System.out.println("System Reset: " + data1 + ": " + data2);
                break;
            case ShortMessage.TIMING_CLOCK:
                System.out.println("Timing Clock: " + data1 + ": " + data2);
                break;
            case ShortMessage.TUNE_REQUEST:
                System.out.println("Tune Request: " + data1 + ": " + data2);
                break;
            default:
                System.out.println(command + ": " + data1 + ": " + data2);
                break;
        }
    }
}
