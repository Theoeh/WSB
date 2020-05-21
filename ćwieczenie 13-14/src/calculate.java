import java.awt.EventQueue;

public class calculate {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CalcFrame();
			}
		});
	}
}