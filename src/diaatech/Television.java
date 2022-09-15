package diaatech;

public class Television {

// Your code here.
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public boolean  getturnOff() {
	
		return isOn=false;
	}
	public boolean turnOn() {
		return isOn=true;
	}
	public void getchangeChannel(int newChannel) {
	this.currentChannel=currentChannel;
	this.isOn=isOn;
	}
		
	
	public int  getchannelUp() {
	if(isOn=true && currentChannel>18) {
		return currentChannel=currentChannel++;
	}
	else {
	return currentChannel=3;
	}
	
		
	}
	public int getchannelDown() {
		if(isOn=true && currentChannel<3) {
		return currentChannel=currentChannel--;
		}
		else {
			return currentChannel=18;
		}
		
	}
	public int getraiseVolume() {
		if(isOn=true && currentChannel<=10) {
		return currentVolume=currentVolume++;
		}
		return currentChannel;
	
		
		
	}
	public  int getlowerVolume() {
		if(isOn=true && currentVolume<=0) {
			return currentVolume=currentVolume--;
		}
		return currentChannel;
		
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
