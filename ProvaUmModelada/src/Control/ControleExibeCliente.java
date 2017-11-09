package Control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.BDSimulado;
import Model.Cliente;
import View.ViewExibeClienteString;

public class ControleExibeCliente {
	// Atributos
	private BDSimulado bds;

	public ControleExibeCliente(BDSimulado bds) {
		// Guardar o BDSimulado
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void exibirCliente() {
		// Recuperar todos os Clientes
		ArrayList<Cliente> clientes = this.bds.getClientes();

		String nome = JOptionPane.showInputDialog("informe o nome do Cliente");
		String c = "";
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNome().equals(nome)) {
				c = c + clientes.get(i);
			} else {
				JOptionPane.showMessageDialog(null, "Cliente não encontrado");
			}
		}
		ViewExibeClienteString vec = new ViewExibeClienteString(c);
	}

}
