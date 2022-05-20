import java.util.*;
public class IntercaladaSimple {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N = x.nextInt();
		int serie = 6;
		for ( int i=1 ; i<=N ; i++)
		{
			System.out.print(serie + " ");
			if ( i%2 != 0) //cuando es impar
				serie = serie + 2;
			else // cuando es par
				serie *=2;
		}
	}

}
