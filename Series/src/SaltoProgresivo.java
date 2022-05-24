import java.util.Scanner;

public class SaltoProgresivo {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		int a = 1;
		int b = 2;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for ( int i=1 ; i< N-1 ; i++)
		{
			if ( i%2 != 0) //cuando es impar
			{
				a += i;
				System.out.print(a + " ");
			}
			else // cuando es par
			{
				b *=i;
				System.out.print(b + " ");
			}
		}

	}

}
