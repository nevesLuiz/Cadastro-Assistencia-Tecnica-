package paineis;
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tela.TelaProjetoSemestre;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import classes.Cliente;

public class PainelLoginColaborador extends JFrame {
		private JTextField tfUsuario;    //declaração de componenetes visuais
		private JLabel lbSenha;        //utilizados na aplicação
		private JLabel lbUsuario,jlLogin,jlDeclaracao;        //e cada exemplo podera ser utilizado
		private JButton btLogar;       //um componente diferente
		private JButton btCancelar;    
		private JPasswordField pfSenha; 
		private ImageIcon imagem,imagemSuperior;
		private JLabel imagen,imagen2;
		private Button btVoltar;
		private List<Cliente> clientes;
		
		
		public PainelLoginColaborador(List<Cliente> clientes){ 
			super();
			setSize(1920, 1080);;
			setLayout(null);
		    iniciarComponentes();
		    getContentPane().setBackground(Color.black);
		    criarEventos();
		    this.clientes = clientes;
		}
		
		private void iniciarComponentes() {
			jlLogin = new JLabel("LOGIN");
			btVoltar = new Button("Voltar");
			tfUsuario = new JTextField(5);     
			pfSenha = new JPasswordField(5);
			lbSenha = new JLabel("Senha: ");  
			lbUsuario = new JLabel("Usuario: ");
			btLogar = new JButton("Logar");
			btCancelar = new JButton("Cancelar");
			imagem = new ImageIcon("src/img/thumb-1920-987066.jpg");
			jlLogin.setFont(new Font("Serif",Font.BOLD,36));
			jlDeclaracao = new JLabel("Entre com seus dados corretamente para acessar o sistema");
			jlDeclaracao.setFont(new Font("Serif",Font.BOLD,16));
			lbSenha.setFont(new Font("Serif",Font.BOLD,26));
			lbUsuario.setFont(new Font("Serif",Font.BOLD,26));
			imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
			imagemSuperior = new ImageIcon("src/img/fundo de tela para login (1).jpg");
			imagen2 = new JLabel(imagemSuperior);
			imagen = new JLabel(imagem);		
			imagen = new JLabel(imagem);	
			
			add(jlDeclaracao);
			add(tfUsuario);   
			add(lbSenha);   
			add(lbUsuario);
			add(btLogar);
			add(btCancelar);
			add(pfSenha);
			add(jlLogin);
			add(btVoltar);
			add(imagen2);
			add(imagen);
		
			
			jlLogin.setBounds(670, 310, 600, 30);  
			jlDeclaracao.setBounds(670, 340, 600, 30);  
			tfUsuario.setBounds(840, 440, 300, 30);    
			lbUsuario.setBounds(710, 440, 200, 20);
			lbSenha.setBounds(710, 490, 200, 20);
			pfSenha.setBounds(840, 490, 300, 30);   
			btLogar.setBounds(790, 540, 150, 30); 
			btCancelar.setBounds(990, 540, 150, 30);
			btVoltar.setBounds(20,20,100,30);
			imagen2.setBounds(500,250,880,400);
			imagen.setBounds(0,0,1920,1080);
			
			
			

		}
		
		private void criarEventos(){     
			btLogar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					String senha = String.valueOf(pfSenha.getPassword()); 
					if (tfUsuario.getText().equals("1") && senha.equals("1")){ 
						  	OpçoesColaborador tela = new OpçoesColaborador(clientes);
						  	setVisible(false);
						  	tela.setVisible(true);
						  	 
					}else{
						JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
					}
					
				}
			});
			
			btCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
					
					System.exit(0);                             
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
			
		}
}