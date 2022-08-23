import java.util.*;
public class Burbuja {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Valor de N");
		int N = x.nextInt();
		int Lista[] = new int[N];
		//Entrada de datos
		for (int i=0 ; i<N ; i++)
		{
			System.out.print("Lista posicion " + i + " -> ");
			Lista[i]= x.nextInt();
		}
		//Metodo Burbuja
		for (int i=0 ; i<N-1 ; i++)
		{
			for (int j=0 ; j<N-1 ; j++)
			{
				if (Lista[j+1]<Lista[j])
				{
					int aux=Lista[j];
					Lista[j]=Lista[j+1];
					Lista[j+1]=aux;
				}
			}
		}
		//Salida de datos
		for (int i=0 ; i<N ; i++)
			System.out.println(Lista[i]);

	}

}
