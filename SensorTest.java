package legonidas;

//import lejos.hardware.Button;
import lejos.hardware.port.*;
import lejos.hardware.ev3.*;
import lejos.hardware.lcd.LCD;
//import lejos.hardware.motor.EV3MediumRegulatedMotor;
//import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
//import lejos.utility.Delay;

public class SensorTest {

	//private static EV3MediumRegulatedMotor motorA;
	

	public static void main(String[] args) {
		
		// get a port instance
		Port port = LocalEV3.get().getPort("S1");

		// Get an instance of the Ultrasonic EV3 sensor
		SensorModes sensor = new EV3UltrasonicSensor(port);

		// get an instance of this sensor in measurement mode
		SampleProvider distance= sensor.getMode("Distance");

		// initialize an array of floats for fetching samples. 
		// Ask the SampleProvider how long the array should be
		float[] sample = new float[distance.sampleSize()];
		
		// fetch a sample
		int i = 0;
		while(true) {
		  distance.fetchSample(sample, 0);
		LCD.drawString(Float.toString(sample[0]), 0, i++);
		if (i == 8)
			i = 0;
		Delay.msDelay(100);
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		}
	/*	Delay.msDelay(2000);
		
		motorA = new EV3MediumRegulatedMotor(MotorPort.A);
		//LCD.drawString("FORWARD",0,0);
		motorA.forward();
		Button.waitForAnyPress();
		//LCD.drawString("BACKWARD",0,0);
		motorA.backward();
		Button.waitForAnyPress();
		motorA.stop();    */ 
		
		
	}

}
