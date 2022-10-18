import java.util.*;
public class PermutacionConRepeticion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		double n = x.nextInt();
		System.out.print("Digite valor de r ");
		double r = x.nextInt();
		double resultado = Math.pow(n, r);
		System.out.print("El num. de permutaciones es: " + resultado);
	}

}
