import java.util.*;
public class PermutacionConRepeticion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite Valor de n ");
		double n = x.nextInt();
		System.out.print("Digite Valor de r ");
		double r = x.nextInt();
		double p = Math.pow(n, r);
		System.out.print("El resultado es: " + p);
	}

}
