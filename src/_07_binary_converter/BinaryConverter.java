package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JTextField text = new JTextField(15);
	JLabel label = new JLabel();
	public void showButton() {
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(text);
		panel.add(label);
		JButton button = new JButton();
		panel.add(button);
		frame.pack();
		button.addActionListener(this);
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	                                       

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String answer = text.getText();
		System.out.println(answer);
		answer = convert(answer);
		label.setText(answer);
		frame.pack();
	}
}
