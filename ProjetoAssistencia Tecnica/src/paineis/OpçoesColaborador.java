package paineis;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import classes.Cliente;

public class OpçoesColaborador extends JFrame {
	private Button btPesquisa,btCadastroPresencial,btOrdens,btVoltar,btdeletar,btAlterar;
	private ImageIcon imagem;
	private JLabel imagen,colaboradorLateralSuperior;
	
	private List<Cliente> clientes;

	public OpçoesColaborador(List<Cliente> clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		iniciarComponentes();
		getContentPane().setBackground(Color.yellow);
		criarEventos();
		setLocationRelativeTo(getContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void iniciarComponentes() {
		//Objetos
		btCadastroPresencial = new Button("Cadastrar");
		btCadastroPresencial.setFont(new Font("Serif", Font.BOLD, 22));
		btOrdens = new Button("Ordens");
		btOrdens.setFont(new Font("Serif", Font.BOLD, 22));
		btPesquisa = new Button("Pesquisar");
		btPesquisa.setFont(new Font("Serif", Font.BOLD, 22));
		btVoltar = new Button("Voltar");
		btAlterar = new Button("Alterar");
		btAlterar.setFont(new Font("Serif", Font.BOLD, 22));
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		colaboradorLateralSuperior = new JLabel("Colaborador: ");
		imagen=  new JLabel(imagem);
		btdeletar = new Button("Deletar");
		btdeletar.setFont(new Font("Serif", Font.BOLD, 22));
		//adds
		add(btdeletar);
		add(btCadastroPresencial);
		add(btOrdens);
		add(btPesquisa);
		add(btVoltar);
		add(btAlterar);
		add(imagen);
		add(colaboradorLateralSuperior);
		//Bounds
		btCadastroPresencial.setBounds(700, 640, 200, 80);
		btOrdens.setBounds(700, 500, 200, 80);
		btPesquisa.setBounds(1000,500,200,80);
		btdeletar.setBounds(1000,640,200,80);
		btAlterar.setBounds(850, 400, 200, 80);
		btVoltar.setBounds(20,20,100,30);
		imagen.setBounds(0,0,1920,1080);
		
	}

	private void criarEventos() {
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelDeEntrada tela = new PainelDeEntrada(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btOrdens.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelMostrarOrdens tela = new PainelMostrarOrdens(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btCadastroPresencial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastroPresencial tela = new PainelCadastroPresencial(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btPesquisa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisar tela = new PainelPesquisar(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btdeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelDeletar tela = new PainelDeletar(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PainelRemotoCliente tela = new PainelRemotoCliente(clientes);
				setVisible(false);
				tela.preencherDados();
				tela.setVisible(true);
				
				
			}
		});
	
		
		
		
	}
	

}
