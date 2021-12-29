//@Autor: Vanessa de Oliveira Lyra


public class FindComputerWordsGame{

	//Declare variables
	private String playerA, playerB, winner;
	private int totPointA, totPointB;

	//Constructors - initializes the objects
	public FindComputerWordsGame(){

	}



	//Compute - do the calculations for the program
	public void compute(){

		if(totPointA < totPointB){
			winner = "Player B";
		}
		else if(totPointA > totPointB){
			winner = "Player A";
		}
		else{
			winner = "draw";
		}


	}//end of compute




	//Setters and getters
	public void setPlayerA(String playerA){
		this.playerA = playerA;
	}

	public void setPlayerB(String playerB){
		 this.playerB = playerB;
	}

	public void setTotPointA(int totPointA){
		this.totPointA = totPointA;
	     }

	public void setTotPointB(int totPointB){
		this.totPointB = totPointB;
     }

	public String getWinner(){
	    return winner;
    }
}