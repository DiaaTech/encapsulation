package diaatech;

public class FruitTree {
// Your code here.
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	private int startingPiecesOfFruit;
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if(numberOfPiecesToRemove > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit=typeOfFruit;
		this.startingPiecesOfFruit=startingPiecesOfFruit;
	}
    public String getTypeOfFruit() {
	return typeOfFruit;
      }
    public void setTypeOfFruit(String typeOfFruit) {
	this.typeOfFruit = typeOfFruit;
      }
    public int getPiecesOfFruitLeft() {
	return piecesOfFruitLeft;
      }
    public void setPiecesOfFruitLeft(int piecesOfFruitLeft) {
	this.piecesOfFruitLeft = startingPiecesOfFruit-piecesOfFruitLeft;
}
	public int getStartingPiecesOfFruit() {
		return startingPiecesOfFruit;
	}
	public void setStartingPiecesOfFruit(int startingPiecesOfFruit) {
		this.startingPiecesOfFruit = startingPiecesOfFruit;
	}
	
	

}




