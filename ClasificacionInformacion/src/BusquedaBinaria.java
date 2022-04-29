import java.util.*;
public class BusquedaBinaria {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int arrayOrdenado[] = {10,15,17,21,42,55,67,69,70,81,88,91};
        int indiceBuscado =busqueda(arrayOrdenado,21);
        System.out.println("El elemento se encuentra el la pocision -> "+
        indiceBuscado);
	}
	
	
    public static int busqueda(int[] array,int elementoBuscar )
    {
    	int indiceMenor = 0;
    	int indiceMayor = array.length - 1;
    	int posicionEncontrada = - 1;
    	while (indiceMenor <= indiceMayor)
    	{
    		int indiceMedio=(indiceMenor + indiceMayor)/2;
    		//verificamos si el elemento a buscar esta en el medio
    		if (elementoBuscar == array[indiceMedio])
    		{
    			posicionEncontrada = indiceMedio;
    			break;
    		}
    		//buscamos en la mitad de la lista ya sea mayor o menor
    		else if (elementoBuscar < array[indiceMedio])
    		{
    			indiceMayor = indiceMedio - 1;
    		}
    		else if (elementoBuscar > array[indiceMedio])
    		{
    		    indiceMenor = indiceMedio + 1;
    		}
    	}	
    	return posicionEncontrada;   	
    }
}
