package org.usfirst.frc.team2990.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DriveTrain {
	JoshMotorControllor joshmotorcontrollorLeftTop;
	JoshMotorControllor joshmotorcontrollorLeftBottomOne;
	JoshMotorControllor joshmotorcontrollorLeftBottomTwo;
	JoshMotorControllor joshmotorcontrollorRightTop;
	JoshMotorControllor joshmotorcontrollorRightBottomOne;
	JoshMotorControllor joshmotorcontrollorRightBottomTwo;
	float lerpSpeed = 0.8f;
	public DriveTrain(int pwm1, int pwm2, int pwm3, int pwm4, int pwm5, int pwm6){
		joshmotorcontrollorLeftTop = new JoshMotorControllor(pwm1, lerpSpeed, false);
		joshmotorcontrollorLeftBottomOne= new JoshMotorControllor(pwm2, lerpSpeed, false);
		joshmotorcontrollorLeftBottomTwo = new JoshMotorControllor(pwm3, lerpSpeed, false);
		joshmotorcontrollorRightTop = new JoshMotorControllor(pwm4, lerpSpeed, false);
		joshmotorcontrollorRightBottomOne = new JoshMotorControllor(pwm5, lerpSpeed, false);
		joshmotorcontrollorRightBottomTwo= new JoshMotorControllor(pwm6, lerpSpeed, false);
	}
	public void Update(){
		joshmotorcontrollorLeftTop.UpdateMotor();
		joshmotorcontrollorLeftBottomOne.UpdateMotor();
		joshmotorcontrollorLeftBottomTwo.UpdateMotor();
		joshmotorcontrollorRightTop.UpdateMotor();
		joshmotorcontrollorRightBottomOne.UpdateMotor();
		joshmotorcontrollorRightBottomTwo.UpdateMotor();
	}
	public void SetLeftSpeed(float Speed){
		joshmotorcontrollorLeftTop.target = -Speed;
		joshmotorcontrollorLeftBottomOne.target = Speed;
		joshmotorcontrollorLeftBottomTwo.target = Speed;
	}
	public void SetRightSpeed(float Speed){
		joshmotorcontrollorRightTop.target = -Speed;
		joshmotorcontrollorRightBottomOne.target = Speed;
		joshmotorcontrollorRightBottomTwo.target = Speed;
	}
	public void SetBothSpeed(float Speed){
		joshmotorcontrollorLeftTop.target = -Speed;
		joshmotorcontrollorLeftBottomOne.target = Speed;
		joshmotorcontrollorLeftBottomTwo.target = Speed;
		joshmotorcontrollorRightTop.target = -Speed;
		joshmotorcontrollorRightBottomOne.target = Speed;
		joshmotorcontrollorRightBottomTwo.target = Speed;
	}
	public void SetBreak(){
		joshmotorcontrollorRightTop.SetBrake();
		joshmotorcontrollorRightBottomOne.SetBrake();
		joshmotorcontrollorRightBottomTwo.SetBrake();
		joshmotorcontrollorLeftTop.SetBrake();
		joshmotorcontrollorLeftBottomOne.SetBrake();
		joshmotorcontrollorLeftBottomTwo.SetBrake();
	}
	public void SetCoast(){
		joshmotorcontrollorRightTop.SetCoast();
		joshmotorcontrollorRightBottomOne.SetCoast();
		joshmotorcontrollorRightBottomTwo.SetCoast();
		joshmotorcontrollorLeftTop.SetCoast();
		joshmotorcontrollorLeftBottomOne.SetCoast();
		joshmotorcontrollorLeftBottomTwo.SetCoast();
		// TODO Auto-generated method stub

	}
}