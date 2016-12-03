/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auf3progii;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author nana
 */
public class Sinusgenerator {
    /** die Tonleiter (C, D, E, F, G, A, H, C²*/
	    private static double frequencies[] = {261.63, 293.66, 329.63, 349.23, 392.00, 440.00, 493.88, 523.25};
            public static final double NOTE_C = 261.63;
	   
	     public static byte[] getSinusTone(double frequency, AudioFormat af) {
	         byte sample_size = (byte) (af.getSampleSizeInBits() / 8);
	         byte[] data = new byte[(int) af.getSampleRate() * sample_size];
	         double step_width = (2 * Math.PI) / af.getSampleRate();
	         double x = 0;
	 
	         for (int i = 0; i < data.length; i += sample_size) {
	             int sample_max_value = (int) Math.pow(2, af.getSampleSizeInBits()) / 2 - 1;
	             int value = (int) (sample_max_value * Math.sin(frequency * x));
	             for (int j = 0; j < sample_size; j++) {
	                 byte sample_byte = (byte) ((value >> (8 * j)) & 0xff);
	                 data[i + j] = sample_byte;
	             }
	             x += step_width;
	         }
	         return data;
	     }
	 
	     public static void play(double frequenzy) {
	         AudioFormat af = new AudioFormat(44100, 16, 1, true, false);
	         byte[] data = getSinusTone(frequenzy, af);
	       
	         try {
	             Clip c = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
	 
	             c.open(af, data, 0, data.length);
	             c.start();
//	             c.loop(1000);
	             
//	             while(c.isRunning()) {
//	                 try {
//	                     Thread.sleep(50);
//	                 } catch (Exception ex) {}
//	             }
	             
	         } catch (LineUnavailableException ex) {
	             ex.printStackTrace();
	         }
	     }
}
