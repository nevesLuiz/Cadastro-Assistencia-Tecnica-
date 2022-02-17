package arquivo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

import classes.Cliente;

public class LerEscreverArquivo {

public void escreverArquivo (List<Cliente> clientes) {
	FileOutputStream saida;
	
	try {
		saida = new FileOutputStream("Clientes.bin");
		ObjectOutputStream objeto = new ObjectOutputStream(saida);
		objeto.writeObject(clientes);
		objeto.close();
		JOptionPane.showMessageDialog(null, "Mensagem gravada com suscesso");
	
	} catch (FileNotFoundException e) {
		JOptionPane.showConfirmDialog(null, "Arquivo não encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
	
	}catch (IOException e) {
		e.printStackTrace();		
		}
	
	}
		public List<Cliente> lerArquivo() {
			List<Cliente> clientes = null;
			FileInputStream entrada;
	
	try {
		entrada = new FileInputStream("Clientes.bin");
		ObjectInputStream objeto = new ObjectInputStream(entrada);
		clientes = (List<Cliente>) objeto.readObject();
	} catch (FileNotFoundException e) {
		JOptionPane.showConfirmDialog(null, "Arquivo não encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
		
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		JOptionPane.showConfirmDialog(null, "Classe não encontrado", "Arquivo", JOptionPane.ERROR_MESSAGE);
	}
	return clientes;
	
	
}

}