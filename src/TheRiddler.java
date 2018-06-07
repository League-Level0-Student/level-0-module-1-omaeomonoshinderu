import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog(null , "What has wheels and flies, but stays on the ground");
		
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("a garbage truck")) {
		// 5. Otherwise, say "wrong" and tell them the answer
score++;
	JOptionPane.showMessageDialog(null, "You know da wae! You now have " + score + " points");

}
else {
	JOptionPane.showMessageDialog(null,"You do not know da wae");
}
// 6. Add some more riddles
riddle = JOptionPane.showInputDialog(null , "Whats once in a minute, twice in a moment, but never in a thousnd years");

//4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("The letter m")) {
		// 5. Otherwise, say "wrong" and tell them the answer
score++;
	JOptionPane.showMessageDialog(null, "You know da wae! You now have " + score + " points");

}
else {
	JOptionPane.showMessageDialog(null,"You do not know da wae");
}
riddle = JOptionPane.showInputDialog(null , "Why was 6 scared of 7");

//4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("Because 7 8 9")) {
		// 5. Otherwise, say "wrong" and tell them the answer
score++;
	JOptionPane.showMessageDialog(null, "You know da wae! You now have " + score + " points");

}
else {
	JOptionPane.showMessageDialog(null,"You do not know da wae");
}
// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "");
	}
}

