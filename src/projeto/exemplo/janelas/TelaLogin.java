package projeto.exemplo.janelas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import projeto.exemplo.sistema.classes.CadLogin;
import projeto.exemplo.sistema.classes.Usuarios;

public class TelaLogin extends JFrame{

	private JFrame frmTelaDeLogin;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmTelaDeLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		setTitle("Tela de Login");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome de Usu\u00E1rio:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(32, 42, 164, 14);
		getContentPane().add(lblNewLabel);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(32, 58, 343, 20);
		getContentPane().add(txtUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(32, 99, 164, 14);
		getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(32, 113, 343, 20);
		getContentPane().add(txtSenha);
		
		
		Usuarios us = new Usuarios();
		CadLogin cl = new CadLogin();
		
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				us.setNomeUsuario(txtUsuario.getText());
				us.setSenha(txtSenha.getText());
				
				if(cl.logar(us)) {
					TelaHome th = new TelaHome();
					th.setVisible(true);
					th.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Não foi possível logar.\nUsuário ou senha incorreto");
				}
				
			}
		});
		btnLogar.setBounds(159, 181, 89, 23);
		getContentPane().add(btnLogar);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeLogin = new JFrame();
		frmTelaDeLogin.setTitle("Tela de Login");
		frmTelaDeLogin.setBounds(100, 100, 450, 300);
		frmTelaDeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
