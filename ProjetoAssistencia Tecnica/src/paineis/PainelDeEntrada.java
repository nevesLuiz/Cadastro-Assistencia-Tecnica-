package paineis;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Cliente;
import tela.TelaProjetoSemestre;

public class PainelDeEntrada extends JFrame {
	private JLabel jlEscolha,imagen;
	private Button btColaborador,btCliente,btVoltar;
	private ImageIcon imagem;
	private List<Cliente> clientes = new ArrayList<>();
	
	public PainelDeEntrada(List<Cliente> clientes) {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		this.clientes = clientes;
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		btColaborador = new Button("Colaborador");
		btVoltar = new Button("Voltar");
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);
		jlEscolha = new JLabel("ENTRE COM A OPÇÃO DESEJADA");
		jlEscolha.setForeground(Color.white);
		jlEscolha.setFont(new Font("Serif", Font.BOLD,66));
		btCliente = new Button("Cliente");
		btCliente.setFont(new Font("Serif", Font.PLAIN,28));
		btColaborador.setFont(new Font("Serif", Font.PLAIN,28));
		
		add(btCliente);
		add(btColaborador);
		add(btVoltar);
		add(jlEscolha);
		add(imagen);
		
		jlEscolha.setBounds(440,450,1100,80);
		btCliente.setBounds(580,560,300,100);
		btColaborador.setBounds(1020,560,300,100);
		btVoltar.setBounds(20,20,100,30);
		imagen.setBounds(0,0,1920,1080);
		
	}

	private void criarEventos() {
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaProjetoSemestre tela = new TelaProjetoSemestre("Tela Teste");
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelLoginCliente carro = new PainelLoginCliente(clientes);
				setVisible(false);
				carro.setVisible(true);
				
				
			} 
		});
		btColaborador.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelLoginColaborador colaborador = new PainelLoginColaborador(clientes);
				setVisible(false);
				colaborador.setVisible(true);
				
				
			} 
		});
		
	}

}
