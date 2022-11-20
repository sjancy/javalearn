package com.jerin.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Arrays;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.AudioProcessor;
import be.tarsos.dsp.io.jvm.AudioDispatcherFactory;
import be.tarsos.dsp.mfcc.MFCC;

public class App {
	private final static String pathToFile = "C:\\Jerin\\datasets\\genre-guesser1\\test-recorded-dataset\\classical-mozart.wav";
	private final static int audioBufferSize = 2048;
	private final static int bufferOverlap = 1024;
	private final static int amountOfMelFilters = 20;
	private final static int amountOfCepstrumCoef = 30;
	private final static float lowerFilterFreq = 133.33f;
	private final static float upperFilterFreq = 8000f;

	public static void main(String[] args) {
		File file = new File(pathToFile);
		AudioInputStream audioInputStream;
		byte[] byteAudioArray;
		AudioDispatcher audioDispatcher;
		System.out.println("Start");

		try {
			audioInputStream = AudioSystem.getAudioInputStream(file);
			//byteAudioArray = audioInputStream.readAllBytes();
			//byteAudioArray = readAudioFileData(pathToFile);
			byteAudioArray = readWAVAudioFileData(pathToFile);
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			return;
		}

		try {
			audioDispatcher = AudioDispatcherFactory.fromByteArray(byteAudioArray, audioInputStream.getFormat(),
					audioBufferSize, bufferOverlap);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		final MFCC mfccProcessor = new MFCC(audioBufferSize, audioInputStream.getFormat().getSampleRate(),
				amountOfCepstrumCoef, amountOfMelFilters, lowerFilterFreq, upperFilterFreq);

		audioDispatcher.addAudioProcessor(mfccProcessor);
		audioDispatcher.addAudioProcessor(new AudioProcessor() {

			@Override // gets called on each audio frame
			public boolean process(AudioEvent audioEvent) {
				float[] mfccs = mfccProcessor.getMFCC();
				/*  do whatever necessary with the mfcc elements here
				e.g print them  */
				System.out.println(Arrays.toString(mfccs));
				return true;
			}

			@Override // gets called when end of the audio file was reached
			public void processingFinished() {
				System.out.println("end of file reached");
			}
		});
		audioDispatcher.run();// starts a new thread

	}
	
	
    public static byte[] readAudioFileData(final String filePath) {
        byte[] data = null;
        try {
            final ByteArrayOutputStream baout = new ByteArrayOutputStream();
            final File file = new File(filePath);
            final AudioInputStream audioInputStream = AudioSystem
            .getAudioInputStream(file);

            byte[] buffer = new byte[4096];
            int c;
            while ((c = audioInputStream.read(buffer, 0, buffer.length)) != -1) {
                baout.write(buffer, 0, c);
            }
            audioInputStream.close();
            baout.close();
            data = baout.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    public static byte[] readWAVAudioFileData(final String filePath){
        byte[] data = null;
        try {
            final ByteArrayOutputStream baout = new ByteArrayOutputStream();
            final AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));

            AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, baout);
            audioInputStream.close();
            baout.close();
            data = baout.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}