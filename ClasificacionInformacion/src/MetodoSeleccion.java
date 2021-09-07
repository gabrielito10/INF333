import java.util.*;
public class MetodoSeleccion {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite tama�o del array -> ");
		int N = x.nextInt();
		int array[] = new int[N];
		
		//INTRODUCIENDO DATOS
		for ( int i=0 ; i<N ; i++)
		{
			System.out.print("Array en la posicion " + i + "-> ");
			array[i]=x.nextInt();
		}
		//METODO DE SELECCION
		int menor, pos;
		for (int i=0 ; i<N ; i++)
		{
			menor = array[i];
			pos = i;
			//ENCONTRANDO EL MENOR
			for ( int j=i+1 ; j<N ; j++)
			{
				if (array[j] < menor)
				{
					menor = array[j];
					pos = j;
				}
			}
			//SI EL MENOR ESTA EN OTRA POSICION
			if (pos != i)
			{
				int aux = array[i];
				array[i] = array[pos];
				array[pos] = aux;
			}
		}
		//SALIDA DE DATOS
		for ( int i=0 ; i<N ; i++)
		{
			System.out.print(array[i] + " ");
		}

	}

}
