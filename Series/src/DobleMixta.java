import java.util.Scanner;

public class DobleMixta {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		int serie = 10;
		int a = 1;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.print(serie + " ");
			serie*=a;
			if ( i%2 != 0) // es impar
				a+=2;
			else
				a*=2;
		}

	}

}
