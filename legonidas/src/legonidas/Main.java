package legonidas;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Main {

	private static EV3MediumRegulatedMotor motorA;
	

	public static void main(String[] args) {
		
//		LCD.drawString("Hello World!", 0, 4);
//		Delay.msDelay(5000);
		
		motorA = new EV3MediumRegulatedMotor(MotorPort.A);
		LCD.drawString("FORWARD",0,0);
		motorA.forward();
		Button.waitForAnyPress();
		LCD.drawString("BACKWARD",0,0);
		motorA.backward();
		Button.waitForAnyPress();
		motorA.stop();     
		
		
	}

}
