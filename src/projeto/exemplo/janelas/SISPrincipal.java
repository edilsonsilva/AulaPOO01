package projeto.exemplo.janelas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class SISPrincipal extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SISPrincipal frame = new SISPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SISPrincipal() {
		setBounds(100, 100, 450, 300);

	}

}
