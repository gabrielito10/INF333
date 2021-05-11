import java.util.*;
public class PermutacionSinRepeticion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		System.out.print("Digte valor de r ");
		int r = x.nextInt();
		long res = factorial(N)/factorial(N-r);
		System.out.println(res);
	}
	// 7 * 6 * 5 
	public static long factorial(int num)
	{
		if (num == 0)
			return 1;
		else
			return num * factorial(num -1);
	}
}
