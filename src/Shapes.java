/*
 * 
 * 
 * */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Shapes {
	
	
	private static ShapesPanel panel;
	

	Shapes(){
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800,400);
		frame.setTitle("Network Project HABEEB");
		frame.setLocationRelativeTo(null);
	    panel = new ShapesPanel();
		frame.add(panel);
		

		JLabel label = new JLabel("Emission rate", SwingConstants.LEFT);
		panel.add(label);
		//JComboBox
        String[] emissionRate = {"100 packet/s", "300 packet/s", "500 packet/s"};
        JComboBox<String> jComboBox = new JComboBox<>(emissionRate);
        jComboBox.setBounds(80, 50, 140, 20);
        panel.add(jComboBox);

	    
	    
	    
		JLabel label2 = new JLabel("Transmission rate", SwingConstants.LEFT);
		panel.add(label2);
		//JComboBox
        String[] transmissionRate = {"300 packet/s", "500 packet/s", "800 packet/s"};
        JComboBox<String> jComboBox2 = new JComboBox<>(transmissionRate);
        jComboBox2.setBounds(80, 50, 140, 20);
        panel.add(jComboBox2);
		
		
		//button
        JButton button = new JButton("Start");
	    panel.add(button);
		
		//button
	    JButton button2 = new JButton("Reset");
	    panel.add(button2);
	    
	    
		JLabel label3 = new JLabel("msec", SwingConstants.LEFT);
		label3.setBounds(0, 700, 90, 20);
		panel.add(label3);
	    
		
		button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected =  jComboBox.getItemAt(jComboBox.getSelectedIndex());
                label3.setText("it's work...");
                
                
                //runProg();
                
            }
        });


		//JPanel panel2 = new JPanel();
		//frame.add(panel2);
	      
//		
//	    JPanel panel2 = new JPanel();
//	      frame.getContentPane();

//	      Dimension size = button.getPreferredSize();
//	      button.setBounds(300, 180, size.width, size.height);
//	      panel2.setLayout(null);
//	      panel2.add(button);
//	      panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		//DrawCable p = new DrawCable();

		
		frame.setVisible(true);
		
		while (true) {
			panel.moveRec();
			panel.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
//	protected static void runProg() {
//		while (true) {
//			panel.moveRec();
//			panel.repaint();
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}

}
