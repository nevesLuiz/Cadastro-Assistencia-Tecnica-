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

public class PainelLoginCliente extends JFrame {
		private JTextField tfUsuario;    
		private JLabel lbSenha,jlDeclaracao,jlLogin;        
		private JLabel lbUsuario;       
		private JButton btLogar;       
		private JButton btCancelar;    
		private JPasswordField pfSenha; 
		private ImageIcon imagem,imagemSuperior;
		private JLabel imagen,imagen2;
		private Button btVoltar;
		private List<Cliente> clientes ;
	

		public PainelLoginCliente(List<Cliente> clientes){ 
			super();
			// dimensionar a tela
			setSize(1920, 1080);;
			//desativa o dimencionamento automatico pelo java
			setLayout(null);
		    iniciarComponentes();
		    this.clientes= clientes;
		    getContentPane().setBackground(Color.white);
		    criarEventos();
		    setLocationRelativeTo(getContentPane());
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		private void iniciarComponentes() {
			btVoltar = new Button("Voltar");
			jlLogin = new JLabel("LOGIN");
			jlLogin.setFont(new Font("Serif",Font.BOLD,36));
			tfUsuario = new JTextField(5);    
			jlDeclaracao = new JLabel("Entre com seus dados corretamente para acessar o sistema");
			jlDeclaracao.setFont(new Font("Serif",Font.BOLD,16));
			pfSenha = new JPasswordField(5);
			lbSenha = new JLabel("SENHA: ");  
			lbSenha.setFont(new Font("Serif",Font.BOLD,26));
			lbUsuario = new JLabel("USUÁRIO:");
			btLogar = new JButton("Logar");
			btCancelar = new JButton("Cancelar");
			lbUsuario.setFont(new Font("Serif",Font.BOLD,26));
			imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
			imagemSuperior = new ImageIcon("src/img/fundo de tela para login (1).jpg");
			imagen2 = new JLabel(imagemSuperior);
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
					// TODO Auto-generated method stub
					String senha = String.valueOf(pfSenha.getPassword()); 
					if (tfUsuario.getText().equals("1") && senha.equals("1")){ 
						  	 OpcoesCliente clien = new OpcoesCliente(clientes);
							 setVisible(false);
							 clien.setVisible(true);
							 
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