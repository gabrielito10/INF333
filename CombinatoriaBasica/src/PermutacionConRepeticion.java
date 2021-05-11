import java.util.*;
public class PermutacionConRepeticion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		System.out.print("Digte valor de r ");
		int r = x.nextInt();
		double res = Math.pow(N, r);
		System.out.println(res);
	}

}
