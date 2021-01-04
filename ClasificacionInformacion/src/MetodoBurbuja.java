import java.util.*;
public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite tamaño array");
		int N = x.nextInt();
		int lista[] = new int[N];
		//INTRUDUCIONEDO DATOS EN EL ARRAY
		for (int i=0 ; i<N ; i++)
		{
			System.out.println("lista[" + i + "] --> ");
			lista[i]= x.nextInt();
		}
		
		//CLASIFICACION CON EL METODO DE:
		for (int i=0 ; i<N ; i++)
		{
			for (int j=0 ; j<N-1 ; j++)
			{
				if(lista[j+1] < lista[j])
				{
					int temp = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = temp;
				}
			}
		}
		
		//SALIDA DE LA LISTA ORDENADA
		for (int i=0; i<N ; i++)
		{
			System.out.print(lista[i] + ",");
		}
	}

}
