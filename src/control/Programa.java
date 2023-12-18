package control;
import view.TelaCadastroPessoa;

import javax.swing.JOptionPane;

import model.Pessoa;
public class Programa implements IOuvinteBotao {

	public static void main(String[] args) {
		
		TelaCadastroPessoa tela = new TelaCadastroPessoa(new Programa());
		tela.setVisible(true);

	}
	public void gravaPessoa (Pessoa p) {
		JOptionPane.showMessageDialog(null, p.getNome()+" de telefone " +
	p.getTelefone()+ " foi cadastrada com sucesso");
	}

}
