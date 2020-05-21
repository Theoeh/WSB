import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

// Na bazie zadania jednostki z æwiczeñ 3-4
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
		String opcje[] = {"km","m"};
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
			if(jednostka == "km") {
				c=(double) (l*0.621371192);
				String w = String.valueOf(c);
				wynik.setText("to " +w +" mil");
			}
			else if(jednostka == "m") {
				c=(double) (l*0.000621371192);
				String w = String.valueOf(c);
				wynik.setText("to " +w +" mil");
			}

		}
	}
}
