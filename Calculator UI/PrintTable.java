import javax.swing.*;
import java.awt.*;

class FlowLayoutWindow extends JFrame {
	String names[] = { "7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "-" };
	JButton button[] = new JButton[names.length];

	FlowLayoutWindow() {
		setSize(500, 500);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4, 4));

		for (int i = 0; i < names.length; i++) {
			button[i] = new JButton(names[i]);
			button[i].setFont(new Font("", Font.BOLD, 25));
			add(button[i]);
		}
		setVisible(true);

	}
}

class Example {
	public static void main(String[] args) {
		new FlowLayoutWindow();
	}
}