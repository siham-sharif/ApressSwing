package com.company;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SoundClipTest extends JFrame {

    public static void main(String[] args){
        JFrame frame = new JFrame("Sound check");
        frame.setSize(300,200);

        JButton button = new JButton("Click me");
        frame.add(button);
        button.addActionListener(new AL());
        frame.setVisible(true);
    }

    public static class AL implements ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            File clap = new File("src/com/company/piano.wav");
            music(clap);
        }
    }

    public static void music(File sound){

        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.loop(100);
        }
        catch (Exception error){}

    }

}
