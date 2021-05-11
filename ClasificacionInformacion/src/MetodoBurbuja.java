import java.util.*;
public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Tamaño del array");
		int N = x.nextInt();
		int lista[] = new int[N];
		// introduciendo datos
		for (int i=0 ; i<N ; i++)
		{
			System.out.print("lista en la posicion " + i + "--> ");
			lista[i] = x.nextInt();
		}
		//metodo de la burbuja
		for (int i=0 ; i<N ; i++)
		{
			for (int j=0 ; j<N-1 ; j++)
			{
				if (lista[j] > lista[j+1])
				{
					int temp = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = temp;
				}
				
			}
		}
		
		// imprimiendo la lista
		System.out.print("La lista ordenada es: ");
		for (int i=0 ; i<N ; i++)
		{
			System.out.print(lista[i] + " ");
		}
	}

}
