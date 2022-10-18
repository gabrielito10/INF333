import java.util.*;
public class PermutacionSinRepeticion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		double n = x.nextInt();
		System.out.print("Digite valor de r ");
		double r = x.nextInt();
		//3.628.800
		double resultado= factorial(n)/factorial(n-r);
		System.out.print(resultado);
		
	}
	
	public static double factorial(double numero)
	{
		if (numero == 0)
			return 1;
		else
			return numero * factorial(numero - 1);
	}
}
