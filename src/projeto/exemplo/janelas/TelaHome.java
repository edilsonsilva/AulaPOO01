package projeto.exemplo.janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaHome extends JFrame{

	
	
	
	public JMenuItem mntmNewMenuItem;
	private JFrame frmTelaHome;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public TelaHome() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(46, 68, 300, 86);
		getContentPane().add(lblNewLabel);
		
		JMenuBar mnuPrincipal = new JMenuBar();
		setJMenuBar(mnuPrincipal);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		mnuPrincipal.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Produto");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaProdutos.initialize();
				
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\XOpen\\eclipse-workspace\\POO\\Icons\\b_pdfdoc.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\XOpen\\eclipse-workspace\\POO\\Icons\\b_newtbl.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Fechar");
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\Users\\XOpen\\eclipse-workspace\\POO\\Icons\\b_minus.png"));
		mnNewMenu.add(mntmNewMenuItem_2);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaHome = new JFrame();
		frmTelaHome.setTitle("Tela Home");
		frmTelaHome.setBounds(100, 100, 450, 300);
		frmTelaHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
