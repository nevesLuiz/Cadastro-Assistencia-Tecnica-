package paineis;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.BeanDescriptor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;

import arquivo.LerEscreverArquivo;
import classes.Cadastro;
import classes.Cliente;

public class PainelCadastroPresencial extends JFrame{
	private JLabel imagen,jlCpf,jlRG,jlNome,jlTelefone,jlEndereco,jlEmail,jlNumeSerie,jlTipoMaquina,jlPresencaAvaria,jlDescricao,jlNumeroProtocolo,jlColaborador,jlCadastro;
	private JTextField jtfCpf,jtfNome,jtfTelefone,jtfEndereco,jtfEmail,jtfNumeroSerie,jtfProtocolo,jtfRG;
	private JRadioButton rbDesktop,rbNootbook,rbAvariaSim,rbAvariaNao;
	private ButtonGroup bgMaquina,bgAvarias;
	private ImageIcon imagem;
	private Button btVoltar,botao;
	private JTextArea jtfDescricao;
	private List<Cliente> clientes = new ArrayList<>();
	LerEscreverArquivo arquivo = new LerEscreverArquivo();
	
	public PainelCadastroPresencial(List<Cliente> clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
        iniciarCmponentes();
        getContentPane().setBackground(Color.cyan);
        criarEventos();

	}



	private void iniciarCmponentes() {
		botao = new Button("Cadastrar");
		btVoltar = new Button("Voltar");
		jlCpf = new JLabel("CPF:");
		jlCpf.setFont(new Font("Serif", Font.BOLD, 18));
		jlCpf.setForeground(Color.red);
		jlRG = new JLabel("RG:");
		jlRG.setFont(new Font("Serif", Font.BOLD, 18));
		jlRG.setForeground(Color.red);
		jlNome = new JLabel("Entre com o nome do Cliente:");
		jlNome.setFont(new Font("Serif", Font.BOLD, 18));
		jlNome.setForeground(Color.red);
		jlTelefone = new JLabel("Telefone:");
		jlTelefone.setFont(new Font("Serif", Font.BOLD, 18));
		jlTelefone.setForeground(Color.red);
		jlEndereco = new JLabel("Endereço:");
		jlEndereco.setFont(new Font("Serif", Font.BOLD, 18));
		jlEndereco.setForeground(Color.red);
		jlEmail = new JLabel("Cliente:");
		jlEmail.setFont(new Font("Serif", Font.BOLD, 18));
		jlEmail.setForeground(Color.red);
		jlNumeSerie = new JLabel("Numero de Serie da maquina:");
		jlNumeSerie.setFont(new Font("Serif", Font.BOLD, 18));
		jlNumeSerie.setForeground(Color.red);
		jlTipoMaquina = new JLabel("Tipo de maquina:");
		jlTipoMaquina.setFont(new Font("Serif", Font.BOLD, 18));
		jlTipoMaquina.setForeground(Color.red);
		jlPresencaAvaria = new JLabel("Contem Avarias?");
		jlPresencaAvaria.setFont(new Font("Serif", Font.BOLD, 18));
		jlPresencaAvaria.setForeground(Color.red);
		jlDescricao = new JLabel("Descrição do caso:");
		jlDescricao.setFont(new Font("Serif", Font.BOLD, 18));
		jlDescricao.setForeground(Color.red);
		jlNumeroProtocolo = new JLabel("Numero de procolo:");
		jlNumeroProtocolo.setFont(new Font("Serif", Font.BOLD, 18));
		jlNumeroProtocolo.setForeground(Color.red);
		jlCadastro = new JLabel("CADASTRO");
		jlCadastro.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 40));
		jlCadastro.setForeground(Color.black);
		jtfCpf = new JTextField();
		jtfRG = new JTextField();
		jtfNome = new JTextField();
		jtfTelefone = new JTextField();
		jtfEndereco = new JTextField();
		jtfEmail = new JTextField();
		jtfNumeroSerie = new JTextField();
		jtfDescricao = new JTextArea();
		jtfProtocolo = new JTextField();
		jlColaborador = new JLabel("Colaborador: ");
		bgAvarias = new ButtonGroup();
		bgMaquina = new ButtonGroup();
		rbDesktop = new JRadioButton("Desktop");
		rbDesktop.setOpaque(false);
		rbNootbook = new JRadioButton("Notebook");
		rbNootbook.setOpaque(false);
		rbAvariaNao = new JRadioButton("Não");
		rbAvariaNao.setOpaque(false);
		rbAvariaSim = new JRadioButton("Sim");
		rbAvariaSim.setOpaque(false);
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);
		
		add(jlCpf);
		add(jlDescricao);
		add(jlEmail);
		add(jlEndereco);
		add(jlNome);
		add(jlNumeSerie);
		add(jlNumeroProtocolo);
		add(jlPresencaAvaria);
		add(jlRG);
		add(jlTelefone);
		add(jlTipoMaquina);
		add(jlColaborador);
		add(jlCadastro);
		add(jtfCpf);
		add(jtfDescricao);
		add(jtfEmail);
		add(jtfEndereco);
		add(jtfNumeroSerie);
		add(jtfNome);
		add(rbAvariaNao);
		add(rbAvariaSim);
		add(rbDesktop);
		add(rbNootbook);
		add(jtfProtocolo);
		add(jtfTelefone);
		add(jtfRG);
		add(btVoltar);
		add(botao);
		bgAvarias.add(rbAvariaNao);
		bgAvarias.add(rbAvariaSim);
		bgMaquina.add(rbDesktop);
		bgMaquina.add(rbNootbook);
		add(imagen);
		
		
		jlCadastro.setBounds(820, 300, 300, 30);
		
		jlNome.setBounds(380, 400, 300, 20);
		jtfNome.setBounds(380, 430, 300, 20);
		
		jlCpf.setBounds(780, 400, 300, 20);
		jtfCpf.setBounds(780, 430, 200, 20);
		
		jlRG.setBounds(1060, 400, 300, 20);
		jtfRG.setBounds(1060, 430, 200, 20);
		
		jlTipoMaquina.setBounds(1360, 400, 300, 20);
		rbDesktop.setBounds(1360, 430, 100, 20);
		rbNootbook.setBounds(1440, 430, 100, 20);
		
		jlEmail.setBounds(380, 500, 300, 20);
		jtfEmail.setBounds(380, 530, 300, 20);
		
		jlTelefone.setBounds(780, 500, 300, 20);
		jtfTelefone.setBounds(780, 530, 200, 20);
		
		jlEndereco.setBounds(1060, 500, 300, 20);
		jtfEndereco.setBounds(1060, 530, 480, 20);
		
		jlPresencaAvaria.setBounds(380,560,300,20);
		rbAvariaSim.setBounds(380,590,50,20);
		rbAvariaNao.setBounds(440,590,50,20);
		
		jlNumeSerie.setBounds(380,640,300,20);
		jtfNumeroSerie.setBounds(380,670,250,20);
		
		jlDescricao.setBounds(780,560,250,20);
		jtfDescricao.setBounds(780,590,760,100);
		
		jlNumeroProtocolo.setBounds(380, 700, 300, 20);
		jtfProtocolo.setBounds(380,730,170,20);
		
		botao.setBounds(820,800,100,30);
		
		btVoltar.setBounds(20,20,100,30);
		
		imagen.setBounds(0,0,1920,1080);
		
		}
	private void criarEventos() {
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OpçoesColaborador tela = new OpçoesColaborador(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!jtfDescricao.getText().isEmpty() && !jtfNome.getText().isEmpty() && !jtfTelefone.getText().isEmpty() && !jtfNumeroSerie.getText().isEmpty()
						&& !jtfCpf.getText().isEmpty()&& !jtfEmail.getText().isEmpty()&& !jtfEndereco.getText().isEmpty()&& !jtfRG.getText().isEmpty()) {	
					String cpf,rg,tipoMaquina = null,email,telefone,endereco,avarias = null,numSerie,descricao,protocoloco,nome;
					
					nome = jtfNome.getText();
					cpf= jtfCpf.getText();
					rg = jtfRG.getText();
					email = jtfEmail.getText();
					telefone = jtfTelefone.getText();
					endereco = jtfEndereco.getText();
					numSerie = jtfNumeroSerie.getText();
					descricao = jtfDescricao.getText();
					protocoloco = jtfProtocolo.getText();

					if (rbAvariaNao.isSelected()) avarias = "Não";
					if (rbAvariaSim.isSelected()) avarias = "Sim";
					if (rbDesktop.isSelected()) tipoMaquina = "Desktop";
					if (rbNootbook.isSelected()) tipoMaquina = "Notebook";
					
					clientes.add(new Cadastro(nome, cpf, rg, tipoMaquina, email, telefone, endereco, avarias, numSerie, descricao, protocoloco));
					
					jtfNome.setText("");
					jtfCpf.setText("");
					jtfDescricao.setText("");
					jtfEmail.setText("");
					jtfEndereco.setText("");
					jtfNumeroSerie.setText("");
					jtfProtocolo.setText("");
					jtfRG.setText("");
					jtfTelefone.setText("");
					
					arquivo.escreverArquivo(clientes);

				}
				
			} 
		});
		
	}
	

}
