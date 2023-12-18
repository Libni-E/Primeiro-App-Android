package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import control.IOuvinteBotao;
import model.Pessoa;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TelaCadastroPessoa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	
	//Atrituto que armazena a referencia ao ojbeto que grava a pessoa no banco de dados
	private IOuvinteBotao ouvinteBotao;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa frame = new TelaCadastroPessoa();
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
	private TelaCadastroPessoa() {
		setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 12));
		setBackground(new Color(192, 192, 192));
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(10, 10, 45, 13);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(10, 48, 45, 13);
		contentPane.add(lblTelefone);
		
		txtNome = new JTextField();
		txtNome.setHorizontalAlignment(SwingConstants.LEFT);
		txtNome.setBounds(65, 7, 374, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		txtTelefone.setBounds(65, 45, 374, 19);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnCadastra = new JButton("Cadastra");
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastra();
				
			}
		});
		btnCadastra.setBounds(354, 74, 85, 21);
		contentPane.add(btnCadastra);
	}
	
	public TelaCadastroPessoa(IOuvinteBotao ouvinteBotao) {
		this();
		this.ouvinteBotao = ouvinteBotao;
	}
	private void cadastra() {
		String nome = txtNome.getText();
		int telefone = Integer.parseInt(txtTelefone.getText());
		Pessoa p = new Pessoa (nome, telefone);
		ouvinteBotao.gravaPessoa(p);
	}
}
