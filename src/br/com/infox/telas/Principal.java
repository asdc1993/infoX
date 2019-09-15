package br.com.infox.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.infox.telas.Sobre;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private final JLabel lblData = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				alterarLabel();
			}
		});
		setTitle("infoX - Sistema para controle de OS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSobre = new JButton("");
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/about.png")));
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
				
			}
		});
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBounds(681, 37, 64, 64);
		contentPane.add(btnSobre);
		
		JButton btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(br.com.infox.telas.Principal.class.getResource("/br/com/infox/icones/cliente.png")));
		btnClientes.setToolTipText("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes clientes = new Clientes();
				clientes.setVisible(true);
			}
		});
		btnClientes.setBounds(79, 84, 128, 128);
		contentPane.add(btnClientes);
		
		JButton btnOs = new JButton("");
		btnOs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Os os = new Os();
				os.setVisible(true);
			}
		});
		btnOs.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/printer.png")));
		btnOs.setToolTipText("Ordem de Servi\u00E7o");
		btnOs.setBounds(232, 84, 128, 128);
		contentPane.add(btnOs);
		
		JButton btnUsuarios = new JButton("");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true);
		    }
		});
		btnUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/users.png")));
		btnUsuarios.setToolTipText("Usuarios");
		btnUsuarios.setBounds(79, 240, 128, 128);
		contentPane.add(btnUsuarios);
		
		JButton btnRelatorios = new JButton("");
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorios relatorios = new Relatorios();
				relatorios.setVisible(true);
			}
		});
		btnRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/report2.png")));
		btnRelatorios.setToolTipText("Relatorios");
		btnRelatorios.setBounds(232, 240, 128, 128);
		contentPane.add(btnRelatorios);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icones/x.png")));
		lblNewLabel.setBounds(504, 240, 256, 256);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 520, 794, 51);
		contentPane.add(panel);	
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setForeground(SystemColor.text);
		lblData.setBounds(130, 0, 564, 33);
		panel.setLayout(null);
		panel.add(lblData);
		
	}
		private void alterarLabel() {
			Date data = new Date();
			DateFormat formatador =
            DateFormat.getDateInstance(DateFormat.FULL);
			lblData.setText(formatador.format(data));
		}
}

