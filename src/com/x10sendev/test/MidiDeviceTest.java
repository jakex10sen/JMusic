package com.x10sendev.test;

import com.x10sendev.device.MidiReceiver;

import javax.sound.midi.*;

public class MidiDeviceTest {
    public static void main(String[] args) throws MidiUnavailableException {
        Synthesizer synthesizer;
        Transmitter transmitter;
        MidiDevice device;
        MidiDevice.Info midiDevInfo = null;
        for (MidiDevice.Info info : MidiSystem.getMidiDeviceInfo()) {
            System.out.println(info.getName() + ": " + info.getVendor() + ": " + info.getDescription());
            if (info.getName().contains("MPKmini2")) {
                midiDevInfo = info;
                break;
            }
        }
        if (midiDevInfo == null) {
            System.err.println("ERROR: couldn't find MidiDevice");
            System.exit(-1);
        }
        synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        device = MidiSystem.getMidiDevice(midiDevInfo);
        device.open();
        transmitter = device.getTransmitter();

        MidiReceiver midiReceiver = new MidiReceiver(synthesizer.getReceiver());

        transmitter.setReceiver(midiReceiver);


    }
}
