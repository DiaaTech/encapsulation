package diaatech;

public class Television {
// Your code here.
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	private String turnOff;
	private String turnOn;
	private int channel;
	private int volume;
	private int newChannel;
	
	public void setTurnOff(String turnOff) {
		this.turnOff=turnOff;
	}
	public void setTurnOn(String turnOn, int channel ,int volume ) {
		this.turnOn=turnOn;
		this.channel=channel;
		this.volume=volume;
	}
	public void setChangeChannel(int newChannel) {
		this.newChannel=newChannel;
		
	}
	public void channelUp() {
		
		
	}
	void channelDown() {
		
	}
	void raiseVolume() {
		
	}
	void lowerVolume() {
		
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	

}
