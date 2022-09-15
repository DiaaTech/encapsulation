package diaatech;

public class Elevator {
// Your code here.
	private int currentFloor;
    private int numberOfFloors	;
	private boolean doorOpen;
	
	public void Elevator(int totalNumberOffloors){
		this.numberOfFloors=numberOfFloors;
	}
	public boolean getOpenDoor() {
		return doorOpen=true;
		
	}
	public boolean  getcloseDoor() {
		return  doorOpen=false;
		
	}
	public int getgoUp(int desiredFloor) {
		return desiredFloor;
				
	}
	public int getgodown(int desiredFloor) {
		return desiredFloor;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	public void setDoorOpen(boolean doorOpen) {
		this.doorOpen = doorOpen;
	}
	
}
