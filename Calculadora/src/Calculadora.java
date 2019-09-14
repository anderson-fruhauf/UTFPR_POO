import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class Calculadora extends JFrame{
	private JTextField textField;
	private Double valor1, valor2;
	private String sinal;
	
	
	
	public Calculadora() {
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button1.setBounds(21, 128, 46, 23);
		getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		button2.setBounds(74, 128, 46, 23);
		getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button3.setBounds(130, 128, 46, 23);
		getContentPane().add(button3);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button6.setBounds(130, 94, 46, 23);
		getContentPane().add(button6);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button5.setBounds(74, 94, 46, 23);
		getContentPane().add(button5);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button4.setBounds(21, 94, 46, 23);
		getContentPane().add(button4);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button9.setBounds(130, 56, 46, 23);
		getContentPane().add(button9);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button8.setBounds(74, 56, 46, 23);
		getContentPane().add(button8);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button7.setBounds(21, 56, 46, 23);
		getContentPane().add(button7);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setBounds(21, 162, 97, 23);
		getContentPane().add(btn0);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(textField.getText());
				sinal = "+";
				textField.setText("");
			}
		});
		btnPlus.setBounds(186, 128, 52, 57);
		getContentPane().add(btnPlus);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnCe.setBounds(184, 94, 54, 23);
		getContentPane().add(btnCe);
		
		textField = new JTextField();
		textField.setBounds(21, 11, 273, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton(".");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button.setBounds(130, 162, 46, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("=");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(248, 162, 52, 23);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(248, 128, 52, 23);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("*\r\n");
		button_3.setBounds(248, 94, 52, 23);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("/");
		button_4.setBounds(248, 56, 52, 23);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("-");
		button_5.setBounds(186, 56, 52, 23);
		getContentPane().add(button_5);
	}
}
