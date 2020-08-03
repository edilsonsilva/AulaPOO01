package projeto.exemplo.janelas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import projeto.exemplo.sistema.classes.CadCliente;

public class CadastroCliente {

	private JFrame frmCadastroDeClientes;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtDN;
	private JTextField txtEmail;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCEP;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JPasswordField txtConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente window = new CadastroCliente();
					window.frmCadastroDeClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeClientes = new JFrame();
		frmCadastroDeClientes.setResizable(false);
		frmCadastroDeClientes.setTitle("Cadastro de Clientes");
		frmCadastroDeClientes.setBounds(100, 100, 579, 681);
		frmCadastroDeClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeClientes.getContentPane().setLayout(null);
		
		JPanel pnlDadosPessoais = new JPanel();
		pnlDadosPessoais.setBorder(new LineBorder(Color.GRAY));
		pnlDadosPessoais.setBounds(10, 51, 542, 146);
		frmCadastroDeClientes.getContentPane().add(pnlDadosPessoais);
		pnlDadosPessoais.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Cliente:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 116, 14);
		pnlDadosPessoais.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 47, 116, 14);
		pnlDadosPessoais.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sexo:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(10, 90, 116, 14);
		pnlDadosPessoais.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(227, 90, 116, 14);
		pnlDadosPessoais.add(lblNewLabel_1_1_1_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 26, 522, 20);
		pnlDadosPessoais.add(txtNome);
		txtNome.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(10, 62, 522, 20);
		pnlDadosPessoais.add(txtCPF);
		
		JComboBox cbxSexo = new JComboBox();
		cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		cbxSexo.setBounds(10, 113, 204, 22);
		pnlDadosPessoais.add(cbxSexo);
		
		txtDN = new JTextField();
		txtDN.setBounds(227, 114, 305, 20);
		pnlDadosPessoais.add(txtDN);
		txtDN.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dados Pessoais");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 25, 138, 24);
		frmCadastroDeClientes.getContentPane().add(lblNewLabel);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContato.setBounds(10, 208, 138, 24);
		frmCadastroDeClientes.getContentPane().add(lblContato);
		
		JPanel pnlContato = new JPanel();
		pnlContato.setBorder(new LineBorder(Color.GRAY));
		pnlContato.setBounds(10, 234, 542, 62);
		frmCadastroDeClientes.getContentPane().add(pnlContato);
		pnlContato.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Telefone:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 11, 116, 14);
		pnlContato.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("E-Mail:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(214, 11, 116, 14);
		pnlContato.add(lblNewLabel_1_2_1);
		
		JFormattedTextField txtTelefone = new JFormattedTextField();
		txtTelefone.setBounds(10, 31, 183, 20);
		pnlContato.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(214, 31, 318, 20);
		pnlContato.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereo.setBounds(10, 307, 138, 24);
		frmCadastroDeClientes.getContentPane().add(lblEndereo);
		
		JPanel pnlEndereco = new JPanel();
		pnlEndereco.setBorder(new LineBorder(Color.GRAY));
		pnlEndereco.setBounds(10, 342, 542, 167);
		frmCadastroDeClientes.getContentPane().add(pnlEndereco);
		pnlEndereco.setLayout(null);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Tipo:");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(10, 11, 116, 14);
		pnlEndereco.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Logradouro:");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1.setBounds(173, 11, 116, 14);
		pnlEndereco.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("N\u00FAmero:");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1.setBounds(10, 71, 116, 14);
		pnlEndereco.add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("Complemento:");
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1_1.setBounds(110, 71, 116, 14);
		pnlEndereco.add(lblNewLabel_1_2_2_1_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("Bairro:");
		lblNewLabel_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1_1_1.setBounds(10, 118, 116, 14);
		pnlEndereco.add(lblNewLabel_1_2_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1_1 = new JLabel("CEP:");
		lblNewLabel_1_2_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1_1_1_1.setBounds(335, 118, 116, 14);
		pnlEndereco.add(lblNewLabel_1_2_2_1_1_1_1_1);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setModel(new DefaultComboBoxModel(new String[] {"Rua", "Av", "AL", "Viela", "Pra\u00E7a"}));
		cbxTipo.setBounds(10, 30, 146, 22);
		pnlEndereco.add(cbxTipo);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(172, 31, 360, 20);
		pnlEndereco.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(10, 85, 86, 20);
		pnlEndereco.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(110, 87, 422, 20);
		pnlEndereco.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(10, 133, 315, 20);
		pnlEndereco.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(335, 133, 197, 20);
		pnlEndereco.add(txtCEP);
		txtCEP.setColumns(10);
		
		JLabel lblAcesso = new JLabel("Acesso");
		lblAcesso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAcesso.setBounds(10, 520, 138, 24);
		frmCadastroDeClientes.getContentPane().add(lblAcesso);
		
		JPanel pnlAcesso = new JPanel();
		pnlAcesso.setBorder(new LineBorder(Color.GRAY));
		pnlAcesso.setBounds(10, 544, 542, 62);
		frmCadastroDeClientes.getContentPane().add(pnlAcesso);
		pnlAcesso.setLayout(null);
		
		JLabel lblNewLabel_1_2_2_1_1_2 = new JLabel("Nomede Usu\u00E1rio:");
		lblNewLabel_1_2_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1_2.setBounds(10, 11, 116, 14);
		pnlAcesso.add(lblNewLabel_1_2_2_1_1_2);
		
		JLabel lblNewLabel_1_2_2_1_1_2_1 = new JLabel("Senha:");
		lblNewLabel_1_2_2_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1_2_1.setBounds(205, 11, 116, 14);
		pnlAcesso.add(lblNewLabel_1_2_2_1_1_2_1);
		
		JLabel lblNewLabel_1_2_2_1_1_2_1_1 = new JLabel("Confirmar Senha:");
		lblNewLabel_1_2_2_1_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1_2_1_1.setBounds(376, 11, 116, 14);
		pnlAcesso.add(lblNewLabel_1_2_2_1_1_2_1_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 31, 179, 20);
		pnlAcesso.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(200, 31, 146, 20);
		pnlAcesso.add(txtSenha);
		
		txtConfirmar = new JPasswordField();
		txtConfirmar.setBounds(376, 31, 156, 20);
		pnlAcesso.add(txtConfirmar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		CadCliente cli = new CadCliente();
		projeto.exemplo.sistema.classes.CadastroCliente cad = new projeto.exemplo.sistema.classes.CadastroCliente();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtSenha.getText().equals(txtConfirmar.getText())){
					cli.setNome(txtNome.getText());
					cli.setCPF(txtCPF.getText());
					cli.setSexo(cbxSexo.getSelectedItem().toString());
					cli.setDataNascimento(txtDN.getText());
					cli.setTelefone(txtTelefone.getText());
					cli.setEmail(txtEmail.getText());
					cli.setTipo(cbxTipo.getSelectedItem().toString());
					cli.setLogradouro(txtLogradouro.getText());
					cli.setNumero(txtNumero.getText());
					cli.setComplemento(txtComplemento.getText());
					cli.setBairro(txtBairro.getText());
					cli.setCep(txtCEP.getText());
					cli.setUsuario(txtUsuario.getText());
					cli.setSenha(txtSenha.getText());
					
					cad.cadastrar(cli);
					
					JOptionPane.showMessageDialog(null, "Dados Gravados com sucesso!");				
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "As senhas devem ser iguais");
				}
			}
		});
		
		btnCadastrar.setBounds(236, 617, 89, 23);
		frmCadastroDeClientes.getContentPane().add(btnCadastrar);
	}
}
