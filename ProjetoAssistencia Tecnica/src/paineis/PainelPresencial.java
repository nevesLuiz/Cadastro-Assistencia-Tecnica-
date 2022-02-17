package paineis;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import arquivo.LerEscreverArquivo;
import classes.Cadastro;
import classes.Cliente;
import classes.VisitaTecnica;

public class PainelPresencial extends JFrame {	
	private JLabel jlnome,jlendereço,jlBairro,jlNumero,jlReferencia,jlCEP,jlTipoMaquina,jlDescricao,jlSOLICITAR,jlDia,jlHorario;
	private JTextField jtfNome,jtfBairro,jtfNumero,jtfReferencia,jtfCEP,jtfendereco,jtfDia;
	private JTextArea jtfDescricao;
	private JRadioButton rbDesktop,rbNootbook,rb1630,rb0900,rb1300;
	private ButtonGroup rbMAquina,rbHorario;
	private Button botao,btVoltar;
	private ImageIcon imagem;
	private JLabel imagen;
	private List<Cliente>clientes = new ArrayList<>();
	LerEscreverArquivo arquivo = new LerEscreverArquivo();

	public PainelPresencial(List<Cliente>clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		AbrirArquivo();
        iniciarComponentes();
        getContentPane().setBackground(Color.cyan);
        criarEventos();
	}
	private void AbrirArquivo() {
		
		
	}
	private void iniciarComponentes() {
		jlHorario = new JLabel("Horario");
		jlHorario.setFont(new Font("Serif",Font.BOLD,26));
		jlHorario.setForeground(Color.red);
		jlnome = new JLabel("Nome");
		jlnome.setFont(new Font("Serif",Font.BOLD,26));
		jlnome.setForeground(Color.red);
		jlendereço = new JLabel("Endereço");
		jlendereço.setFont(new Font("Serif",Font.BOLD,26));
		jlendereço.setForeground(Color.red);
		jlDia = new JLabel("Dia");
		jlDia.setFont(new Font("Serif",Font.BOLD,26));
		jlDia.setForeground(Color.red);
		jlBairro = new JLabel("Bairro");
		jlBairro.setFont(new Font("Serif",Font.BOLD,26));
		jlBairro.setForeground(Color.red);
		jlNumero = new JLabel("Numero");
		jlNumero.setFont(new Font("Serif",Font.BOLD,26));
		jlNumero.setForeground(Color.red);
		jlReferencia = new JLabel("Referencia");
		jlReferencia.setFont(new Font("Serif",Font.BOLD,26));
		jlReferencia.setForeground(Color.red);
		jlCEP = new JLabel("CEP");
		jlCEP.setFont(new Font("Serif",Font.BOLD,26));
		jlCEP.setForeground(Color.red);
		jlTipoMaquina = new JLabel("Tipo de Maquina");
		jlTipoMaquina.setFont(new Font("Serif",Font.BOLD,26));
		jlTipoMaquina.setForeground(Color.red);
		jlDescricao = new JLabel("Descrição");
		jlDescricao.setFont(new Font("Serif",Font.BOLD,26));
		jlDescricao.setForeground(Color.red);
		jlSOLICITAR = new JLabel("SOLICITAR VISITA TÉCNICA");
		jlSOLICITAR.setFont(new Font("Serif",Font.BOLD,40));
		jtfNome = new JTextField();
		jtfBairro = new JTextField();
		jtfDia = new JTextField();
		jtfCEP = new JTextField();
		jtfDescricao = new JTextArea();
		jtfendereco = new JTextField();
		jtfReferencia = new JTextField();
		jtfNumero = new JTextField();
		rbDesktop = new JRadioButton("Desktop");
		rbDesktop.setFont(new Font("Serif", Font.BOLD, 20));
		rbDesktop.setOpaque(false);
		rbNootbook = new JRadioButton("Notebook");
		rbNootbook.setFont(new Font("Serif", Font.BOLD, 20));
		rbNootbook.setOpaque(false);
		rbMAquina = new ButtonGroup();
		rb1300 = new JRadioButton("13:00");
		rb0900 = new JRadioButton("09:00");
		rb1630 = new JRadioButton("16:30");
		rb1630.setOpaque(false);
		rb0900.setOpaque(false);
		rb1300.setOpaque(false);
		rbHorario = new ButtonGroup();
		botao = new Button("Salvar");
		botao.setFont(new Font("Calibri",Font.BOLD,26));
		btVoltar = new Button("Voltar");
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);
		
		add(jlnome);
		add(jlHorario);
		add(jlendereço);
		add(jlDia);
		add(jlBairro);
		add(jlNumero);
		add(jlReferencia);
		add(jlCEP);
		add(jlTipoMaquina);
		add(jlDescricao);
		add(jlSOLICITAR);
		add(jtfBairro);
		add(jtfCEP);
		add(jtfDescricao);
		add(jtfNome);
		add(jtfNumero);
		add(jtfDia);
		add(jtfendereco);
		add(jtfReferencia);
		add(rbDesktop);
		add(rbNootbook);
		add(rb0900);
		add(rb1300);
		add(rb1630);
		rbHorario.add(rb0900);
		rbHorario.add(rb1300);
		rbHorario.add(rb1630);
		rbMAquina.add(rbDesktop);
		rbMAquina.add(rbNootbook);
		add(btVoltar);
		add(botao);
		add(imagen);

		jlSOLICITAR.setBounds(700, 200, 600, 50);
		jlnome.setBounds(300,300,100,50);
		jtfNome.setBounds(300, 340, 230, 20);
		jlendereço.setBounds(540, 300, 150, 50);
		jtfendereco.setBounds(540, 340, 200, 20);
		jlBairro.setBounds(760, 300, 100, 50);
		jtfBairro.setBounds(760, 340, 200, 20);
		jlNumero.setBounds(980, 300, 100, 50);
		jtfNumero.setBounds(980, 340, 100, 20); 
		jlTipoMaquina.setBounds(1140, 300, 200, 50);
		rbDesktop.setBounds(1130, 360, 100, 20);
		rbNootbook.setBounds(1250, 360, 150, 20);
		jlCEP.setBounds(1400, 300, 100, 50);
		jtfCEP.setBounds(1400, 340, 100, 20);
		jlReferencia.setBounds(300,380,150,50);
		jtfReferencia.setBounds(300,420,100,20);
		jlDia.setBounds(540,380,100,50);
		jtfDia.setBounds(540,420,70,20);
		jlHorario.setBounds(760, 380, 100, 50);
		rb1300.setBounds(770, 420, 80, 20);
		rb1630.setBounds(830, 420, 80, 20);
		rb0900.setBounds(700, 420, 80, 20);
		jlDescricao.setBounds(980, 380, 150, 50);
		jtfDescricao.setBounds(980, 420, 500, 100);
		botao.setBounds(820, 700, 200, 40);;
		btVoltar.setBounds(20,20,100,30);
		imagen.setBounds(0,0,1920,1080);
		
	}
	private void criarEventos() {
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OpcoesCliente tela = new OpcoesCliente(clientes);
				setVisible(false);
				tela.setVisible(true);
			
			} 
		});
botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!jtfDescricao.getText().isEmpty() && !jtfNome.getText().isEmpty() && !jtfBairro.getText().isEmpty() && !jtfCEP.getText().isEmpty()
						&& !jtfDia.getText().isEmpty()&& !jtfendereco.getText().isEmpty()&& !jtfNumero.getText().isEmpty()&& !jtfReferencia.getText().isEmpty()) {	
					 String endereco,bairro,referencia,cep,tipomaquina = null,descricao,nome;
					 Double horario = null,numeroDaCasa;
					 int dia;
					
					nome = jtfNome.getText();
					cep= jtfCEP.getText();
					referencia = jtfReferencia.getText();
					bairro = jtfBairro.getText();
					dia = Integer.parseInt(jtfDia.getText());
					endereco = jtfendereco.getText();
					numeroDaCasa =Double.parseDouble(jtfNumero.getText());
					descricao = jtfDescricao.getText();
					
					if (rb0900.isSelected()) horario = (double) 900 ;
					if (rb1300.isSelected()) horario = (double) 1300;
					if (rb1630.isSelected()) horario = (double) 1630 ;
					if (rbDesktop.isSelected()) tipomaquina = "Desktop";
					if (rbNootbook.isSelected()) tipomaquina = "Note+book";
					
					clientes.add(new VisitaTecnica(nome, endereco, bairro, referencia, cep, tipomaquina, descricao, horario, numeroDaCasa, dia));
					
					jtfNome.setText("");
					jtfCEP.setText("");
					jtfDescricao.setText("");
					jtfDia.setText("");
					jtfendereco.setText("");
					jtfNumero.setText("");
					jtfReferencia.setText("");
					jtfBairro.setText("");
					
					arquivo.escreverArquivo(clientes);

				}
				
			} 
		});
		
	}


}
