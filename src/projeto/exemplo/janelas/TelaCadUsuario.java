package projeto.exemplo.janelas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import projeto.exemplo.sistema.classes.CadLogin;
import projeto.exemplo.sistema.classes.Usuarios;
import javax.swing.DefaultComboBoxModel;

public class TelaCadUsuario extends JFrame {

	private JFrame frmCadastro;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public TelaCadUsuario() {
		setTitle("Cadastro de Usu\u00E1rios");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome de Usu\u00E1rio:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(21, 34, 164, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(21, 91, 164, 14);
		getContentPane().add(lblSenha);
		
		JLabel lblNvelUsurio = new JLabel("N\u00EDvel Usu\u00E1rio:");
		lblNvelUsurio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNvelUsurio.setBounds(21, 160, 164, 14);
		getContentPane().add(lblNvelUsurio);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(21, 50, 343, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(21, 105, 343, 20);
		getContentPane().add(txtSenha);
		
		JComboBox cbxNivel = new JComboBox();
		cbxNivel.setModel(new DefaultComboBoxModel(new String[] {"Vendedor", "Gerente", "Comprador", "Assistente"}));
		cbxNivel.setBounds(21, 174, 343, 20);
		getContentPane().add(cbxNivel);
		
		Usuarios us = new Usuarios();
		
		CadLogin cl = new CadLogin();
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			us.setNomeUsuario(txtUsuario.getText());
			us.setSenha(txtSenha.getText());
			us.setNivelUsuario(cbxNivel.getSelectedItem().toString());
			
			JOptionPane.showMessageDialog(null, cl.cadastrar(us));
		}});
		btnCadastrar.setBounds(138, 215, 113, 23);
		getContentPane().add(btnCadastrar);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("Cadastro Usu\u00E1rio");
		frmCadastro.setBounds(100, 100, 450, 300);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
