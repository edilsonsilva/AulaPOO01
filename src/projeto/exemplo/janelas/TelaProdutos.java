package projeto.exemplo.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import projeto.exemplo.sistema.classes.CadLogin;
import projeto.exemplo.sistema.classes.CadastroProduto;
import projeto.exemplo.sistema.classes.Produtos;

public class TelaProdutos extends JFrame{
	private static JFrame frame;
	public static JTable table;
	private static JTextField txtId;
	private static JTextField txtNome;
	private static JTextField txtDescricao;
	private static JTextField txtQuantidade;
	private static JTextField txtPreco;
	
	public TelaProdutos() {
		getContentPane().setLayout(null);
	}

	


	public static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 783, 224);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id do Produto:");
		lblNewLabel.setBounds(10, 22, 115, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto:");
		lblNomeDoProduto.setBounds(10, 59, 100, 14);
		panel.add(lblNomeDoProduto);
		
		JLabel lblDescrioDoProduto = new JLabel("Descri\u00E7\u00E3o do Produto:");
		lblDescrioDoProduto.setBounds(10, 97, 100, 14);
		panel.add(lblDescrioDoProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 137, 115, 14);
		panel.add(lblQuantidade);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setBounds(10, 179, 115, 14);
		panel.add(lblPreo);
		
		txtId = new JTextField();
		txtId.setBounds(10, 36, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(10, 76, 482, 20);
		panel.add(txtNome);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(10, 115, 482, 20);
		panel.add(txtDescricao);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(10, 152, 86, 20);
		panel.add(txtQuantidade);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(10, 193, 86, 20);
		panel.add(txtPreco);
		
		
		JButton btnAt = new JButton("Atualizar");
		btnAt.setBounds(10,225,100,20);
		frame.add(btnAt);
		
		
		btnAt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Produtos pt =  new Produtos();
				pt.setId(Integer.parseInt(txtId.getText()));
				pt.setNome(txtNome.getText());
				pt.setDescricao(txtDescricao.getText());
				pt.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
				pt.setPreco(Double.parseDouble(txtPreco.getText()));
				
				CadastroProduto cp = new CadastroProduto();
				JOptionPane.showMessageDialog(null,cp.atualizar(pt));
			}
		});
		
		
		
		
		JButton btnAp = new JButton("Apagar");
		btnAp.setBounds(130,225,100,20);
		frame.add(btnAp);
		
		
		btnAp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroProduto cp = new CadastroProduto();
				JOptionPane.showMessageDialog(null,cp.apagar(Integer.parseInt(txtId.getText())));
			}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 250, 414, 239);
		frame.getContentPane().add(scrollPane);
		
		CadLogin cl=new CadLogin();	
		Object[] colunas = {"Id","Nome","Descrição","Quantidade","Preço"};
		
		table = new JTable(cl.listar(),colunas);
		scrollPane.setViewportView(table);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int linha = table.getSelectedRow();
				String id=table.getModel().getValueAt(linha,0).toString();
				String nome=table.getModel().getValueAt(linha,1).toString();
				String descricao=table.getModel().getValueAt(linha,2).toString();
				String quantidade=table.getModel().getValueAt(linha,3).toString();
				String preco=table.getModel().getValueAt(linha,4).toString();
				
				txtId.setText(id);
				txtNome.setText(nome);
				txtDescricao.setText(descricao);
				txtQuantidade.setText(quantidade);
				txtPreco.setText(preco);
				
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}
}
