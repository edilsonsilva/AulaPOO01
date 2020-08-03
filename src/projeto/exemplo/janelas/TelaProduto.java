package projeto.exemplo.janelas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import projeto.exemplo.sistema.classes.CadastroProduto;
import projeto.exemplo.sistema.classes.Produtos;

public class TelaProduto {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtQuantidade;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProduto window = new TelaProduto();
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
	public TelaProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Produto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 145, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDescrioDoProduto = new JLabel("Descri\u00E7\u00E3o do Produto:");
		lblDescrioDoProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescrioDoProduto.setBounds(10, 65, 145, 14);
		frame.getContentPane().add(lblDescrioDoProduto);
		
		JLabel lblQuantidadeDoProduto = new JLabel("Quantidade do Produto:");
		lblQuantidadeDoProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantidadeDoProduto.setBounds(10, 198, 145, 14);
		frame.getContentPane().add(lblQuantidadeDoProduto);
		
		JLabel lblPreoDoProduto = new JLabel("Pre\u00E7o do Produto:");
		lblPreoDoProduto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPreoDoProduto.setBounds(165, 198, 145, 14);
		frame.getContentPane().add(lblPreoDoProduto);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 34, 413, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JTextArea txtDescricao = new JTextArea();
		txtDescricao.setBounds(10, 80, 413, 107);
		frame.getContentPane().add(txtDescricao);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(10, 223, 112, 20);
		frame.getContentPane().add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(165, 223, 119, 20);
		frame.getContentPane().add(txtPreco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		Produtos prod = new Produtos();
		CadastroProduto cp = new CadastroProduto();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prod.setNome(txtNome.getText());
				prod.setDescricao(txtDescricao.getText());
				prod.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
				prod.setPreco(Double.parseDouble(txtPreco.getText()));
				
				JOptionPane.showMessageDialog(null,cp.cadastro(prod));
				
				
			}
		});
		
		
		btnCadastrar.setBounds(294, 198, 123, 47);
		frame.getContentPane().add(btnCadastrar);
	}
}
