package DesafioDeCodigoGFT01;
//Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class teste03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTotal = scan.nextInt();
		int numFigCompradas = scan.nextInt();
		Set<Integer> setFig = new HashSet<>();
		Set<Integer> setFigComprada = new HashSet<>();
		for (int i = 1; i <= numTotal; i++) {
			setFig.add(i);
		}
		for (int i = 1; i <= numFigCompradas; i++) {
			setFigComprada.add(scan.nextInt());
		}		
		System.out.println(setFig.size()-setFigComprada.size());
		scan.close();
	}
}