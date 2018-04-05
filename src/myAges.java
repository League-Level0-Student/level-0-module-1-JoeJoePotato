import javax.swing.JOptionPane;

public class myAges {
	public static void main(String[] args) {

		for (int i = 0; i < 12; i++) {
			if (i == 1) {
				JOptionPane.showMessageDialog(null, 1 + " year old");
			} else {
				JOptionPane.showMessageDialog(null, i + " years old");

			}

		}
	}
}
