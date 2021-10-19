import java.util.*;
public class IntercaladaLineal {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.print("Digite valor de N -> ");
        int N = x.nextInt();
        int Serie = 1;
        for (int i=1 ; i<=N ; i++ )
        {
        	System.out.println(Serie);
        	if (i%2 != 0) // es impar
        		Serie = Serie +2;
        	else // par
        		Serie *= 2;
        }
	}

}
