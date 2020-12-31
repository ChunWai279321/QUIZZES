import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Quiz3 {

	private JFrame frmWaterCalculator;
	private JTextField textField1;
	//private final JButton btnTellMe = new JButton("Tell Me");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz3 window = new Quiz3();
					window.frmWaterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaterCalculator = new JFrame();
		frmWaterCalculator.setFont(new Font("Dialog", Font.PLAIN, 12));
		frmWaterCalculator.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		frmWaterCalculator.setForeground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		frmWaterCalculator.setTitle("Water Calculator");
		frmWaterCalculator.setBounds(100, 100, 450, 300);
		frmWaterCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnHowMuchWater = new JTextPane();
		txtpnHowMuchWater.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnHowMuchWater.setBackground(SystemColor.menu);
		txtpnHowMuchWater.setText("How much water should I drink?");
		txtpnHowMuchWater.setEditable(false);
		
		JTextPane txtpnMyWeight = new JTextPane();
		txtpnMyWeight.setBackground(SystemColor.menu);
		txtpnMyWeight.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnMyWeight.setText("My weight (kg):");
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField1.setColumns(10);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double weight = 0,water;
				try {
					weight=Double.parseDouble(textField1.getText());
					water=weight/25;
					JOptionPane.showMessageDialog(null,"Buddy, you should drink "+water+" L of water a day!");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Please enter your weight");
				}
				
				
			}
		});
		btnTellMe.setForeground(new Color(0, 0, 0));
		btnTellMe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTellMe.setBackground(UIManager.getColor("Button.light"));
		GroupLayout groupLayout = new GroupLayout(frmWaterCalculator.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(81)
							.addComponent(txtpnHowMuchWater, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(97)
							.addComponent(txtpnMyWeight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(136)
							.addComponent(btnTellMe, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(txtpnHowMuchWater, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField1)
						.addComponent(txtpnMyWeight))
					.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
					.addComponent(btnTellMe, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(50))
		);
		frmWaterCalculator.getContentPane().setLayout(groupLayout);
	}
}
