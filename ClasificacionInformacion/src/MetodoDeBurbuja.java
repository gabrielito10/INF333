import java.util.*;
public class MetodoDeBurbuja {

	public static void main(String[] args) {
		//ENTRADA DE DATOS
		Scanner x = new Scanner(System.in);
		System.out.print("Digite la longitud del array ");
		int N = x.nextInt();
		int array[] = new int[N];
		for (int i = 0 ; i < N; i++)
		{
		  System.out.print("Array en la posicion [" + i + "] ==> ");
		  array[i] = x.nextInt();
		}
		//METODO DE LA BURBUJA
		for (int i = 0 ; i < N - 1; i++)
		{
			for (int j = 0 ; j < N - 1 -i; j++)
			{
			  if (array[j] > array[j+1])
			  {
				  //intercambio
				  int aux = array[j+1];
				  array[j+1] = array[j];
				  array[j] = aux;
			  }
			}
		}
		//SALIDA DE DATOS
		System.out.print("Lista ordenada ==> ");
		for (int i = 0 ; i < N; i++)
		{
		  System.out.print(array[i] + " ");
		}
	}

}
