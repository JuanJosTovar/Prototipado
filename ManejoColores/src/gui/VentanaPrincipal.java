package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTexto;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JButton btnOpaco;
	private JButton btnTransparente;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTexto = new JTextField();
		textTexto.setBounds(164, 36, 179, 20);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(33, 112, 89, 23);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		JLabel lblNewLabel = new JLabel("Color Texto");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(210, 81, 89, 14);
		contentPane.add(lblNewLabel);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(210, 112, 89, 23);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(384, 112, 89, 23);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		JLabel lblNewLabel_1 = new JLabel("Color Fondo");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(210, 220, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		btnFondoAzul = new JButton("Azul");
		btnFondoAzul.setBounds(33, 256, 89, 23);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Rojo");
		btnFondoRojo.setBounds(210, 256, 89, 23);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Verde");
		btnFondoVerde.setBounds(384, 256, 89, 23);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnOpaco = new JButton("Opaco");
		btnOpaco.setBounds(102, 341, 89, 23);
		btnOpaco.addActionListener(this);
		contentPane.add(btnOpaco);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(298, 341, 121, 23);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == btnAzul) {
			 textTexto.setForeground(Color.BLUE);
		 }else if(e.getSource() == btnRojo) {
			 textTexto.setForeground(Color.RED);
		 }else if(e.getSource() == btnVerde) {
			 textTexto.setForeground(Color.GREEN);
		 }else if(e.getSource() == btnFondoAzul) {
			 textTexto.setBackground(Color.BLUE);
		 }else if(e.getSource() == btnFondoRojo) {
			 textTexto.setBackground(Color.RED);
		 }else if(e.getSource() == btnFondoVerde) {
			 textTexto.setBackground(Color.GREEN);
		 } 
		 
		 if(e.getSource() == btnOpaco) {
			 textTexto.setOpaque(true);
		 }else if(e.getSource() == btnTransparente) {
			 textTexto.setOpaque(false);
		 }
		
	}
}
