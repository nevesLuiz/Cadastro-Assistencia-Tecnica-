package paineis;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import arquivo.LerEscreverArquivo;
import classes.Cliente;

public class PainelPesquisar extends JFrame {
	private List<Cliente> clientes = new ArrayList<>();
	private JLabel jlNome;
	private JTextField jtfNomeCliente;
	private JButton jbPesquisar;
	private JTextArea jtaMostrarPesquisa;
	private Button btVoltar;
	private ImageIcon imagem;
	private JLabel imagen;
	LerEscreverArquivo arquivo = new LerEscreverArquivo();

	public PainelPesquisar(List<Cliente> clientes) {
		super();

		setSize(1920, 1080);
		setLayout(null);
		setBackground(Color.cyan);
		AbrirArquivo();
		iniciarComponentes();
		criarEventos();

	}

	private void AbrirArquivo() {
		if (!(arquivo.lerArquivo() == null)) {
			clientes = arquivo.lerArquivo();

		}

	}

	private void iniciarComponentes() {
		jlNome = new JLabel("Nome do Cliente:");
		jtfNomeCliente = new JTextField();
		jbPesquisar = new JButton("Pesquisar");
		jlNome.setFont(new Font("Calibri", Font.BOLD,26));
		jtaMostrarPesquisa = new JTextArea();
		jbPesquisar.setFont(new Font("Calibri", Font.BOLD,22));
		btVoltar = new Button("Voltar");
		imagem = new ImageIcon("src/img/69862_Papel-de-Parede-Engrenagem-Digital_1920x1200.jpg");
		imagen = new JLabel(imagem);

		add(btVoltar);
		add(jlNome);
		add(jtfNomeCliente);
		add(jbPesquisar);
		add(jtaMostrarPesquisa);
		
		add(imagen);

		btVoltar.setBounds(20, 20, 100, 30);
		jlNome.setBounds(700, 300, 200, 30);
		jtfNomeCliente.setBounds(700, 330, 150, 20);
		jbPesquisar.setBounds(700, 360, 200, 30);
		jtaMostrarPesquisa.setBounds(700, 420, 540, 280);
		
		imagen.setBounds(0,0,1920,1080);
	}

	private void criarEventos() {
		jbPesquisar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean achou = false;

				for (Cliente cliente : clientes) {
					if (cliente.getNome().equals(jtfNomeCliente.getText())) {
						jtaMostrarPesquisa.append((clientes.indexOf(cliente) + 1) + cliente.mostrarDados());
						achou = true;
						break;
					}
					if (!achou)
						JOptionPane.showMessageDialog(null, "Cliente inexistente", "Pesquisa",
								JOptionPane.ERROR_MESSAGE);
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