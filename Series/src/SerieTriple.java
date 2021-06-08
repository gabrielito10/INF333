import java.util.Scanner;

public class SerieTriple {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Valor de N ");
		int N = x.nextInt();
		int serie1 = 1;
		int serie2 = 1;
		int serie3 = 1;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.println(serie1);
			serie1*=serie2;
			serie2*=serie3;
			serie3*=i;
		}
	}

}
