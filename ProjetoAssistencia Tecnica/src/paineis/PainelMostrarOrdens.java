package paineis;
import classes.Cadastro;
import classes.Cliente;
import java.awt.*;

import javax.swing.*;

import arquivo.LerEscreverArquivo;
import paineis.PainelRemotoCliente;
import classes.Cliente;
import classes.OrdenAD;
import classes.VisitaTecnica;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class PainelMostrarOrdens extends JFrame {
	private JButton btRemoto,btCadastro,btVisita;
	private JTextArea jtaMostrardados;
	private JScrollPane jsMostrar;
	private Button btVoltar;
	private ImageIcon imagem;
	private JLabel imagen;
	LerEscreverArquivo arquivo = new LerEscreverArquivo();
	private List<Cliente> clientes;

	public PainelMostrarOrdens(List<Cliente>clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		AbrirArquivo();
		iniciarComponentes();
		getContentPane().setBackground(Color.pink);
		criarEventos();

	}
	

	private void AbrirArquivo() {
		if (!(arquivo.lerArquivo() == null )) {
			clientes = arquivo.lerArquivo();
			
		}
		
	}


	private void iniciarComponentes() {
		btCadastro = new JButton("Cadastros");
		btRemoto = new JButton("Remoto");
		btVisita = new JButton("Visitas Técnicas");
		jtaMostrardados = new JTextArea();
        jsMostrar = new JScrollPane(jtaMostrardados);
        jtaMostrardados.setEditable(false);	
        btVoltar = new Button("Voltar");
        imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
        imagen = new JLabel(imagem);
        
        add(btCadastro);
        add(btVoltar);
		add(btRemoto);
		add(jsMostrar);
		add(btVisita);
		add(imagen);
		
		
		btVoltar.setBounds(20,20,100,30);
		btRemoto.setBounds(800,430,100,35);
		jsMostrar.setBounds(700,500, 400, 200);
		btCadastro.setBounds(700,430,100,35);
		btVisita.setBounds(900,430,150,35);
		imagen.setBounds(0,0,1920,1080);
	}

	private void criarEventos() {
		btRemoto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrardados.setText("CADASTRO DE ATENDIMENTO REMOTO:");
				for (Cliente clientes : clientes) {
				if (clientes instanceof OrdenAD ) {
					jtaMostrardados.append(clientes.mostrarDados());
				}
				}} 
		});
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OpçoesColaborador tela = new OpçoesColaborador(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		btCadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrardados.setText("CADASTROS:");
				for (Cliente clientes : clientes) {
				if (clientes instanceof Cadastro ) {
					jtaMostrardados.append(clientes.mostrarDados());
				}
				}} 
		});
		btVisita.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrardados.setText("Visitas Técnicas:");
				for (Cliente clientes : clientes) {
				if (clientes instanceof VisitaTecnica ) {
					jtaMostrardados.append(clientes.mostrarDados());
				}
				}} 
		});
	}

}
	


