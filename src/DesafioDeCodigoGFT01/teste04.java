package DesafioDeCodigoGFT01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class teste04 {

	public static void main(String[] args) {
		//divertido
		Scanner scan = new Scanner(System.in);
		String T = JOptionPane.showInputDialog("Numero para ser indentificado: ");
		String respostasCompetidores = JOptionPane.showInputDialog("Numeros para serem analisados espaçados por ';': ");
		String[] respostasCompetidoresSplit = respostasCompetidores.split(";");
		int cont = 0;
		for(int i = 0;i<respostasCompetidoresSplit.length;i++) {
			if(Integer.valueOf(respostasCompetidoresSplit[i]).intValue() == Integer.valueOf(T).intValue()) cont++;
		};
		JOptionPane.showConfirmDialog(null, cont);
		scan.close();
	}
}
