import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interface extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private static  JTextField p1 = new JTextField();
	private static  JTextField p2 = new JTextField();
	private JButton Addition = new JButton("+");
	private JButton Substraction = new JButton("-");
	private JButton Multiplication = new JButton("*");
	private JLabel Result = new JLabel("Result");
	private JButton Integration = new JButton("Int");
	private JButton Derivation = new JButton("Der");
	private JTextArea Results = new JTextArea();
	private JLabel Polynomial1 = new JLabel("Polynomial 1");
	private JLabel Polynomial2 = new JLabel("Polynomial 2");
		
	Interface() {
			JPanel polyPanel = new JPanel();
			
			this.setSize(460, 300);
			this.add(polyPanel);
			polyPanel.setLayout(null);
			this.setVisible(true);
			this.setTitle("Polynomial Operations");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			int x = (int) ((d.getWidth() - this.getWidth())/ 2);
			int y = (int) ((d.getHeight() - this.getHeight())/ 2);
			this.setLocation(x, y);
//			
			p1.setLocation(110,20);
			p1.setSize(240, 20);
			polyPanel.add(p1);
			p2.setLocation(110,60);
			p2.setSize(240, 20);
			polyPanel.add(p2);			
			Addition.setLocation(20,90);
			Addition.setSize(60, 20);
			polyPanel.add(Addition);			
			Substraction.setLocation(80,90);
			Substraction.setSize(60, 20);
			polyPanel.add(Substraction);
			Multiplication.setLocation(140,90);
			Multiplication.setSize(60, 20);
			polyPanel.add(Multiplication);			
			Integration.setLocation(20,120);
			Integration.setSize(60, 20);
			polyPanel.add(Integration);			
			Derivation.setLocation(80,120);
			Derivation.setSize(60, 20);
			polyPanel.add(Derivation);			
			Results.setLocation(80,150);
			Results.setSize(270, 30);
			Results.setEditable(false);
			polyPanel.add(Results);			
			Result.setLocation(30,150);
			Result.setSize(130, 30);
			polyPanel.add(Result);
			Polynomial1.setLocation(20,20);
			Polynomial1.setSize(150, 30);
			polyPanel.add(Polynomial1);			
			Polynomial2.setLocation(20,50);
			Polynomial2.setSize(150, 30);
			polyPanel.add(Polynomial2);
//			
			}
	
	String getPoly1() {
        return p1.getText();
    }
	
	String getPoly2() {
        return p2.getText();
    }
	
	String Results() {
        return Results.getText();
    }

	void setResults(String st) {
	        Results.setText(st);
	    }
	
	void showError(String errMessage) {
		JOptionPane.showMessageDialog(null,errMessage);
    }

	void addAdditionListener(ActionListener e) {
        Addition.addActionListener(e);
	}
	
	void addSubstractionListener(ActionListener e) {
        Substraction.addActionListener(e);
	}
	
	void addMultiplicationListener(ActionListener e) {
        Multiplication.addActionListener(e);
	}
	
	void addIntegrationListener(ActionListener e) {
        Integration.addActionListener(e);
	}
		
	void addDerivationListener(ActionListener e) {
        Derivation.addActionListener(e);
	}	
}



