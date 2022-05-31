import java.util.Scanner;

public class DobleProgresiva {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		int serie = 8;
		int a = 2;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.print(serie + " ");
			serie+=a;
			a*=i;
		}
	}

}
