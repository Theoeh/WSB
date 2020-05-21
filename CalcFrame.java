import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcFrame extends JFrame implements ActionListener{
	JTextField wpiszTekst;
	JButton action = new JButton("Oblicz");
	JComboBox jednostki;
	JLabel wynik;
	public CalcFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (550,100);
		setLocation(300,300);
		setLayout(new FlowLayout());
		wpiszTekst = new JTextField(10);
		add(wpiszTekst);
		add(new JLabel(" "));
		String opcje[] = {"stopnie","radiany"};
		jednostki = new JComboBox(opcje);
		jednostki.setBounds(50, 50, 70, 30);
		add(jednostki);
		wynik = new JLabel("    ");
		add(wynik);
		add(action);
		action.addActionListener((ActionListener)this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == action) {
			String liczba = wpiszTekst.getText();
			String jednostka = jednostki.getSelectedItem().toString();
			int l = Integer.parseInt(liczba);
			double c = 0;
			if(jednostka == "stopnie") {
				c=(double) ((l*Math.PI)/180);
				String w = String.valueOf(c);
				wynik.setText("to " +w +" radianów");
			}
			else if(jednostka == "radiany") {
				c=(double) ((l*180)/Math.PI);
				String w = String.valueOf(c);
				wynik.setText("to " +w +" stopni");
			}

		}
	}
}