package day11_set_get;

public class Quiz03_1AirconditionerMethod {

	private int cooling = 0 ;
	private int heater = 0;
	
	public void setCooling(int cooling) {
		this.cooling = cooling;
	}
	
	public void setHeater(int heater) {
		this.heater = heater;
	}
	
	public int getCooling() {
		return cooling;
	}
	
	public int getHeater() {
		return heater;
	}
	
	public void powerOff() {
		System.out.println("시스템을 종료합니다.");
		return;
	}
}
