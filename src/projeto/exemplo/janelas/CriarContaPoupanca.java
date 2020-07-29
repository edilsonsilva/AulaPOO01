package projeto.exemplo.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import projeto.exemplo.heranca.Poupanca;

public class CriarContaPoupanca extends JFrame{

	//Vamos criar uma vari�vel para ajudar a construtir
			//um hist�rico de opera��es
			private static String historico = "";
	
	
	public static void main(String[] args) {
		
		Poupanca pp = new Poupanca();
		
		JFrame janela = new JFrame();
		janela.setTitle("Poupan�a");
		janela.setSize(400, 500);
		
		//Gerenciador de tela
		janela.getContentPane().setLayout(null);
		
		JLabel lblBanco = new JLabel("N�Banco");
		lblBanco.setBounds(10, 30, 80, 20);
		janela.add(lblBanco);
		
		JTextField txtBanco = new JTextField();
		txtBanco.setBounds(70,30,80,20);
		janela.add(txtBanco);
		
		
		
		JLabel lblAgencia = new JLabel("N�Ag�ncia");
		lblAgencia.setBounds(10, 50, 80, 20);
		janela.add(lblAgencia);
		
		JTextField txtAgencia = new JTextField();
		txtAgencia.setBounds(70,50,80,20);
		janela.add(txtAgencia);
		
		
		
		
		JLabel lblConta = new JLabel("N�Conta");
		lblConta.setBounds(10, 70, 80, 20);
		janela.add(lblConta);
		
		JTextField txtConta = new JTextField();
		txtConta.setBounds(70,70,80,20);
		janela.add(txtConta);
		
		
		
		JLabel lblTitular = new JLabel("Titular");
		lblTitular.setBounds(10, 90, 80, 20);
		janela.add(lblTitular);
		
		JTextField txtTitular = new JTextField();
		txtTitular.setBounds(70,90,80,20);
		janela.add(txtTitular);
		
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(10, 110, 80, 20);
		janela.add(lblSaldo);
		
		JTextField txtSaldo = new JTextField();
		txtSaldo.setBounds(70,110,80,20);
		janela.add(txtSaldo);
		
		
		JButton btnAbrirConta = new JButton("Abrir Conta");
		btnAbrirConta.setBounds(10,140,100,20);
		janela.add(btnAbrirConta);
		
		
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(10, 170, 100, 20);
		janela.add(lblValor);
		
		JTextField txtValor = new JTextField();
		txtValor.setBounds(90,170,100,20);
		janela.add(txtValor);
		
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(10,200,100,20);
		janela.add(btnDepositar);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.setBounds(120,200,100,20);
		janela.add(btnSacar);
		
		JButton btnVerificarSaldo = new JButton("Verificar Saldo");
		btnVerificarSaldo.setBounds(230,200,140,20);
		janela.add(btnVerificarSaldo);
		
		
		JTextField txtResultado = new JTextField();
		txtResultado.setBounds(10,230,360,200);
		janela.add(txtResultado);	
		
		/*
		 * desabilitar os bot�es e caixas de texto na
		 * inicializa��o do projeto
		 * 
		 */
		txtValor.setEnabled(false);
		txtResultado.setEnabled(false);
		btnDepositar.setEnabled(false);
		btnSacar.setEnabled(false);
		btnVerificarSaldo.setEnabled(false);
		
		
		/*
		 * Ao clicar no bot�o abrir conta iremos exibir uma 
		 * mensagem de confirma��o ao usu�rio e iremos desabilitar
		 * as caixas acima e o bot�o abrirconta e habilitar os 
		 * bot�es depositar e sacar
		 */
		
		btnAbrirConta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Voc� abriu uma conta", "Aten��o", JOptionPane.INFORMATION_MESSAGE);
				
				//Passar todos os dados para a conta poupan�a
				pp.setnBanco(Integer.parseInt(txtBanco.getText()));
				pp.setnAgencia(Integer.parseInt(txtAgencia.getText()));
				pp.setnConta(Integer.parseInt(txtConta.getText()));
				pp.setTitular(txtTitular.getText());
				pp.setSaldo(Double.parseDouble(txtSaldo.getText()));
				
				/*
				 * Habilitar as caixas e bot�es desabilitados e 
				 * desabilitar as caixas e bot�es habilitados
				 */
				txtBanco.setEnabled(false);
				txtAgencia.setEnabled(false);
				txtConta.setEnabled(false);
				txtTitular.setEnabled(false);
				txtSaldo.setEnabled(false);
				btnAbrirConta.setEnabled(false);
				
				
				txtValor.setEnabled(true);
				txtResultado.setEnabled(true);
				btnDepositar.setEnabled(true);
				btnSacar.setEnabled(true);
				btnVerificarSaldo.setEnabled(true);
				
			}
		});
		
		
		
		
		
		//codifica��o do bot�o verificar saldo
		
		btnVerificarSaldo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				historico+=pp.verificarSaldo()+"\r\n";
				txtResultado.setText(historico);
				
			}
		});
		
		//codifica��o do bot�o sacar 
		btnSacar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				historico += pp.sacar(Double.parseDouble(txtValor.getText()))+"\r\n";
				txtResultado.setText(historico);
				
				
			}
		});
		
		
		//codifica��o do bot�o depositar
		btnDepositar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				historico+=pp.depositar(Double.parseDouble(txtValor.getText()))+"\r\n";
				txtResultado.setText(historico);
				
				
			}
		});
		
		
		
		
		janela.setVisible(true);
		janela.setDefaultCloseOperation(3);

	}

}
