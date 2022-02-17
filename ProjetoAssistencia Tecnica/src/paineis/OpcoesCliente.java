package paineis;

import java.awt.*;

import javax.sql.rowset.BaseRowSet;
import javax.swing.*;
import javax.swing.JRadioButton;

import classes.Cliente;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class OpcoesCliente extends JFrame {
	private Button btServicoAD,btVisitaTecnica,btVoltar;
	private ImageIcon imagem;
	private JLabel imagen,clienteLateralSuperior;
	private List<Cliente> clientes;

	public OpcoesCliente(List<Cliente> clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		iniciarComponentes();
		getContentPane().setBackground(Color.black);
		criarEventos();

	}

	private void iniciarComponentes() {
		btServicoAD = new Button("Atendimento Virtual");
		btVisitaTecnica = new Button("Visita Técnica");
		btVoltar = new Button("Voltar");
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		btServicoAD.setFont(new Font("Serif", Font.PLAIN,28));
		btVisitaTecnica.setFont(new Font("Serif", Font.PLAIN,28));
		imagen = new JLabel(imagem);
		
		add(btServicoAD);
		add(btVisitaTecnica);
		add(btVoltar);
		add(imagen);  
		
		
		btServicoAD.setBounds(580,460,300,100);
		btVisitaTecnica.setBounds(1020,460,300,100);
		btVoltar.setBounds(20,20,100,30);
		imagen.setBounds(0,0,1920,1080);
		
		
	}

	private void criarEventos() {
		btServicoAD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelRemotoCliente remoto = new PainelRemotoCliente(clientes);
				setVisible(false);
				remoto.setVisible(true);
				
			} 
		});
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelDeEntrada tela = new PainelDeEntrada(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btVisitaTecnica.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPresencial tela = new PainelPresencial(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
	}
	

}
