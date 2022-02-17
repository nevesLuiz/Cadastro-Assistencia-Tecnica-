package paineis;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.awt.event.*;
import javax.swing.GroupLayout.Group;

import arquivo.LerEscreverArquivo;

import javax.swing.*;

import classes.Cliente;
import classes.OrdenAD;

public class PainelRemotoCliente extends JFrame {
	//var
	private JLabel  jlsistema,jlconecaoRemota,jltipoMaquina,jldescricao,imagen,jlidRemoto,jlsenhaRemoto,licensaLaterialSuperior,jlidentificacao,jlSOLICITAR;
	private JRadioButton rbSistemaWindowns,rbSistemaLinux,rbAnyDesk,rbTeamViewer,rbEmpresa,rbPessoal,rbSistemaMac;
	private JTextField jtfIdRemoto,jtfSenhaRemota,jtfidentificacao;
	private ButtonGroup bgTipo,bgSistema,bgConecao;
	private Button btVoltar,btCadastrar;
	private JTextArea jtfDescrica;
	private ImageIcon imagem;
	private Button botao;
	private OrdenAD remoto;
	private List<Cliente> clientes = new ArrayList<>();
	LerEscreverArquivo arquivo = new LerEscreverArquivo();
	
	
	

	public PainelRemotoCliente(List<Cliente>clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		AbrirArquivo();
		iniciarComponentes();
		getContentPane().setBackground(Color.white);
		criarEventos();
	}
	
	private void AbrirArquivo() {
		if (!(arquivo.lerArquivo() == null )) {
			clientes = arquivo.lerArquivo();	
		}
	}


		private void iniciarComponentes() {
		//Objects
		jlidentificacao = new JLabel("Nome do Solicitante ");
		jlidentificacao.setForeground(Color.red);
		jlidentificacao.setFont(new Font("Calibri", Font.BOLD,26));
		jtfidentificacao = new JTextField();
		rbSistemaMac = new JRadioButton("Mac");
		rbSistemaMac.setOpaque(false);
		rbSistemaMac.setFont(new Font("Serif", Font.BOLD, 22));
		licensaLaterialSuperior = new JLabel("Licença: Ativa ");
		licensaLaterialSuperior.setFont(new Font("Calibri", Font.BOLD,26));
		jlsistema = new JLabel("Sistema Operacional");
		jlsistema.setFont(new Font("Calibri", Font.BOLD,26));
		jlsistema.setForeground(Color.red);
		jlconecaoRemota = new JLabel("Meio de Coneção Remota");
		jlconecaoRemota.setFont(new Font("Calibri", Font.BOLD,26));
		jlconecaoRemota.setForeground(Color.red);
		jldescricao = new JLabel("Descrição da Solicitação");
		jldescricao.setFont(new Font("Calibri", Font.BOLD,26));
		jldescricao.setForeground(Color.red);
		jtfDescrica = new JTextArea();
		jltipoMaquina = new JLabel("Uso da Maquina: ");
		jltipoMaquina.setFont(new Font("Calibri", Font.BOLD,26));
		jltipoMaquina.setForeground(Color.red);
		bgConecao = new ButtonGroup();
		bgSistema = new ButtonGroup();
		bgTipo = new ButtonGroup();
		rbAnyDesk = new JRadioButton("AnyDesk");
		rbAnyDesk.setFont(new Font("Serif", Font.BOLD, 22));
		rbAnyDesk.setOpaque(false);
		rbEmpresa = new JRadioButton("Empresarial");
		rbEmpresa.setOpaque(false);
		rbEmpresa.setFont(new Font("Serif", Font.BOLD, 22));
		rbPessoal = new JRadioButton("Particular");
		rbPessoal.setOpaque(false);
		rbPessoal.setFont(new Font("Serif", Font.BOLD, 22));
		rbSistemaLinux = new JRadioButton("Linux");
		rbSistemaLinux.setOpaque(false);
		rbSistemaLinux.setFont(new Font("Serif", Font.BOLD, 22));
		rbTeamViewer = new JRadioButton("TeamViewer");
		rbTeamViewer.setOpaque(false);
		rbTeamViewer.setFont(new Font("Calibri",Font.BOLD,22));
		rbSistemaWindowns = new JRadioButton("Windows");
		rbSistemaWindowns.setOpaque(false);
		rbSistemaWindowns.setFont(new Font("Serif", Font.BOLD, 22));
		jtfIdRemoto = new JTextField();
		jtfSenhaRemota = new JTextField();
		jlidRemoto = new JLabel("Entre com o ID Remoto:");
		jlidRemoto.setFont(new Font("Calibri", Font.BOLD,26));
		jlidRemoto.setForeground(Color.red);
		jlsenhaRemoto = new JLabel("Entre com a Senha de acesso");
		jlsenhaRemoto.setFont(new Font("Calibri", Font.BOLD,26));
		jlsenhaRemoto.setForeground(Color.red);
		btVoltar = new Button("Voltar");
		btCadastrar = new Button("Salvar");
		botao = new Button("Cadastrar");
		jlSOLICITAR = new JLabel("SOLICITAR ATENDIMENTO A DISTÂNCIA");
		jlSOLICITAR.setFont(new Font("Calibri",Font.BOLD,40));
		btCadastrar.setFont(new Font("Calibri",Font.BOLD,26));
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);
		
		
		
		
		//Add
		add(licensaLaterialSuperior);
		add(jlSOLICITAR);
		add(jlconecaoRemota);
		add(jlidRemoto);
		add(jlsenhaRemoto);
		add(jldescricao);
		add(jlsistema);
		add(jlidentificacao);
		add(jltipoMaquina);
		add(rbAnyDesk);
		add(rbEmpresa);
		add(rbPessoal);
		add(rbSistemaLinux);
		add(rbSistemaWindowns);
		add(rbSistemaMac);
		add(rbTeamViewer);
		bgTipo.add(rbEmpresa);
		bgTipo.add(rbPessoal);
		bgSistema.add(rbSistemaLinux);
		bgSistema.add(rbSistemaWindowns);
		bgSistema.add(rbSistemaMac);
		bgConecao.add(rbTeamViewer);;
		bgConecao.add(rbAnyDesk);
		add(jtfDescrica);
		add(jtfIdRemoto);
		add(jtfSenhaRemota);
		add(btVoltar);
		add(btCadastrar);
		add(botao);
		add(jtfidentificacao);
		
	
		
		
		add(imagen);

		
		
		//Dimension
		licensaLaterialSuperior.setBounds(1670,60,200,30);
		jlSOLICITAR.setBounds(710, 200, 800, 80);
		jlidentificacao.setBounds(480,400,300,30);
		jtfidentificacao.setBounds(480,430,300,30);
		jlsistema.setBounds(780,400,300,30);
		rbSistemaWindowns.setBounds(800,440,150,30);
		rbSistemaLinux.setBounds(800,470,100,30);
		jltipoMaquina.setBounds(1040,400,300,30);
		rbEmpresa.setBounds(1040,440,200,30);
		rbPessoal.setBounds(1040,470,200,30);
		jlconecaoRemota.setBounds(1280,400,300,30);
		rbTeamViewer.setBounds(1280,440,200,30);
		rbAnyDesk.setBounds(1280,470,200,30);
		jldescricao.setBounds(480,520,300,30);
		jtfDescrica.setBounds(480,550,300,80);
		jlidRemoto.setBounds(880,520,300,30);
		jtfIdRemoto.setBounds(880,550,300,20);
		jlsenhaRemoto.setBounds(1280,520,300,30);
		jtfSenhaRemota.setBounds(1280,550,300,20);
		btVoltar.setBounds(20,20,100,30);
		btCadastrar.setBounds(820,700,200,40);
		rbSistemaMac.setBounds(800,510,200,20);
		botao.setBounds(820, 700, 200, 40);;
		
		
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
		btCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!jtfDescrica.getText().isEmpty() && !jtfidentificacao.getText().isEmpty() && !jtfIdRemoto.getText().isEmpty() && !jtfSenhaRemota.getText().isEmpty()) {
					String sistema = null,descricao,tipoMaquina = null,conecaoRemota = null,idRemoto,senha,nome;
					nome = jtfidentificacao.getText();
					descricao = jtfDescrica.getText();
					idRemoto = jtfIdRemoto.getText();
					senha = jtfSenhaRemota.getText();
					
					if (rbSistemaLinux.isSelected()) sistema = "Linux";
					if (rbSistemaWindowns.isSelected()) sistema = "Windows";
					if (rbSistemaMac.isSelected()) sistema = "Mac";
					if (rbPessoal.isSelected()) tipoMaquina = "Uso Pessoal";
					if (rbEmpresa.isSelected()) tipoMaquina = "Uso Empresarial";
					if (rbAnyDesk.isSelected()) conecaoRemota = "AnyDesk";
					if (rbTeamViewer.isSelected()) conecaoRemota = "TeamViewer";
					
					clientes.add(new OrdenAD(nome, sistema, descricao, tipoMaquina, conecaoRemota, idRemoto, senha));
					jtfDescrica.setText("");
					jtfidentificacao.setText("");
					jtfIdRemoto.setText("");
					jtfSenhaRemota.setText("");
					
					arquivo.escreverArquivo(clientes);
				}else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "CADASTRO REMOTO",JOptionPane.ERROR_MESSAGE);
				}
				
			} 
		});
		botao.addActionListener(new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {
		botao.setVisible(false);
		remoto.setIdRemoto(jtfIdRemoto.getText());
		remoto.setDescricao(jtfDescrica.getText());
		remoto.setSenha(jtfSenhaRemota.getText());
		remoto.setNome(jtfidentificacao.getText());
		///////////////////////////////////////////	
		if (rbTeamViewer.isSelected())remoto.setConecaoRemota("TeamViewer");
		if (rbAnyDesk.isSelected())remoto.setConecaoRemota("AnyDesk");
		if (rbPessoal.isSelected())remoto.setTipoMaquina("Uso Pessoal");		
		if (rbEmpresa.isSelected())remoto.setTipoMaquina("Uso Empresaria");
		if (rbSistemaLinux.isSelected())remoto.setSistema("Linux");
		if (rbSistemaWindowns.isSelected())remoto.setSistema("Windows");
		
		arquivo.escreverArquivo(clientes);
			}
		});
	}
	public void preencherDados() {
		btCadastrar.setVisible(false);
			int indice = Integer.parseInt( JOptionPane.showInputDialog("entre com o indice do carro a ser alterado"));
			if (clientes.get(indice-1)instanceof OrdenAD) {
			remoto = (OrdenAD)clientes.get(indice-1);
			jtfDescrica.setText(remoto.getDescricao());
			jtfidentificacao.setText(remoto.getNome());
			jtfIdRemoto.setText(remoto.getIdRemoto());
			jtfSenhaRemota.setText(remoto.getSenha());
			//setando  tipo de combustivel
			if (remoto.getTipoMaquina().equals("TeamViewer")) rbTeamViewer.setSelected(true);
			if (remoto.getTipoMaquina().equals("AnyDesk")) rbAnyDesk.setSelected(true);
			if (remoto.getSistema().equals("Windows")) rbSistemaWindowns.setSelected(true);
			if (remoto.getSistema().equals("Linux")) rbSistemaLinux.setSelected(true);
			if (remoto.getTipoMaquina().equals("Uso Pessoal")) rbPessoal.setSelected(true);
			if (remoto.getTipoMaquina().equals("Uso Empresaria")) rbEmpresa.setSelected(true);
			
		} else {JOptionPane.showMessageDialog(null, "indice de outro tipo de veiculo", "ALTERAR",JOptionPane.WARNING_MESSAGE);
		
		}
	}
	
}

    
