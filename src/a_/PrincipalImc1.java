package a_;

import javax.swing.JOptionPane;

public class PrincipalImc1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas?"));
		
		Pessoa pessoas[] = new Pessoa[n];
		
		String resultado = "";
		
		for(int i = 0; i < n; i++) {
			Pessoa p = new Pessoa();
			p.cadastra();
			pessoas[i] = p;
			resultado += p.exibir();
		}
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
}
