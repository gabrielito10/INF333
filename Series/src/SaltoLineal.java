import java.util.*;
public class SaltoLineal {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		int serie1 = 1;
		int serie2 = 2;
		System.out.println(serie1);
		System.out.println(serie2);
		for (int i=1 ; i<N-1 ; i++)
		{
			if ( i%2 != 0) // es impar
			{
				serie1+=2;
				System.out.println(serie1);
			}
			else // es par
			{
				serie2*=2;
				System.out.println(serie2);
			}
		}
	}

}
