import java.util.Scanner;

public class IntercaladaLineal {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		int serie = 1;
		String salida="1"; 
		for (int i=1 ; i<=N ; i++)
		{
			if ( i%2 != 0) // es impar
				serie = serie + 2;
			else // es impar
				serie = serie * 2;
			//concatenar valores
			salida = salida + " " + serie;
		}
		System.out.print(salida);
	}

}
