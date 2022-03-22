import java.util.*;
public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite tamaño del array -> ");
		int N = x.nextInt();
		int array[] = new int[N];
		
		//INTRODUCIENDO DATOS
		for ( int i=0 ; i<N ; i++)
		{
			System.out.print("Array en la posicion " + i + "-> ");
			array[i]=x.nextInt();
		}
		
		//METODO DE LA BURBUJA
		for (int i=0 ; i<N ; i++)
		{
			for ( int j=0 ; j<N-1 ; j++)
			{
				if (array[j] > array[j+1])
				{
					int aux=array[j+1];
					array[j+1]=array[j];
					array[j]= aux;
				}
			}
		}
		//SALIDA DE DATOS
		for ( int i=0 ; i<N ; i++)
		{
			System.out.print(array[i] + " ");
		}

	}

}
