package oop;

public class Automobile {

	
	private String color;
	private int speed;
	private String make;
	
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public void breack (int b) {
		speed=speed -b;
		}
	
	public void changeGear (int g) {
		speed=speed-g;
	}
		public void accelerator(int ac) {
		speed=speed+ac;
			}
	public void getspeed(int gs) {
		speed=speed+gs;
	}
	
}
	