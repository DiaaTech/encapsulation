package diaatech;

public class HomeWorkAssignment {
// Your code here.
	private int totalMarks;	
	private int possibleMarks;	
	private String submitterName;	
	private String letterGrade;
	
	public void setHomeworkAssignment(int possibleMarks) {
		if (totalMarks <= 100 && totalMarks >= 90) {
             letterGrade =("Grade:  A");
        } else if (totalMarks < 90 && totalMarks >= 80) {
            letterGrade =("Grade: B");
        } else if (totalMarks < 80 && totalMarks >= 70) {
        	 letterGrade =("Grade:C");
        } else if (totalMarks < 70 && totalMarks >= 60) {
          letterGrade =("Grade: D");
        } else if (totalMarks < 60) {
        	letterGrade = ("Grade: F");
        }
		
		   
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public void setPossibleMarks(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {
	return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade=letterGrade; 
		
	}

	
}
