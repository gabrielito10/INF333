import java.util.Scanner;

public class CombinacionConRepeticion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite Valor de n ");
		double n = x.nextInt();
		System.out.print("Digite Valor de r ");
		double r = x.nextInt();
		double p = factorial(r+n-1)/(factorial(n-r)*factorial(r));
		System.out.print(p);

	}
	public static double factorial(double numero)
	{
		if (numero == 0)
			return 1;
		else
			return numero * factorial(numero - 1);
	}
}
