

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class calc extends JFrame {
		
			  // Text fields for Number 1, Number 2, and Result
			  private JTextField jtfNum1, jtfNum2, jtfResult;

			  // Buttons "Add", "Subtract", "Multiply" and "Divide"
			  private JButton jbtAdd, jbtSub, jbtMul, jbtDiv, jbtRem, jbtClear;

			  // Main Method
			  public static void main(String[] args) {
				  calc frame = new calc();
			    frame.pack();
			    frame.setTitle("Calculator");
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setLocationRelativeTo(null); // Center the frame
			    frame.setVisible(true);
			  }

			  // Default Constructor
			  public calc() {
			    // Panel p1 to hold text fields and labels
			    JPanel p1 = new JPanel();
			    //p1.setLayout(new FlowLayout(100000000));
			    p1.add(new JLabel("Number 1"));
			    p1.add(jtfNum1 = new JTextField(3));
			    p1.add(new JLabel("Number 2"));
			    p1.add(jtfNum2 = new JTextField(3));
			    p1.add(new JLabel("Result"));
			    p1.add(jtfResult = new JTextField(8));
			    jtfResult.setEditable(false);
			    jtfResult.setHorizontalAlignment(SwingConstants.RIGHT);

			    // Panel p2 to hold buttons
			    JPanel p2 = new JPanel();
			   // p2.setLayout(new FlowLayout());
			    p2.add(jbtAdd = new JButton("Add"));
			    p2.add(jbtSub = new JButton("Subtract"));
			    p2.add(jbtMul = new JButton("Multiply"));
			    p2.add(jbtDiv = new JButton("Divide"));
//			    p2.add(jbtRem = new JButton("Reminder"));
//			    p2.add(jbtClear = new JButton("Clear"));

			    // Set mnemonic keys
			    /*jbtAdd.setMnemonic('A');
			    jbtSub.setMnemonic('S');
			    jbtMul.setMnemonic('M');
			    jbtDiv.setMnemonic('D');*/

			    // Add panels to the frame
			   // setLayout(new BorderLayout());
			    add(p1, BorderLayout.CENTER);
			    add(p2, BorderLayout.SOUTH);

			    // Register listeners
			    jbtAdd.addActionListener(new Listener());
			    jbtSub.addActionListener(new Listener());
			    jbtMul.addActionListener(new Listener());
			    jbtDiv.addActionListener(new Listener());
			    jbtRem.addActionListener(new Listener());
			    jbtClear.addActionListener(new Listener() {
			    	public void actionPerformed(ActionEvent e) {
			    		jtfResult.setText(null);
			    		jtfNum1.setText(null);
			    		jtfNum2.setText(null);
			    	}
			    });
			  }

			  class Listener implements ActionListener {
			    @Override // Handle ActionEvent from buttons and menu items
			    public void actionPerformed(ActionEvent e) {
			      String actionCommand = e.getActionCommand();
			      if ("Add".equals(actionCommand))
			          calculate('+');
			      else if ("Subtract".equals(actionCommand))
			        calculate('-');
			      else if ("Multiply".equals(actionCommand))
			        calculate('*');
			      else if ("Divide".equals(actionCommand))
			        calculate('/');
//			      else if ("Reminder".equals(actionCommand))
//			    	  calculate ('%');
			    }
			  }

			  // Calculate and show the result in jtfResult
			  private void calculate(char operator) {
			    // Obtain Number 1 and Number 2
			    double num1 = new Double(jtfNum1.getText().trim()).doubleValue();
			    double num2 = new Double(jtfNum2.getText().trim()).doubleValue();
			    double result = 0;

			    // Perform selected operation
			    switch (operator) {
			      case '+': result = num1 + num2;
			                break;
			      case '-': result = num1 - num2;
			                break;
			      case '*': result = num1 * num2;
			                break;
			      case '/': result = num1 / num2;
			      			break;
//			      case '%': result = num1 % num2;
//			      			break;
			      
			    }

			    // Set result in jtfResult
			    jtfResult.setText(String.valueOf(result));
			  }
			}
