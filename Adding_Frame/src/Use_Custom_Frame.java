import java.awt.Window;

import javax.swing.*;
public class Use_Custom_Frame extends JFrame {
	public Use_Custom_Frame()
	{
		JButton jbt= new JButton("Okay!");
		JLabel jbl= new JLabel("Enter your name:");
		JTextField jtname= new JTextField("Type your name here.");
		JCheckBox jcbox= new JCheckBox("Bold");
		JRadioButton jrbRed= new JRadioButton("Red");
		JComboBox JcboColor= new JComboBox(new String[]{"Red","Green","Blue"});
		
		JPanel panel=new JPanel();
		panel.add(jbt);
		panel.add(jbl);
		panel.add(jtname);
		panel.add(jcbox);
		panel.add(jrbRed);
		panel.add(jtname);
		panel.add(JcboColor);
		panel.setSize(50,500);
		add(panel);
		setSize(450,200);
		//jbt.addActionListener(OkListenerClass);
		//frame.setVisible(true);
		OKListenerClass l1= new OKListenerClass();
		jbt.addActionListener(l1);
		Window frame;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);
	}

}
