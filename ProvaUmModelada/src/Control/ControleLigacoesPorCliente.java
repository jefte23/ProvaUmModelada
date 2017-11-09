// Questão 2b: lista de todas as Ligações realizadas por um Cliente
// determinado

package Control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.BDSimulado;
import Model.Ligacao;
import View.ViewExibeLigacoesString;

public class ControleLigacoesPorCliente {

	// Atributos
	private BDSimulado bds;

	public ControleLigacoesPorCliente(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void ligacoesPorCliente() {

		// Recupera todas as ligações
		ArrayList<Ligacao> ligacaos = this.bds.getLigacoes();

		String nome = JOptionPane.showInputDialog("Infome o nome do cliente: ");
		String c = "";
		for (int i = 0; i < ligacaos.size(); i++) {
			if (ligacaos.get(i).getCliente().getNome().equals(nome)) {
				c = c + ligacaos.get(i);
			}
		}
		ViewExibeLigacoesString cels = new ViewExibeLigacoesString(c);
	}
}
