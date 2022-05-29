package DesafioDeCodigoGFT01;
import java.util.Scanner;

public class teste02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	    String inputC = scan.next();
	    String inputP = scan.next();
	    Double C = Double.parseDouble(inputC);
	    Double P = Double.parseDouble(inputP);
	    Double media = C/P;

	    System.out.printf("%.2f",media);
	    scan.close();
  }
}