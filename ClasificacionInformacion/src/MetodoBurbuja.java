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
				if (array[i] < array[j])
				{
					int aux=array[j];
					array[j]=array[i];
					array[i]= aux;
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
