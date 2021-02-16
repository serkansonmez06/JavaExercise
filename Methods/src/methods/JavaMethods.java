package methods;

public class JavaMethods {

	public static void main(String[] args) {
	   
		boolean gameOver = true;
		int score= 800;
		int levelCompleted = 5;
		int bonus= 100;
	
		
		 int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
		 System.out.println(" your final score was " + highScore);
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		score =10000;
		levelCompleted=8;
		bonus =200;
		
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Serkan", position);
		
		position = calculateHighScorePosition(900);
		displayHighScorePosition("Ismail", position);
		
			
		
		position = calculateHighScorePosition(500);
		displayHighScorePosition("Hatice", position);
		
		position = calculateHighScorePosition(1000);
		displayHighScorePosition("Ama", position);
	}



	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {
		

		if (gameOver) {
			int finalScore =score +(levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("your final score was " + finalScore);
			return finalScore;
			
		}else {
			return -1;// -1 mean invalid value
		}
	}
		
// 		*********************
		
		
		

	
	
   public static void displayHighScorePosition (String playerName, int position) {
	   System.out.println( playerName +" managed to get into the position " + position + " on the high score table" );
	  
	   
   }
   public static int calculateHighScorePosition(int playerScore) {
	   
	   if(playerScore>=1000) {
		   return 1;
	   }else if( 500<=playerScore) {
		   return 2;
	   }else if(100 <=playerScore) {
		   return 3;
	   }else
	   
		   return 4;
   }
	}	


		//alternative way of method return 
//	   int playerPosition= 4;
//	   
//	   if(playerScore>= 1000) {
//		   playerPosition=1;
//	   }else if (playerScore >=500) {
//		   playerPosition=2;
//	   }else if (playerScore >=100) {
//		   playerPosition =3;
//	   }
//return playerPosition;
	
	
	
 

