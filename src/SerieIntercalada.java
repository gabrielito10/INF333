import java.util.Scanner;
public class SerieIntercalada {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		int Serie=1;
		//Serie Lineal
		/*for (int i=1 ; i<=N ; i++)
		{
			System.out.println(Serie);
			if ( i%2 != 0) // es impar
				Serie= Serie+2;
			else //es par
				Serie*=2;
		}*/
		
		//Serie Progresiva
		/*for (int i=1 ; i<=N ; i++)
		{
			System.out.println(Serie);
			if ( i%2 != 0) // es impar
				Serie= Serie+i;
			else //es par
				Serie*=i;
		}*/
		int aux=1;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.println(Serie);
			if ( i%2 != 0) // es impar
			{
		    	Serie= Serie+aux;//(operacion aritmetica)
		    	aux++;
			}
			else //es par
				Serie*=2;
		}
	}

}