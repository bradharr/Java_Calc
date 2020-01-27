package Calculators;

/*
 * Java Calculator to practice Java Skills
 * Bradley Harr
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculatorWindow {

	private JFrame frame;
	private JTextField resultsFieldTxt;
	
	Double firstNum;
	Double secondNum;
	Double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorWindow window = new calculatorWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(254, 408));
		frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setPreferredSize(new Dimension(350, 500));
		frame.getContentPane().setSize(new Dimension(349, 500));
		frame.getContentPane().setLayout(null);
		
		
		//Results Text Field
		resultsFieldTxt = new JTextField();
		resultsFieldTxt.setEditable(false);
		resultsFieldTxt.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		resultsFieldTxt.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		resultsFieldTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		resultsFieldTxt.setBounds(6, 18, 243, 52);
		frame.getContentPane().add(resultsFieldTxt);
		resultsFieldTxt.setColumns(10);
		resultsFieldTxt.setText("0");

		
		//Buttons - Row 1
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String backspace = null;
			
			if(resultsFieldTxt.getText().length() == 1) {
				resultsFieldTxt.setText("0");
			}
			else if(resultsFieldTxt.getText().length() > 1) {
			StringBuilder strB = new StringBuilder(resultsFieldTxt.getText());
			strB.deleteCharAt(resultsFieldTxt.getText().length() - 1);
			backspace = strB.toString();
			resultsFieldTxt.setText(backspace);
			}
			
		}
		});
		btnBack.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnBack.setBounds(6, 83, 60, 60);
		frame.getContentPane().add(btnBack);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultsFieldTxt.setText("0");
				
			}
		});
		btnClear.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnClear.setBounds(67, 83, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultsFieldTxt.getText());
				resultsFieldTxt.setText("0");
				operations = "%";
				
			}
		});
		btnPercent.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPercent.setBounds(128, 83, 60, 60);
		frame.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				firstNum = Double.parseDouble(resultsFieldTxt.getText());
				resultsFieldTxt.setText("0");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPlus.setBounds(189, 83, 60, 60);
		frame.getContentPane().add(btnPlus);

		//Buttons - Row 2		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn7.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn7.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn7.getText();
					resultsFieldTxt.setText(enterNumber);}				
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn7.setBounds(6, 140, 60, 60);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn8.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn8.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn8.getText();
					resultsFieldTxt.setText(enterNumber);}
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn8.setBounds(67, 140, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn9.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn9.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn9.getText();
					resultsFieldTxt.setText(enterNumber);}
				
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn9.setBounds(128, 140, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultsFieldTxt.getText());
				resultsFieldTxt.setText("0");
				operations = "-";
				
			}
		});
		btnMinus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnMinus.setBounds(189, 140, 60, 60);
		frame.getContentPane().add(btnMinus);
		
		//Buttons - Row 3
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn4.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn4.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn4.getText();
					resultsFieldTxt.setText(enterNumber);}
				
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn4.setBounds(6, 197, 60, 60);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn5.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn5.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn5.getText();
					resultsFieldTxt.setText(enterNumber);}
				
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn5.setBounds(67, 197, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn6.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn6.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn6.getText();
					resultsFieldTxt.setText(enterNumber);}
				
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn6.setBounds(128, 197, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultsFieldTxt.getText());
				resultsFieldTxt.setText("0");
				operations = "*";
				
			}
		});
		btnMult.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnMult.setBounds(189, 197, 60, 60);
		frame.getContentPane().add(btnMult);
		
		//Buttons - Row 4
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn1.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn1.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn1.getText();
					resultsFieldTxt.setText(enterNumber);}
				
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn1.setBounds(6, 254, 60, 60);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn2.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn2.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn2.getText();
					resultsFieldTxt.setText(enterNumber);}
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn2.setBounds(67, 254, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn3.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn3.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn3.getText();
					resultsFieldTxt.setText(enterNumber);}
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn3.setBounds(128, 254, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(resultsFieldTxt.getText());
				resultsFieldTxt.setText("0");
				operations = "/";
				
			}
		});
		btnDiv.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnDiv.setBounds(189, 254, 60, 60);
		frame.getContentPane().add(btnDiv);
		
		//Buttons - Row 5
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(resultsFieldTxt.getText().contains(".")) {
					String enterNumber = resultsFieldTxt.getText() + btn0.getText();
					resultsFieldTxt.setText(enterNumber);;
				}
				else if(Integer.parseInt(resultsFieldTxt.getText()) == 0) {
					resultsFieldTxt.setText(btn0.getText());;
				}
				else {
					String enterNumber = resultsFieldTxt.getText() + btn0.getText();
					resultsFieldTxt.setText(enterNumber);}
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btn0.setBounds(6, 311, 60, 60);
		frame.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber = resultsFieldTxt.getText() + btnDot.getText();
				resultsFieldTxt.setText(enterNumber);
				
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnDot.setBounds(67, 311, 60, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(resultsFieldTxt.getText()));
				ops = ops * (-1);
				resultsFieldTxt.setText(String.valueOf(ops));
				
			}
		});
		btnPM.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnPM.setBounds(128, 311, 60, 60);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(resultsFieldTxt.getText());
				if(operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					resultsFieldTxt.setText(answer);
				}
				else if(operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					resultsFieldTxt.setText(answer);
				}
				else if(operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					resultsFieldTxt.setText(answer);
				}
				else if(operations == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					resultsFieldTxt.setText(answer);
				}
				else if(operations == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					resultsFieldTxt.setText(answer);
				}
				
			}
				
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnEqual.setBounds(189, 311, 60, 60);
		frame.getContentPane().add(btnEqual);

	}
	
}
