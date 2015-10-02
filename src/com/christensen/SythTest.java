package com.christensen;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class SythTest {
    public static void main(String[] args){
        int channel = 0;
        int volume = 80;
        int duration = 200;

        try{
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();
            playNotes(channels[1]);
            synth.close();

        } catch (MidiUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void playNotes(MidiChannel channel) throws InterruptedException {
        int volume = 80;
        int duration = 200;
        channel.noteOn(90, volume);
        Thread.sleep(duration);
        channel.noteOff(60);
        channel.noteOn(62, volume);
        Thread.sleep(duration);
        channel.noteOff(60);
        channel.noteOn(64, volume);
        Thread.sleep(duration);
        channel.noteOff(64);

        Thread.sleep(500);

        // -----------------------------------------
        channel.noteOn(60, volume);
        channel.noteOn(64, volume);
        channel.noteOn(67, volume);
        Thread.sleep(3000);
        channel.allNotesOff();
        Thread.sleep(500);
    }
}
