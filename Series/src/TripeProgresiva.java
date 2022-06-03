import java.util.Scanner;

public class TripeProgresiva {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		long serie=1;
		long a=1;
		long b=1;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.print(serie + " ");
			serie*=a;
			a*=b;
			b*=i;
		}
	}

}
