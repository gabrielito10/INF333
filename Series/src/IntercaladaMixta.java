import java.util.Scanner;

public class IntercaladaMixta {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		int serie = 1;
		int aux =1;
		for ( int i=1 ; i<=N ; i++)
		{
			System.out.print(serie + " ");
			if ( i%2 != 0) //cuando es impar
			{
				serie = serie + aux;
				aux++;
			}
			else // cuando es par
				serie *=2;
		}
	}

}
