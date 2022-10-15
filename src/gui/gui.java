package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon image = new ImageIcon("spaceman.jpg");
		
		JLabel label = new JLabel();
		label.setText("AYYYYOOOOOOOOO");
		label.setForeground(Color.WHITE);
		//label.setIcon(image);
		
		
		
		
		
		JFrame frame = new JFrame(); //JFrame = a GUI window to add components to
		frame.setVisible(true);
		frame.setSize(980, 600 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Project Astra");
		frame.getContentPane().setBackground(new Color(0x000000));
		frame.add(label);
		
		
		
		ImageIcon spacemanresized = new ImageIcon("spacemanresized.png");
		frame.setIconImage(spacemanresized.getImage());
		
		
		
				
		
	}

}
