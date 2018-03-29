import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {
		int score3;
		int score1;
		int score2;
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String Guess1 = JOptionPane.showInputDialog(
				"What will burn glass, and when fused with poison gas is bulletproof.(do not capitalize)");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (Guess1.equals("flourine")) {
			score1 = (2);
			JOptionPane.showMessageDialog(null, "That is correct!");
		} else {
			score1 = (0);
			JOptionPane.showMessageDialog(null, "Sorry, thats not it.The answer is flourine");
		}
		String Guess2 = JOptionPane
				.showInputDialog("Two children, who were all tangled up in their reckoning of the days of the week,"
						+ "\n" + "paused on their way to school to straighten matters out. " + "\n"
						+ "When the day after tomorrow is yesterday, said Priscilla, "
						+ "then 'today' will be as far from Sunday as that day was which was 'today' when the day before yesterday was tomorrow!"
						+ "\n" + "On which day of the week did this puzzling prattle occur? (do not capitalize)");
		// 5. Otherwise, say "wrong" and tell them the answer
		if (Guess2.equals("sunday")) {
			score2 = (5);
			JOptionPane.showMessageDialog(null, "That is correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, thats not it.The answer is sunday");
			score2 = (0);
		}
		String Guess3 = JOptionPane.showInputDialog("Alive without breath," + "\n" + "As cold as death" + "\n"
				+ "Never thirsty, ever drinking," + "\n" + "All in mail never clinking.(again, no caps)");
		if (Guess3.equals("fish")) {
			score3 = (3);
			JOptionPane.showMessageDialog(null, "That is correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, thats not it.The answer is fish");
			score3 = (0);
		}

		int finalscore = (score1 + score2 + score3);
		JOptionPane.showMessageDialog(null, "Your final score is:" + finalscore);
		// 6. Add some more riddles}
		// 2. Make a pop up to show the score.

	}
}
