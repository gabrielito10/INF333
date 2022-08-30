import java.util.*;
public class Seleccion {

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
		//Metodo de seleccion
		for (int i=0 ; i<=N-1 ; i++)
		{
			int menor=Lista[i];
			int pos=i;
			for(int j=i+1 ; j<=N-1 ; j++)
			{
				if (Lista[j]<menor)
				{
					menor=Lista[j];
					pos=j;
				}
			}
			if(i!=pos)
			{
				int aux=Lista[i];
				Lista[i]=Lista[pos];
				Lista[pos]=aux;
			}
		}
		//Salida de datos
				for (int i=0 ; i<N ; i++)
					System.out.println(Lista[i]);
	}

}
