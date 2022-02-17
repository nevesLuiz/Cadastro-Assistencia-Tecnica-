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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import arquivo.LerEscreverArquivo;
import classes.Cliente;

public class PainelDeletar extends JFrame {	
		private List<Cliente> clientes = new ArrayList<>();
		private JTextField jtfindice;
		private JLabel jlindice;
		private Button jbDeletar;
		private Button btVoltar;
		private ImageIcon imagem;
		private JLabel imagen;
		LerEscreverArquivo arquivo = new LerEscreverArquivo();


	public PainelDeletar(List<Cliente> clientes) throws HeadlessException {
		super();
		// dimensionar a tela
		setSize(1920, 1080);;
		//desativa o dimencionamento automatico pelo java
		setLayout(null);
		AbrirArquivo();
		iniciarComponentes();
		getContentPane().setBackground(Color.yellow);
		criarEventos();
		setLocationRelativeTo(getContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	private void AbrirArquivo() {
		if (!(arquivo.lerArquivo() == null )) {
			clientes = arquivo.lerArquivo();
		}
			
			
	}


	private void iniciarComponentes() {
		jlindice = new JLabel("Deletar:");
		jtfindice = new JTextField();
		jbDeletar = new Button("Deletar");
		jbDeletar.setFont(new Font("Serif", Font.PLAIN,28));
		btVoltar = new Button("Voltar");
		jlindice.setFont(new Font("Serif", Font.PLAIN,28));
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);

		add(btVoltar);
		add(jbDeletar);
		add(jlindice);
		add(jtfindice);
		add(imagen);
		
		btVoltar.setBounds(20,20,100,30);
		jlindice.setBounds(800, 400, 200, 30);
		jtfindice.setBounds(800, 430, 150, 30);
		jbDeletar.setBounds(800, 470, 200, 50);
		imagen.setBounds(0,0,1920,1080);
		
	}


	private void criarEventos() {
		jbDeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				int indice = Integer.parseInt(jtfindice.getText())-1;
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o arquivo?","Exclusãso de Cadastro", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					clientes.remove(indice);
					arquivo.escreverArquivo(clientes);
				
				}
				}catch (NumberFormatException erro) {
				 JOptionPane.showMessageDialog(null, "Preencher com numeros");
				
			}
			}
		});
		btVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OpçoesColaborador tela = new OpçoesColaborador(clientes);
				setVisible(false);
				tela.setVisible(true);
				
			} 
		});
		}
		
	}
	
