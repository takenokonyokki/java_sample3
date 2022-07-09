import java.awt.FlowLayout;
import javax.swing.*;

public class Gui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World");
		JButton button = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
	}
} 