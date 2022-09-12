package diaatech;

public class Airplane {
// Your code here.
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats ;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
		
	}
	
	public void setReserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass=true) {
			totalNumberOfSeats = availableFirstClassSeats ;
		}
		else if(forFirstClass=false){
			totalNumberOfSeats= availableCoachSeats;
		}
		else  {
			totalNumberOfSeats=bookedFirstClassSeats;
		}
		
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public void setPlaneNumber(String planeNumber) {
		this.planeNumber = planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public void setBookedFirstClassSeats(int bookedFirstClassSeats) {
		this.bookedFirstClassSeats = bookedFirstClassSeats;
	}

	public int getAvailableFirstClassSeats() {
		return availableFirstClassSeats= totalFirstClassSeats-bookedFirstClassSeats;
	}

	public void setAvailableFirstClassSeats(int availableFirstClassSeats) {
		this.availableFirstClassSeats =availableFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public void setTotalFirstClassSeats(int totalFirstClassSeats) {
		this.totalFirstClassSeats = totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public void setBookedCoachSeats(int bookedCoachSeats) {
		this.bookedCoachSeats = bookedCoachSeats;
	}

	public int getAvailableCoachSeats() {
		return availableCoachSeats=totalCoachSeats-bookedCoachSeats;
	}

	public void setAvailableCoachSeats(int availableCoachSeats) {
		this.availableCoachSeats = availableCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats=totalCoachSeats;
	}

	public void setTotalCoachSeats(int totalCoachSeats) {
		this.totalCoachSeats = totalCoachSeats;
	}

	
}
