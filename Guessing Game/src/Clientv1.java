import java.util.Random;

import javax.swing.JOptionPane;

public class Clientv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words={"one","two","three","four","five"};
		
		
		Random myRandomNumber=new Random();
		boolean gameOver = false; // game loop control
		int firstRandom=myRandomNumber.nextInt(words.length);
		
		/*String input= JOptionPane.showInputDialog("What is your guess?");
		
		
		
		System.out.print("word is: "+words[firstRandom]);
		
		
		guessedWord.setCharAt(2,'X');
		
		String wordToGuess = "hello";*/
		StringBuilder ourWord = new StringBuilder(words[firstRandom]);
		
		
		// loop through 'ourWord' and replace each character with a '-'
		for(int i=0;i<ourWord.length();i++){
			ourWord.setCharAt(i, '-');
		}
		
		
		
		// Create a game loop
		while(gameOver==false) {
			
			// keep asking user for input until
			// 1) the words match OR
			// 2) 'ourWord' no longer contains any '-' characters
			
			System.out.println(ourWord);
			String userInput = JOptionPane.showInputDialog("guess one letter:");
			// grab just the first character
			char ourLetterGuess = userInput.charAt(0);
			
			// once the user guesses,
			// if the user's guess matches any character in
			// the wordToGuess,
			// then set 'ourWord' 's corresponding character to that character
			String Z = "0";
			int bdub=0;
			for (int i=0;i<words[firstRandom].length();i++){
				
				if(ourLetterGuess==words[firstRandom].charAt(i))
				{Z="1";}
				if (Z.equals("1")){
				ourWord.setCharAt(i, ourLetterGuess);
				}
				if(ourWord.charAt(i)!='-'){
					bdub++;
					if(bdub==ourWord.length()){
					gameOver=true;
					System.out.print("You have won!");}
				}
				Z="0";
				
			}}}}
			
			
			
			
			// loop - test each letter in 'ourGuess'
			// if no characters are '-', then
			// set the 'gameOver' variable to true
			
			
		
		
		// game is over when the while loop exits
		
		
		
		
	
/*static boolean checkForWin(StringBuilder ourWord) {
			
			
			// loop through the ourWord
			// if any characters are '-', return false
			// else, return true
			return false;
		}
}*/






























































/*import java.util.Random;

import javax.swing.JOptionPane;

public class Clientv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words={"one","two","the","man"};
		Random myRandomNumber=new Random();
		
			int firstRandom=myRandomNumber.nextInt(words.length);
		
		
		String input= JOptionPane.showInputDialog("What is your guess?");
		
		if(input.equals(words[firstRandom])){
		System.out.print("Great job");
		}
		
		//System.out.print("word is: "+words[firstRandom]);
		
		StringBuilder guessedWord= new StringBuilder("---");
		
		//guessedWord.setCharAt(2,'X');
	*/	
		/*String wordToguess="hello";
		StringBuilder ourword=new StringBuilder(wordToguess);
		boolean gameOver=false;
		
		ourword.setCharAt(0, '-');
		while(gameOver==false){
		
		
			//keep asking until words match or ourword= a char in it
			String userInput=JOptionPane.showInputDialog("Guess one letter: ");
			//grabs just the first character
			char ourLetterGuess=userInput.charAt(0);
			//char ourletterGuess=
		
			//once the user guesses or matches in the word to guess 
			//then set ourwords character to that character
			
			ourword.setCharAt(0, ourLetterGuess);

			//loop-test each for a guess
			//if no characters are - set variable to true
			
			
			
			
		}
		//game is over here when while exits
		System.out.println("You Won");*/



