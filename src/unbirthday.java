import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String bday = JOptionPane.showInputDialog("When is your birthday");
	if (bday.equals("05/17")) {
		JOptionPane.showMessageDialog(null, "happy birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "happy UNbirthday");
	}
	
	}
}

