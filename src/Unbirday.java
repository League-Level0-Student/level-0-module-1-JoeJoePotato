import javax.swing.JOptionPane;

public class Unbirday {
	public static void main(String[] args) {
		String day1 = JOptionPane.showInputDialog(null, "What is your birthday?(example: 06/09)");
		if (day1.equals("03/22")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");
		} else {
			JOptionPane.showMessageDialog(null, "Have a merry UNbirthday!");
		}
	}
}