package diaatech;

public class demo {

	public static void main(String[] args) {
		//answer no.1 : HomeWorkAssignment. 
		
		HomeWorkAssignment homeWorkAssig = new HomeWorkAssignment();
		
		homeWorkAssig.setLetterGrade("A");
	    homeWorkAssig.setPossibleMarks(70);
	    homeWorkAssig.setSubmitterName("RONALDO");
	    homeWorkAssig.setTotalMarks(70);
	    homeWorkAssig.setHomeworkAssignment(65);
	    
	     System.out.println(homeWorkAssig.getSubmitterName());
         System.out.println(homeWorkAssig.getLetterGrade());
         System.out.println(homeWorkAssig.getPossibleMarks());
         System.out.println(homeWorkAssig.getTotalMarks());
        
		//answer no.2:FruitTree.
		/*
		FruitTree myFruitTree = new FruitTree("banana", 10);
		
		myFruitTree.setTypeOfFruit("orange");
		myFruitTree.setStartingPiecesOfFruit(10);
		myFruitTree.setPiecesOfFruitLeft(3);
		
		System.out.println(myFruitTree.getTypeOfFruit());
		System.out.println(myFruitTree.getPiecesOfFruitLeft());
        System.out.println(myFruitTree.pickFruit(10));
      */
		//answer no.3: Employee.
		/*
		Employee myEmployee= new Employee(0, null, null, 0);
		
		myEmployee.setEmployeeId(01);
		myEmployee.setFirstName("edward");
		myEmployee.setLastName("nelson");
		myEmployee.setFullName("");
		myEmployee.setDepartment("Accounting");
		myEmployee.setAnnualSalary(100000);
		
		
		 System.out.println(myEmployee.getEmployeeId());
		 System.out.println(myEmployee.getFirstName());
		 System.out.println(myEmployee.getLastName());
		 System.out.println(myEmployee.getFullName());
		 System.out.println(myEmployee.getDepartment());
		 System.out.println(myEmployee.getAnnualSalary());
		*/
		//answer no.4:Airplane.
		/*
		Airplane myAirplane =new Airplane();
		myAirplane.setAvailableFirstClassSeats(0);
		myAirplane.setBookedFirstClassSeats(40);
		myAirplane.setTotalFirstClassSeats(50);
		myAirplane.setAvailableCoachSeats(0);
		myAirplane.setBookedCoachSeats(30);
		myAirplane.setTotalCoachSeats(50);
		myAirplane.setPlaneNumber("AM1625");
		
		 System.out.println(myAirplane.getAvailableFirstClassSeats());
		 System.out.println(myAirplane.getBookedFirstClassSeats());
		 System.out.println(myAirplane.getTotalFirstClassSeats());
		 System.out.println(myAirplane.getAvailableCoachSeats());
		 System.out.println(myAirplane.getBookedCoachSeats());
		 System.out.println(myAirplane.getTotalCoachSeats());
		 System.out.println(myAirplane.getPlaneNumber());
	*/
		//answer no.5:Television.
		/*
		Television myTv= new Television();
		
		myTv.setCurrentChannel(30);
		myTv.setCurrentVolume(6);
		myTv.setOn(true);
		
		
		
		 System.out.println(myTv.getCurrentChannel());
		 System.out.println(myTv.getCurrentVolume());
		 System.out.println(myTv.getchannelUp());
		 System.out.println(myTv.getchannelDown());
		 System.out.println(myTv.getturnOff());
		 System.out.println(myTv.getlowerVolume());
		 System.out.println(myTv.getraiseVolume());
		
		*/
		//answer no.6:Elevator.
		/*
		Elevator myElevator=new Elevator();
		myElevator.setCurrentFloor(8);
		myElevator.setNumberOfFloors(10);
	
		 System.out.println(myElevator.getCurrentFloor());
		 System.out.println(myElevator.getNumberOfFloors());
		 System.out.println(myElevator.getOpenDoor());
		 System.out.println(myElevator.getcloseDoor());
		 System.out.println(myElevator.getgoUp(6));
		 System.out.println(myElevator.getgodown(2));
		 */
  }

	

}
