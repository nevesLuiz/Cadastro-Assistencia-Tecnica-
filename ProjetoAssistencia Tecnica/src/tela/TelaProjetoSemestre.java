package tela;

import java.awt.Container;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.text.AttributeSet.ColorAttribute;

import classes.Cliente;
import paineis.PainelLoginCliente;
import paineis.PainelDeEntrada;

public class TelaProjetoSemestre extends JFrame {
	private JLabel jlbemvindo, imagen;
	private Button btcomeçar;
	private ImageIcon imagem;
	private List<Cliente> clientes = new ArrayList<>();

	public TelaProjetoSemestre(String title) throws HeadlessException {
		super("Projeto Semestre");
		// dimensionar a tela
		setSize(1920, 1080);
		;
		// desativa o dimencionamento automatico pelo java
		setLayout(null);
		iniciarComponentes();
		getContentPane().setBackground(Color.white);
		criarEventos();
		setLocationRelativeTo(getContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void iniciarComponentes() {
		btcomeçar = new Button("INÍCIO");
		jlbemvindo = new JLabel("SEJA BEM VINDO");
		jlbemvindo.setForeground(Color.white);
		jlbemvindo.setFont(new Font("Serif", Font.BOLD, 66));
		btcomeçar.setFont(new Font("Serif", Font.PLAIN, 28));
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);

		add(jlbemvindo);
		add(btcomeçar);
		add(imagen);

		jlbemvindo.setBounds(680, 450, 800, 50);
		btcomeçar.setBounds(780, 600, 300, 100);
		imagen.setBounds(0, 0, 1920, 1080);

	}

	private void criarEventos() {
		btcomeçar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PainelDeEntrada entrada = new PainelDeEntrada(clientes);
				setVisible(false);
				entrada.setVisible(true);

			}
		});

	}

}
