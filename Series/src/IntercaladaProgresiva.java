import java.util.*;
public class IntercaladaProgresiva {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		int serie = 1;
		//String salida="1"; 
		for (int i=1 ; i<=N ; i++)
		{
			System.out.println(serie);
			if ( i%2 != 0) // es impar
				serie = serie + i;
			else // es impar
				serie = serie * i;
		}
	}

}
