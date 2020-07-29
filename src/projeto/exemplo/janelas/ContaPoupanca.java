package projeto.exemplo.janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ContaPoupanca {

	private JFrame frame;
	private JTextField txtBanco;
	private JTextField txtAgencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContaPoupanca window = new ContaPoupanca();
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
	public ContaPoupanca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 763, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero do Banco");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 108, 27);
		frame.getContentPane().add(lblNewLabel);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(128, 12, 303, 24);
		frame.getContentPane().add(txtBanco);
		txtBanco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero da Ag\u00EAncia");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 49, 121, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtAgencia = new JTextField();
		txtAgencia.setBounds(127, 49, 308, 27);
		frame.getContentPane().add(txtAgencia);
		txtAgencia.setColumns(10);
		
		JButton btnAbrirConta = new JButton("Abrir Conta");
		btnAbrirConta.setBounds(128, 94, 255, 37);
		frame.getContentPane().add(btnAbrirConta);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(126, 136, 570, 287);
		frame.getContentPane().add(txtResultado);
	}
}
