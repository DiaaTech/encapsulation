package diaatech;

public class demo {

	public static void main(String[] args) {
		//answer no.1 : HomeWorkAssignment. 
		HomeWorkAssignment homeWorkAssig = new HomeWorkAssignment();
		
	    homeWorkAssig.setLetterGrade("A");
	    homeWorkAssig.setPossibleMarks(0);
	    homeWorkAssig.setSubmitterName("RONALDO");
	    homeWorkAssig.setTotalMarks(80);
	    
         System.out.println(homeWorkAssig.getLetterGrade());
         System.out.println(homeWorkAssig.getPossibleMarks());
         System.out.println(homeWorkAssig.getSubmitterName());
         System.out.println(homeWorkAssig.getTotalMarks());
       
		//answer no.2:FruitTree.
		/*
		FruitTree myFruitTree = new FruitTree("banana", 10);
		
		myFruitTree.setTypeOfFruit("orange");
		myFruitTree.setStartingPiecesOfFruit(10);
		myFruitTree.setPiecesOfFruitLeft(3);
		
		System.out.println(myFruitTree.getTypeOfFruit());
		System.out.println(myFruitTree.getPiecesOfFruitLeft());
        System.out.println(myFruitTree.pickFruit(0));
      */
		//answer no.3: Employee.
		/*
		Employee myEmployee= new Employee(0, null, null, 0);
		
		myEmployee.setEmployeeId(01);
		myEmployee.setFirstName("edward");
		myEmployee.setLastName("nelson");
		myEmployee.setFullName("");
		myEmployee.setDepartment("Accounting");
		myEmployee.setAnnualSalary(2000);
		
		
		 System.out.println(myEmployee.getEmployeeId());
		 System.out.println(myEmployee.getFirstName());
		 System.out.println(myEmployee.getLastName());
		 System.out.println(myEmployee.getFullName());
		 System.out.println(myEmployee.getDepartment());
		 System.out.println(myEmployee.getAnnualSalary());
		*/
		//answer no.4:Airplane.
		/*
		Airplane myAirplane =new Airplane("", 0,0);
		myAirplane.setAvailableFirstClassSeats(0);
		myAirplane.setBookedFirstClassSeats(40);
		myAirplane.setTotalFirstClassSeats(50);
		myAirplane.setAvailableCoachSeats(0);
		myAirplane.setBookedCoachSeats(30);
		myAirplane.setTotalCoachSeats(50);
		myAirplane.setPlaneNumber("A562");
		myAirplane.setReserveSeats(true,0);
		
		 System.out.println(myAirplane.getAvailableFirstClassSeats());
		 System.out.println(myAirplane.getBookedFirstClassSeats());
		 System.out.println(myAirplane.getTotalFirstClassSeats());
		 System.out.println(myAirplane.getAvailableCoachSeats());
		 System.out.println(myAirplane.getBookedCoachSeats());
		 System.out.println(myAirplane.getTotalCoachSeats());
		 System.out.println(myAirplane.getPlaneNumber());
		*/
		//answer no.5:Television.
		Television myTv= new Television();
		
  }

}
